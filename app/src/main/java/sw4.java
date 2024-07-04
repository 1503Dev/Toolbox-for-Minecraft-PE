package defpackage;

import javax.annotation.CheckForNull;

/* renamed from: sw4  reason: default package */
public final class sw4 extends qv4 {
    public static final sw4 V = new sw4(0, null, new Object[0]);
    @CheckForNull
    public final transient Object S;
    public final transient Object[] T;
    public final transient int U;

    public sw4(int i, @CheckForNull Object obj, Object[] objArr) {
        this.S = obj;
        this.T = objArr;
        this.U = i;
    }

    @Override // defpackage.qv4
    public final rw4 a() {
        return new rw4(1, this.U, this.T);
    }

    @Override // defpackage.qv4
    public final pw4 c() {
        return new pw4(this, this.T, this.U);
    }

    @Override // defpackage.qv4
    public final qw4 d() {
        return new qw4(this, new rw4(0, this.U, this.T));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // defpackage.qv4, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object obj3 = this.S;
        Object[] objArr = this.T;
        int i = this.U;
        if (obj != null) {
            if (i == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int c = gv4.c(obj.hashCode());
                    while (true) {
                        int i2 = c & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        } else if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                            break;
                        } else {
                            c = i2 + 1;
                        }
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int c2 = gv4.c(obj.hashCode());
                    while (true) {
                        int i4 = c2 & length2;
                        char c3 = (char) sArr[i4];
                        if (c3 == 65535) {
                            break;
                        } else if (obj.equals(objArr[c3])) {
                            obj2 = objArr[c3 ^ 1];
                            break;
                        } else {
                            c2 = i4 + 1;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int c4 = gv4.c(obj.hashCode());
                    while (true) {
                        int i5 = c4 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        } else if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                            break;
                        } else {
                            c4 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.U;
    }
}