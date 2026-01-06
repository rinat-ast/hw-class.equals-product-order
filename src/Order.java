import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {//чисто для эксперимента
        String[] orderName = new String[basket.length];
        int[] orderPrice = new int[basket.length];
        for (int i = 0; i < basket.length; i++) {
            orderName[i] = basket[i].name;
            orderPrice[i] = basket[i].price;
        }
        return "Заказ " + customer + ". Наименование товаров: " + Arrays.toString(orderName)
                + " Цена товаров: " + Arrays.toString(orderPrice);
    }

    @Override
    public boolean equals(Object o) {
        Order order = (Order) o;
        if (customer != order.customer) return false;
        if (basket.length != order.basket.length) return false;
        for (int i = 0; i < basket.length; i++) {
            if (!basket[i].name.equals(order.basket[i].name)){
//                System.out.println(basket[i].name +" -и- "+ order.basket[i].name);
                return false;
            }
            if (basket[i].name == null) return false;
            if (order.basket[i].name == null) return false;

        }
        return true;

    }
}





