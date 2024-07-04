package com.microsoft.xal.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Security;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public final class Ecdsa {
    private static final String PREF_FILE_NAME = "xbox_live_ecdsa";
    private static final String PREF_PRIVATE_KEY = "private_key";
    private static final String PREF_PUBLIC_KEY = "public_key";
    private static final String PREF_UNIQUE_ID = "unique_id";
    private KeyPair keyPair;
    private String uniqueId;

    static {
        Security.addProvider(new ua());
    }

    public Ecdsa() {
    }

    public Ecdsa(String str, KeyPair keyPair) {
        this.uniqueId = str;
        this.keyPair = keyPair;
    }

    public static byte[] derToP1363(byte[] bArr) {
        int i = (bArr[1] & 128) != 0 ? 3 : 2;
        int i2 = bArr[i + 1];
        int i3 = i + 2 + i2;
        int i4 = bArr[i3 + 1];
        int min = Math.min(i2, 32);
        int min2 = Math.min(i4, 32);
        byte[] bArr2 = new byte[min + min2];
        System.arraycopy(bArr, i3 - min, bArr2, 0, min);
        System.arraycopy(bArr, ((i3 + 2) + i4) - min2, bArr2, min, min2);
        return bArr2;
    }

    public static Ecdsa restoreKeyAndId(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, 0);
        if (sharedPreferences.contains(PREF_UNIQUE_ID) && sharedPreferences.contains(PREF_PRIVATE_KEY) && sharedPreferences.contains(PREF_PUBLIC_KEY)) {
            try {
                String string = sharedPreferences.getString(PREF_UNIQUE_ID, null);
                byte[] decode = Base64.decode(sharedPreferences.getString(PREF_PRIVATE_KEY, null), 0);
                byte[] decode2 = Base64.decode(sharedPreferences.getString(PREF_PUBLIC_KEY, null), 0);
                KeyFactory keyFactory = KeyFactory.getInstance("ECDSA", "SC");
                KeyPair keyPair = new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode2)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode)));
                if ((keyPair.getPrivate() instanceof ECPrivateKey) && (keyPair.getPublic() instanceof ECPublicKey)) {
                    return new Ecdsa(string, keyPair);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void generateKey(String str) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("ECDSA", "SC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        this.keyPair = keyPairGenerator.generateKeyPair();
        this.uniqueId = str;
    }

    public EccPubKey getPublicKey() {
        ECPublicKey eCPublicKey = (ECPublicKey) this.keyPair.getPublic();
        if (eCPublicKey != null) {
            return new EccPubKey(eCPublicKey);
        }
        return null;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public byte[] sign(byte[] bArr) {
        Signature signature = Signature.getInstance("NONEwithECDSA", "SC");
        signature.initSign(this.keyPair.getPrivate());
        signature.update(bArr);
        return derToP1363(signature.sign());
    }

    public boolean storeKeyPairAndId(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREF_FILE_NAME, 0).edit();
        edit.putString(PREF_UNIQUE_ID, str);
        edit.putString(PREF_PRIVATE_KEY, Base64.encodeToString(this.keyPair.getPrivate().getEncoded(), 3));
        edit.putString(PREF_PUBLIC_KEY, Base64.encodeToString(this.keyPair.getPublic().getEncoded(), 3));
        return edit.commit();
    }
}