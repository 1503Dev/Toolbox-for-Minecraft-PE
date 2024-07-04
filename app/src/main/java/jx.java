package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: jx  reason: default package */
public final class jx {
    public final Context a;
    public final TextInputLayout b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;
    public int f;
    public Animator g;
    public final float h;
    public int i;
    public int j;
    public CharSequence k;
    public boolean l;
    public AppCompatTextView m;
    public int n;
    public ColorStateList o;
    public CharSequence p;
    public boolean q;
    public AppCompatTextView r;
    public int s;
    public ColorStateList t;
    public Typeface u;

    /* renamed from: jx$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;

        public a(int i, TextView textView, int i2, TextView textView2) {
            this.a = i;
            this.b = textView;
            this.c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            jx jxVar = jx.this;
            jxVar.i = this.a;
            jxVar.g = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && (appCompatTextView = jx.this.m) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
                TextView textView2 = this.d;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    this.d.setAlpha(1.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public jx(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.h = context.getResources().getDimensionPixelSize(rh0.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i) {
        if (this.c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            FrameLayout frameLayout = new FrameLayout(this.a);
            this.e = frameLayout;
            this.c.addView(frameLayout, -1, new FrameLayout.LayoutParams(-2, -2));
            this.c.addView(new Space(this.a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.b.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f++;
        } else {
            this.c.addView(textView, i);
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public final void b() {
        boolean z;
        if (this.c != null && this.b.getEditText() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LinearLayout linearLayout = this.c;
            EditText editText = this.b.getEditText();
            WeakHashMap<View, String> weakHashMap = a41.a;
            linearLayout.setPaddingRelative(editText.getPaddingStart(), 0, this.b.getEditText().getPaddingEnd(), 0);
        }
    }

    public final void c() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        float f;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(i4.a);
                arrayList.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.h, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(i4.d);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final boolean e() {
        return (this.j != 1 || this.m == null || TextUtils.isEmpty(this.k)) ? false : true;
    }

    public final TextView f(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.r;
        }
        return this.m;
    }

    public final int g() {
        AppCompatTextView appCompatTextView = this.m;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public final void h() {
        this.k = null;
        c();
        if (this.i == 1) {
            this.j = (!this.q || TextUtils.isEmpty(this.p)) ? 0 : 2;
        }
        k(this.i, this.j, j(this.m, null));
    }

    public final void i(TextView textView, int i) {
        FrameLayout frameLayout;
        ViewGroup viewGroup = this.c;
        if (viewGroup == null) {
            return;
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (z && (frameLayout = this.e) != null) {
            int i2 = this.f - 1;
            this.f = i2;
            if (i2 == 0) {
                frameLayout.setVisibility(8);
            }
            viewGroup = this.e;
        }
        viewGroup.removeView(textView);
        int i3 = this.d - 1;
        this.d = i3;
        LinearLayout linearLayout = this.c;
        if (i3 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    public final boolean j(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.b;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (textInputLayout.isLaidOut() && this.b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void k(int i, int i2, boolean z) {
        TextView f;
        TextView f2;
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.g = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.q, this.r, 2, i, i2);
            d(arrayList, this.l, this.m, 1, i, i2);
            eb1.r(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, f(i), i, f(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (f2 = f(i2)) != null) {
                f2.setVisibility(0);
                f2.setAlpha(1.0f);
            }
            if (i != 0 && (f = f(i)) != null) {
                f.setVisibility(4);
                if (i == 1) {
                    f.setText((CharSequence) null);
                }
            }
            this.i = i2;
        }
        this.b.o();
        this.b.r(z, false);
        this.b.s();
    }
}