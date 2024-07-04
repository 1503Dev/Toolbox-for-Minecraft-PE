package androidx.fragment.app;

import androidx.lifecycle.c;
import java.util.ArrayList;

public abstract class i {
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public ArrayList<a> a = new ArrayList<>();
    public boolean p = false;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public int a;
        public c b;
        public int c;
        public int d;
        public int e;
        public int f;
        public c.EnumC0007c g;
        public c.EnumC0007c h;

        public a() {
        }

        public a(int i, c cVar) {
            this.a = i;
            this.b = cVar;
            c.EnumC0007c enumC0007c = c.EnumC0007c.RESUMED;
            this.g = enumC0007c;
            this.h = enumC0007c;
        }
    }

    public final void b(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.d = this.c;
        aVar.e = this.d;
        aVar.f = this.e;
    }
}