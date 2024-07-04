package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import defpackage.k9;
import defpackage.kt;
import defpackage.l4.c;
import java.util.Set;

/* renamed from: l4  reason: default package */
public final class l4<O extends c> {
    public final a<?, O> a;
    public final String b;

    /* renamed from: l4$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a<T extends e, O> extends d<T, O> {
        public e a(Context context, Looper looper, jd jdVar, c cVar, ff ffVar, zb0 zb0Var) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        @Deprecated
        public e b(Context context, Looper looper, jd jdVar, c cVar, kt.a aVar, kt.b bVar) {
            return a(context, looper, jdVar, cVar, aVar, bVar);
        }
    }

    /* renamed from: l4$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b<C> {
    }

    /* renamed from: l4$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
        public static final C0043c a = new C0043c(0);

        /* renamed from: l4$c$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public interface a extends c {
            Account a();
        }

        /* renamed from: l4$c$b */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public interface b extends c {
            GoogleSignInAccount b();
        }

        /* renamed from: l4$c$c  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static final class C0043c implements c {
            public C0043c() {
            }

            public /* synthetic */ C0043c(int i) {
            }
        }
    }

    /* renamed from: l4$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class d<T, O> {
    }

    /* renamed from: l4$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface e {
        boolean a();

        Set<Scope> b();

        void c(yg1 yg1Var);

        void d(String str);

        boolean e();

        int f();

        boolean g();

        wp[] h();

        String i();

        void j(k9.c cVar);

        String k();

        boolean l();

        void m(rv rvVar, Set<Scope> set);
    }

    /* renamed from: l4$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class f<C extends e> extends b<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends e> l4(String str, a<C, O> aVar, f<C> fVar) {
        this.b = str;
        this.a = aVar;
    }
}