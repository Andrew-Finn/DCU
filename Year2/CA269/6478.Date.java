public class Date implements Comparable<Date>
{
    private int day, month, year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    public int compareTo(Date other)
    {
        return Integer.compare((this.year * 365 + this.month * 30 + this.day), (other.year * 365 + other.month * 30 + other.day));
    }
}

