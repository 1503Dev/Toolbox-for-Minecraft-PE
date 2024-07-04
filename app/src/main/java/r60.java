package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: r60  reason: default package */
public final class r60 {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public r60(long j) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = 150L;
    }

    public r60(long j, long j2, TimeInterpolator timeInterpolator) {
        this.d = 0;
        this.e = 1;
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.a);
        animator.setDuration(this.b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : i4.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r60)) {
            return false;
        }
        r60 r60Var = (r60) obj;
        if (this.a != r60Var.a || this.b != r60Var.b || this.d != r60Var.d || this.e != r60Var.e) {
            return false;
        }
        return b().getClass().equals(r60Var.b().getClass());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return '\n' + r60.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.a + " duration: " + this.b + " interpolator: " + b().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.e + "}\n";
    }
}