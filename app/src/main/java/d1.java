package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: d1  reason: default package */
public final class d1 implements uu0 {
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public char f;
    public Drawable h;
    public Context i;
    public CharSequence j;
    public CharSequence k;
    public int e = 4096;
    public int g = 4096;
    public ColorStateList l = null;
    public PorterDuff.Mode m = null;
    public boolean n = false;
    public boolean o = false;
    public int p = 16;

    public d1(Context context, CharSequence charSequence) {
        this.i = context;
        this.a = charSequence;
    }

    @Override // defpackage.uu0
    public final h1 a() {
        return null;
    }

    @Override // defpackage.uu0
    public final uu0 b(h1 h1Var) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable h = km.h(drawable);
                this.h = h;
                Drawable mutate = h.mutate();
                this.h = mutate;
                if (this.n) {
                    km.f(mutate, this.l);
                }
                if (this.o) {
                    km.g(this.h, this.m);
                }
            }
        }
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f = Character.toLowerCase(c);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f = Character.toLowerCase(c);
        this.g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.p = (z ? 1 : 0) | (this.p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.p = (z ? 2 : 0) | (this.p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final uu0 setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.p = (z ? 16 : 0) | (this.p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.h = cg.b(this.i, i);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.d = c;
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.d = c;
        this.f = Character.toLowerCase(c2);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.d = c;
        this.e = KeyEvent.normalizeMetaState(i);
        this.f = Character.toLowerCase(c2);
        this.g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final uu0 setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.p = (this.p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // defpackage.uu0, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}