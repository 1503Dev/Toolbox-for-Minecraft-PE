package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: tk5  reason: default package */
public final class tk5 extends e03 {
    public final int R;
    public final String S;
    public final int T;
    public final cu1 U;
    public final int V;
    public final lr2 W;
    public final boolean X;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public tk5(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tk5(int i, Throwable th, int i2, String str, int i3, cu1 cu1Var, int i4, boolean z) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, str, i3, cu1Var, i4, null, SystemClock.elapsedRealtime(), z);
        String str2;
        String str3;
        if (i == 0) {
            str2 = "Source error";
        } else if (i != 1) {
            str2 = "Unexpected runtime error";
        } else {
            String valueOf = String.valueOf(cu1Var);
            int i5 = zn4.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i4 != 4) {
                throw new IllegalStateException();
            } else {
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(valueOf);
            str2 = qq.d(sb, ", format_supported=", str3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tk5(String str, Throwable th, int i, int i2, String str2, int i3, cu1 cu1Var, int i4, ov5 ov5Var, long j, boolean z) {
        super(str, th, i, j);
        boolean z2;
        int i5 = i2;
        if (z) {
            if (i5 != 1) {
                z2 = false;
                tv2.G(z2);
                tv2.G(th != null);
                this.R = i5;
                this.S = str2;
                this.T = i3;
                this.U = cu1Var;
                this.V = i4;
                this.W = ov5Var;
                this.X = z;
            }
            i5 = 1;
        }
        z2 = true;
        tv2.G(z2);
        tv2.G(th != null);
        this.R = i5;
        this.S = str2;
        this.T = i3;
        this.U = cu1Var;
        this.V = i4;
        this.W = ov5Var;
        this.X = z;
    }

    public final tk5 a(ov5 ov5Var) {
        String message = getMessage();
        int i = zn4.a;
        return new tk5(message, getCause(), this.P, this.R, this.S, this.T, this.U, this.V, ov5Var, this.Q, this.X);
    }
}