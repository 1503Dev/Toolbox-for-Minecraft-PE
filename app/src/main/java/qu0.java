package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import defpackage.f1;
import java.util.ArrayList;

/* renamed from: qu0  reason: default package */
public final class qu0 extends ActionMode {
    public final Context a;
    public final f1 b;

    /* renamed from: qu0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements f1.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<qu0> c = new ArrayList<>();
        public final os0<Menu, Menu> d = new os0<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // defpackage.f1.a
        public final boolean a(f1 f1Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(f1Var), new w50(this.b, (uu0) menuItem));
        }

        @Override // defpackage.f1.a
        public final void b(f1 f1Var) {
            this.a.onDestroyActionMode(e(f1Var));
        }

        @Override // defpackage.f1.a
        public final boolean c(f1 f1Var, f fVar) {
            ActionMode.Callback callback = this.a;
            qu0 e = e(f1Var);
            Menu orDefault = this.d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new c60(this.b, fVar);
                this.d.put(fVar, orDefault);
            }
            return callback.onPrepareActionMode(e, orDefault);
        }

        @Override // defpackage.f1.a
        public final boolean d(f1 f1Var, f fVar) {
            ActionMode.Callback callback = this.a;
            qu0 e = e(f1Var);
            Menu orDefault = this.d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new c60(this.b, fVar);
                this.d.put(fVar, orDefault);
            }
            return callback.onCreateActionMode(e, orDefault);
        }

        public final qu0 e(f1 f1Var) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                qu0 qu0Var = this.c.get(i);
                if (qu0Var != null && qu0Var.b == f1Var) {
                    return qu0Var;
                }
            }
            qu0 qu0Var2 = new qu0(this.b, f1Var);
            this.c.add(qu0Var2);
            return qu0Var2;
        }
    }

    public qu0(Context context, f1 f1Var) {
        this.a = context;
        this.b = f1Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new c60(this.a, this.b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.P;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.Q;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.P = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }
}