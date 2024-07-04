package defpackage;

import android.content.Context;
import defpackage.of;
import java.util.Collection;

/* renamed from: q61  reason: default package */
public final class q61 implements of.a {
    public static final String d = y20.e("WorkConstraintsTracker");
    public final p61 a;
    public final of<?>[] b;
    public final Object c;

    public q61(Context context, bw0 bw0Var, p61 p61Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = p61Var;
        this.b = new of[]{new t9(applicationContext, bw0Var), new v9(applicationContext, bw0Var), new bu0(applicationContext, bw0Var), new i90(applicationContext, bw0Var), new p90(applicationContext, bw0Var), new k90(applicationContext, bw0Var), new j90(applicationContext, bw0Var)};
        this.c = new Object();
    }

    public final boolean a(String str) {
        of<?>[] ofVarArr;
        boolean z;
        synchronized (this.c) {
            for (of<?> ofVar : this.b) {
                Object obj = ofVar.b;
                if (obj != null && ofVar.c(obj) && ofVar.a.contains(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    y20.c().a(d, String.format("Work %s constrained by %s", str, ofVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(Collection collection) {
        of<?>[] ofVarArr;
        of<?>[] ofVarArr2;
        synchronized (this.c) {
            for (of<?> ofVar : this.b) {
                if (ofVar.d != null) {
                    ofVar.d = null;
                    ofVar.e(null, ofVar.b);
                }
            }
            for (of<?> ofVar2 : this.b) {
                ofVar2.d(collection);
            }
            for (of<?> ofVar3 : this.b) {
                if (ofVar3.d != this) {
                    ofVar3.d = this;
                    ofVar3.e(this, ofVar3.b);
                }
            }
        }
    }

    public final void c() {
        of<?>[] ofVarArr;
        synchronized (this.c) {
            for (of<?> ofVar : this.b) {
                if (!ofVar.a.isEmpty()) {
                    ofVar.a.clear();
                    qf<?> qfVar = ofVar.c;
                    synchronized (qfVar.c) {
                        if (qfVar.d.remove(ofVar) && qfVar.d.isEmpty()) {
                            qfVar.d();
                        }
                    }
                }
            }
        }
    }
}