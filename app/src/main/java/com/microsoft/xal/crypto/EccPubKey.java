package com.microsoft.xal.crypto;

import android.util.Base64;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;

public final class EccPubKey {
    private final ECPublicKey key;

    public EccPubKey(ECPublicKey eCPublicKey) {
        this.key = eCPublicKey;
    }

    private static String convertBigIntToBase64(BigInteger bigInteger, int i, int i2) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length >= i) {
            return Base64.encodeToString(byteArray, byteArray.length - i, i, i2);
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
        return Base64.encodeToString(bArr, i2);
    }

    public String getBase64UrlX() {
        return convertBigIntToBase64(this.key.getW().getAffineX(), 32, 11);
    }

    public String getBase64UrlY() {
        return convertBigIntToBase64(this.key.getW().getAffineY(), 32, 11);
    }
}