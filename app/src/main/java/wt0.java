package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: wt0  reason: default package */
public final class wt0 {
    public final ArrayList<b> a = new ArrayList<>();
    public b b = null;
    public ValueAnimator c = null;
    public final a d = new a();

    /* renamed from: wt0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            wt0 wt0Var = wt0.this;
            if (wt0Var.c == animator) {
                wt0Var.c = null;
            }
        }
    }

    /* renamed from: wt0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final int[] a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }
}