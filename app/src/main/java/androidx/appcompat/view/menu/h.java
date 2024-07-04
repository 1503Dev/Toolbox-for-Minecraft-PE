package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.h1;

public final class h implements uu0 {
    public h1 A;
    public MenuItem.OnActionExpandListener B;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public char j;
    public Drawable l;
    public f n;
    public o o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public int y;
    public View z;
    public int i = 4096;
    public int k = 4096;
    public int m = 0;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public boolean C = false;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements h1.a {
        public a() {
        }
    }

    public h(f fVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.n = fVar;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.d = i4;
        this.e = charSequence;
        this.y = i5;
    }

    public static void c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // defpackage.uu0
    public final h1 a() {
        return this.A;
    }

    @Override // defpackage.uu0
    public final uu0 b(h1 h1Var) {
        h1 h1Var2 = this.A;
        if (h1Var2 != null) {
            h1Var2.a = null;
        }
        this.z = null;
        this.A = h1Var;
        this.n.p(true);
        h1 h1Var3 = this.A;
        if (h1Var3 != null) {
            h1Var3.h(new a());
        }
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = km.h(drawable).mutate();
            if (this.u) {
                km.f(drawable, this.s);
            }
            if (this.v) {
                km.g(drawable, this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        h1 h1Var;
        if ((this.y & 8) != 0) {
            if (this.z == null && (h1Var = this.A) != null) {
                this.z = h1Var.d(this);
            }
            return this.z != null;
        }
        return false;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.n.f(this);
            }
            return false;
        }
        return false;
    }

    public final void f(boolean z) {
        this.x = z ? this.x | 32 : this.x & (-33);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        h1 h1Var = this.A;
        if (h1Var != null) {
            View d = h1Var.d(this);
            this.z = d;
            return d;
        }
        return null;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.m;
        if (i != 0) {
            Drawable b = z5.b(this.n.a, i);
            this.m = 0;
            this.l = b;
            return d(b);
        }
        return null;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.o != null;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        h1 h1Var = this.A;
        return (h1Var == null || !h1Var.g()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.n.a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.a) > 0) {
            inflate.setId(i2);
        }
        f fVar = this.n;
        fVar.k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.j == c) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.n.p(false);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.j == c && this.k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c);
        this.k = KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.x = i2;
        if (i != i2) {
            this.n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        boolean z2;
        int i;
        int i2 = this.x;
        int i3 = 2;
        if ((i2 & 4) != 0) {
            f fVar = this.n;
            fVar.getClass();
            int i4 = this.b;
            int size = fVar.f.size();
            fVar.w();
            for (int i5 = 0; i5 < size; i5++) {
                h hVar = fVar.f.get(i5);
                if (hVar.b == i4) {
                    boolean z3 = true;
                    if ((hVar.x & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && hVar.isCheckable()) {
                        if (hVar != this) {
                            z3 = false;
                        }
                        int i6 = hVar.x;
                        int i7 = i6 & (-3);
                        if (z3) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        int i8 = i | i7;
                        hVar.x = i8;
                        if (i6 != i8) {
                            hVar.n.p(false);
                        }
                    }
                }
            }
            fVar.v();
        } else {
            int i9 = i2 & (-3);
            if (!z) {
                i3 = 0;
            }
            int i10 = i3 | i9;
            this.x = i10;
            if (i2 != i10) {
                this.n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final uu0 setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.x = z ? this.x | 16 : this.x & (-17);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.h == c) {
            return this;
        }
        this.h = c;
        this.n.p(false);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.h == c && this.i == i) {
            return this;
        }
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.h = c;
        this.j = Character.toLowerCase(c2);
        this.n.p(false);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.h = c;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.p(false);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i;
        f fVar = this.n;
        fVar.k = true;
        fVar.p(true);
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.n.a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.p(false);
        o oVar = this.o;
        if (oVar != null) {
            oVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final uu0 setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.x;
        int i3 = i2 & (-9);
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.x = i4;
        if (i2 != i4) {
            z2 = true;
        }
        if (z2) {
            f fVar = this.n;
            fVar.h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        f fVar = this.n;
        fVar.k = true;
        fVar.p(true);
        return this;
    }
}