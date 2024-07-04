package defpackage;

import android.os.Bundle;

/* renamed from: pt3  reason: default package */
public final class pt3 implements vh3 {
    public final Bundle P = new Bundle();

    @Override // defpackage.vh3
    public final synchronized void B(String str, String str2) {
        this.P.putInt(str, 3);
    }

    @Override // defpackage.vh3
    public final synchronized void H(String str) {
        this.P.putInt(str, 1);
    }

    @Override // defpackage.vh3
    public final synchronized void P(String str) {
        this.P.putInt(str, 2);
    }

    @Override // defpackage.vh3
    public final void b() {
    }

    @Override // defpackage.vh3
    public final void e() {
    }

    @Override // defpackage.vh3
    public final void m(String str) {
    }
}