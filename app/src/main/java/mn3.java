package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: mn3  reason: default package */
public final class mn3 {
    public final dl2 a;
    public final kd b;
    public final Executor c;

    public mn3(dl2 dl2Var, kd kdVar, yw2 yw2Var) {
        this.a = dl2Var;
        this.b = kdVar;
        this.c = yw2Var;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        long b = this.b.b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b2 = this.b.b();
        if (decodeByteArray != null) {
            long j = b2 - b;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            vz3.k("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j + " on ui thread: " + z);
        }
        return decodeByteArray;
    }
}