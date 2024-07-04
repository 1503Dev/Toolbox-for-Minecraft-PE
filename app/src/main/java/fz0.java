package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import defpackage.fz0;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: fz0  reason: default package */
public final class fz0 extends PopupWindow {
    public final Activity a;
    public final io.mrarm.mctoolbox.bridge.a b;
    public final TextView c;
    public boolean d;
    public ya0 e;
    public xs0 f;
    public final a g;
    private final a.InterfaceC0035a h;
    public final Handler i;
    public final mc0 j;
    public boolean k;

    /* renamed from: fz0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends Drawable {
        public final Paint a = new Paint();
        public final RectF b = new RectF();
        public final int c;
        public final int d;
        public float e;
        public float f;

        public a(Context context) {
            this.e = context.getResources().getDimensionPixelSize(2131165527);
            this.c = context.getResources().getColor(2131099844);
            this.d = context.getResources().getColor(2131099845);
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            this.b.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
            this.a.setColor(this.c);
            RectF rectF = this.b;
            float f = this.e;
            canvas.drawRoundRect(rectF, f, f, this.a);
            this.a.setColor(this.d);
            canvas.clipRect(0.0f, 0.0f, getBounds().width() * this.f, getBounds().height());
            RectF rectF2 = this.b;
            float f2 = this.e;
            canvas.drawRoundRect(rectF2, f2, f2, this.a);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public fz0(final Activity activity, final b bVar, final tv tvVar, final ve0 ve0Var) {
        super(activity.getResources().getDimensionPixelSize(2131165529), activity.getResources().getDimensionPixelSize(2131165526));
        this.f = new xs0(new ia0(2, this));
        a.InterfaceC0035a interfaceC0035a = new a.InterfaceC0035a() { // from class: dz0
            @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
            public final void a() {
                fz0.this.b();
            }
        };
        this.h = interfaceC0035a;
        this.i = new Handler(Looper.getMainLooper());
        this.j = new mc0(1, this);
        this.k = false;
        this.a = activity;
        this.b = bVar;
        a aVar = new a(activity);
        this.g = aVar;
        TextView textView = new TextView(activity);
        this.c = textView;
        textView.setBackground(aVar);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(activity.getResources().getColor(2131099846));
        textView.setGravity(17);
        textView.setAlpha(0.8f);
        textView.setOnClickListener(new View.OnClickListener() { // from class: ez0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fz0 fz0Var = fz0.this;
                Activity activity2 = activity;
                a aVar2 = bVar;
                tv tvVar2 = tvVar;
                uv uvVar = ve0Var;
                fz0Var.getClass();
                new n21(new ContextThemeWrapper(activity2, 2131820553), aVar2, tvVar2, uvVar, true).show();
                fz0Var.a(true);
            }
        });
        setContentView(textView);
        bVar.P("internal/premium/remaining_time", interfaceC0035a);
    }

    public final void a(boolean z) {
        setAnimationStyle(z ? 2131820551 : 0);
        update();
        if (this.k) {
            return;
        }
        this.i.postDelayed(this.j, 10L);
        this.k = true;
    }

    public final void b() {
        final float n = ((b) this.b).n("internal/premium/remaining_time");
        final boolean z = n > 0.0f && n < 15.0f;
        synchronized (this) {
            if (z != this.d) {
                h21.a(new Runnable() { // from class: bz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        fz0 fz0Var = fz0.this;
                        boolean z2 = z;
                        boolean z3 = fz0Var.e.Q;
                        if (z3 && z2) {
                            fz0Var.i.removeCallbacks(fz0Var.j);
                            fz0Var.k = false;
                            fz0Var.setAnimationStyle(2131820551);
                            fz0Var.showAtLocation(fz0Var.a.getWindow().getDecorView(), 49, 0, fz0Var.a.getResources().getDimensionPixelSize(2131165528));
                            return;
                        }
                        fz0Var.a(z3);
                    }
                });
                this.d = z;
            }
        }
        if (z) {
            h21.a(new Runnable() { // from class: cz0
                @Override // java.lang.Runnable
                public final void run() {
                    fz0 fz0Var = fz0.this;
                    float f = n;
                    fz0.a aVar = fz0Var.g;
                    aVar.f = f / 15.0f;
                    aVar.invalidateSelf();
                    TextView textView = fz0Var.c;
                    textView.setText(textView.getResources().getString(2131755202, fz0Var.c.getResources().getString(2131755298, Integer.valueOf(Math.round(f)))));
                }
            });
        }
    }
}