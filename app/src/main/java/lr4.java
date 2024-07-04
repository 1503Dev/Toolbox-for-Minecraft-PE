package defpackage;

import android.os.IBinder;

/* renamed from: lr4  reason: default package */
public final class lr4 extends fy4 {
    public IBinder Q;
    public String R;
    public int S;
    public float T;
    public int U;
    public String V;
    public byte W;

    public lr4() {
        super(5);
    }

    public final lr4 p(int i) {
        this.S = i;
        this.W = (byte) (this.W | 2);
        return this;
    }

    public final lr4 q(float f) {
        this.T = f;
        this.W = (byte) (this.W | 4);
        return this;
    }

    public final pr4 r() {
        IBinder iBinder;
        if (this.W != 31 || (iBinder = this.Q) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.Q == null) {
                sb.append(" windowToken");
            }
            if ((this.W & 1) == 0) {
                sb.append(" stableSessionToken");
            }
            if ((this.W & 2) == 0) {
                sb.append(" layoutGravity");
            }
            if ((this.W & 4) == 0) {
                sb.append(" layoutVerticalMargin");
            }
            if ((this.W & 8) == 0) {
                sb.append(" displayMode");
            }
            if ((this.W & 16) == 0) {
                sb.append(" windowWidthPx");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new pr4(iBinder, this.R, this.S, this.T, this.U, this.V);
    }
}