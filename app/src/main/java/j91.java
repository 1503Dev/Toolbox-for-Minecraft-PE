package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j91  reason: default package */
public final class j91 implements k91 {
    public static final j91 b = new j91();
    public final ArrayList a = new ArrayList();

    @Override // defpackage.k91
    public final void a(Bundle bundle, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((k91) it.next()).a(bundle, str);
        }
    }
}