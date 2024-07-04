package androidx.databinding;

import androidx.databinding.c;
import androidx.databinding.g;

public final class d extends c<g.a, g, b> {
    public static final if0<b> U = new if0<>(10);
    public static final a V = new a();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends c.a<g.a, g, b> {
        @Override // androidx.databinding.c.a
        public final void a(int i, Object obj, Object obj2, Object obj3) {
            g.a aVar = (g.a) obj;
            g gVar = (g) obj2;
            b bVar = (b) obj3;
            if (i == 1) {
                aVar.b(gVar, bVar.a, bVar.b);
            } else if (i == 2) {
                aVar.c(gVar, bVar.a, bVar.b);
            } else if (i == 3) {
                aVar.d(gVar, bVar.a, bVar.c, bVar.b);
            } else if (i != 4) {
                aVar.a(gVar);
            } else {
                aVar.e(gVar, bVar.a, bVar.b);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public int a;
        public int b;
        public int c;
    }

    public d() {
        super(V);
    }

    public static b i(int i, int i2, int i3) {
        b a2 = U.a();
        if (a2 == null) {
            a2 = new b();
        }
        a2.a = i;
        a2.c = i2;
        a2.b = i3;
        return a2;
    }

    @Override // androidx.databinding.c
    public final /* bridge */ /* synthetic */ void c(int i, Object obj, Object obj2) {
        throw null;
    }

    public final synchronized void j(g gVar, int i, b bVar) {
        super.c(i, gVar, bVar);
        if (bVar != null) {
            U.b(bVar);
        }
    }
}