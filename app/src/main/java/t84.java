package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: t84  reason: default package */
public final class t84 implements nc4 {
    public final Executor a;
    public final yu2 b;

    public t84(yw2 yw2Var, yu2 yu2Var) {
        this.a = yw2Var;
        this.b = yu2Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 10;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        if (((Boolean) w82.d.c.a(x92.e2)).booleanValue()) {
            return zw4.C(null);
        }
        return zw4.E(this.b.c(), new at4() { // from class: r84
            @Override // defpackage.at4
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new mc4() { // from class: s84
                    @Override // defpackage.mc4
                    public final void b(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.a);
    }
}