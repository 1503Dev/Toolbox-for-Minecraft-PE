package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: g84  reason: default package */
public final class g84 implements nc4 {
    public final Set a;

    public g84(Set set) {
        this.a = set;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 8;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.a) {
            arrayList.add(str);
        }
        return zw4.C(new mc4() { // from class: f84
            @Override // defpackage.mc4
            public final void b(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}