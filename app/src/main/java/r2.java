package defpackage;

import android.util.Log;
import defpackage.tv;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: r2  reason: default package */
public final class r2 {
    public final ArrayList a = new ArrayList();

    /* renamed from: r2$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements d {
        public final /* synthetic */ e a;
        public final /* synthetic */ f b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;

        public a(e eVar, f fVar, int i, String str, boolean z) {
            this.a = eVar;
            this.b = fVar;
            this.c = i;
            this.d = str;
            this.e = z;
        }

        public final void a() {
            Log.i("AdLoader", "Ad discarded; reloading");
            f fVar = this.b;
            int i = this.c;
            fVar.a = null;
            fVar.b = i;
            r2.this.a(fVar, this.d, 0);
        }

        public final void b() {
            StringBuilder b = e5.b("Failed to load ad from ");
            b.append(this.a.getClass().getSimpleName());
            Log.i("AdLoader", b.toString());
            if (!this.e) {
                r2.this.a(this.b, this.d, this.c + 1);
            }
        }

        public final void c(c cVar) {
            StringBuilder b = e5.b("Successfully loaded ad from ");
            b.append(this.a.getClass().getSimpleName());
            Log.i("AdLoader", b.toString());
            f fVar = this.b;
            int i = this.c;
            if (i <= fVar.b) {
                fVar.a = cVar;
                fVar.b = i;
            }
        }
    }

    /* renamed from: r2$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements tv.a {
        public boolean a = false;
        public final /* synthetic */ e b;
        public final /* synthetic */ tv.a c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;

        public b(e eVar, tv.a aVar, String str, int i) {
            this.b = eVar;
            this.c = aVar;
            this.d = str;
            this.e = i;
        }

        @Override // defpackage.tv.a
        public final void a() {
            this.c.a();
        }

        @Override // defpackage.tv.a
        public final void b() {
            if (this.a) {
                return;
            }
            StringBuilder b = e5.b("Failed to load ad from ");
            b.append(this.b.getClass().getSimpleName());
            Log.i("AdLoader", b.toString());
            r2.this.b(this.c, this.d, this.e + 1);
        }

        @Override // defpackage.tv.a
        public final void c() {
            StringBuilder b = e5.b("Successfully loaded ad from ");
            b.append(this.b.getClass().getSimpleName());
            Log.i("AdLoader", b.toString());
            this.a = true;
            this.c.c();
        }

        @Override // defpackage.tv.a
        public final void d() {
            this.c.d();
        }
    }

    /* renamed from: r2$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c {
        void a();
    }

    /* renamed from: r2$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface d {
    }

    /* renamed from: r2$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface e {
        boolean a();

        void b(boolean z);

        void c(String str, b bVar);

        void d(String str, a aVar);
    }

    /* renamed from: r2$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class f implements c {
        public c a;
        public int b;

        @Override // defpackage.r2.c
        public final void a() {
            c cVar = this.a;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    public final void a(f fVar, String str, int i) {
        if (i >= this.a.size()) {
            return;
        }
        e eVar = (e) this.a.get(i);
        boolean a2 = eVar.a();
        StringBuilder b2 = e5.b("Loading ad from ");
        b2.append(eVar.getClass().getSimpleName());
        Log.d("AdLoader", b2.toString());
        eVar.d(str, new a(eVar, fVar, i, str, a2));
        if (a2) {
            a(fVar, str, i + 1);
        }
    }

    public final void b(tv.a aVar, String str, int i) {
        if (i >= this.a.size()) {
            aVar.b();
            return;
        }
        e eVar = (e) this.a.get(i);
        StringBuilder b2 = e5.b("Loading ad from ");
        b2.append(eVar.getClass().getSimpleName());
        Log.d("AdLoader", b2.toString());
        eVar.c(str, new b(eVar, aVar, str, i));
    }

    public final void c(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(z);
        }
    }
}