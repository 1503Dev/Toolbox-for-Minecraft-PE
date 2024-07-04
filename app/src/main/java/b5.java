package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: b5  reason: default package */
public final class b5 {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public b5(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public final void a() {
        Drawable a = ye.a(this.a);
        if (a != null) {
            if (this.d || this.e) {
                Drawable mutate = km.h(a).mutate();
                if (this.d) {
                    km.f(mutate, this.b);
                }
                if (this.e) {
                    km.g(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x000d, B:5:0x0015, B:7:0x001b, B:12:0x002e, B:14:0x0036, B:16:0x003c, B:17:0x0049, B:19:0x0051, B:20:0x005a, B:22:0x0062, B:24:0x0074, B:25:0x0078, B:27:0x007c), top: B:35:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x000d, B:5:0x0015, B:7:0x001b, B:12:0x002e, B:14:0x0036, B:16:0x003c, B:17:0x0049, B:19:0x0051, B:20:0x005a, B:22:0x0062, B:24:0x0074, B:25:0x0078, B:27:0x007c), top: B:35:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:3:0x000d, B:5:0x0015, B:7:0x001b, B:12:0x002e, B:14:0x0036, B:16:0x003c, B:17:0x0049, B:19:0x0051, B:20:0x005a, B:22:0x0062, B:24:0x0074, B:25:0x0078, B:27:0x007c), top: B:35:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        int resourceId;
        int resourceId2;
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, lj0.CompoundButton, i, 0);
        try {
            int i4 = lj0.CompoundButton_buttonCompat;
            if (obtainStyledAttributes.hasValue(i4) && (resourceId2 = obtainStyledAttributes.getResourceId(i4, 0)) != 0) {
                try {
                    CompoundButton compoundButton = this.a;
                    compoundButton.setButtonDrawable(z5.b(compoundButton.getContext(), resourceId2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z) {
                    int i5 = lj0.CompoundButton_android_button;
                    if (obtainStyledAttributes.hasValue(i5) && (resourceId = obtainStyledAttributes.getResourceId(i5, 0)) != 0) {
                        CompoundButton compoundButton2 = this.a;
                        compoundButton2.setButtonDrawable(z5.b(compoundButton2.getContext(), resourceId));
                    }
                }
                i2 = lj0.CompoundButton_buttonTint;
                if (obtainStyledAttributes.hasValue(i2)) {
                    ye.b(this.a, obtainStyledAttributes.getColorStateList(i2));
                }
                i3 = lj0.CompoundButton_buttonTintMode;
                if (obtainStyledAttributes.hasValue(i3)) {
                    CompoundButton compoundButton3 = this.a;
                    PorterDuff.Mode d = um.d(obtainStyledAttributes.getInt(i3, -1), null);
                    if (Build.VERSION.SDK_INT >= 21) {
                        compoundButton3.setButtonTintMode(d);
                    } else if (compoundButton3 instanceof jx0) {
                        ((jx0) compoundButton3).setSupportButtonTintMode(d);
                    }
                }
            }
            z = false;
            if (!z) {
            }
            i2 = lj0.CompoundButton_buttonTint;
            if (obtainStyledAttributes.hasValue(i2)) {
            }
            i3 = lj0.CompoundButton_buttonTintMode;
            if (obtainStyledAttributes.hasValue(i3)) {
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}