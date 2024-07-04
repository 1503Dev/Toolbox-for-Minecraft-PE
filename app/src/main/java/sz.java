package defpackage;

import android.content.Context;
import defpackage.iw;
import io.mrarm.mctoolbox.bridge.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: sz  reason: default package */
public class sz implements vv {
    @wq0("android_icon")
    private String a;
    @wq0("name")
    private String b;
    @wq0("help_id")
    private String c;
    @wq0("shortcut_color")
    private String d;
    public int e;
    @wq0("items")
    private List<iw> f;
    @wq0("shortcuts")
    private List<lw> g;
    public transient int h;
    public transient int i;
    public transient ArrayList j = new ArrayList();
    public transient rz k = new iw.a() { // from class: rz
        @Override // defpackage.iw.a
        public final void a(iw iwVar) {
            Iterator it = sz.this.j.iterator();
            while (it.hasNext()) {
                ((iw.a) it.next()).a(iwVar);
            }
        }
    };

    @Override // defpackage.vv
    public final void a(iw.a aVar) {
        this.j.remove(aVar);
    }

    @Override // defpackage.vv
    public final void b(iw.a aVar) {
        this.j.add(aVar);
    }

    @Override // defpackage.vv
    public final String c() {
        return this.c;
    }

    @Override // defpackage.vv
    public final List<lw> d() {
        return this.g;
    }

    @Override // defpackage.vv
    public final int e() {
        return this.h;
    }

    @Override // defpackage.vv
    public final void f(oj ojVar) {
        List<iw> list = this.f;
        if (list == null) {
            return;
        }
        for (iw iwVar : list) {
            iwVar.e(ojVar, true);
        }
    }

    @Override // defpackage.vv
    public final String g(Context context) {
        int i = this.i;
        return i != 0 ? context.getString(i) : this.b;
    }

    public void h(Context context, b bVar) {
        if (this.a != null) {
            this.h = context.getResources().getIdentifier(this.a, "drawable", context.getPackageName());
        }
        if (this.b != null) {
            this.i = context.getResources().getIdentifier(this.b, "string", context.getPackageName());
        }
        if (this.d != null) {
            this.e = context.getResources().getColor(context.getResources().getIdentifier(this.d, "color", context.getPackageName()));
            for (iw iwVar : this.f) {
                if (iwVar instanceof xc0) {
                    xc0 xc0Var = (xc0) iwVar;
                    if (xc0Var.h == 0) {
                        xc0Var.h = this.e;
                    }
                }
            }
        }
        for (iw iwVar2 : this.f) {
            iwVar2.b(this.k);
        }
        ArrayList arrayList = new ArrayList();
        for (iw iwVar3 : this.f) {
            iwVar3.c(new rz0(arrayList));
        }
        this.g = Collections.unmodifiableList(arrayList);
    }
}