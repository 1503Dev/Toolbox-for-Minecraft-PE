package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: e04  reason: default package */
public final class e04 implements wy4 {
    public final /* synthetic */ boolean P;
    public final /* synthetic */ f04 Q;

    public e04(f04 f04Var, boolean z) {
        this.Q = f04Var;
        this.P = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r1.equals("banner") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4 A[SYNTHETIC] */
    @Override // defpackage.wy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj) {
        List emptyList;
        List asList;
        final ArrayList arrayList;
        Iterator it;
        f62 f62Var;
        Bundle bundle = (Bundle) obj;
        if (((f25) this.Q.P).C()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else if (obj2 instanceof String[]) {
            asList = Arrays.asList((String[]) obj2);
        } else {
            emptyList = Collections.emptyList();
            arrayList = new ArrayList();
            it = emptyList.iterator();
            while (true) {
                char c = 0;
                int i = 2;
                if (!it.hasNext()) {
                    String str = (String) it.next();
                    switch (str.hashCode()) {
                        case -1396342996:
                            break;
                        case -1052618729:
                            if (str.equals("native")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                                if (c != 3) {
                                    f62Var = f62.Q;
                                } else {
                                    f62Var = f62.Z;
                                }
                            } else {
                                f62Var = f62.V;
                            }
                        } else {
                            f62Var = f62.S;
                        }
                    } else {
                        f62Var = f62.R;
                    }
                    arrayList.add(f62Var);
                } else {
                    final m72 m72Var = (m72) f04.W.get(hj4.a(hj4.a(bundle, "device"), "network").getInt("active_network_state", -1), m72.Q);
                    f04 f04Var = this.Q;
                    b72 w = e72.w();
                    int i2 = bundle.getInt("cnt", -2);
                    int i3 = bundle.getInt("gnt", 0);
                    if (i2 == -1) {
                        f04Var.V = 2;
                    } else {
                        f04Var.V = 1;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                w.j();
                                e72.E((e72) w.Q, 1);
                            } else {
                                w.j();
                                e72.E((e72) w.Q, 3);
                            }
                        } else {
                            w.j();
                            e72.E((e72) w.Q, 2);
                        }
                        switch (i3) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                            case 16:
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i = 3;
                                break;
                            case 13:
                                i = 5;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        w.j();
                        e72.F((e72) w.Q, i);
                    }
                    final e72 e72Var = (e72) w.h();
                    final boolean z = this.P;
                    ((ez3) this.Q.Q).a(new bl4() { // from class: d04
                        @Override // defpackage.bl4
                        public final Object e(Object obj3) {
                            boolean z2;
                            int i4;
                            long j;
                            long j2;
                            int i5;
                            int i6;
                            long j3;
                            long j4;
                            e04 e04Var = e04.this;
                            boolean z3 = z;
                            ArrayList arrayList2 = arrayList;
                            e72 e72Var2 = e72Var;
                            m72 m72Var2 = m72Var;
                            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                            if (!((f25) e04Var.Q.P).C()) {
                                f04 f04Var2 = e04Var.Q;
                                i72 F = j72.F();
                                F.j();
                                j72.N((j72) F.Q, arrayList2);
                                boolean z4 = false;
                                if (Settings.Global.getInt(f04Var2.R.getContentResolver(), "airplane_mode_on", 0) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                int i7 = 2;
                                if (z2) {
                                    i4 = 2;
                                } else {
                                    i4 = 1;
                                }
                                F.j();
                                j72.w((j72) F.Q, i4);
                                jv5 jv5Var = jv5.A;
                                int h = jv5Var.e.h(f04Var2.R, f04Var2.T);
                                F.j();
                                j72.x((j72) F.Q, h);
                                hz3 hz3Var = f04Var2.U;
                                synchronized (hz3Var.h) {
                                    j = hz3Var.c;
                                }
                                F.j();
                                j72.L((j72) F.Q, j);
                                hz3 hz3Var2 = f04Var2.U;
                                synchronized (hz3Var2) {
                                    synchronized (hz3Var2.j) {
                                        j2 = hz3Var2.e;
                                    }
                                }
                                F.j();
                                j72.M((j72) F.Q, j2);
                                hz3 hz3Var3 = f04Var2.U;
                                synchronized (hz3Var3.g) {
                                    i5 = hz3Var3.b;
                                }
                                F.j();
                                j72.P((j72) F.Q, i5);
                                F.j();
                                j72.Q((j72) F.Q, m72Var2);
                                F.j();
                                j72.O((j72) F.Q, e72Var2);
                                int i8 = f04Var2.V;
                                F.j();
                                j72.y((j72) F.Q, i8);
                                if (z3) {
                                    i6 = 2;
                                } else {
                                    i6 = 1;
                                }
                                F.j();
                                j72.X((j72) F.Q, i6);
                                hz3 hz3Var4 = f04Var2.U;
                                synchronized (hz3Var4) {
                                    synchronized (hz3Var4.f) {
                                        j3 = hz3Var4.a;
                                    }
                                }
                                F.j();
                                j72.R((j72) F.Q, j3);
                                jv5Var.j.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                F.j();
                                j72.K((j72) F.Q, currentTimeMillis);
                                if (Settings.Global.getInt(f04Var2.R.getContentResolver(), "wifi_on", 0) != 0) {
                                    z4 = true;
                                }
                                if (!z4) {
                                    i7 = 1;
                                }
                                F.j();
                                j72.Y((j72) F.Q, i7);
                                byte[] D = ((j72) F.h()).D();
                                p5.z(sQLiteDatabase, z3, true);
                                hz3 hz3Var5 = e04Var.Q.U;
                                synchronized (hz3Var5) {
                                    synchronized (hz3Var5.f) {
                                        j4 = hz3Var5.a;
                                    }
                                }
                                p5.w(sQLiteDatabase, j4, D);
                                return null;
                            }
                            return null;
                        }
                    });
                    return;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = emptyList.iterator();
        while (true) {
            char c2 = 0;
            int i4 = 2;
            if (!it.hasNext()) {
            }
            arrayList.add(f62Var);
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        sv2.d("Failed to get signals bundle");
    }
}