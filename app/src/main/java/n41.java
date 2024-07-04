package defpackage;

/* renamed from: n41  reason: default package */
public final class n41 {
    public final a a;
    public final o41 b;

    /* renamed from: n41$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        m41 a();
    }

    /* renamed from: n41$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class b implements a {
        @Override // defpackage.n41.a
        public final m41 a() {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract m41 b();
    }

    public n41(o41 o41Var, a aVar) {
        this.a = aVar;
        this.b = o41Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final <T extends m41> T a(Class<T> cls) {
        m41 a2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String b2 = k6.b("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            T t = (T) this.b.a.get(b2);
            if (!cls.isInstance(t)) {
                a aVar = this.a;
                if (aVar instanceof b) {
                    a2 = ((b) aVar).b();
                } else {
                    a2 = aVar.a();
                }
                t = a2;
                m41 put = this.b.a.put(b2, t);
                if (put != null) {
                    put.a();
                }
            }
            return t;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}