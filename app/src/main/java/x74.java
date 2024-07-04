package defpackage;

import android.os.Bundle;

/* renamed from: x74  reason: default package */
public final class x74 implements mc4 {
    public final String a;

    public x74(String str) {
        this.a = str;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}