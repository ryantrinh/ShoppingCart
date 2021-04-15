package com.devsfast.cart;

import java.util.List;

public class ShoppingCart {

  private final  List<Item> items;


    public ShoppingCart(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return items.stream().mapToDouble(item -> item.getSubtotal()).sum();
    }

}
