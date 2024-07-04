package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* renamed from: q60  reason: default package */
public final class q60 {
    public final os0<String, r60> a = new os0<>();
    public final os0<String, PropertyValuesHolder[]> b = new os0<>();

    public static q60 a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e) {
            StringBuilder b = e5.b("Can't load animation resource ID #0x");
            b.append(Integer.toHexString(i));
            Log.w("MotionSpec", b.toString(), e);
            return null;
        }
    }

    public static q60 b(ArrayList arrayList) {
        q60 q60Var = new q60();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                q60Var.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = i4.c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = i4.d;
                    }
                } else {
                    interpolator = i4.b;
                }
                r60 r60Var = new r60(startDelay, duration, interpolator);
                r60Var.d = objectAnimator.getRepeatCount();
                r60Var.e = objectAnimator.getRepeatMode();
                q60Var.a.put(propertyName, r60Var);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return q60Var;
    }

    public final r60 c(String str) {
        boolean z;
        if (this.a.getOrDefault(str, null) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q60) {
            return this.a.equals(((q60) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return '\n' + q60.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}