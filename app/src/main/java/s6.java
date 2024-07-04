package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: s6  reason: default package */
public final class s6 {
    public static volatile s6 d;
    public static final Object e = new Object();
    public final Context c;
    public final HashSet b = new HashSet();
    public final HashMap a = new HashMap();

    public s6(Context context) {
        this.c = context.getApplicationContext();
    }

    public final void a(Class cls, HashSet hashSet) {
        synchronized (e) {
            if (j01.a()) {
                Trace.beginSection(cls.getSimpleName());
            }
            if (!hashSet.contains(cls)) {
                if (!this.a.containsKey(cls)) {
                    hashSet.add(cls);
                    try {
                        qx qxVar = (qx) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        List<Class<? extends qx<?>>> a = qxVar.a();
                        if (!a.isEmpty()) {
                            for (Class<? extends qx<?>> cls2 : a) {
                                if (!this.a.containsKey(cls2)) {
                                    a(cls2, hashSet);
                                }
                            }
                        }
                        a71 b = qxVar.b(this.c);
                        hashSet.remove(cls);
                        this.a.put(cls, b);
                    } catch (Throwable th) {
                        throw new st0(th);
                    }
                } else {
                    this.a.get(cls);
                }
                Trace.endSection();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
        }
    }
}