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
    public String toString(){//чисто для эксперимента
        String [] orderName = new String[basket.length];
        int [] orderPrice = new int[basket.length];
        for (int i = 0; i < basket.length; i++) {
            orderName[i] = basket[i].name;
            orderPrice[i] = basket[i].price;
        }
        return "Заказ " + customer + ". Наименование товаров: " + Arrays.toString(orderName)
                + " Цена товаров: " + Arrays.toString(orderPrice);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order order = (Order) obj;
        return Objects.equals(customer, order.customer) && Arrays.equals(basket, order.basket);
    }
}
