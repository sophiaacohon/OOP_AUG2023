package employee.version5;

public class myDate {
    int date;
    String month;
    int year;
    
    public myDate(int date, String month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "[" + date + " " + month + " " + year + "]";
    }
}
