package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: en4  reason: default package */
public final /* synthetic */ class en4 implements ThreadFactory {
    public final /* synthetic */ String a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}