package ExercicioD;

public class Student {

    private int studentNumber;
    private String name;
    private String course;

    public Student (int number, String name, String course){
        this.studentNumber = number;
        this.name = name;
        this.course = course;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    @Override
    public String toString() {
        return "Number: " + studentNumber + ", " + "Name: " + name + ", " + "Course: " + course;
    }
}
