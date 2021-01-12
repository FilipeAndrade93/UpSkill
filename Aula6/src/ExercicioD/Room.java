package ExercicioD;

public class Room {

    private int capacity;
    private String block;
    private int number;
    Student[] studentList;

    public Room(int capacity, String block, int number){
        this.capacity = capacity;
        this.block = block;
        this.number = number;
        this.studentList = new Student[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBlock() {
        return block;
    }

    public int getNumber() { return number; }


    @Override
    public String toString() {
        return "Number: " + number + ", " + "Block: " + block + ", " + "Capacity: " + capacity;
    }

    public void addStudent(Student student){
        for (int i = 0; i < capacity; i++){
            if (studentList[i] == null){
                studentList[i] = student;
                break;
            }
        }
    }

    public void removeStudent(int number){
       for (int i = 0; i < studentList.length; i++){
           if (studentList[i] != null){
               if (studentList[i].getStudentNumber() == number){
                   studentList[i] = null;
               }
           }
       }
    }

    public void printStudents(){
        for (int i = 0; i < capacity; i++){
            Student a = studentList[i];
            System.out.println("Student--> " + a);
        }
    }
}
