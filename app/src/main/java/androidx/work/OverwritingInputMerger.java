package androidx.work;

import androidx.work.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class OverwritingInputMerger extends rx {
    @Override // defpackage.rx
    public final b a(ArrayList arrayList) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((b) it.next()).a));
        }
        aVar.a(hashMap);
        b bVar = new b(aVar.a);
        b.b(bVar);
        return bVar;
    }
}