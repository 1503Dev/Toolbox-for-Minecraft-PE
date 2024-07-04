package defpackage;

import android.content.Context;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: vx0  reason: default package */
public final class vx0 extends yc0 {
    public vx0(Context context, b bVar, ny0 ny0Var, wv wvVar) {
        super(context, bVar, ny0Var, wvVar, null, null, null);
    }

    @Override // defpackage.yc0
    public final iw b(String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1422950858:
                if (str.equals("action")) {
                    c = 0;
                    break;
                }
                break;
            case -868304044:
                if (str.equals("toggle")) {
                    c = 1;
                    break;
                }
                break;
            case 1732829925:
                if (str.equals("separator")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new tx0(this.c, this.d);
            case 1:
                return new yx0(this.c);
            case 2:
                return new xx0();
            default:
                return null;
        }
    }
}