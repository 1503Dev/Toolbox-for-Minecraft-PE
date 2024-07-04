package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import java.util.ArrayList;

/* renamed from: mq  reason: default package */
public final class mq extends d {
    public mq(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float c() {
        return this.s.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void d(Rect rect) {
        boolean z;
        if (FloatingActionButton.this.a0) {
            super.d(rect);
            return;
        }
        int i = 0;
        if (this.b && this.s.getSizeDimension() < 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i = (0 - this.s.getSizeDimension()) / 2;
        }
        rect.set(i, i, i, i);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void e() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void f() {
        l();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void g(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.s.isEnabled()) {
                this.s.setElevation(this.d);
                if (this.s.isPressed()) {
                    floatingActionButton = this.s;
                    f = this.f;
                } else if (this.s.isFocused() || this.s.isHovered()) {
                    floatingActionButton = this.s;
                    f = this.e;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.s.setElevation(0.0f);
            floatingActionButton = this.s;
            floatingActionButton.setTranslationZ(f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void h(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.s.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.y, m(f, f3));
            stateListAnimator.addState(d.z, m(f, f2));
            stateListAnimator.addState(d.A, m(f, f2));
            stateListAnimator.addState(d.B, m(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.s, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.s;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.s, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.x);
            stateListAnimator.addState(d.C, animatorSet);
            stateListAnimator.addState(d.D, m(0.0f, 0.0f));
            this.s.setStateListAnimator(stateListAnimator);
        }
        if (n()) {
            l();
            throw null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void k() {
    }

    public final AnimatorSet m(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.s, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.s, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(d.x);
        return animatorSet;
    }

    public final boolean n() {
        boolean z;
        if (!FloatingActionButton.this.a0) {
            if (this.b && this.s.getSizeDimension() < 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }
}