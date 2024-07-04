package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import java.util.ArrayList;

public final class d implements k, AdapterView.OnItemClickListener {
    public Context P;
    public LayoutInflater Q;
    public f R;
    public ExpandedMenuView S;
    public int T;
    public k.a U;
    public a V;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends BaseAdapter {
        public int P = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.R;
            h hVar = fVar.v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == hVar) {
                        this.P = i;
                        return;
                    }
                }
            }
            this.P = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c */
        public final h getItem(int i) {
            f fVar = d.this.R;
            fVar.i();
            ArrayList<h> arrayList = fVar.j;
            d.this.getClass();
            int i2 = i + 0;
            int i3 = this.P;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            f fVar = d.this.R;
            fVar.i();
            int size = fVar.j.size();
            d.this.getClass();
            int i = size + 0;
            if (this.P < 0) {
                return i;
            }
            return i - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                d dVar = d.this;
                view = dVar.Q.inflate(dVar.T, viewGroup, false);
            }
            ((l.a) view).c(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context, int i) {
        this.T = i;
        this.P = context;
        this.Q = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar, boolean z) {
        k.a aVar = this.U;
        if (aVar != null) {
            aVar.b(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean d(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void e(Context context, f fVar) {
        if (this.P != null) {
            this.P = context;
            if (this.Q == null) {
                this.Q = LayoutInflater.from(context);
            }
        }
        this.R = fVar;
        a aVar = this.V;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void f() {
        a aVar = this.V;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean h(o oVar) {
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(oVar);
        b.a aVar = new b.a(oVar.a);
        d dVar = new d(aVar.a.a, ni0.abc_list_menu_item_layout);
        gVar.R = dVar;
        dVar.U = gVar;
        f fVar = gVar.P;
        fVar.b(dVar, fVar.a);
        d dVar2 = gVar.R;
        if (dVar2.V == null) {
            dVar2.V = new a();
        }
        a aVar2 = dVar2.V;
        AlertController.b bVar = aVar.a;
        bVar.l = aVar2;
        bVar.m = gVar;
        View view = oVar.o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.c = oVar.n;
            bVar.d = oVar.m;
        }
        bVar.k = gVar;
        androidx.appcompat.app.b a2 = aVar.a();
        gVar.Q = a2;
        a2.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.Q.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.Q.show();
        k.a aVar3 = this.U;
        if (aVar3 != null) {
            aVar3.c(oVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void j(k.a aVar) {
        this.U = aVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean k(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.R.q(this.V.getItem(i), this, 0);
    }
}