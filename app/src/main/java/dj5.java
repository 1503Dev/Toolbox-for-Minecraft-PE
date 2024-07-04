package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dj5  reason: default package */
public final class dj5 extends fy4 {
    public final Logger Q;

    public dj5(String str) {
        super(12);
        this.Q = Logger.getLogger(str);
    }

    @Override // defpackage.fy4
    public final void h(String str) {
        this.Q.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}