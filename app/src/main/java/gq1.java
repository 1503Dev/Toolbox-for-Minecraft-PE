package defpackage;

import javax.annotation.concurrent.GuardedBy;

/* renamed from: gq1  reason: default package */
public final class gq1 {
    public static final Object a = new Object();
    @GuardedBy("sLock")
    public static boolean b;
    public static int c;
}