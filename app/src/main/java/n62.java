package defpackage;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* renamed from: n62  reason: default package */
public final class n62 {
    public static final n62 f = new n62();
    public final mv2 a;
    public final t42 b;
    public final String c;
    public final xv2 d;
    public final Random e;

    public n62() {
        mv2 mv2Var = new mv2();
        t42 t42Var = new t42(new km5(), new xk5(), new ic4(), new we2(), new mo2());
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        xv2 xv2Var = new xv2(0, 231004000, true, false);
        Random random = new Random();
        this.a = mv2Var;
        this.b = t42Var;
        this.c = bigInteger;
        this.d = xv2Var;
        this.e = random;
    }
}