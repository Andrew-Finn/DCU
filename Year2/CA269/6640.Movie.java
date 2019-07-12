public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int num) {
        double amount = 0;
        switch (_priceCode) {
            case Movie.REGULAR:
                amount += 2;
                if (num > 2) {
                    amount += (num - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amount += num * 3;
                break;
            case Movie.CHILDRENS:
                amount += 1.5;
                if (num > 3) {
                    amount += (num - 3) * 1.5;
                }
                break;
        }
        return amount;
    }

    public int getFrequentRenterPoints(int num) {
        int renter_points = 1;
        if ((_priceCode == NEW_RELEASE) && num > 1) {
            renter_points++;
        }
        return renter_points;
    }
}