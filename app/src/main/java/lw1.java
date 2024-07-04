package defpackage;

import java.nio.ByteBuffer;

/* renamed from: lw1  reason: default package */
public final class lw1 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}