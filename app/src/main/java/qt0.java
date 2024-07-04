package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.a;
import defpackage.f1;
import java.lang.ref.WeakReference;

/* renamed from: qt0  reason: default package */
public final class qt0 extends f1 implements f.a {
    public Context R;
    public ActionBarContextView S;
    public f1.a T;
    public WeakReference<View> U;
    public boolean V;
    public f W;

    public qt0(Context context, ActionBarContextView actionBarContextView, f1.a aVar) {
        this.R = context;
        this.S = actionBarContextView;
        this.T = aVar;
        f fVar = new f(actionBarContextView.getContext());
        fVar.l = 1;
        this.W = fVar;
        fVar.e = this;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(f fVar, MenuItem menuItem) {
        return this.T.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(f fVar) {
        i();
        a aVar = this.S.S;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // defpackage.f1
    public final void c() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.S.sendAccessibilityEvent(32);
        this.T.b(this);
    }

    @Override // defpackage.f1
    public final View d() {
        WeakReference<View> weakReference = this.U;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.f1
    public final f e() {
        return this.W;
    }

    @Override // defpackage.f1
    public final MenuInflater f() {
        return new tu0(this.S.getContext());
    }

    @Override // defpackage.f1
    public final CharSequence g() {
        return this.S.getSubtitle();
    }

    @Override // defpackage.f1
    public final CharSequence h() {
        return this.S.getTitle();
    }

    @Override // defpackage.f1
    public final void i() {
        this.T.c(this, this.W);
    }

    @Override // defpackage.f1
    public final boolean j() {
        return this.S.j0;
    }

    @Override // defpackage.f1
    public final void k(View view) {
        this.S.setCustomView(view);
        this.U = view != null ? new WeakReference<>(view) : null;
    }

    @Override // defpackage.f1
    public final void l(int i) {
        m(this.R.getString(i));
    }

    @Override // defpackage.f1
    public final void m(CharSequence charSequence) {
        this.S.setSubtitle(charSequence);
    }

    @Override // defpackage.f1
    public final void n(int i) {
        o(this.R.getString(i));
    }

    @Override // defpackage.f1
    public final void o(CharSequence charSequence) {
        this.S.setTitle(charSequence);
    }

    @Override // defpackage.f1
    public final void p(boolean z) {
        this.Q = z;
        this.S.setTitleOptional(z);
    }
}