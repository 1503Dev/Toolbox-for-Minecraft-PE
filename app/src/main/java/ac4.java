package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: ac4  reason: default package */
public final /* synthetic */ class ac4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ac4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Long l = null;
        switch (this.a) {
            case 0:
                bc4 bc4Var = (bc4) this.b;
                if (!bc4Var.a.j(bc4Var.c)) {
                    return new cc4(null, null, null, null, null);
                }
                String h = bc4Var.a.h(bc4Var.c);
                if (h == null) {
                    h = "";
                }
                String str2 = h;
                String g = bc4Var.a.g(bc4Var.c);
                if (g == null) {
                    g = "";
                }
                String str3 = g;
                String f = bc4Var.a.f(bc4Var.c);
                if (f == null) {
                    f = "";
                }
                String str4 = f;
                qt2 qt2Var = bc4Var.a;
                Context context = bc4Var.c;
                if (!qt2Var.j(context)) {
                    str = null;
                } else {
                    synchronized (qt2Var.b) {
                        str = qt2Var.d;
                        if (str == null) {
                            if (qt2.k(context)) {
                                String str5 = qt2Var.d;
                                synchronized (qt2Var.j) {
                                    if (((m23) qt2Var.j.get()) != null) {
                                        try {
                                            str5 = ((m23) qt2Var.j.get()).b();
                                        } catch (Exception unused) {
                                            qt2Var.c("getAppIdOrigin", false);
                                        }
                                    }
                                }
                                qt2Var.d = str5;
                            } else {
                                qt2Var.d = "fa";
                            }
                            str = qt2Var.d;
                        }
                    }
                }
                if (str == null) {
                    str = "";
                }
                if ("TIME_OUT".equals(str3)) {
                    l = (Long) w82.d.c.a(x92.Z);
                }
                return new cc4(str2, str3, str4, str, l);
            default:
                ((cl4) this.b).a();
                return null;
        }
    }
}