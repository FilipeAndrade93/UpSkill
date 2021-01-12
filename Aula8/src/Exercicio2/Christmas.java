package Exercicio2;

public class Christmas extends GiftCard {
    public Christmas(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Merry Christmas " + getDestinatario());
    }
}
