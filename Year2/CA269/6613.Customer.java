import java.util.*;

class Customer {
    private String _name;
    private List<Rental> _rentals;
    public Customer (String name, List<Rental> list){
        _name = name;
        _rentals=list;
    }
 
    // public void addRental(Rental arg) {
    //     _rentals.addElement(arg);
    
    public List<Rental> getRentals(){
        return _rentals;
    }
    
    public String toString(){
        return _name+": "+_rentals.toString();
        }
    
    public String getName() {
        return _name;
    }
}

// Incorrect program output
// --- Input ---

// --- Program output ---

// Donald
// [Mickey Mouse (2) [1], The Pointer Sisters (0) [10]]
// Donald


// --- Expected output (exact text)---

// Donald
// [Mickey Mouse (2) [1], The Pointer Sisters (0) [10]]
// Donald: [Mickey Mouse (2) [1], The Pointer Sisters (0) [10]]

