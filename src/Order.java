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
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        if (customer == null || order.customer == null) return false;// проверка на нуль!
        if (!customer.equals(order.customer)) return false;
        // тут сравниваем две переменные с типом String
        if (basket == null || order.basket == null) {
            return false;
        }
        if (basket.length != order.basket.length) return false;// проверка на совпадение длин массивов?
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null || order.basket[i] == null) return false;
            if (!basket[i].equals(order.basket[i])) {// или тут вызывается equals класса Product?
                return false;
            }
        }
        return true;

    }

}






