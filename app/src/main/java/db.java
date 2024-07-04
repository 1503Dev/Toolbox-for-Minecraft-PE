package defpackage;

import defpackage.pg;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: db  reason: default package */
public final class db extends pg.a {
    public boolean a = true;

    /* renamed from: db$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a implements pg<ql0, ql0> {
        public static final a P = new a();

        @Override // defpackage.pg
        public final ql0 b(ql0 ql0Var) {
            ql0 ql0Var2 = ql0Var;
            try {
                za zaVar = new za();
                ql0Var2.y().k(zaVar);
                return new pl0(ql0Var2.t(), ql0Var2.g(), zaVar);
            } finally {
                ql0Var2.close();
            }
        }
    }

    /* renamed from: db$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b implements pg<vk0, vk0> {
        public static final b P = new b();

        @Override // defpackage.pg
        public final vk0 b(vk0 vk0Var) {
            return vk0Var;
        }
    }

    /* renamed from: db$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c implements pg<ql0, ql0> {
        public static final c P = new c();

        @Override // defpackage.pg
        public final ql0 b(ql0 ql0Var) {
            return ql0Var;
        }
    }

    /* renamed from: db$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class d implements pg<Object, String> {
        public static final d P = new d();

        @Override // defpackage.pg
        public final String b(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: db$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class e implements pg<ql0, j21> {
        public static final e P = new e();

        @Override // defpackage.pg
        public final j21 b(ql0 ql0Var) {
            ql0Var.close();
            return j21.a;
        }
    }

    /* renamed from: db$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class f implements pg<ql0, Void> {
        public static final f P = new f();

        @Override // defpackage.pg
        public final Void b(ql0 ql0Var) {
            ql0Var.close();
            return null;
        }
    }

    @Override // defpackage.pg.a
    @Nullable
    public final pg a(Type type) {
        if (vk0.class.isAssignableFrom(d31.e(type))) {
            return b.P;
        }
        return null;
    }

    @Override // defpackage.pg.a
    @Nullable
    public final pg<ql0, ?> b(Type type, Annotation[] annotationArr, vl0 vl0Var) {
        if (type == ql0.class) {
            return d31.h(annotationArr, fu0.class) ? c.P : a.P;
        } else if (type == Void.class) {
            return f.P;
        } else {
            if (this.a && type == j21.class) {
                try {
                    return e.P;
                } catch (NoClassDefFoundError unused) {
                    this.a = false;
                    return null;
                }
            }
            return null;
        }
    }
}