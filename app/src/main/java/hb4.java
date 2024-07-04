package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: hb4  reason: default package */
public final /* synthetic */ class hb4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc4 b;

    public /* synthetic */ hb4(nc4 nc4Var, int i) {
        this.a = i;
        this.b = nc4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.n2)).booleanValue() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.p2)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        r10 = defpackage.fr4.f(r0);
        r11 = ((java.lang.Long) defpackage.w82.d.c.a(defpackage.x92.y2)).longValue();
        r14 = defpackage.jv5.A.g.b().C();
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
        monitor-enter(defpackage.fr4.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
        r6 = r10.a(r11, null, r14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
        monitor-exit(defpackage.fr4.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.o2)).booleanValue() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
        if (((java.lang.Boolean) defpackage.w82.d.c.a(defpackage.x92.q2)).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
        r0 = defpackage.gr4.f(r0);
        r11 = ((java.lang.Long) defpackage.w82.d.c.a(defpackage.x92.z2)).longValue();
        r14 = defpackage.jv5.A.g.b().C();
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
        monitor-enter(defpackage.gr4.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
        if (r0.f.b.getBoolean("paidv2_publisher_option", true) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
        r6 = new defpackage.cr4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
        r6 = r0.a(r11, null, r14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0100, code lost:
        monitor-exit(defpackage.gr4.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
        r4 = r0.f.b.getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0115, code lost:
        r8 = r0.f.b.getBoolean("paidv2_user_option", true);
        r7 = r4;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        int i;
        boolean z;
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                ib4 ib4Var = (ib4) this.b;
                ib4Var.getClass();
                try {
                    Context context = ib4Var.a;
                    boolean b = ib4Var.c.b();
                    cr4 cr4Var = new cr4();
                    cr4 cr4Var2 = new cr4();
                    if (b) {
                        if (!((Boolean) w82.d.c.a(x92.r2)).booleanValue()) {
                            return new jb4(true);
                        }
                    }
                    if (!b) {
                        break;
                    }
                    if (b) {
                        break;
                    }
                    if (!b) {
                        break;
                    }
                    if (b) {
                        break;
                    }
                    cr4 cr4Var3 = cr4Var2;
                    boolean z2 = true;
                    boolean z3 = true;
                    return new jb4(cr4Var, cr4Var3, z2, z3, b);
                } catch (IOException e) {
                    jv5.A.g.f("PerAppIdSignal", e);
                    return new jb4(ib4Var.c.b());
                }
            default:
                xc4 xc4Var = (xc4) this.b;
                TelephonyManager telephonyManager = (TelephonyManager) xc4Var.b.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                jv5 jv5Var = jv5.A;
                cu5 cu5Var = jv5Var.c;
                int i4 = -1;
                if (cu5.E(xc4Var.b, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) xc4Var.b.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                        i3 = type;
                        i4 = ordinal;
                    } else {
                        i3 = -1;
                    }
                    z = connectivityManager.isActiveNetworkMetered();
                    i2 = i4;
                    i = i3;
                } else {
                    i = -2;
                    z = false;
                    i2 = -1;
                }
                return new wc4(networkOperator, i, jv5Var.e.k(xc4Var.b), phoneType, z, i2);
        }
    }
}