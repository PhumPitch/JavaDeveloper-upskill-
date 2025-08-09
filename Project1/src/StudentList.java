import java.util.ArrayList;

public class StudentList {
    private String name;
    private String address;
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    /*
     * Constructure for the Student Class.
     * Validation Input Data
     */

    public StudentList(String name, String address) {
        // Validation of input name
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must be filled");
        }

        // Valid Addres
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must be filled");
        }

        this.name = name;
        this.address = address;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must be filled");
        }
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s(%s)", name, address);
    }

    /*
     * Add a new course and grade.
     * 
     * @param course (name)
     * 
     * @paeam grade (0-100)
     */
    public void addCourseGrade(String course, int grade) {
        // Add validation for the course and grade
        if(course == null || course.isBlank()){
            System.out.println("Error: Course name cannot be blank");
            return;
        }
        if(grade < 0 || grade > 100){
            System.out.println("Error: Grade must be between 0-100");
            return; // spot the error = stop compile
        }
        //Check if the course limit is reached
        if(courses.size() >= 30){
            System.out.println("Cannot add more than 30 courses");
            return;
        } 

        this.courses.add(course);
        this.grades.add(grade);
    }

    //Print all the courses and grades in a format string
    public void printGrades(){
        System.out.print(this.name+" ");

        for(int i=0; i < courses.size(); i++){
            System.out.print(courses.get(i) + ":" + grades.get(i));
            if (i<courses.size()-1) System.out.print(", ");
        }
        System.out.println();
    }

    //The average grade
    //@Return the average grade, or 0.0 if no courses are added.

    public double getAverageGrade(){
        if(courses.isEmpty()) return 0.0;
        int sum=0;

        for (int _grade : grades){
            sum += _grade;
        }
        //grades.forEach(grade -> sum+=grade);

        return (double)sum/courses.size();

    }
}
