package defpackage;

import android.content.Context;
import android.util.Pair;
import androidx.databinding.e;
import androidx.databinding.f;
import androidx.databinding.g;
import defpackage.jb0;
import defpackage.r01;
import defpackage.vr0;
import defpackage.xs0;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: vr0  reason: default package */
public final class vr0 extends fj {
    public static final lj h;
    public static final lj i;
    public Pattern f;
    public final ArrayList g = new ArrayList();

    /* renamed from: vr0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final lw a;
        public y21 b;
        public final ya0 c;

        public a(final mw mwVar, final lw lwVar) {
            boolean z;
            this.a = lwVar;
            y21 y21Var = (y21) ((xz0) mwVar).j.get(lwVar);
            this.b = y21Var;
            if (y21Var != null) {
                z = true;
            } else {
                z = false;
            }
            ya0 ya0Var = new ya0(z);
            this.c = ya0Var;
            ya0Var.a(new xs0(new xs0.a() { // from class: ur0
                @Override // defpackage.xs0.a
                public final void a() {
                    y21 y21Var2;
                    vr0.a aVar = vr0.a.this;
                    mw mwVar2 = mwVar;
                    lw lwVar2 = lwVar;
                    if (aVar.c.Q) {
                        y21Var2 = ((xz0) mwVar2).b(lwVar2);
                    } else {
                        y21 y21Var3 = aVar.b;
                        if (y21Var3 != null) {
                            xz0 xz0Var = (xz0) mwVar2;
                            if (xz0Var.j.containsKey(y21Var3.a)) {
                                if (xz0Var.j.get(y21Var3.a) == y21Var3) {
                                    y21Var3.a(false);
                                    xz0Var.j.remove(y21Var3.a);
                                    xz0Var.i.remove(y21Var3);
                                    xz0Var.e.a();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            y21Var2 = null;
                        } else {
                            return;
                        }
                    }
                    aVar.b = y21Var2;
                }
            }));
        }
    }

    static {
        int i2 = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131492987;
        ljVar.e = 19;
        h = ljVar;
        lj ljVar2 = new lj();
        ljVar2.d = 2131492989;
        ljVar2.e = 44;
        i = ljVar2;
    }

    public vr0(final Context context, g21 g21Var, mw mwVar) {
        oj ojVar = new oj();
        ojVar.b = this;
        for (vv vvVar : g21Var.b) {
            if (vvVar.d() != null) {
                f fVar = new f();
                for (lw lwVar : vvVar.d()) {
                    fVar.add(new a(mwVar, lwVar));
                }
                cb0 cb0Var = new cb0(fVar, new bq() { // from class: sr0
                    @Override // defpackage.bq
                    public final boolean a(Object obj) {
                        vr0 vr0Var = vr0.this;
                        Context context2 = context;
                        vr0.a aVar = (vr0.a) obj;
                        Pattern pattern = vr0Var.f;
                        return pattern == null || pattern.matcher(aVar.a.e(context2)).find();
                    }
                });
                this.g.add(new Pair(cb0Var, Integer.valueOf(fVar.size())));
                ct0 ct0Var = new ct0(vvVar.g(context), i);
                final db0 db0Var = new db0(cb0Var);
                final tr0 tr0Var = new tr0();
                ojVar.o(new af(ct0Var, new r01(db0Var, new r01.a() { // from class: ib0
                    @Override // defpackage.r01.a
                    public final boolean a(e eVar) {
                        jb0.c cVar = tr0Var;
                        bb0 bb0Var = (bb0) eVar;
                        int H = db0Var.H();
                        ((tr0) cVar).getClass();
                        return H > 0;
                    }
                })));
                ojVar.o(new s10((g) cb0Var, h));
            }
        }
        m(ojVar);
    }
}