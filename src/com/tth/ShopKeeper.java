package com.tth;

public class ShopKeeper extends Person implements Seller {
    ShopKeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi, I'm a Shopkeeper!";
    }

    @Override
    public void sellGoods() {
        // TODO: Implement
    }
}
