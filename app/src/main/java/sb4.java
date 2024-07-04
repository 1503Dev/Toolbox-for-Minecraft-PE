package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sb4  reason: default package */
public final class sb4 implements nc4 {
    public final ez4 a;
    public final ScheduledExecutorService b;
    public final f64 c;
    public final Context d;
    public final li4 e;
    public final e64 f;
    public final zq3 g;
    public final pt3 h;
    public final String i;

    public sb4(yw2 yw2Var, ScheduledExecutorService scheduledExecutorService, String str, f64 f64Var, Context context, li4 li4Var, e64 e64Var, zq3 zq3Var, pt3 pt3Var) {
        this.a = yw2Var;
        this.b = scheduledExecutorService;
        this.i = str;
        this.c = f64Var;
        this.d = context;
        this.e = li4Var;
        this.f = e64Var;
        this.g = zq3Var;
        this.h = pt3Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 32;
    }

    public final sy4 b(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        sy4 r = sy4.r(zw4.D(new jy4() { // from class: rb4
            @Override // defpackage.jy4
            public final dz4 a() {
                zm2 zm2Var;
                zm2 a;
                final sb4 sb4Var = sb4.this;
                String str2 = str;
                final List list2 = list;
                final Bundle bundle2 = bundle;
                boolean z3 = z;
                boolean z4 = z2;
                sb4Var.getClass();
                final bx2 bx2Var = new bx2();
                if (z4) {
                    e64 e64Var = sb4Var.f;
                    e64Var.getClass();
                    try {
                        e64Var.a.put(str2, e64Var.b.a(str2));
                    } catch (RemoteException e) {
                        sv2.e("Couldn't create RTB adapter : ", e);
                    }
                    e64 e64Var2 = sb4Var.f;
                    if (e64Var2.a.containsKey(str2)) {
                        a = (zm2) e64Var2.a.get(str2);
                    } else {
                        a = null;
                    }
                } else {
                    try {
                        a = sb4Var.g.a(str2);
                    } catch (RemoteException e2) {
                        sv2.e("Couldn't create RTB adapter : ", e2);
                        zm2Var = null;
                    }
                }
                zm2Var = a;
                if (zm2Var == null) {
                    l92 l92Var = x92.e1;
                    w82 w82Var = w82.d;
                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                        int i = h64.U;
                        synchronized (h64.class) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("name", str2);
                                jSONObject.put("signal_error", "Adapter failed to instantiate");
                                if (((Boolean) w82Var.c.a(x92.k1)).booleanValue()) {
                                    jSONObject.put("signal_error_code", 1);
                                }
                                bx2Var.a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    jv5.A.j.getClass();
                    final h64 h64Var = new h64(str2, zm2Var, bx2Var, SystemClock.elapsedRealtime());
                    l92 l92Var2 = x92.j1;
                    w82 w82Var2 = w82.d;
                    if (((Boolean) w82Var2.c.a(l92Var2)).booleanValue()) {
                        sb4Var.b.schedule(new sy2(3, h64Var), ((Long) w82Var2.c.a(x92.c1)).longValue(), TimeUnit.MILLISECONDS);
                    }
                    if (z3) {
                        if (((Boolean) w82Var2.c.a(x92.o1)).booleanValue()) {
                            final zm2 zm2Var2 = zm2Var;
                            sb4Var.a.e(new Runnable() { // from class: pb4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    sb4 sb4Var2 = sb4.this;
                                    zm2 zm2Var3 = zm2Var2;
                                    Bundle bundle3 = bundle2;
                                    List list3 = list2;
                                    h64 h64Var2 = h64Var;
                                    bx2 bx2Var2 = bx2Var;
                                    sb4Var2.getClass();
                                    try {
                                        zm2Var3.J1(new va0(sb4Var2.d), sb4Var2.i, bundle3, (Bundle) list3.get(0), sb4Var2.e.e, h64Var2);
                                    } catch (RemoteException e3) {
                                        bx2Var2.c(e3);
                                    }
                                }
                            });
                        } else {
                            zm2Var.J1(new va0(sb4Var.d), sb4Var.i, bundle2, (Bundle) list2.get(0), sb4Var.e.e, h64Var);
                            return bx2Var;
                        }
                    } else {
                        synchronized (h64Var) {
                            if (!h64Var.T) {
                                try {
                                    if (((Boolean) w82Var2.c.a(x92.k1)).booleanValue()) {
                                        h64Var.R.put("signal_error_code", 0);
                                    }
                                } catch (JSONException unused2) {
                                }
                                h64Var.Q.a(h64Var.R);
                                h64Var.T = true;
                            }
                        }
                        return bx2Var;
                    }
                }
                return bx2Var;
            }
        }, this.a));
        l92 l92Var = x92.j1;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            r = (sy4) zw4.G(r, ((Long) w82Var.c.a(x92.c1)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return zw4.z(r, Throwable.class, new hy3(1, str), this.a);
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.D(new ee4(7, this), this.a);
    }
}