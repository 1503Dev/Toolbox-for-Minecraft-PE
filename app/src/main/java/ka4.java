package defpackage;

import android.os.Bundle;

/* renamed from: ka4  reason: default package */
public final class ka4 implements mc4 {
    public final Boolean a;

    public ka4(Boolean bool) {
        this.a = bool;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}