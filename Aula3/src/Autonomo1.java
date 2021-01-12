public class Autonomo1 {

    public static void main(String[] args) {

        int year = 1900;

        int age = 2020 - year;

        if (age == 0){
            System.out.println("You is a baby");
        } else if (age > 0){
            System.out.println("Tens " + age + " anos");
        } else {
            System.out.println("Erro");
        }
    }
}
