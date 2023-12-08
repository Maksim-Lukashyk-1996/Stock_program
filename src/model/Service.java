package model;

import com.sun.tools.javac.Main;

public class Service extends Stock{
    public void test(Product product, Stock stock){
        if (stock.getSize()>=product.getSize()+stock.getTotalSize()){
            stock.setTotalSize(stock.getTotalSize()+ product.getSize());
            stock.addProduct(product);
            stock.setTotalWeight(calculateWeight(product, stock));
            System.out.println("Add product");
        }else{
            System.out.println("Field");
        }
    }
    public Double calculateWeight(Product product, Stock stock){
        return stock.getTotalWeight()+product.getWeight();
    }
}