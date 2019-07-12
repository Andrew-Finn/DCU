import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.Random;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

interface Assignment2Interface {
    static void main(String[] args) throws Exception {
        // Command line argument handling -> Used Assigment 1 main as template. Ref Assigment 1
        String input_filename;
        if (args.length <= 1) {
            input_filename = "out/production/assignment_2/Assignment2Interface.class";
            System.out.println("No command line argument [1] passed for input trying to use IntelliJ build file: " + input_filename + "\n");
        } else {
            input_filename = args[1];
        }
        byte[] bytesToSign = Files.readAllBytes(Path.of(input_filename));

        BigInteger p = new BigInteger("b59dd795 68817b4b 9f678982 2d22594f 376e6a9a bc024184 6de426e5 dd8f6edd ef00b465 f38f509b 2b183510 64704fe7 5f012fa3 46c5e2c4 42d7c99e ac79b2bc 8a202c98 327b9681 6cb80426 98ed3734 643c4c05 164e739c b72fba24 f6156b6f 47a7300e f778c378 ea301e11 41a6b25d 48f19242 68c62ee8 dd313474 5cdf7323".replace(" ", ""), 16);
        BigInteger g = new BigInteger("44ec9d52 c8f9189e 49cd7c70 253c2eb3 154dd4f0 8467a64a 0267c9de fe4119f2 e373388c fa350a4e 66e432d6 38ccdc58 eb703e31 d4c84e50 398f9f91 677e8864 1a2d2f61 57e2f4ec 538088dc f5940b05 3c622e53 bab0b4e8 4b1465f5 738f5496 64bd7430 961d3e5a 2e7bceb6 2418db74 7386a58f f267a993 9833beef b7a6fd68".replace(" ", ""), 16);
        BigInteger x = new BigInteger("59145fbe 8a6c862b 27f26f4a 9595445c 1f03a3c7 0a77cb1a abd21c90 12bb0e60 8ac38f29 86b224e6 adc594be a7259c17 d9b57c19 5d51afad 7bd3ed66 a68f5a24 8e507a24 3bfe170e d3e7284f 7fb52749 8d9ffa01 439168f7 be4b05c3 e9c563ee 66faca55 50c5af87 8c243edc 7e7b6092 4d277585 6c25e5be 1a23ff53 ac5c695d".replace(" ", ""), 16);

        BigInteger y = generateY(g, x, p);

        BigInteger r;
        BigInteger s;
        long seed = 7462234;

        do {
            BigInteger k = generateK(p, seed);
            r = generateR(g, k, p);
            s = generateS(bytesToSign, x, r, k, p);
            seed += 1;
        } while (s.equals(ZERO));

        writeToFile(r.toString(16).toUpperCase(), "r.txt");
        writeToFile(s.toString(16).toUpperCase(), "s.txt");
        writeToFile(y.toString(16).toUpperCase(), "y.txt");

        System.out.println("R: " + r.toString(16).toUpperCase());
        System.out.println("Y: " + y.toString(16).toUpperCase());
        System.out.println("S: " + s.toString(16).toUpperCase());

        System.out.println("\nRun assertion tests:");
        System.out.print("0 < r < p : ");
        System.out.println(r.compareTo(ONE) > 0 && p.compareTo(r) > 0);
        System.out.print("0 < s < p-1 : ");
        System.out.println(s.compareTo(ONE) > 0 && p.subtract(ONE).compareTo(s) > 0);
        System.out.print("g^H(m) (mod p) = (y^r)r^s (mod p): ");
        System.out.println(g.modPow(sha256(bytesToSign), p).equals((y.modPow(r, p).multiply(r.modPow(s, p))).mod(p)));
    }
    /* Method generateK generate a valid pseudorandom random value given modulus and a random seed */
    private static BigInteger generateK(BigInteger modulus, long seed) {
        BigInteger k;
        int iterator = 1;
        do {
            k = generatePseudorandom(seed, iterator, modulus.subtract(ONE));
            iterator += 1;
        } while (!(calculateGCD(k, modulus.subtract(ONE)).equals(ONE)));
        return k;
    }

    /* Method generateY returns the public key y and is generated from the given generator, secretKey  and modulus */
    static BigInteger generateY(BigInteger generator, BigInteger secretKey, BigInteger modulus) {
        return generator.modPow(secretKey, modulus);
    }

    /* Method generateR generates the first part of the ElGamal signature from the given generator, random value k and modulus */
    static BigInteger generateR(BigInteger generator, BigInteger k, BigInteger modulus) {
        return generator.modPow(k, modulus);
    }

    /* Method generateS will generate the second part of the ElGamal signature from the given plaintext, secretKey, first signature part r, random value k and modulus */
    static BigInteger generateS(byte[] plaintext, BigInteger secretKey, BigInteger r, BigInteger k, BigInteger modulus) throws NoSuchAlgorithmException {
        return (sha256(plaintext).subtract(secretKey.multiply(r)).multiply(calculateInverse(k, modulus.subtract(ONE)))).mod(modulus.subtract(ONE));
    }

    /* Method calculateGCD returns the GCD of the given val1 and val2 */
    static BigInteger calculateGCD(BigInteger val1, BigInteger val2) {
        if (val2.equals(ZERO)) return val1;
        return calculateGCD(val2, val1.mod(val2));
    }

    /* Method calculateInverse returns the modular inverse of the given val */
    static BigInteger calculateInverse(BigInteger val, BigInteger modulus) {
        BigInteger[] euclidArr = extendedEuclid(val, modulus);
        return euclidArr[1].mod(modulus);
    }

    /* Method extendedEuclid returns the BigInteger array of the euclid x y  */
    private static BigInteger[] extendedEuclid(BigInteger x, BigInteger y) {
        if ((Objects.equals(y, ZERO))) { // Base case
            return new BigInteger[]{x, ONE, new BigInteger("0")};
        }
        @SuppressWarnings("SuspiciousNameCombination")
        BigInteger[] euclidArr = extendedEuclid(y, x.mod(y)); // IntelliJ doesn't like x being passed as y
        return new BigInteger[]{euclidArr[0], euclidArr[2], euclidArr[1].subtract((x.divide(y)).multiply(euclidArr[2]))};
    }

    /* Method sha256 returns the SHA-256 hash in the form of a Big Integer  */
    private static BigInteger sha256(byte[] p) throws NoSuchAlgorithmException { // Not necessary just lets me match the format of the formula when generating S
        return byteToBigInt(MessageDigest.getInstance("SHA-256").digest(p));
    }

    /* Method byteToBigInt returns a BigInteger of a given byte array
     Ref https://stackoverflow.com/questions/48372017/convert-byte-array-to-biginteger */
    private static BigInteger byteToBigInt(byte[] arr) {
        byte[] rev = new byte[arr.length + 1];
        for (int i = 0, j = arr.length; j > 0; i++, j--)
            rev[j] = arr[i];
        return new BigInteger(rev);
    }

    /* Method writeToFile writes given string to a file that is also given
     Ref Myself? Copied from Assigment 1 */
    private static void writeToFile(String fileData, String fileName) throws IOException {
        FileOutputStream stream = new FileOutputStream(fileName);
        stream.write(fileData.getBytes(StandardCharsets.UTF_8));
        stream.close();
    }

    private static BigInteger generatePseudorandom(long seed, int iterator, BigInteger maxSize) {
        return new BigInteger(maxSize.bitLength(), new Random(seed * iterator)).add(ONE);
    }
}
