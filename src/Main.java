import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product uncleBob =new Product(13,"Тушёнка Uncle Bob",400,"Консервы");
        Product uncleBob2 =new Product(13,"Тушёнка Uncle Bob",400,"Консервы");
        Product secondFront =new Product(14,"Тушёнка Второй фронт",400,"Консервы");
        Product doshirak = new Product(200,"Доширак",58,"Бич пакет");
        Product mayonnaise = new Product(201,"Мистер Рико",120,"Майонез");
        Product toiletPaper = new Product(300,"Zewa",150,"Тулетная бумага");

        System.out.println(uncleBob2.equals(uncleBob));

        Product [] alexOrder = {uncleBob,secondFront,doshirak,mayonnaise,toiletPaper};
        Product [] jimOrder = {secondFront,doshirak,mayonnaise,toiletPaper,uncleBob2};

        Order alex = new Order("Alex",alexOrder);
        Order jim = new Order("Jim",jimOrder);

        System.out.println(Arrays.toString(alex.basket));
        System.out.println(Arrays.toString(alexOrder));
        System.out.println(alex);

        System.out.println(jim.equals(alex));
    }
}