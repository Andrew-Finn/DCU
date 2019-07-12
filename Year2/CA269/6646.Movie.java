public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    public Price price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        if (arg == CHILDRENS) {
            price = new ChildrensPrice();
        } 
        else if (arg == NEW_RELEASE) {
            price = new NewReleasePrice();
        } 
        else
            price = new RegularPrice();
    }

    public String getTitle() {
        return _title;
    }

    public double getCharge(int num) {
        double amount = 0;
        if (price.getPriceCode() == REGULAR) {
            //switch(price.getPriceCode()){
            //  case price.REGULAR:
            amount += 2;
            if (num > 2) {
                amount += (num - 2) * 1.5;
            }
        }
        else if (price.getPriceCode() == NEW_RELEASE) {
            amount += num * 3;
        }
        else if (price.getPriceCode() == CHILDRENS) {
            amount += 1.5;
            if (num > 3) {
                amount += (num - 3) * 1.5;
            }
        }
        return amount;
    }

    public int getFrequentRenterPoints(int num) {
        int point = 1;
        if ((price.getPriceCode() == NEW_RELEASE) && num > 1) {
            point++;
        }
        return point;
    }
}
