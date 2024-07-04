package defpackage;

import android.content.Context;
import defpackage.iw;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xc0  reason: default package */
public abstract class xc0 implements iw {
    public final io.mrarm.mctoolbox.bridge.a a;
    public tv b;
    public uv c;
    public int d;
    public String e;
    public String f;
    public int g;
    public int h;
    private final a.InterfaceC0035a i = new a.InterfaceC0035a() { // from class: wc0
        @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
        public final void a() {
            xc0 xc0Var = xc0.this;
            xc0Var.getClass();
            h21.a(new ly0(1, xc0Var));
        }
    };
    public transient ArrayList j = new ArrayList();

    /* renamed from: xc0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a implements lw {
        public xc0 a;

        public a(xc0 xc0Var) {
            this.a = xc0Var;
        }

        @Override // defpackage.lw
        public final int b(Context context) {
            int i = this.a.h;
            if (i == 0) {
                return context.getResources().getColor(2131099863);
            }
            return i;
        }

        @Override // defpackage.lw
        public final int c(Context context) {
            return this.a.g;
        }

        @Override // defpackage.lw
        public final String e(Context context) {
            return this.a.f(context);
        }

        @Override // defpackage.lw
        public final String getId() {
            return this.a.f.replace('/', '+');
        }
    }

    public xc0(io.mrarm.mctoolbox.bridge.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.iw
    public final void a(iw.a aVar) {
        this.j.remove(aVar);
    }

    @Override // defpackage.iw
    public final void b(iw.a aVar) {
        this.j.add(aVar);
    }

    @Override // defpackage.iw
    public /* synthetic */ void c(rz0 rz0Var) {
    }

    public final String f(Context context) {
        int i = this.d;
        return i != 0 ? context.getString(i) : this.e;
    }

    public void g() {
    }

    public final void h() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((iw.a) it.next()).a(this);
        }
    }

    public void i(Context context, zz zzVar) {
        if (zzVar.s("label")) {
            this.e = zzVar.r("label").q();
            this.d = context.getResources().getIdentifier(this.e, "string", context.getPackageName());
        }
        if (zzVar.s("icon")) {
            this.g = context.getResources().getIdentifier(zzVar.r("icon").q(), "drawable", context.getPackageName());
        }
        if (zzVar.s("path")) {
            j(zzVar.r("path").q());
        }
    }

    public void j(String str) {
        String str2 = this.f;
        if (str2 != null) {
            ((b) this.a).W(str2, this.i);
        }
        this.f = str;
        if (str != null) {
            ((b) this.a).P(str, this.i);
        }
        g();
    }
}