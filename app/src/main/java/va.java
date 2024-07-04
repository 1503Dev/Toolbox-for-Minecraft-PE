package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: va  reason: default package */
public final class va implements jg0 {
    public ThreadLocal a = new ThreadLocal();
    public volatile HashSet b;
    public volatile HashMap c;

    static {
        new kg0("threadLocalEcImplicitlyCa");
        new kg0("ecImplicitlyCa");
        new kg0("threadLocalDhDefaultParams");
        new kg0("DhDefaultParams");
        new kg0("acceptableEcCurves");
        new kg0("additionalEcParameters");
    }

    public va() {
        new ThreadLocal();
        this.b = new HashSet();
        this.c = new HashMap();
    }

    public final un a() {
        un unVar = (un) this.a.get();
        if (unVar != null) {
            return unVar;
        }
        return null;
    }
}