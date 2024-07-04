package defpackage;

import android.content.Context;
import defpackage.ia;
import defpackage.l41;
import defpackage.wv0;

/* renamed from: t1  reason: default package */
public final /* synthetic */ class t1 implements l41.a, wv0.b {
    public static void b(int i, int i2, String str, boolean z) {
        ga1.h().n().d(i, i2, str, z);
    }

    @Override // defpackage.l41.a
    public j41 a(Context context) {
        return new ia.a(context);
    }

    @Override // defpackage.wv0.b
    public tv0 get() {
        return new b20();
    }
}