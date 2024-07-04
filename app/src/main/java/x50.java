package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;

/* renamed from: x50  reason: default package */
public abstract class x50 implements bs0, k, AdapterView.OnItemClickListener {
    public Rect P;

    public static int m(e eVar, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = eVar.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = eVar.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = eVar.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean u(f fVar) {
        int size = fVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = fVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean d(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void e(Context context, f fVar) {
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean k(h hVar) {
        return false;
    }

    public abstract void l(f fVar);

    public abstract void n(View view);

    public abstract void o(boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        e eVar;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            eVar = (e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            eVar = (e) listAdapter;
        }
        f fVar = eVar.P;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof b)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        fVar.q(menuItem, this, i2);
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z);

    public abstract void t(int i);
}