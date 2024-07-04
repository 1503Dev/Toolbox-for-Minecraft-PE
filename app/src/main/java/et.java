package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import defpackage.l4;
import java.util.Collections;
import java.util.Set;

/* renamed from: et  reason: default package */
public abstract class et<T extends IInterface> extends k9<T> implements l4.e {
    public final Set<Scope> y;
    public final Account z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public et(Context context, Looper looper, int i, jd jdVar, ff ffVar, zb0 zb0Var) {
        super(context, looper, r3, r4, i, new fi1(ffVar), new ii1(zb0Var), jdVar.f);
        ct5 a = ft.a(context);
        ht htVar = ht.d;
        uf0.f(ffVar);
        uf0.f(zb0Var);
        this.z = jdVar.a;
        Set<Scope> set = jdVar.c;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.y = set;
    }

    @Override // defpackage.l4.e
    public final Set<Scope> b() {
        return l() ? this.y : Collections.emptySet();
    }

    @Override // defpackage.k9
    public final Account q() {
        return this.z;
    }

    @Override // defpackage.k9
    public final void s() {
    }

    @Override // defpackage.k9
    public final Set<Scope> u() {
        return this.y;
    }
}