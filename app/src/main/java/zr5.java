package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: zr5  reason: default package */
public final class zr5 extends f0 {
    public static final Parcelable.Creator<zr5> CREATOR = new ys5();
    public final String P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final int T;
    public final int U;
    public final zr5[] V;
    public final boolean W;
    public final boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;

    public zr5() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zr5(Context context, h3 h3Var) {
        this(context, new h3[]{h3Var});
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zr5(Context context, h3[] h3VarArr) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        double d;
        double d2;
        DisplayMetrics displayMetrics;
        h3 h3Var = h3VarArr[0];
        this.S = false;
        int i5 = h3Var.a;
        boolean z = i5 == -3 && h3Var.b == -4;
        this.X = z;
        this.b0 = false;
        boolean z2 = h3Var.d;
        this.c0 = z2;
        boolean z3 = h3Var.f;
        this.d0 = z3;
        if (z) {
            h3 h3Var2 = h3.h;
            this.T = h3Var2.a;
            i = h3Var2.b;
        } else {
            this.T = i5;
            if (z2) {
                i = h3Var.e;
            } else if (z3) {
                i = h3Var.g;
            } else {
                i = h3Var.b;
            }
        }
        this.Q = i;
        boolean z4 = this.T == -1;
        boolean z5 = i == -2;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        if (z4) {
            mv2 mv2Var = n62.f.a;
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (displayMetrics.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i6 = displayMetrics3.heightPixels;
                        int i7 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i8 = displayMetrics3.heightPixels;
                        int i9 = displayMetrics3.widthPixels;
                        if (i8 == i6 && i9 == i7) {
                            int i10 = displayMetrics2.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i4 = i10 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.U = i4;
                            d = i4 / displayMetrics2.density;
                            i2 = (int) d;
                            d2 = i2;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            if (d - d2 >= 0.01d) {
                                i2++;
                            }
                        }
                    }
                }
            }
            i4 = displayMetrics2.widthPixels;
            this.U = i4;
            d = i4 / displayMetrics2.density;
            i2 = (int) d;
            d2 = i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d - d2 >= 0.01d) {
            }
        } else {
            i2 = this.T;
            mv2 mv2Var2 = n62.f.a;
            this.U = (int) TypedValue.applyDimension(1, i2, displayMetrics2);
        }
        if (z5) {
            int i11 = (int) (displayMetrics2.heightPixels / displayMetrics2.density);
            i3 = i11 <= 400 ? 32 : i11 <= 720 ? 50 : 90;
        } else {
            i3 = i;
        }
        mv2 mv2Var3 = n62.f.a;
        this.R = (int) TypedValue.applyDimension(1, i3, displayMetrics2);
        if (z4 || z5) {
            str = i2 + "x" + i3 + "_as";
        } else if (!this.c0 && !this.d0) {
            str = z ? "320x50_mb" : h3Var.c;
        } else {
            str = this.T + "x" + i + "_as";
        }
        this.P = str;
        int length = h3VarArr.length;
        if (length > 1) {
            this.V = new zr5[length];
            for (int i12 = 0; i12 < h3VarArr.length; i12++) {
                this.V[i12] = new zr5(context, h3VarArr[i12]);
            }
        } else {
            this.V = null;
        }
        this.W = false;
        this.Y = false;
    }

    public zr5(String str, int i, int i2, boolean z, int i3, int i4, zr5[] zr5VarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.P = str;
        this.Q = i;
        this.R = i2;
        this.S = z;
        this.T = i3;
        this.U = i4;
        this.V = zr5VarArr;
        this.W = z2;
        this.X = z3;
        this.Y = z4;
        this.Z = z5;
        this.a0 = z6;
        this.b0 = z7;
        this.c0 = z8;
        this.d0 = z9;
    }

    public static zr5 c() {
        return new zr5("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zr5 d() {
        return new zr5("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = tv2.s(parcel, 20293);
        tv2.k(parcel, 2, this.P);
        tv2.g(parcel, 3, this.Q);
        tv2.g(parcel, 4, this.R);
        tv2.a(parcel, 5, this.S);
        tv2.g(parcel, 6, this.T);
        tv2.g(parcel, 7, this.U);
        tv2.o(parcel, 8, this.V, i);
        tv2.a(parcel, 9, this.W);
        tv2.a(parcel, 10, this.X);
        tv2.a(parcel, 11, this.Y);
        tv2.a(parcel, 12, this.Z);
        tv2.a(parcel, 13, this.a0);
        tv2.a(parcel, 14, this.b0);
        tv2.a(parcel, 15, this.c0);
        tv2.a(parcel, 16, this.d0);
        tv2.A(parcel, s);
    }
}