package ExercicioD;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(10, "A", 1);

        Student filipe = new Student(1, "Filipe Andrade", "Java");
        Student amilcar = new Student(2, "Amilcar Alhadas", "Java");
        Student monica = new Student(3, "Mónica Galhão", "Java");
        Student adolfo = new Student(4, "Adolfo Dias", "Esbelele");

        room1.addStudent(filipe);
        room1.addStudent(amilcar);
        room1.addStudent(monica);

        System.out.println("Classroom details--> " + room1.toString());
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Student list:");
        System.out.println("");
        room1.printStudents();
        System.out.println("");

        room1.removeStudent(1);
        room1.addStudent(adolfo);

        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Updated Student list:");
        System.out.println("");
        room1.printStudents();
    }
}
