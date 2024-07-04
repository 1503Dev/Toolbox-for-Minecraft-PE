package defpackage;

import com.google.android.gms.common.api.Scope;
import defpackage.k9;
import defpackage.l4;
import java.util.Set;

/* renamed from: ch1  reason: default package */
public final class ch1 implements k9.c, rh1 {
    public final l4.e a;
    public final n4<?> b;
    public rv c = null;
    public Set<Scope> d = null;
    public boolean e = false;
    public final /* synthetic */ lt f;

    public ch1(lt ltVar, l4.e eVar, n4<?> n4Var) {
        this.f = ltVar;
        this.a = eVar;
        this.b = n4Var;
    }

    @Override // defpackage.k9.c
    public final void a(gf gfVar) {
        this.f.b0.post(new bh1(this, gfVar));
    }

    public final void b(gf gfVar) {
        zg1 zg1Var = (zg1) this.f.Y.get(this.b);
        if (zg1Var != null) {
            uf0.a(zg1Var.b0.b0);
            l4.e eVar = zg1Var.Q;
            String name = eVar.getClass().getName();
            String valueOf = String.valueOf(gfVar);
            StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            eVar.d(sb.toString());
            zg1Var.n(gfVar, null);
        }
    }
}