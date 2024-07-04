package defpackage;

import java.util.Map;

/* renamed from: w51  reason: default package */
public final class w51 {
    public final tl a;
    public final int b;
    public final int c;
    public final int d;

    public w51(tl tlVar) {
        int c;
        this.a = tlVar;
        String b = tlVar.b();
        if (b.equals("SHAKE128")) {
            c = 32;
        } else if (b.equals("SHAKE256")) {
            c = 64;
        } else {
            c = tlVar.c();
        }
        this.b = c;
        int i = 16;
        this.c = 16;
        double d = c * 8;
        int i2 = 0;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            i3 >>= 1;
            if (i3 == 0) {
                break;
            }
            i4++;
        }
        double d2 = i4;
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        int ceil = (int) Math.ceil(d / d2);
        int i5 = ceil * 15;
        int i6 = 0;
        while (true) {
            i5 >>= 1;
            if (i5 == 0) {
                break;
            }
            i6++;
        }
        while (true) {
            i >>= 1;
            if (i == 0) {
                break;
            }
            i2++;
        }
        int floor = ((int) Math.floor(i6 / i2)) + 1 + ceil;
        this.d = floor;
        String b2 = tlVar.b();
        if (b2 != null) {
            if (v51.b.get(v51.a(c, floor, b2)) != null) {
                return;
            }
            StringBuilder b3 = e5.b("cannot find OID for digest algorithm: ");
            b3.append(tlVar.b());
            throw new IllegalArgumentException(b3.toString());
        }
        Map<String, v51> map = v51.b;
        throw new NullPointerException("algorithmName == null");
    }
}