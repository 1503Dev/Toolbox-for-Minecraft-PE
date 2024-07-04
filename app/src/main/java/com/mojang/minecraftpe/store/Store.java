package com.mojang.minecraftpe.store;

public interface Store {
    void acknowledgePurchase(String str, String str2);

    void destructor();

    ExtraLicenseResponseData getExtraLicenseData();

    String getProductSkuPrefix();

    String getRealmsSkuPrefix();

    String getStoreId();

    boolean hasVerifiedLicense();

    void purchase(String str, boolean z, String str2);

    void queryProducts(String[] strArr);

    void queryPurchases();

    boolean receivedLicenseResponse();
}