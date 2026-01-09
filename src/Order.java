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
        if (this == o) {//сравнили объекты, если равны то вернуть true
            return true;
        }
        if (o == null || getClass() != o.getClass()) {// сравнили их классы, если равны то вернуть false
            return false;
        }
        Order order = (Order) o;
        if (!Objects.equals(customer, order.customer)) {//Сравниваем строки, если не равны возвращаем false
            return false;
        }
        if (basket == null && order.basket == null) { // Если оба массива равны нулю - то возвращаем true.
            return true;//дальше проверять смысла нет.
        }
        if (basket == null || order.basket == null) {// Проверка массивов на нуль, если не равны возвращаем false
            return false;
        }
        if (basket.length != order.basket.length) {// проверка на совпадение длин массивов.
            return false;
        }
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null && order.basket[i] == null) {//если объектов нет, то по сути они равны. чтоб не выбрасило исключение NullPointException  мы пропускаем дальнейшую итерацию.
                continue;
            }
            if (basket[i] == null || order.basket[i] == null) {//если в одном из объектов нуль, то вернуть false
                return false;
            }
            if (!basket[i].equals(order.basket[i])) {// тут вызывается equals класса Product
                return false;
            }
        }
        return true;
    }
}






