package defpackage;

import defpackage.n41;
import java.io.PrintWriter;

/* renamed from: m20  reason: default package */
public final class m20 extends z61 {
    public final b10 f;
    public final b g;

    /* renamed from: m20$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a<D> extends v60<D> {
        @Override // androidx.lifecycle.LiveData
        public final void d() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void e() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void f(kb0<? super D> kb0Var) {
            super.f(kb0Var);
        }

        @Override // defpackage.v60, androidx.lifecycle.LiveData
        public final void g(D d) {
            super.g(d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            vj.g(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: m20$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends m41 {
        public static final a c = new a();
        public nt0<a> b = new nt0<>();

        /* renamed from: m20$b$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements n41.a {
            @Override // defpackage.n41.a
            public final m41 a() {
                return new b();
            }
        }

        @Override // defpackage.m41
        public final void a() {
            if (this.b.f() <= 0) {
                nt0<a> nt0Var = this.b;
                int i = nt0Var.S;
                Object[] objArr = nt0Var.R;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                nt0Var.S = 0;
                nt0Var.P = false;
                return;
            }
            this.b.h(0).getClass();
            throw null;
        }
    }

    public m20(b10 b10Var, o41 o41Var) {
        this.f = b10Var;
        this.g = (b) new n41(o41Var, b.c).a(b.class);
    }

    @Deprecated
    public final void D1(String str, PrintWriter printWriter) {
        b bVar = this.g;
        if (bVar.b.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (bVar.b.f() > 0) {
                a h = bVar.b.h(0);
                printWriter.print(str);
                printWriter.print("  #");
                nt0<a> nt0Var = bVar.b;
                if (nt0Var.P) {
                    nt0Var.c();
                }
                printWriter.print(nt0Var.Q[0]);
                printWriter.print(": ");
                printWriter.println(h.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        vj.g(this.f, sb);
        sb.append("}}");
        return sb.toString();
    }
}