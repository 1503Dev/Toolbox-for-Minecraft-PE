package defpackage;

import defpackage.bf0;
import defpackage.jb0;
import java.util.regex.Pattern;

/* renamed from: we0  reason: default package */
public final /* synthetic */ class we0 implements bq, jb0.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ we0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bq
    public final boolean a(Object obj) {
        bf0.c cVar = (bf0.c) obj;
        Pattern pattern = ((xe0) this.a).f;
        return pattern == null || pattern.matcher(cVar.a).find();
    }

    @Override // defpackage.jb0.b
    public final boolean c() {
        xz0 xz0Var = (xz0) this.a;
        if (!xz0Var.n.Q && xz0Var.o.Q) {
            return true;
        }
        return false;
    }
}