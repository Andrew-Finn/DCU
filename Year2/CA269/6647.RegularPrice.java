public class RegularPrice extends Price {
    public double getCharge(int num) {
        if (num > 2) {
            return (2 + ((num - 2) * 1.5)) * 2;
        }
        return 4;
    }

    public int getFrequentRenterPoints(int num) {
        return 1;
    }

    public int getPriceCode() {
        return REGULAR * 2;
    }
}