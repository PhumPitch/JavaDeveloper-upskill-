public class TestDate {
    public static void main(String[] args) {
        //create obj. d1 to call method in Class Date
        Date d1 = new Date(2025, 8, 2);
        System.out.println(d1);

        d1.setYear(2024);
        d1.setMonth(6);
        d1.setDay(23);
        System.out.println(d1);

        System.out.println("Day is "+ d1.getDay());
        System.out.println("Month is "+ d1.getMonth());
        System.out.println("Year is "+ d1.getYear());

        d1.setDate(2023, 1, 25);
        System.out.println(d1); //call toString method
        
    }
}
