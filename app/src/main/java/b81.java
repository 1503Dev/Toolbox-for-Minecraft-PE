package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: b81  reason: default package */
public final class b81 extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    public b81(b81 b81Var) {
        this.c = null;
        this.d = z71.V;
        if (b81Var != null) {
            this.a = b81Var.a;
            this.b = b81Var.b;
            this.c = b81Var.c;
            this.d = b81Var.d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new a81(this, resources) : new z71(this, resources);
    }
}