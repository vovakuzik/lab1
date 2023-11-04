
class Date {
    private int month;
    private int day;
    private int year;


    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }


    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }


    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    //
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    //
    public void displayDate() {
        System.out.printf("%d/%d/%d\n", month, day, year);
    }
}


public class Main {
    public static void main(String[] args) {

        Date myDate = new Date(9, 29, 2023);


        System.out.println("Начальная дата:");
        myDate.displayDate();


        myDate.setMonth(10);
        myDate.setDay(1);
        myDate.setYear(2023);


        System.out.println("Измененная дата:");
        myDate.displayDate();
    }
}
