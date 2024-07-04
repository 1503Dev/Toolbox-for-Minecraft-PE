package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.l;
import java.util.ArrayList;

public final class e extends BaseAdapter {
    public f P;
    public int Q = -1;
    public boolean R;
    public final boolean S;
    public final LayoutInflater T;
    public final int U;

    public e(f fVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.S = z;
        this.T = layoutInflater;
        this.P = fVar;
        this.U = i;
        b();
    }

    public final void b() {
        f fVar = this.P;
        h hVar = fVar.v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == hVar) {
                    this.Q = i;
                    return;
                }
            }
        }
        this.Q = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final h getItem(int i) {
        ArrayList<h> l;
        if (this.S) {
            f fVar = this.P;
            fVar.i();
            l = fVar.j;
        } else {
            l = this.P.l();
        }
        int i2 = this.Q;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> l;
        if (this.S) {
            f fVar = this.P;
            fVar.i();
            l = fVar.j;
        } else {
            l = this.P.l();
        }
        int i = this.Q;
        int size = l.size();
        if (i < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.T.inflate(this.U, viewGroup, false);
        }
        int i3 = getItem(i).b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.P.m() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        l.a aVar = (l.a) view;
        if (this.R) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}