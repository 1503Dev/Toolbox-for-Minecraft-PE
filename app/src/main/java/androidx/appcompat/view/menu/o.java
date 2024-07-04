package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class o extends f implements SubMenu {
    public h A;
    public f z;

    public o(Context context, f fVar, h hVar) {
        super(context);
        this.z = fVar;
        this.A = hVar;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean d(h hVar) {
        return this.z.d(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean e(f fVar, MenuItem menuItem) {
        return super.e(fVar, menuItem) || this.z.e(fVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean f(h hVar) {
        return this.z.f(hVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.f
    public final String j() {
        int i;
        h hVar = this.A;
        if (hVar != null) {
            i = hVar.a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // androidx.appcompat.view.menu.f
    public final f k() {
        return this.z.k();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean m() {
        return this.z.m();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean n() {
        return this.z.n();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean o() {
        return this.z.o();
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }
}