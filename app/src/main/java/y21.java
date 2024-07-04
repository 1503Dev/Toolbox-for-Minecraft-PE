package defpackage;

import defpackage.mz0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y21  reason: default package */
public class y21 {
    public final lw a;
    public final ya0 b = new ya0();

    /* renamed from: y21$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a extends l11<y21> {
        public static final xt c = pr0.a;
        public final mw a;
        public final Map<String, lw> b;

        public a(mw mwVar, HashMap hashMap) {
            this.a = mwVar;
            this.b = hashMap;
        }

        @Override // defpackage.l11
        public final y21 a(c00 c00Var) {
            Object c2;
            xt xtVar = c;
            zz zzVar = (zz) xtVar.c(c00Var, zz.class);
            try {
                lw lwVar = this.b.get(zzVar.r("id").q());
                if (lwVar != null) {
                    y21 b = ((xz0) this.a).b(lwVar);
                    if (zzVar.s("button")) {
                        mz0.a aVar = ((b01) b).f;
                        wz r = zzVar.r("button");
                        if (r == null) {
                            c2 = null;
                        } else {
                            c2 = xtVar.c(new g00(r), mz0.a.class);
                        }
                        mz0.a aVar2 = (mz0.a) ar.n(mz0.a.class).cast(c2);
                        aVar.getClass();
                        if (aVar2 != null) {
                            aVar.a = aVar2.a;
                            aVar.b = aVar2.b;
                        }
                    }
                    if (zzVar.s("enabled")) {
                        b.a(zzVar.r("enabled").g());
                    }
                    return b;
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new a00(e);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, y21 y21Var) {
            y21 y21Var2 = y21Var;
            i00Var.g();
            i00Var.F("id");
            i00Var.O(y21Var2.a.getId());
            i00Var.F("enabled");
            i00Var.P(y21Var2.b.Q);
            xt xtVar = c;
            i00Var.F("button");
            xtVar.k(((b01) y21Var2).f, mz0.a.class, i00Var);
            i00Var.E();
        }
    }

    public y21(lw lwVar) {
        this.a = lwVar;
    }

    public final void a(boolean z) {
        this.b.H(z);
    }
}