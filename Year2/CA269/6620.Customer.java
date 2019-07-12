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
        double total = 0;
        int frequentRenterPoints = 0;
        String result = "";

        for (Rental rental : _rentals) {
            double runningTotal = 0;
            runningTotal += getTotal(rental);
            int movieType = rental.getMovie().getPriceCode();
            
            frequentRenterPoints++;
            
            
            if ((movieType == Movie.NEW_RELEASE) && rental.getDaysRented()>1){frequentRenterPoints++;}
            result+="  "+rental.getMovie().getTitle()+"  "+String.valueOf(runningTotal)+"\n";
            total+=runningTotal;
        }
            
        result += "Amount owed is " + String.valueOf(total) +"\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)+" frequent renter points"+"\n";
        return result;
        }
    
    public double getTotal(Rental rental){
            double owed = 0;
            int movieType = rental.getMovie().getPriceCode();
            
            if (movieType == Movie.REGULAR){
                owed += 2;
                if (rental.getDaysRented() > 2) {
                    owed += (rental.getDaysRented() - 2) * 1.5;
                }
            }

            else if (movieType ==  Movie.NEW_RELEASE){
                owed += rental.getDaysRented() * 3;
            }
            
            else if (movieType ==  Movie.CHILDRENS){
                owed += 1.5;
                if (rental.getDaysRented() > 3) {
                    owed += (rental.getDaysRented() - 3) * 1.5;
                }
             }
        return owed;
    }
}

