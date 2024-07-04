package androidx.recyclerview.widget;

import android.view.View;

public final class z {
    public final b a;
    public a b = new a();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public int a = 0;
        public int b;
        public int c;
        public int d;
        public int e;

        public final boolean a() {
            int i = this.a;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.d;
                int i4 = this.b;
                if ((((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) << 0) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.d;
                int i6 = this.c;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.e;
                int i8 = this.b;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.e;
                int i10 = this.c;
                if (i9 > i10) {
                    i2 = 1;
                } else if (i9 != i10) {
                    i2 = 4;
                }
                if ((i & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        int a();

        int b(View view);

        View c(int i);

        int d();

        int e(View view);
    }

    public z(b bVar) {
        this.a = bVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        int i5;
        int d = this.a.d();
        int a2 = this.a.a();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View c = this.a.c(i);
            int b2 = this.a.b(c);
            int e = this.a.e(c);
            a aVar = this.b;
            aVar.b = d;
            aVar.c = a2;
            aVar.d = b2;
            aVar.e = e;
            if (i3 != 0) {
                aVar.a = i3 | 0;
                if (aVar.a()) {
                    return c;
                }
            }
            if (i4 != 0) {
                a aVar2 = this.b;
                aVar2.a = i4 | 0;
                if (aVar2.a()) {
                    view = c;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        a aVar = this.b;
        int d = this.a.d();
        int a2 = this.a.a();
        int b2 = this.a.b(view);
        int e = this.a.e(view);
        aVar.b = d;
        aVar.c = a2;
        aVar.d = b2;
        aVar.e = e;
        a aVar2 = this.b;
        aVar2.a = 24579 | 0;
        return aVar2.a();
    }
}