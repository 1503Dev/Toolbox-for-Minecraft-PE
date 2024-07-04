package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;

/* renamed from: vh  reason: default package */
public final class vh {
    public static int a(File file) {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                channel.close();
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }
}