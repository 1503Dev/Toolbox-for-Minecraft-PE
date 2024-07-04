package defpackage;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import defpackage.el0;
import defpackage.hs0;
import defpackage.vl0;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

/* renamed from: ns0  reason: default package */
public final class ns0 {
    public final Context a;
    public final nw b;
    public final el0 c;
    public hs0 d;
    public long e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public boolean h;

    /* renamed from: ns0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void c();
    }

    /* renamed from: ns0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b {
        public final hs0.a a;

        public b(hs0.a aVar) {
            this.a = aVar;
        }
    }

    /* renamed from: ns0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
        void a(rs0 rs0Var);

        void b();
    }

    public ns0(Context context) {
        this.a = context;
        if (el0.e == null) {
            el0.e = new el0(context.getApplicationContext());
        }
        this.c = el0.e;
        vl0.b bVar = new vl0.b();
        bVar.a("https://ads.mctoolbox.app/v1/");
        bVar.c.add(new zt(new xt()));
        this.b = (nw) bVar.b().b(nw.class);
    }

    public final void a(a aVar, Runnable runnable) {
        if (this.d != null && System.currentTimeMillis() < this.e) {
            aVar.c();
            return;
        }
        this.f.add(aVar);
        this.g.add(runnable);
        if (this.h) {
            return;
        }
        this.h = true;
        pb<hs0> a2 = this.b.a(1);
        qs0 qs0Var = new qs0();
        qs0Var.d(new re0(this));
        qs0Var.c(new se0(this));
        a2.g(qs0Var);
    }

    public final void b(b bVar, String str, int i, c cVar) {
        String str2;
        hs0.a aVar = bVar.a;
        el0 el0Var = this.c;
        String[] strArr = {aVar.c};
        String[] strArr2 = {aVar.d};
        ms0 ms0Var = new ms0(this, aVar, str, i, cVar);
        el0Var.getClass();
        el0.c cVar2 = new el0.c(strArr, strArr2, ms0Var);
        int i2 = 0;
        while (true) {
            String[] strArr3 = cVar2.a;
            if (i2 < strArr3.length) {
                el0 el0Var2 = el0.this;
                String str3 = strArr3[i2];
                String str4 = cVar2.b[i2];
                el0Var2.getClass();
                try {
                    str2 = Base64.encodeToString(MessageDigest.getInstance("MD5").digest(str3.getBytes(StandardCharsets.UTF_8)), 0);
                } catch (Exception unused) {
                    str2 = null;
                }
                if (str2 == null) {
                    Log.e("ResourceLoader", "Failed to get destination file name for: " + str3);
                    cVar2.b();
                } else {
                    File file = new File(el0Var2.c, str2);
                    if (!el0Var2.d.containsKey(str3)) {
                        el0Var2.d.put(str3, new el0.b(str3, str4, file));
                    }
                    el0.b bVar2 = el0Var2.d.get(str3);
                    bVar2.d.add(cVar2);
                    if (bVar2.d.size() == 1) {
                        el0.this.b.execute(new iz(3, bVar2));
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final b c(String str) {
        float f;
        hs0.a aVar;
        boolean z;
        if (this.d == null) {
            return null;
        }
        Context context = this.a;
        if (c3.c == null) {
            c3.c = new c3(context.getApplicationContext());
        }
        int i = c3.c.b;
        hs0 hs0Var = this.d;
        float[] fArr = hs0Var.c;
        float f2 = 0.0f;
        if (fArr.length > 0) {
            f = fArr[Math.min(i, fArr.length - 1)];
        } else {
            f = 0.0f;
        }
        if (hs0Var.d.length != 0 && Math.random() < f) {
            hs0.a[] aVarArr = hs0Var.d;
            hs0.a[] aVarArr2 = new hs0.a[aVarArr.length];
            int i2 = 0;
            for (hs0.a aVar2 : aVarArr) {
                String[] strArr = aVar2.b;
                int length = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        if (strArr[i3].equals(str)) {
                            z = true;
                            break;
                        }
                        i3++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    aVarArr2[i2] = aVar2;
                    f2 += aVar2.h;
                    i2++;
                }
            }
            if (i2 != 0) {
                double random = Math.random();
                double d = f2;
                Double.isNaN(d);
                Double.isNaN(d);
                Double.isNaN(d);
                float f3 = (float) (random * d);
                for (int i4 = 0; i4 < i2; i4++) {
                    aVar = aVarArr2[i4];
                    float f4 = aVar.h;
                    if (f3 <= f4) {
                        break;
                    }
                    f3 -= f4;
                }
            }
        }
        aVar = null;
        if (aVar == null) {
            return null;
        }
        return new b(aVar);
    }
}