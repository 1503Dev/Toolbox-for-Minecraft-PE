package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;
import java.util.Objects;

/* renamed from: zf0  reason: default package */
public final class zf0 extends Drawable implements a.InterfaceC0035a {
    public final a P;
    public final Drawable Q;
    public final Paint R;
    public final RectF S;
    public float T;

    public zf0(b bVar, Drawable drawable) {
        Paint paint = new Paint();
        this.R = paint;
        this.S = new RectF();
        this.P = bVar;
        Drawable.ConstantState constantState = drawable.getConstantState();
        Objects.requireNonNull(constantState);
        this.Q = constantState.newDrawable();
        paint.setColor(Color.argb(102, 0, 0, 0));
        bVar.P("internal/premium/remaining_time", this);
    }

    @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
    public final synchronized void a() {
        if (Math.abs(b() - this.T) > 1.0f) {
            h21.a(new iz(1, this));
        }
    }

    public final synchronized float b() {
        float n = ((b) this.P).n("internal/premium/remaining_time");
        if (n > 0.0f) {
            return Math.max(1.0f - ((n / 15.0f) / 60.0f), 0.0f) * 360.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float b;
        this.Q.draw(canvas);
        this.S.set(getBounds());
        synchronized (this) {
            b = b();
            this.T = b;
        }
        if (b > 0.0f) {
            canvas.drawArc(this.S, 270.0f, -b, true, this.R);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.Q.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}