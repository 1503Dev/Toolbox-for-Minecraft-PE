package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: a43  reason: default package */
public final class a43 implements gn, bj {
    public final Object g;
    public Object h;
    public Serializable i;

    public final BigInteger[] a(byte[] bArr) {
        BigInteger bigInteger;
        in inVar = (in) ((on) this.h).U;
        BigInteger bigInteger2 = inVar.j;
        int bitLength = bigInteger2.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger3 = new BigInteger(1, bArr);
        if (bitLength < length) {
            bigInteger3 = bigInteger3.shiftRight(length - bitLength);
        }
        BigInteger bigInteger4 = ((zn) ((on) this.h)).V;
        ((ej) this.g).getClass();
        rj0 rj0Var = (rj0) ((ej) this.g);
        rj0Var.a = bigInteger2;
        rj0Var.b = (SecureRandom) this.i;
        eq eqVar = new eq();
        while (true) {
            rj0 rj0Var2 = (rj0) ((ej) this.g);
            int bitLength2 = rj0Var2.a.bitLength();
            while (true) {
                bigInteger = new BigInteger(bitLength2, rj0Var2.b);
                if (!bigInteger.equals(rj0.c) && bigInteger.compareTo(rj0Var2.a) < 0) {
                    break;
                }
            }
            wn n = eqVar.J0(inVar.i, bigInteger).n();
            n.b();
            BigInteger mod = n.b.t().mod(bigInteger2);
            BigInteger bigInteger5 = gn.a;
            if (!mod.equals(bigInteger5)) {
                BigInteger mod2 = bigInteger.modInverse(bigInteger2).multiply(bigInteger3.add(bigInteger4.multiply(mod))).mod(bigInteger2);
                if (!mod2.equals(bigInteger5)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z, uc ucVar) {
        Object obj;
        SecureRandom secureRandom;
        boolean z2;
        SecureRandom secureRandom2 = null;
        if (z) {
            if (ucVar instanceof td0) {
                td0 td0Var = (td0) ucVar;
                this.h = (zn) td0Var.Q;
                secureRandom = td0Var.P;
                if (!z) {
                    ((ej) this.g).getClass();
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (secureRandom != null) {
                        secureRandom2 = secureRandom;
                    } else {
                        secureRandom2 = new SecureRandom();
                    }
                }
                this.i = secureRandom2;
            }
            obj = (zn) ucVar;
        } else {
            obj = (co) ucVar;
        }
        this.h = obj;
        secureRandom = null;
        if (!z) {
        }
        if (z2) {
        }
        this.i = secureRandom2;
    }
}