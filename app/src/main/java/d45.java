package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: d45  reason: default package */
public final class d45 {
    public static final Logger a = Logger.getLogger(d45.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static boolean a() {
        return b.get();
    }
}