package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: xg5  reason: default package */
public final class xg5 extends yg5 {
    public xg5(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.yg5
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // defpackage.yg5
    public final double c(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.P).getLong(obj, j));
    }

    @Override // defpackage.yg5
    public final float e(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.P).getInt(obj, j));
    }

    @Override // defpackage.yg5
    public final void g(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.yg5
    public final void h(Object obj, long j, boolean z) {
        if (zg5.h) {
            zg5.d(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zg5.e(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.yg5
    public final void i(Object obj, long j, byte b) {
        if (zg5.h) {
            zg5.d(obj, j, b);
        } else {
            zg5.e(obj, j, b);
        }
    }

    @Override // defpackage.yg5
    public final void k(Object obj, long j, double d) {
        ((Unsafe) this.P).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.yg5
    public final void l(Object obj, long j, float f) {
        ((Unsafe) this.P).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.yg5
    public final boolean m(long j, Object obj) {
        return zg5.h ? zg5.w(j, obj) : zg5.x(j, obj);
    }
}