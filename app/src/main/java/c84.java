package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: c84  reason: default package */
public final class c84 implements nc4 {
    public final p94 a;
    public final li4 b;
    public final Context c;
    public final yu2 d;

    public c84(p94 p94Var, li4 li4Var, Context context, yu2 yu2Var) {
        this.a = p94Var;
        this.b = li4Var;
        this.c = context;
        this.d = yu2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 7;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.E(this.a.c(), new at4() { // from class: b84
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                String str;
                boolean z;
                String str2;
                int i;
                float f;
                int i2;
                int i3;
                DisplayMetrics displayMetrics;
                String str3;
                c84 c84Var = c84.this;
                sc4 sc4Var = (sc4) obj;
                zr5 zr5Var = c84Var.b.e;
                zr5[] zr5VarArr = zr5Var.V;
                if (zr5VarArr == null) {
                    str = zr5Var.P;
                    z = zr5Var.X;
                } else {
                    str = null;
                    boolean z2 = false;
                    boolean z3 = false;
                    z = false;
                    for (zr5 zr5Var2 : zr5VarArr) {
                        boolean z4 = zr5Var2.X;
                        if (!z4 && !z2) {
                            str = zr5Var2.P;
                            z2 = true;
                        }
                        if (z4) {
                            if (!z3) {
                                z3 = true;
                                z = true;
                            } else {
                                z3 = true;
                            }
                        }
                        if (z2 && z3) {
                            break;
                        }
                    }
                }
                Resources resources = c84Var.c.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    float f2 = displayMetrics.density;
                    int i4 = displayMetrics.widthPixels;
                    i = displayMetrics.heightPixels;
                    nl5 b = c84Var.d.b();
                    b.B();
                    synchronized (b.a) {
                        str3 = b.y;
                    }
                    str2 = str3;
                    i2 = i4;
                    f = f2;
                } else {
                    str2 = null;
                    i = 0;
                    f = 0.0f;
                    i2 = 0;
                }
                StringBuilder sb = new StringBuilder();
                zr5[] zr5VarArr2 = zr5Var.V;
                if (zr5VarArr2 != null) {
                    boolean z5 = false;
                    for (zr5 zr5Var3 : zr5VarArr2) {
                        if (zr5Var3.X) {
                            z5 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i5 = zr5Var3.T;
                            if (i5 == -1) {
                                if (f != 0.0f) {
                                    i5 = (int) (zr5Var3.U / f);
                                } else {
                                    i5 = -1;
                                }
                            }
                            sb.append(i5);
                            sb.append("x");
                            int i6 = zr5Var3.Q;
                            if (i6 == -2) {
                                if (f != 0.0f) {
                                    i6 = (int) (zr5Var3.R / f);
                                } else {
                                    i6 = -2;
                                }
                            }
                            sb.append(i6);
                        }
                    }
                    if (z5) {
                        if (sb.length() != 0) {
                            i3 = 0;
                            sb.insert(0, "|");
                        } else {
                            i3 = 0;
                        }
                        sb.insert(i3, "320x50");
                    }
                }
                return new d84(zr5Var, str, z, sb.toString(), f, i2, i, str2, c84Var.b.p);
            }
        }, zw2.f);
    }
}