package Exercicio2;

public class Main {

    public static void main(String[] args) {
        GiftCard valentine = new Valentines("Adolfo Dias");
        GiftCard birthday = new Birthday("Mónica Galhão");
        GiftCard christmas = new Christmas("Filipe Andrade");

        valentine.showMessage();
        birthday.showMessage();
        christmas.showMessage();
    }
}
