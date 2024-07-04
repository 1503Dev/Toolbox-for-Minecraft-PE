package defpackage;

/* renamed from: qs0  reason: default package */
public final class qs0<T> implements sb<T> {
    public b<T> a;
    public a<T> b;

    /* renamed from: qs0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a<T> {
        void b(Throwable th);
    }

    /* renamed from: qs0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b<T> {
        void b(ol0 ol0Var);
    }

    @Override // defpackage.sb
    public final void a(pb<T> pbVar, Throwable th) {
        a<T> aVar = this.b;
        if (aVar != null) {
            aVar.b(th);
        }
    }

    @Override // defpackage.sb
    public final void b(pb<T> pbVar, ol0<T> ol0Var) {
        b<T> bVar = this.a;
        if (bVar != null) {
            try {
                bVar.b(ol0Var);
            } catch (Exception e) {
                a(pbVar, e);
            }
        }
    }

    public final void c(a aVar) {
        if (this.b != null) {
            throw new IllegalStateException("Can only set the failure callback once");
        }
        this.b = aVar;
    }

    public final void d(b bVar) {
        if (this.a != null) {
            throw new IllegalStateException("Can only set the response callback once");
        }
        this.a = bVar;
    }
}