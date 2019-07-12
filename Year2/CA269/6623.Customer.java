import java.util.*;

class Customer {
    private String _name;
    private List<Rental> _rentals;

    public Customer(String name, List<Rental> list) {
        _name = name;
        _rentals = list;
    }

    public List<Rental> getRentals() {
        return _rentals;
    }

    public String toString() {
        return _name + ": " + _rentals.toString();
    }

    public String getName() {
        return _name;
    }

    public String statement(){
        double totalAmount =0;
        int frequent=0;
        
        StringBuilder result= new StringBuilder();
        for (Rental rental:_rentals){
            double curr = 0;
            curr = getTotal(rental);
            frequent += getFrequentRenterPoints(rental);
            result.append("  " + rental.getMovie().getTitle() + "  " + String.valueOf(curr) + "\n");
            totalAmount += curr;
        }
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequent).append(" frequent renter points").append("\n");
        return result.toString();
    }

    public double getTotal(Rental rental) {
        return rental.getCharge();
    }

    public int getFrequentRenterPoints(Rental rental) {
        int point = 1;
        if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1) {
            point++;
        }
        return point;
    }
}