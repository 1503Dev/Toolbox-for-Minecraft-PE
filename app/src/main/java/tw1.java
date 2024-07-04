package defpackage;

import java.nio.ByteBuffer;

/* renamed from: tw1  reason: default package */
public final class tw1 extends yi5 {
    public tw1(String str) {
        super(str);
    }

    @Override // defpackage.yi5
    public final void c(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}