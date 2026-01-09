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
        if (o == null) {//Проверяем есть ли объект
            return false;
        }
        if (getClass() != o.getClass()) {//Проверка к одному ли классу принадлежат объекты
            return false;
        }
        Order order = (Order) o;
        if (customer == null || order.customer == null) {
            return false;// проверка строк на нуль, если не равны возвращаем false
        }
        if (!Objects.equals(customer, order.customer)) {//Сравниваем строки, если не равны возвращаем false
            return false;
        }
        if (basket == null && order.basket == null) { // Если оба массива равны нулю - то возвращаем true
            return true;
        }
        if (basket == null || order.basket == null) {// Проверка массивов на нуль, если не равны возвращаем false
            return false;
        }
        if (basket.length != order.basket.length) {// проверка на совпадение длин массивов.
            return false;
        }
        for (int i = 0; i < basket.length; i++) {
            if (basket == null && order.basket == null) { // Если оба массива равны нулю - то возвращаем true
                return true;
            }
            if (basket[i] == null || order.basket[i] == null) {
                return false;
            }
            if (!basket[i].equals(order.basket[i])) {// или тут вызывается equals класса Product?
                return false;
            }
        }
        return true;
    }
}






