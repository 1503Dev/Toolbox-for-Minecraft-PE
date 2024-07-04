package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bm1  reason: default package */
public final class bm1 {
    public String a;

    public /* synthetic */ bm1() {
    }

    public /* synthetic */ bm1(String str) {
        this.a = str;
    }

    public final byte[] a() {
        char c;
        String str = this.a;
        int hashCode = str.hashCode();
        if (hashCode == 984523022) {
            if (str.equals("HmacSha256")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 984524074) {
            if (hashCode == 984525777 && str.equals("HmacSha512")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("HmacSha384")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    return j55.h;
                }
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
            return j55.g;
        }
        return j55.f;
    }

    public final byte[] b(int i, byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) gc5.c.a(this.a);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, this.a));
        byte[] bArr4 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int i4 = i3 + length;
            if (i4 >= i) {
                System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i3, length);
            i2++;
            i3 = i4;
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) gc5.c.a(this.a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.a));
        }
        return mac.doFinal(bArr);
    }
}