package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import java.util.WeakHashMap;

/* renamed from: b6  reason: default package */
public final class b6 extends v5 {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public b6(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // defpackage.v5
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        hx0 m = hx0.m(this.d.getContext(), attributeSet, lj0.AppCompatSeekBar, i);
        Drawable f = m.f(lj0.AppCompatSeekBar_android_thumb);
        if (f != null) {
            this.d.setThumb(f);
        }
        Drawable e = m.e(lj0.AppCompatSeekBar_tickMark);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = e;
        if (e != null) {
            e.setCallback(this.d);
            SeekBar seekBar = this.d;
            WeakHashMap<View, String> weakHashMap = a41.a;
            km.d(e, seekBar.getLayoutDirection());
            if (e.isStateful()) {
                e.setState(this.d.getDrawableState());
            }
            c();
        }
        this.d.invalidate();
        int i2 = lj0.AppCompatSeekBar_tickMarkTintMode;
        if (m.l(i2)) {
            this.g = um.d(m.h(i2, -1), this.g);
            this.i = true;
        }
        int i3 = lj0.AppCompatSeekBar_tickMarkTint;
        if (m.l(i3)) {
            this.f = m.b(i3);
            this.h = true;
        }
        m.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable h = km.h(drawable.mutate());
                this.e = h;
                if (this.h) {
                    km.f(h, this.f);
                }
                if (this.i) {
                    km.g(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}