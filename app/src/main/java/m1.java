package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;

/* renamed from: m1  reason: default package */
public abstract class m1 extends ViewDataBinding {
    public int e0;
    public CharSequence f0;
    public boolean g0;
    public boolean h0;
    public Runnable i0;
    public Runnable j0;

    public m1(View view, Object obj) {
        super(0, view, obj);
    }

    public abstract void R(boolean z);

    public abstract void S(boolean z);

    public abstract void T(CharSequence charSequence);

    public abstract void U(int i);

    public abstract void V(Runnable runnable);

    public abstract void W(Runnable runnable);
}