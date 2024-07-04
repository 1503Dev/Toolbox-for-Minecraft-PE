package defpackage;

import android.os.Bundle;

/* renamed from: ob4  reason: default package */
public final class ob4 implements mc4 {
    public final String a;
    public final String b;

    public ob4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) w82.d.c.a(x92.S5)).booleanValue()) {
            str = this.b;
        } else {
            str = this.a;
        }
        bundle.putString("request_id", str);
    }
}