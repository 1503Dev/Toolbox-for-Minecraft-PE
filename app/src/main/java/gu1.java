package defpackage;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: gu1  reason: default package */
public final class gu1 implements fu1 {
    public final FileChannel P;
    public final long Q;
    public final long R;

    public gu1(FileChannel fileChannel, long j, long j2) {
        this.P = fileChannel;
        this.Q = j;
        this.R = j2;
    }

    @Override // defpackage.fu1
    public final long a() {
        return this.R;
    }

    @Override // defpackage.fu1
    public final void f(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.P.map(FileChannel.MapMode.READ_ONLY, this.Q + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}