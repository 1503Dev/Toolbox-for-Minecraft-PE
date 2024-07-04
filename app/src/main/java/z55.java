package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: z55  reason: default package */
public final class z55 {
    public static final z55 b = new z55();
    public static final y55 c = new y55();
    public final AtomicReference a = new AtomicReference();

    public final a85 a() {
        a85 a85Var = (a85) this.a.get();
        return a85Var == null ? c : a85Var;
    }
}