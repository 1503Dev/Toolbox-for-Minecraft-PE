package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.j00;
import java.lang.ref.WeakReference;

/* renamed from: m5  reason: default package */
public class m5 extends Dialog implements y4 {
    public f5 P;
    public final a Q;

    /* renamed from: m5$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements j00.a {
        public a() {
        }

        @Override // defpackage.j00.a
        public final boolean e(KeyEvent keyEvent) {
            return m5.this.c(keyEvent);
        }
    }

    public m5(Context context, int i) {
        super(context, b(context, i));
        this.Q = new a();
        c5 a2 = a();
        ((f5) a2).B0 = b(context, i);
        a2.j();
    }

    private static int b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ih0.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    public final c5 a() {
        if (this.P == null) {
            g7<WeakReference<c5>> g7Var = c5.P;
            this.P = new f5(getContext(), getWindow(), this, this);
        }
        return this.P;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return j00.b(this.Q, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // defpackage.y4
    public final void f() {
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) a().e(i);
    }

    @Override // defpackage.y4
    public final void h() {
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        a().h();
    }

    @Override // defpackage.y4
    public final void j() {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().g();
        super.onCreate(bundle);
        a().j();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().o();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().r(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().s(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().t(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        a().v(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().v(charSequence);
    }
}