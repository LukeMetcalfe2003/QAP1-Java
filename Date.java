public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor to initialize the date
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Methods for getting and setting the day, month and year
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Setting date
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to return the date as a string
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
