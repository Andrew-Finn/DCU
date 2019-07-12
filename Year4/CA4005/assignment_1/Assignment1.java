import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.*;


interface Assignment1Interface {
    String cipherInstance = "AES/CBC/NoPadding";
    String cipherType = "AES";
    Integer shaIterations = 200;
    Integer blockSizeInBytes = 16; // 16 Bytes == 128 bit

    String password = "bit.ly/3ABdhnT";
    BigInteger rsaExponent = new BigInteger("65537");
    BigInteger rsaModulus = new BigInteger("c406136c12640a665900a9df4df63a84fc855927b729a3a106fb3f379e8e4190ebba442f67b93402e535b18a5777e6490e67dbee954bb02175e43b6481e7563d3f9ff338f07950d1553ee6c343d3f8148f71b4d2df8da7efb39f846ac07c865201fbb35ea4d71dc5f858d9d41aaa856d50dc2d2732582f80e7d38c32aba87ba9", 16);

    static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        // Run end-to-end test to make sure everything works before starting
        runEndToEndTest();

        // Command line argument handling
        String input_filename;
        if (args.length <= 1) {
            input_filename = "out/production/assignment_1/Assignment1Interface.class";
            System.out.println("No command line argument [1] passed for input trying to use IntelliJ build file: " + input_filename);
        } else {
            input_filename = args[1];
        }

        String output_filename;
        if (args.length <= 2) {
            output_filename = "Encryption.txt";
            System.out.println("No command line argument passed [2] for output using: " + output_filename);
        } else {
            output_filename = args[1];
        }

        // Generate and save  128 bit IV and Salt
        byte[] iv = generateNRandomBytes(16);
        writeToFile(convertToHex(iv), "IV.txt");
        byte[] salt = generateNRandomBytes(16);
        writeToFile(convertToHex(salt), "Salt.txt");

        // Generate encryption key using SHA-256
        byte[] key = generateKey(password.getBytes(StandardCharsets.UTF_8), salt);

        // Read input file to be encrypted
        byte[] fileToEncrypt = Files.readAllBytes(Path.of(input_filename));

        // Encrypt file using key and save
        byte[] encryptedFile = encryptAES(fileToEncrypt, iv, key);
        writeToFile(convertToHex(encryptedFile), output_filename);

        // Encrypt RSA password and save
        byte[] encryptedPassword = encryptRSA(password.getBytes(StandardCharsets.UTF_8), rsaExponent, rsaModulus);
        writeToFile(convertToHex(encryptedPassword), "Password.txt");
    }

    private static void runEndToEndTest() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        byte[] iv = new byte[16];
        byte[] salt = new byte[16];
        String password = "0000";
        String testData = "Test data 12345";

        byte[] key = generateKey(password.getBytes(StandardCharsets.UTF_8), salt);

        byte[] encryptedData = encryptAES(testData.getBytes(StandardCharsets.UTF_8), iv, key);
        byte[] decryptedData = decryptAES(encryptedData, iv, key);

        if (!testData.equals(new String(decryptedData, StandardCharsets.UTF_8))) {
            throw new Error("End to end test failed. Input -> Encrypted -> Decrypted != Input");
        }
    }

    private static byte[] generateNRandomBytes(int n_bytes) {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[n_bytes];
        random.nextBytes(bytes);
        return bytes;
    }

    private static void writeToFile(String fileData, String fileName) throws IOException {
        FileOutputStream stream = new FileOutputStream(fileName);
        stream.write(fileData.getBytes(StandardCharsets.UTF_8));
        stream.close();
    }

    // Ref: Stackoverflow for using BigInteger to convert to hex. Also thanks Java for changing how to do this in several versions!
    private static String convertToHex(byte[] raw) {
        return new BigInteger(1, raw).toString(16);
    }

    static byte[] generateKey(byte[] password, byte[] salt) throws NoSuchAlgorithmException {
        byte[] saltedPassword = new byte[password.length + salt.length];
        System.arraycopy(password, 0, saltedPassword, 0, password.length);
        System.arraycopy(salt, 0, saltedPassword, password.length, salt.length);

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] sha = saltedPassword;
        for (int i = 0; i < shaIterations; i++) {
            sha = md.digest(sha);
        }
        return sha;
    }

    static byte[] encryptAES(byte[] plaintext, byte[] iv, byte[] key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(cipherInstance);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, cipherType), new IvParameterSpec(iv));
        return cipher.doFinal(pad(plaintext));
    }

    private static byte[] pad(byte[] plaintext) {
        int padAmount = blockSizeInBytes - (plaintext.length % blockSizeInBytes);

        byte[] paddedText = new byte[plaintext.length + padAmount];
        System.arraycopy(plaintext, 0, paddedText, 0, plaintext.length);

        paddedText[plaintext.length] = (byte) 0b10000000; // Add "1000000" byte

        for (int i = 1; i < padAmount; i++) { // For remaining bytes...
            paddedText[plaintext.length + i] = (byte) 0b00000000; // Add "00000000" byte
        }

        return paddedText;
    }

    static byte[] decryptAES(byte[] ciphertext, byte[] iv, byte[] key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(cipherInstance); // Sidenote: Would be nice if these Cipher type strings were mapped to Java types this is asking for a mistype e.g. Cipher.Methods.AES_CBC_NoPadding
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, cipherType), new IvParameterSpec(iv));
        return unpad(cipher.doFinal(ciphertext));
    }

    private static byte[] unpad(byte[] ciphertext) {
        int padStartIndex; // TIL Assigning "padStartIndex" before loop will keep value will expand the scope to outside the loop!
        for (padStartIndex = ciphertext.length - 1; padStartIndex > 0; padStartIndex--) {
            if (ciphertext[padStartIndex] == (byte) 0b10000000) { // Search for padded byte.
                break;
            }
        }
        byte[] output = new byte[padStartIndex]; // New array of length - padding byte (if any)
        System.arraycopy(ciphertext, 0, output, 0, padStartIndex);
        return output;
    }

    // Assuming password in passed encoded correctly
    static byte[] encryptRSA(byte[] password_bytes, BigInteger exponent, BigInteger modulus) {
        return modExp(new BigInteger(password_bytes), exponent, modulus).toByteArray(); // toByteArray will suffice here as modulus will always be positive, 2s compliment won't apply
    }

    // Left to right method
    static BigInteger modExp(BigInteger base, BigInteger exponent, BigInteger modulus) {
        BigInteger result = new BigInteger("1");

        for (int i = 0; i < exponent.bitLength(); i++) {
            if (exponent.testBit(i)) {
                result = result.multiply(result)
                        .multiply(base)
                        .mod(modulus);
            }
            else {
                result = result.multiply(result)
                        .mod(modulus);
            }
        }
        return result;
    }
}
