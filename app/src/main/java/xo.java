package defpackage;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import defpackage.l71;
import defpackage.uc0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: xo  reason: default package */
public final class xo implements Runnable {
    public static final String R = y20.e("EnqueueRunnable");
    public final r61 P;
    public final vc0 Q = new vc0();

    public xo(r61 r61Var) {
        this.P = r61Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(r61 r61Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        a71 a71Var;
        y61 y61Var;
        boolean z9;
        Iterator<? extends k71> it;
        boolean z10;
        r61 r61Var2;
        boolean z11;
        boolean z12;
        Iterator<? extends k71> it2;
        a71 a71Var2;
        boolean z13;
        Class<?> cls;
        y61 y61Var2;
        n71 n71Var;
        sf sfVar;
        String str;
        boolean z14;
        ArrayList arrayList;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        List<r61> list = r61Var.l;
        if (list != null) {
            z = false;
            for (r61 r61Var3 : list) {
                if (!r61Var3.m) {
                    z |= b(r61Var3);
                } else {
                    y20.c().f(R, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", r61Var3.j)), new Throwable[0]);
                }
            }
        } else {
            z = false;
        }
        HashSet E1 = r61.E1(r61Var);
        a71 a71Var3 = r61Var.f;
        List<? extends k71> list2 = r61Var.i;
        String[] strArr = (String[]) E1.toArray(new String[0]);
        String str2 = r61Var.g;
        int i = r61Var.h;
        y61 y61Var3 = y61.ENQUEUED;
        y61 y61Var4 = y61.SUCCEEDED;
        y61 y61Var5 = y61.CANCELLED;
        y61 y61Var6 = y61.FAILED;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = a71Var3.h;
        if (strArr != null && strArr.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int length = strArr.length;
            z3 = z;
            int i2 = 0;
            z4 = true;
            z5 = false;
            z6 = false;
            while (i2 < length) {
                int i3 = length;
                String str3 = strArr[i2];
                l71 i4 = ((n71) workDatabase.n()).i(str3);
                if (i4 == null) {
                    y20.c().b(R, String.format("Prerequisite %s doesn't exist; not enqueuing", str3), new Throwable[0]);
                    break;
                }
                y61 y61Var7 = i4.b;
                if (y61Var7 == y61Var4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z4 &= z18;
                if (y61Var7 == y61Var6) {
                    z6 = true;
                } else if (y61Var7 == y61Var5) {
                    z5 = true;
                }
                i2++;
                length = i3;
            }
        } else {
            z3 = z;
            z4 = true;
            z5 = false;
            z6 = false;
        }
        boolean z19 = !TextUtils.isEmpty(str2);
        if (z19 && !z2) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            ArrayList j = ((n71) workDatabase.n()).j(str2);
            if (!j.isEmpty()) {
                if (i != 3 && i != 4) {
                    if (i == 2) {
                        Iterator it3 = j.iterator();
                        while (it3.hasNext()) {
                            y61 y61Var8 = ((l71.a) it3.next()).b;
                            if (y61Var8 != y61Var3) {
                                if (y61Var8 == y61.RUNNING) {
                                }
                            }
                            z10 = true;
                            z11 = false;
                            r61Var2 = r61Var;
                        }
                    }
                    new zb(a71Var3, str2).run();
                    m71 n = workDatabase.n();
                    Iterator it4 = j.iterator();
                    while (it4.hasNext()) {
                        ((n71) n).a(((l71.a) it4.next()).a);
                    }
                    z8 = z19;
                    a71Var = a71Var3;
                    y61Var = y61Var3;
                    z9 = true;
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    z10 = true;
                    r61Var2 = r61Var;
                    z11 = z9;
                    r61Var2.m = z10;
                    return z3 | z11;
                }
                pk i5 = workDatabase.i();
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = j.iterator();
                while (it5.hasNext()) {
                    Iterator it6 = it5;
                    l71.a aVar = (l71.a) it5.next();
                    boolean z20 = z19;
                    String str4 = aVar.a;
                    y61 y61Var9 = y61Var3;
                    qk qkVar = (qk) i5;
                    qkVar.getClass();
                    pk pkVar = i5;
                    a71 a71Var4 = a71Var3;
                    em0 a = em0.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                    if (str4 == null) {
                        a.y(1);
                    } else {
                        a.E(1, str4);
                    }
                    qkVar.a.b();
                    Cursor g = qkVar.a.g(a);
                    try {
                        if (g.moveToFirst() && g.getInt(0) != 0) {
                            z15 = true;
                            if (!z15) {
                                y61 y61Var10 = aVar.b;
                                if (y61Var10 == y61Var4) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                boolean z21 = z4 & z16;
                                if (y61Var10 == y61Var6) {
                                    z17 = z5;
                                    z6 = true;
                                } else if (y61Var10 == y61Var5) {
                                    z17 = true;
                                } else {
                                    z17 = z5;
                                }
                                arrayList2.add(aVar.a);
                                z5 = z17;
                                z4 = z21;
                            }
                            z19 = z20;
                            it5 = it6;
                            y61Var3 = y61Var9;
                            i5 = pkVar;
                            a71Var3 = a71Var4;
                        }
                        z15 = false;
                        if (!z15) {
                        }
                        z19 = z20;
                        it5 = it6;
                        y61Var3 = y61Var9;
                        i5 = pkVar;
                        a71Var3 = a71Var4;
                    } finally {
                        g.close();
                        a.F();
                    }
                }
                z8 = z19;
                a71Var = a71Var3;
                y61Var = y61Var3;
                if (i == 4 && (z5 || z6)) {
                    n71 n71Var2 = (n71) workDatabase.n();
                    Iterator it7 = n71Var2.j(str2).iterator();
                    while (it7.hasNext()) {
                        n71Var2.a(((l71.a) it7.next()).a);
                    }
                    z14 = false;
                    z6 = false;
                    arrayList = Collections.emptyList();
                } else {
                    z14 = z5;
                    arrayList = arrayList2;
                }
                strArr = (String[]) arrayList.toArray(strArr);
                z5 = z14;
                if (strArr.length > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z9 = false;
                it = list2.iterator();
                while (it.hasNext()) {
                    k71 next = it.next();
                    l71 l71Var = next.b;
                    if (z2 && !z4) {
                        if (z6) {
                            l71Var.b = y61Var6;
                        } else if (z5) {
                            l71Var.b = y61Var5;
                        } else {
                            l71Var.b = y61.BLOCKED;
                        }
                    } else if (!l71Var.c()) {
                        l71Var.n = currentTimeMillis;
                    } else {
                        l71Var.n = 0L;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    try {
                        if (i6 >= 23 && i6 <= 25) {
                            a71Var2 = a71Var;
                        } else if (i6 <= 22) {
                            try {
                                cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                                a71Var2 = a71Var;
                            } catch (ClassNotFoundException unused) {
                                a71Var2 = a71Var;
                            }
                            try {
                                for (mn0 mn0Var : a71Var2.j) {
                                    if (cls.isAssignableFrom(mn0Var.getClass())) {
                                        z13 = true;
                                        break;
                                    }
                                }
                            } catch (ClassNotFoundException unused2) {
                                z13 = false;
                                if (!z13) {
                                }
                                sfVar = l71Var.j;
                                str = l71Var.c;
                                z12 = z9;
                                if (!str.equals(ConstraintTrackingWorker.class.getName())) {
                                    b.a aVar2 = new b.a();
                                    aVar2.a(l71Var.e.a);
                                    it2 = it;
                                    aVar2.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                                    l71Var.c = ConstraintTrackingWorker.class.getName();
                                    b bVar = new b(aVar2.a);
                                    b.b(bVar);
                                    l71Var.e = bVar;
                                    y61Var2 = y61Var;
                                    if (l71Var.b == y61Var2) {
                                    }
                                    n71Var = (n71) workDatabase.n();
                                    n71Var.a.b();
                                    n71Var.a.c();
                                    n71Var.b.e(l71Var);
                                    n71Var.a.h();
                                    if (z2) {
                                    }
                                    while (r0.hasNext()) {
                                    }
                                    if (!z8) {
                                    }
                                    y61Var = y61Var2;
                                    a71Var = a71Var2;
                                    z9 = z12;
                                    it = it2;
                                }
                                it2 = it;
                                y61Var2 = y61Var;
                                if (l71Var.b == y61Var2) {
                                }
                                n71Var = (n71) workDatabase.n();
                                n71Var.a.b();
                                n71Var.a.c();
                                n71Var.b.e(l71Var);
                                n71Var.a.h();
                                if (z2) {
                                }
                                while (r0.hasNext()) {
                                }
                                if (!z8) {
                                }
                                y61Var = y61Var2;
                                a71Var = a71Var2;
                                z9 = z12;
                                it = it2;
                            }
                            z13 = false;
                            if (!z13) {
                                z12 = z9;
                                it2 = it;
                                y61Var2 = y61Var;
                                if (l71Var.b == y61Var2) {
                                    z12 = true;
                                }
                                n71Var = (n71) workDatabase.n();
                                n71Var.a.b();
                                n71Var.a.c();
                                n71Var.b.e(l71Var);
                                n71Var.a.h();
                                if (z2) {
                                    for (String str5 : strArr) {
                                        ok okVar = new ok(next.a.toString(), str5);
                                        qk qkVar2 = (qk) workDatabase.i();
                                        qkVar2.a.b();
                                        qkVar2.a.c();
                                        try {
                                            qkVar2.b.e(okVar);
                                            qkVar2.a.h();
                                            qkVar2.a.f();
                                        } catch (Throwable th) {
                                            qkVar2.a.f();
                                            throw th;
                                        }
                                    }
                                }
                                for (String str6 : next.c) {
                                    p71 o = workDatabase.o();
                                    o71 o71Var = new o71(str6, next.a.toString());
                                    q71 q71Var = (q71) o;
                                    q71Var.a.b();
                                    q71Var.a.c();
                                    try {
                                        q71Var.b.e(o71Var);
                                        q71Var.a.h();
                                    } finally {
                                        q71Var.a.f();
                                    }
                                }
                                if (!z8) {
                                    d71 l = workDatabase.l();
                                    c71 c71Var = new c71(str2, next.a.toString());
                                    e71 e71Var = (e71) l;
                                    e71Var.a.b();
                                    e71Var.a.c();
                                    try {
                                        e71Var.b.e(c71Var);
                                        e71Var.a.h();
                                    } finally {
                                        e71Var.a.f();
                                    }
                                }
                                y61Var = y61Var2;
                                a71Var = a71Var2;
                                z9 = z12;
                                it = it2;
                            }
                        } else {
                            z12 = z9;
                            it2 = it;
                            a71Var2 = a71Var;
                            y61Var2 = y61Var;
                            if (l71Var.b == y61Var2) {
                            }
                            n71Var = (n71) workDatabase.n();
                            n71Var.a.b();
                            n71Var.a.c();
                            n71Var.b.e(l71Var);
                            n71Var.a.h();
                            if (z2) {
                            }
                            while (r0.hasNext()) {
                            }
                            if (!z8) {
                            }
                            y61Var = y61Var2;
                            a71Var = a71Var2;
                            z9 = z12;
                            it = it2;
                        }
                        if (!str.equals(ConstraintTrackingWorker.class.getName()) && (sfVar.d || sfVar.e)) {
                            b.a aVar22 = new b.a();
                            aVar22.a(l71Var.e.a);
                            it2 = it;
                            aVar22.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                            l71Var.c = ConstraintTrackingWorker.class.getName();
                            b bVar2 = new b(aVar22.a);
                            b.b(bVar2);
                            l71Var.e = bVar2;
                            y61Var2 = y61Var;
                            if (l71Var.b == y61Var2) {
                            }
                            n71Var = (n71) workDatabase.n();
                            n71Var.a.b();
                            n71Var.a.c();
                            n71Var.b.e(l71Var);
                            n71Var.a.h();
                            if (z2) {
                            }
                            while (r0.hasNext()) {
                            }
                            if (!z8) {
                            }
                            y61Var = y61Var2;
                            a71Var = a71Var2;
                            z9 = z12;
                            it = it2;
                        }
                        n71Var.b.e(l71Var);
                        n71Var.a.h();
                        if (z2) {
                        }
                        while (r0.hasNext()) {
                        }
                        if (!z8) {
                        }
                        y61Var = y61Var2;
                        a71Var = a71Var2;
                        z9 = z12;
                        it = it2;
                    } finally {
                        n71Var.a.f();
                    }
                    sfVar = l71Var.j;
                    str = l71Var.c;
                    z12 = z9;
                    it2 = it;
                    y61Var2 = y61Var;
                    if (l71Var.b == y61Var2) {
                    }
                    n71Var = (n71) workDatabase.n();
                    n71Var.a.b();
                    n71Var.a.c();
                }
                z10 = true;
                r61Var2 = r61Var;
                z11 = z9;
                r61Var2.m = z10;
                return z3 | z11;
            }
        }
        z8 = z19;
        a71Var = a71Var3;
        y61Var = y61Var3;
        z9 = false;
        it = list2.iterator();
        while (it.hasNext()) {
        }
        z10 = true;
        r61Var2 = r61Var;
        z11 = z9;
        r61Var2.m = z10;
        return z3 | z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            r61 r61Var = this.P;
            r61Var.getClass();
            if (!r61.D1(r61Var, new HashSet())) {
                WorkDatabase workDatabase = this.P.f.h;
                workDatabase.c();
                boolean b = b(this.P);
                workDatabase.h();
                workDatabase.f();
                if (b) {
                    kd0.a(this.P.f.f, RescheduleReceiver.class, true);
                    a71 a71Var = this.P.f;
                    nn0.a(a71Var.g, a71Var.h, a71Var.j);
                }
                this.Q.a(uc0.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.P));
        } catch (Throwable th) {
            this.Q.a(new uc0.a.C0047a(th));
        }
    }
}