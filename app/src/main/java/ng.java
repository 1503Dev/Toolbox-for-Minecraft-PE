package defpackage;

import defpackage.ug;

/* renamed from: ng  reason: default package */
public abstract class ng extends i9 {
    public transient lg<Object> Q;
    public final ug R;

    public ng() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(lg<Object> lgVar) {
        super(lgVar);
        ug context = lgVar != null ? lgVar.getContext() : null;
        this.R = context;
    }

    @Override // defpackage.i9
    public final void c() {
        lg<Object> lgVar = this.Q;
        if (lgVar != null && lgVar != this) {
            ug ugVar = this.R;
            hy.c(ugVar);
            ug.a aVar = ugVar.get();
            hy.c(aVar);
            ((og) aVar).a();
        }
        this.Q = te.P;
    }

    @Override // defpackage.lg
    public final ug getContext() {
        ug ugVar = this.R;
        hy.c(ugVar);
        return ugVar;
    }
}