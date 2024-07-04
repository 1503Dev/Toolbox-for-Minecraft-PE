package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: hy2  reason: default package */
public final class hy2 {
    public final Context a;
    public final String b;
    public final xv2 c;
    public final ja2 d;
    public final la2 e;
    public final kd2 f;
    public final long[] g;
    public final String[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public sx2 n;
    public boolean o;
    public boolean p;
    public long q;

    public hy2(Context context, xv2 xv2Var, String str, la2 la2Var, ja2 ja2Var) {
        ob2 ob2Var = new ob2();
        ob2Var.a("min_1", Double.MIN_VALUE, 1.0d);
        ob2Var.a("1_5", 1.0d, 5.0d);
        ob2Var.a("5_10", 5.0d, 10.0d);
        ob2Var.a("10_20", 10.0d, 20.0d);
        ob2Var.a("20_30", 20.0d, 30.0d);
        ob2Var.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f = new kd2(ob2Var);
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context;
        this.c = xv2Var;
        this.b = str;
        this.e = la2Var;
        this.d = ja2Var;
        String str2 = (String) w82.d.c.a(x92.u);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.h = new String[length];
        this.g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                sv2.h("Unable to parse frame hash target time number.", e);
                this.g[i] = -1;
            }
        }
    }

    public final void a(sx2 sx2Var) {
        ea2.B(this.e, this.d, "vpc2");
        this.i = true;
        this.e.b("vpn", sx2Var.s());
        this.n = sx2Var;
    }

    public final void b() {
        if (((Boolean) cc2.a.d()).booleanValue() && !this.o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.b);
            bundle.putString("player", this.n.s());
            kd2 kd2Var = this.f;
            kd2Var.getClass();
            ArrayList arrayList = new ArrayList(kd2Var.a.length);
            int i = 0;
            while (true) {
                String[] strArr = kd2Var.a;
                if (i >= strArr.length) {
                    break;
                }
                String str = strArr[i];
                double d = kd2Var.c[i];
                double d2 = kd2Var.b[i];
                int i2 = kd2Var.d[i];
                double d3 = i2;
                double d4 = kd2Var.e;
                Double.isNaN(d3);
                Double.isNaN(d4);
                Double.isNaN(d3);
                Double.isNaN(d4);
                Double.isNaN(d3);
                Double.isNaN(d4);
                arrayList.add(new pa2(str, d, d2, d3 / d4, i2));
                i++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pa2 pa2Var = (pa2) it.next();
                bundle.putString("fps_c_".concat(String.valueOf(pa2Var.a)), Integer.toString(pa2Var.e));
                bundle.putString("fps_p_".concat(String.valueOf(pa2Var.a)), Double.toString(pa2Var.d));
            }
            int i3 = 0;
            while (true) {
                long[] jArr = this.g;
                if (i3 < jArr.length) {
                    String str2 = this.h[i3];
                    if (str2 != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i3]).toString()), str2);
                    }
                    i3++;
                } else {
                    cu5 cu5Var = jv5.A.c;
                    Context context = this.a;
                    String str3 = this.c.P;
                    bundle.putString("device", cu5.A());
                    p92 p92Var = x92.a;
                    bundle.putString("eids", TextUtils.join(",", w82.d.a.a()));
                    mv2 mv2Var = n62.f.a;
                    mv2.j(context, str3, bundle, new x93(context, str3));
                    this.o = true;
                    return;
                }
            }
        }
    }

    public final void c(sx2 sx2Var) {
        long j;
        if (this.k && !this.l) {
            if (vz3.m() && !this.l) {
                vz3.k("VideoMetricsMixin first frame");
            }
            ea2.B(this.e, this.d, "vff2");
            this.l = true;
        }
        jv5.A.j.getClass();
        long nanoTime = System.nanoTime();
        if (this.m && this.p && this.q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            kd2 kd2Var = this.f;
            double d = nanoTime - this.q;
            Double.isNaN(nanos);
            Double.isNaN(d);
            Double.isNaN(nanos);
            Double.isNaN(d);
            double d2 = nanos / d;
            kd2Var.e++;
            int i = 0;
            while (true) {
                double[] dArr = kd2Var.c;
                if (i >= dArr.length) {
                    break;
                }
                double d3 = dArr[i];
                if (d3 <= d2 && d2 < kd2Var.b[i]) {
                    int[] iArr = kd2Var.d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d2 < d3) {
                    break;
                }
                i++;
            }
        }
        this.p = this.m;
        this.q = nanoTime;
        long longValue = ((Long) w82.d.c.a(x92.v)).longValue();
        long h = sx2Var.h();
        int i2 = 0;
        while (true) {
            String[] strArr = this.h;
            if (i2 < strArr.length) {
                if (strArr[i2] == null && longValue > Math.abs(h - this.g[i2])) {
                    String[] strArr2 = this.h;
                    int i3 = 8;
                    Bitmap bitmap = sx2Var.getBitmap(8, 8);
                    long j2 = 63;
                    long j3 = 0;
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = 0;
                        while (i5 < i3) {
                            int pixel = bitmap.getPixel(i5, i4);
                            if (Color.green(pixel) + Color.red(pixel) + Color.blue(pixel) > 128) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            j3 |= j << ((int) j2);
                            j2--;
                            i5++;
                            i3 = 8;
                        }
                        i4++;
                        i3 = 8;
                    }
                    strArr2[i2] = String.format("%016X", Long.valueOf(j3));
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }
}