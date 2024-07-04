package defpackage;

/* renamed from: t11  reason: default package */
public final class t11 implements m11 {
    public final /* synthetic */ Class P;
    public final /* synthetic */ l11 Q;

    /* renamed from: t11$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends l11<Object> {
        public final /* synthetic */ Class a;

        public a(Class cls) {
            this.a = cls;
        }

        @Override // defpackage.l11
        public final Object a(c00 c00Var) {
            Object a = t11.this.Q.a(c00Var);
            if (a != null && !this.a.isInstance(a)) {
                StringBuilder b = e5.b("Expected a ");
                b.append(this.a.getName());
                b.append(" but was ");
                b.append(a.getClass().getName());
                throw new e00(b.toString());
            }
            return a;
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Object obj) {
            t11.this.Q.b(i00Var, obj);
        }
    }

    public t11(Class cls, l11 l11Var) {
        this.P = cls;
        this.Q = l11Var;
    }

    @Override // defpackage.m11
    public final <T2> l11<T2> a(xt xtVar, u11<T2> u11Var) {
        Class<? super T2> cls = u11Var.a;
        if (!this.P.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public final String toString() {
        StringBuilder b = e5.b("Factory[typeHierarchy=");
        b.append(this.P.getName());
        b.append(",adapter=");
        b.append(this.Q);
        b.append("]");
        return b.toString();
    }
}