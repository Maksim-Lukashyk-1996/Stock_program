import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clothes jacket = new Clothes(1, "Верхняя одежда", 100.00, 50F);
        Clothes trousers = new Clothes(2, "Брюки", 100.00, 50F);
        Shoes shoes = new Shoes(1, "Туфли", 100.00, 100F);
        Shoes sneakers = new Shoes(2, "Кроссовки", 100.00, 100F);
        Accessories belts = new Accessories(1, "Ремни", 50.00, 100F);
        Accessories cufflinks = new Accessories(2, "Запонки", 50.0,500.0F);


        Stock stock = new Stock(500.0F);
        Service service = new Service();
        List<Product> productList = new ArrayList<>();
        productList.add(jacket);
        productList.add(trousers);
        productList.add(shoes);
        productList.add(sneakers);
        productList.add(belts);
        productList.add(cufflinks);


        productList.forEach((e) -> service.test(e,stock));
        System.out.println("Склад заполнен,общий вес хранимого товара на складе: "+ stock.getTotalWeight() + "кг");
    }
}