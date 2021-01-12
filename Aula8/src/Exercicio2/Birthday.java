package Exercicio2;

public class Birthday extends GiftCard {
    public Birthday(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Happy Birthday " + getDestinatario());
    }
}
