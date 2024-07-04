package defpackage;

import android.os.Bundle;

/* renamed from: na4  reason: default package */
public final class na4 implements mc4 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public na4(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.a.isEmpty()) {
            bundle.putString("inspector_extras", this.a);
        }
        bundle.putInt("test_mode", this.b ? 1 : 0);
        bundle.putInt("linked_device", this.c ? 1 : 0);
        if (((Boolean) w82.d.c.a(x92.N7)).booleanValue()) {
            if (this.b || this.c) {
                bundle.putInt("risd", !this.d ? 1 : 0);
            }
        }
    }
}