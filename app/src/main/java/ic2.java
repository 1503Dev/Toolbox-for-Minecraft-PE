package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ic2  reason: default package */
public final class ic2 extends tc2 {
    public static final int X;
    public static final int Y;
    public final String P;
    public final ArrayList Q = new ArrayList();
    public final ArrayList R = new ArrayList();
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;

    static {
        int rgb = Color.rgb(12, 174, 206);
        X = Color.rgb(204, 204, 204);
        Y = rgb;
    }

    public ic2(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2) {
        this.P = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            lc2 lc2Var = (lc2) list.get(i3);
            this.Q.add(lc2Var);
            this.R.add(lc2Var);
        }
        this.S = num != null ? num.intValue() : X;
        this.T = num2 != null ? num2.intValue() : Y;
        this.U = num3 != null ? num3.intValue() : 12;
        this.V = i;
        this.W = i2;
    }

    @Override // defpackage.uc2
    public final ArrayList f() {
        return this.R;
    }

    @Override // defpackage.uc2
    public final String h() {
        return this.P;
    }
}