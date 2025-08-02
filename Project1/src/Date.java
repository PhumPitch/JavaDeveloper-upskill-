public class Date {
    
    //private int y,m,d
    private int year;
    private int month;
    private int day;

    //Constructore (method with same name as class)
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Setter and Getter

    //Getter (ส่งกลับให้ object)
    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    //Setter (ไว้กำหนดค่า attribute)
    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    //toString() - via obj.
    public String toString(){
        return String.format("%02d-%02d-%04d", month, day, year);
    }

    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
