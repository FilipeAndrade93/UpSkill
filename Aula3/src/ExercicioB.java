public class ExercicioB {

    public static void main(String[] args) {
       int t = 87;

        if (t < 0){
            System.out.println("Está gelado");
        } else if (t <= 15){
            System.out.println("Está frio");
        } else if (t >= 50){
            System.out.println("Está quente");
        } else  if (t >= 80){
            System.out.println("Está a ferver");
        } else {
            System.out.println("Está normal");
        }
    }
}
