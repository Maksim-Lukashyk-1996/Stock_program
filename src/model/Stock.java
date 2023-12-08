package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Stock{
    private Float size;
    private Double totalWeight = 0.0;
    private Float totalSize = 0.0F;
    private List<Product> listProduct = new ArrayList<>();

    public Stock (){

    }

    public Stock (Float size){
        this.size = size;
    }


    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }



    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Float getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Float totalSize) {
        this.totalSize = totalSize;
    }
}

