public class Autonomo4 {

    public static void main(String[] args) {
        boolean result = isPositive (23);

        System.out.println(result);
    }

    public static boolean isPositive(int num){

        if (num >= 0){
            return true;
        } else {
            return false;
        }
    }
}
