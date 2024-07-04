package defpackage;

import sun.misc.Unsafe;

/* renamed from: ua4  reason: default package */
public final class ua4 extends mb4 {
    public ua4(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.mb4
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.mb4
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.mb4
    public final void c(Object obj, long j, boolean z) {
        if (hc4.g) {
            hc4.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            hc4.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.mb4
    public final void d(Object obj, long j, byte b) {
        if (hc4.g) {
            hc4.c(obj, j, b);
        } else {
            hc4.d(obj, j, b);
        }
    }

    @Override // defpackage.mb4
    public final void e(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.mb4
    public final void f(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.mb4
    public final boolean g(long j, Object obj) {
        return hc4.g ? hc4.s(j, obj) : hc4.t(j, obj);
    }
}