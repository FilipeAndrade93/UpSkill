package Exercicio1;

public class Person {

    //Atributos

    private String firstname;
    private String  lastname;
    private int age;
    private String address;
    private String nationality;

    //Construtor

    public Person (String firstname, String lastname, int age, String address, String nationality){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }

    //Métodos get e set

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    //Exercicio B

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person filipe = new Person("Filipe", "Andrade", 27, "Av EUA", "Portuguesa");

        String nome = filipe.getFirstname();
        String apelido = filipe.getLastname();
        int idade = filipe.getAge();

        //filipe.firstname = "Miguel";

        System.out.println(nome + " " + apelido + " tem " + idade + " anos.");

        System.out.println(filipe);
    }
}
