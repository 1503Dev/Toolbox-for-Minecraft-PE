package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ee4  reason: default package */
public final class ee4 implements wy4, bz1, i23, wg3, jy4, kg4 {
    public final /* synthetic */ int P;
    public Object Q;

    public /* synthetic */ ee4(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    public static ee4 d(byte[] bArr) {
        return new ee4(10, sc5.a(bArr));
    }

    @Override // defpackage.jy4
    public final dz4 a() {
        sw4 sw4Var;
        Bundle bundle;
        sw4 b;
        Map map;
        sb4 sb4Var = (sb4) this.Q;
        l92 l92Var = x92.w8;
        w82 w82Var = w82.d;
        String lowerCase = ((Boolean) w82Var.c.a(l92Var)).booleanValue() ? sb4Var.e.f.toLowerCase(Locale.ROOT) : sb4Var.e.f;
        f64 f64Var = sb4Var.c;
        String str = sb4Var.i;
        synchronized (f64Var) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(lowerCase) && (map = (Map) f64Var.c.get(str)) != null) {
                List<g64> list = (List) map.get(lowerCase);
                if (list == null) {
                    String f = nu2.f(f64Var.e, lowerCase, str);
                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                        f = f.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(f);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (g64 g64Var : list) {
                        String str2 = g64Var.a;
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        ((List) hashMap.get(str2)).add(g64Var.b);
                    }
                    sw4Var = qv4.b(hashMap);
                }
            }
            sw4Var = sw4.V;
        }
        if (((Boolean) w82.d.c.a(x92.n1)).booleanValue()) {
            pt3 pt3Var = sb4Var.h;
            synchronized (pt3Var) {
                bundle = new Bundle(pt3Var.P);
            }
        } else {
            bundle = new Bundle();
        }
        final Bundle bundle2 = bundle;
        final ArrayList arrayList = new ArrayList();
        sv4<Map.Entry> sv4Var = sw4Var.P;
        if (sv4Var == null) {
            sv4Var = sw4Var.c();
            sw4Var.P = sv4Var;
        }
        for (Map.Entry entry : sv4Var) {
            String str3 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            Bundle bundle3 = sb4Var.e.d.b0;
            arrayList.add(sb4Var.b(str3, list2, bundle3 != null ? bundle3.getBundle(str3) : null, true, true));
        }
        f64 f64Var2 = sb4Var.c;
        synchronized (f64Var2) {
            b = qv4.b(f64Var2.b);
        }
        sv4<Map.Entry> sv4Var2 = b.P;
        if (sv4Var2 == null) {
            sv4Var2 = b.c();
            b.P = sv4Var2;
        }
        for (Map.Entry entry2 : sv4Var2) {
            i64 i64Var = (i64) entry2.getValue();
            String str4 = i64Var.a;
            Bundle bundle4 = sb4Var.e.d.b0;
            arrayList.add(sb4Var.b(str4, Collections.singletonList(i64Var.d), bundle4 != null ? bundle4.getBundle(str4) : null, i64Var.b, i64Var.c));
        }
        return zw4.s(arrayList).a(new Callable() { // from class: qb4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<dz4> list3 = arrayList;
                Bundle bundle5 = bundle2;
                JSONArray jSONArray = new JSONArray();
                for (dz4 dz4Var : list3) {
                    if (((JSONObject) dz4Var.get()) != null) {
                        jSONArray.put(dz4Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new tb4(bundle5, jSONArray.toString());
            }
        }, sb4Var.a);
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r0v38 ?? I:??[int, boolean, short, byte, char])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r105, byte[] r106) {
        /*
            Method dump skipped, instructions count: 2705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee4.b(byte[], byte[]):void");
    }

    public final int c() {
        return ((sc5) this.Q).a.length;
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 5:
                ((s22) obj).h0((r22) this.Q);
                return;
            default:
                ((zr2) obj).a4((tz3) this.Q);
                return;
        }
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        switch (this.P) {
            case 1:
                Boolean bool = (Boolean) obj;
                ((oc3) this.Q).P.a();
                return;
            default:
                ((dw3) this.Q).c.f((hi4) obj);
                return;
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }

    public /* synthetic */ ee4(fz1 fz1Var) {
        this.P = 2;
        this.Q = fz1Var;
    }

    @Override // defpackage.i23
    /* renamed from: a  reason: collision with other method in class */
    public final void mo3a() {
        dj2 dj2Var = (dj2) this.Q;
        final rj2 rj2Var = dj2Var.a;
        final ArrayList arrayList = dj2Var.b;
        final long j = dj2Var.c;
        final qj2 qj2Var = dj2Var.d;
        final ui2 ui2Var = dj2Var.e;
        jv5.A.j.getClass();
        arrayList.add(Long.valueOf(System.currentTimeMillis() - j));
        String valueOf = String.valueOf(arrayList.get(0));
        vz3.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + valueOf + " ms.");
        cu5.i.postDelayed(new Runnable() { // from class: bj2
            @Override // java.lang.Runnable
            public final void run() {
                rj2 rj2Var2 = rj2Var;
                qj2 qj2Var2 = qj2Var;
                ui2 ui2Var2 = ui2Var;
                ArrayList arrayList2 = arrayList;
                long j2 = j;
                synchronized (rj2Var2.a) {
                    if (qj2Var2.b() != -1 && qj2Var2.b() != 1) {
                        qj2Var2.c();
                        zw2.e.execute(new cx1(2, ui2Var2));
                        String valueOf2 = String.valueOf(w82.d.c.a(x92.b));
                        int b = qj2Var2.b();
                        int i = rj2Var2.g;
                        String valueOf3 = String.valueOf(arrayList2.get(0));
                        jv5.A.j.getClass();
                        long currentTimeMillis = System.currentTimeMillis() - j2;
                        vz3.k("Could not receive /jsLoaded in " + valueOf2 + " ms. JS engine session reference status(onEngLoadedTimeout) is " + b + ". Update status(onEngLoadedTimeout) is " + i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + valueOf3 + " ms. Total latency(onEngLoadedTimeout) is " + currentTimeMillis + " ms. Rejecting.");
                    }
                }
            }
        }, (long) ((Integer) w82.d.c.a(x92.b)).intValue());
    }
}