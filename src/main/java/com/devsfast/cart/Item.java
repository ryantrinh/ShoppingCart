package com.devsfast.cart;

public class Item {
    private final double unitPrice;
    private final int quantity;
    public Item(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return getUnitPrice() * getQuantity();
    }
}
