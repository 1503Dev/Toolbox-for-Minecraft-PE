package defpackage;

import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: r05  reason: default package */
public final class r05 {
    @Nullable
    public final Object a;
    @Nullable
    public final Object b;
    public final byte[] c;
    public final int d;
    public final int e;
    public final String f;
    public final ja g;
    public final int h;

    public r05(@Nullable Object obj, @Nullable Object obj2, byte[] bArr, int i, int i2, int i3, String str, ja jaVar) {
        this.a = obj;
        this.b = obj2;
        this.c = Arrays.copyOf(bArr, bArr.length);
        this.h = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = jaVar;
    }

    @Nullable
    public final byte[] a() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}