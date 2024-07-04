package com.mojang.minecraftpe.store;

import android.util.Log;

public class StubStore implements Store {
    private final StoreListener listener;
    private Product[] products;

    public StubStore(StoreListener storeListener) {
        this.listener = storeListener;
        storeListener.onStoreInitialized(true);
    }

    @Override // com.mojang.minecraftpe.store.Store
    public void acknowledgePurchase(String str, String str2) {
        Log.i("StubStore", "acknowledgePurchase: " + str + " " + str2);
    }

    @Override // com.mojang.minecraftpe.store.Store
    public void destructor() {
    }

    @Override // com.mojang.minecraftpe.store.Store
    public ExtraLicenseResponseData getExtraLicenseData() {
        return new ExtraLicenseResponseData();
    }

    @Override // com.mojang.minecraftpe.store.Store
    public String getProductSkuPrefix() {
        return "";
    }

    @Override // com.mojang.minecraftpe.store.Store
    public String getRealmsSkuPrefix() {
        return "";
    }

    @Override // com.mojang.minecraftpe.store.Store
    public String getStoreId() {
        return "android.googleplay";
    }

    @Override // com.mojang.minecraftpe.store.Store
    public boolean hasVerifiedLicense() {
        return true;
    }

    @Override // com.mojang.minecraftpe.store.Store
    public void purchase(String str, boolean z, String str2) {
        Log.i("StubStore", "purchase: " + str + " " + z + " " + str2);
        this.listener.onPurchaseFailed(str);
    }

    @Override // com.mojang.minecraftpe.store.Store
    public void queryProducts(String[] strArr) {
        StringBuilder b = e5.b("queryProducts: ");
        b.append(strArr.length);
        Log.i("StubStore", b.toString());
        Product[] productArr = new Product[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            Product product = new Product();
            productArr[i] = product;
            product.mId = strArr[i];
            product.mPrice = "PRICELESS";
            product.mUnformattedPrice = "PRICELESS";
            product.mCurrencyCode = "YEN";
        }
        this.products = productArr;
        this.listener.onQueryProductsSuccess(productArr);
    }

    @Override // com.mojang.minecraftpe.store.Store
    public void queryPurchases() {
        Log.i("StubStore", "queryPurchases");
        this.listener.onQueryPurchasesSuccess(new Purchase[0]);
    }

    @Override // com.mojang.minecraftpe.store.Store
    public boolean receivedLicenseResponse() {
        return true;
    }
}