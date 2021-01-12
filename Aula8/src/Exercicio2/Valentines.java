package Exercicio2;

import org.w3c.dom.ls.LSOutput;

public class Valentines extends GiftCard {

    public Valentines(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Happy Valentine's Day " + getDestinatario());
    }
}
