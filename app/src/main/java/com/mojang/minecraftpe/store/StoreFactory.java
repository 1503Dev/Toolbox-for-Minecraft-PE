package com.mojang.minecraftpe.store;

public class StoreFactory {
    public static Store createAmazonAppStore(StoreListener storeListener) {
        return new StubStore(storeListener);
    }

    public static Store createAmazonAppStore(StoreListener storeListener, boolean z) {
        return new StubStore(storeListener);
    }

    public static Store createGooglePlayStore(String str, StoreListener storeListener) {
        return new StubStore(storeListener);
    }

    public static Store createSamsungAppStore(StoreListener storeListener) {
        return new StubStore(storeListener);
    }
}