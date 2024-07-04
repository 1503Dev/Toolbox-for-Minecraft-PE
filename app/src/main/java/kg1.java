package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: kg1  reason: default package */
public final class kg1 {
    public final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());
    public final Map<aw0<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                BasePendingResult basePendingResult = (BasePendingResult) entry.getKey();
                synchronized (basePendingResult.a) {
                    if (!basePendingResult.b()) {
                        basePendingResult.c(basePendingResult.a());
                        basePendingResult.e = true;
                    }
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((aw0) entry2.getKey()).a(new m4(status));
            }
        }
    }
}