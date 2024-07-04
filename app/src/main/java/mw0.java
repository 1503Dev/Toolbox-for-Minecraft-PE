package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: mw0  reason: default package */
public final class mw0 {
    public float c;
    public WeakReference<b> e;
    public iw0 f;
    public final TextPaint a = new TextPaint(1);
    public final a b = new a();
    public boolean d = true;

    /* renamed from: mw0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends z61 {
        public a() {
        }

        @Override // defpackage.z61
        public final void S0(int i) {
            mw0 mw0Var = mw0.this;
            mw0Var.d = true;
            b bVar = mw0Var.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // defpackage.z61
        public final void T0(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            mw0 mw0Var = mw0.this;
            mw0Var.d = true;
            b bVar = mw0Var.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* renamed from: mw0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public mw0(b bVar) {
        this.e = new WeakReference<>(null);
        this.e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.d) {
            return this.c;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.a.measureText((CharSequence) str, 0, str.length());
        }
        this.c = measureText;
        this.d = false;
        return measureText;
    }

    public final void b(iw0 iw0Var, Context context) {
        if (this.f != iw0Var) {
            this.f = iw0Var;
            if (iw0Var != null) {
                TextPaint textPaint = this.a;
                a aVar = this.b;
                iw0Var.a();
                iw0Var.d(textPaint, iw0Var.l);
                iw0Var.b(context, new jw0(iw0Var, textPaint, aVar));
                b bVar = this.e.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                iw0Var.c(context, this.a, this.b);
                this.d = true;
            }
            b bVar2 = this.e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}