package defpackage;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import defpackage.om;

@SuppressLint({"RestrictedAPI"})
/* renamed from: xt0  reason: default package */
public class xt0 extends om {
    public a c0;
    public boolean d0;

    /* renamed from: xt0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends om.c {
        public int[][] H;

        public a(a aVar, xt0 xt0Var, Resources resources) {
            super(aVar, xt0Var, resources);
            if (aVar != null) {
                this.H = aVar.H;
            } else {
                this.H = new int[this.g.length];
            }
        }

        @Override // defpackage.om.c
        public void e() {
            int[][] iArr = this.H;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.H[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.H = iArr2;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.H;
            int i = this.h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new xt0(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new xt0(this, resources);
        }
    }

    public xt0() {
    }

    public xt0(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // defpackage.om, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.om
    public void e(om.c cVar) {
        this.P = cVar;
        int i = this.V;
        if (i >= 0) {
            Drawable d = cVar.d(i);
            this.R = d;
            if (d != null) {
                c(d);
            }
        }
        this.S = null;
        if (cVar instanceof a) {
            this.c0 = (a) cVar;
        }
    }

    @Override // defpackage.om
    /* renamed from: f */
    public a b() {
        return new a(this.c0, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.om, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.d0) {
            super.mutate();
            this.c0.e();
            this.d0 = true;
        }
        return this;
    }

    @Override // defpackage.om, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int f = this.c0.f(iArr);
        if (f < 0) {
            f = this.c0.f(StateSet.WILD_CARD);
        }
        return d(f) || onStateChange;
    }
}