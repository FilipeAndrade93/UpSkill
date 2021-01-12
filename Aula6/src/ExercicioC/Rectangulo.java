package ExercicioC;

public class Rectangulo {

    //Atributos

    private int largura;
    private int comprimento;

    //Construtor

    public Rectangulo (int largura, int comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Rectangulo (int lado){
        this.comprimento = lado;
        this.largura = lado;
    }

    //Metodos


    public int getComprimento() {
        return comprimento;
    }

    public int getLargura() {
        return largura;
    }

    //Funcoes

    public int area(){
       return getComprimento() * getLargura();
    }

    public int perimetro(){
        return getLargura() * 2 + getLargura() * 2;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(getLargura(), 2) + Math.pow(getComprimento(), 2));
    }

    public boolean eQuadrado(){
        return getComprimento() == getLargura();
    }

    public static void main(String[] args) {
        Rectangulo a = new Rectangulo(4);

        Rectangulo b = new Rectangulo(4, 2);

        System.out.println(a.perimetro());
        System.out.println(a.diagonal());

        System.out.println(b.perimetro());

        System.out.println(a.eQuadrado());
    }

}
