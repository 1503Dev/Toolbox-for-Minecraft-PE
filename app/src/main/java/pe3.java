package defpackage;

import android.os.Bundle;
import java.util.Set;

/* renamed from: pe3  reason: default package */
public final class pe3 extends xg3 implements cf2 {
    public final Bundle Q;

    public pe3(Set set) {
        super(set);
        this.Q = new Bundle();
    }

    @Override // defpackage.cf2
    public final synchronized void l(Bundle bundle, String str) {
        this.Q.putAll(bundle);
        R0(eb1.P);
    }
}