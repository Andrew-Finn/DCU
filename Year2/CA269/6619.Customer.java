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

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "";

        for (Rental rental : _rentals) {
            double runningTotal = 0;
            int movieType = rental.getMovie().getPriceCode();
            
            if (movieType == Movie.REGULAR){
                runningTotal += 2;
                if (rental.getDaysRented() > 2) {
                    runningTotal += (rental.getDaysRented() - 2) * 1.5;
                }
            }

            else if (movieType ==  Movie.NEW_RELEASE){
                runningTotal += rental.getDaysRented() * 3;
                if (rental.getDaysRented() > 1){
                    frequentRenterPoints++;
                }
            }
            
            else if (movieType ==  Movie.CHILDRENS){
                runningTotal += 1.5;
                if (rental.getDaysRented() > 3) {
                    runningTotal += (rental.getDaysRented() - 3) * 1.5;
                }
             }

            frequentRenterPoints++;
            
            result += "  " + rental.getMovie().getTitle() + "  " + String.valueOf(runningTotal) + "\n";
            totalAmount += runningTotal;
        }
        
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points" + "\n";
        return result;
    }
}

