
class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public String toString() {
        return _movie.toString() + " [" + _daysRented + "]";
    }

    public double getCharge() {
        double owed = 0;
        switch (_movie.getPriceCode()) {
            case Movie.REGULAR:
                owed += 2;
                if (_daysRented > 2) {
                    owed += (_daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                owed += _daysRented * 3;
                break;
            case Movie.CHILDRENS:
                owed += 1.5;
                if (_daysRented > 3) {
                    owed += (_daysRented - 3) * 1.5;
                }
                break;
        }
        return owed;
    }
}
