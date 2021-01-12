package Exercicio2;

public abstract class GiftCard {

    private String destinatario;

    public GiftCard(String destinatario){
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public abstract void showMessage();
}
