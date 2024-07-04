package defpackage;

import java.util.Set;

/* renamed from: zd3  reason: default package */
public final class zd3 extends xg3 {
    public boolean Q;

    public zd3(Set set) {
        super(set);
        this.Q = false;
    }

    public final synchronized void a() {
        if (this.Q) {
            return;
        }
        R0(v32.T);
        this.Q = true;
    }
}