package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: ey3  reason: default package */
public final /* synthetic */ class ey3 implements ky4 {
    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zw2.a.execute(new bm3(2, (InputStream) obj, createPipe[1]));
        return zw4.C(parcelFileDescriptor);
    }
}