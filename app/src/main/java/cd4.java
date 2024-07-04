package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: cd4  reason: default package */
public final class cd4 {
    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void b(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(k6.a("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}