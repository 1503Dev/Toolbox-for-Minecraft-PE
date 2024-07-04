package defpackage;

import android.app.Activity;
import android.view.View;
import defpackage.cw;
import defpackage.zv;

/* renamed from: ox  reason: default package */
public final class ox extends View implements cw {
    public static final /* synthetic */ int W = 0;
    public ny P;
    public zv Q;
    public zv.b[] R;
    public int S;
    public int T;
    public cw.a U;
    public int[] V;

    public ox(Activity activity) {
        super(activity);
        this.V = new int[2];
    }

    @Override // defpackage.cw
    public final void a(zv zvVar, zv.b[] bVarArr) {
        this.Q = zvVar;
        this.R = bVarArr;
        ((iy0) zvVar).I0(new lx(0, this, bVarArr));
    }

    @Override // defpackage.cw
    public zv.b[] getItems() {
        return this.R;
    }

    @Override // defpackage.cw
    public ny getRenderer() {
        return this.P;
    }

    @Override // defpackage.cw
    public float getTotalHeight() {
        ny nyVar = this.P;
        if (nyVar != null) {
            return nyVar.e();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        if (this.P != null) {
            getLocationInWindow(this.V);
            ny nyVar = this.P;
            int[] iArr = this.V;
            nyVar.u(iArr[0], iArr[1]);
            this.P.w(i3 - i, i4 - i2);
            cw.a aVar = this.U;
            if (aVar != null) {
                ((ia0) aVar).a();
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ny nyVar = this.P;
        if (nyVar != null) {
            nyVar.c(new Runnable() { // from class: mx
                @Override // java.lang.Runnable
                public final void run() {
                    int i = ox.W;
                }
            });
        }
    }

    @Override // android.view.View, defpackage.cw
    public void setBackgroundColor(int i) {
        this.S = i;
    }

    @Override // defpackage.cw
    public void setOffsetY(int i) {
        this.T = i;
        ny nyVar = this.P;
        if (nyVar != null) {
            nyVar.v(i);
        }
    }

    @Override // defpackage.cw
    public void setTotalHeightListener(cw.a aVar) {
        this.U = aVar;
    }
}