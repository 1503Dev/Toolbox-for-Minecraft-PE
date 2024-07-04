package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.lang.reflect.Method;

/* renamed from: b60  reason: default package */
public final class b60 extends x10 implements v50 {
    public static Method s0;
    public v50 r0;

    /* renamed from: b60$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends wm {
        public final int f0;
        public final int g0;
        public v50 h0;
        public h i0;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f0 = 21;
                this.g0 = 22;
                return;
            }
            this.f0 = 22;
            this.g0 = 21;
        }

        @Override // defpackage.wm, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.h0 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                e eVar = (e) adapter;
                h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < eVar.getCount()) {
                    hVar = eVar.getItem(i2);
                }
                h hVar2 = this.i0;
                if (hVar2 != hVar) {
                    f fVar = eVar.P;
                    if (hVar2 != null) {
                        this.h0.b(fVar, hVar2);
                    }
                    this.i0 = hVar;
                    if (hVar != null) {
                        this.h0.e(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f0) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.g0) {
                setSelection(-1);
                ((e) getAdapter()).P.c(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        public void setHoverListener(v50 v50Var) {
            this.h0 = v50Var;
        }

        @Override // defpackage.wm, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                s0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public b60(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // defpackage.v50
    public final void b(f fVar, MenuItem menuItem) {
        v50 v50Var = this.r0;
        if (v50Var != null) {
            v50Var.b(fVar, menuItem);
        }
    }

    @Override // defpackage.v50
    public final void e(f fVar, h hVar) {
        v50 v50Var = this.r0;
        if (v50Var != null) {
            v50Var.e(fVar, hVar);
        }
    }

    @Override // defpackage.x10
    public final wm q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}