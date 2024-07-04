package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.LinkedHashMap;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

@ParametersAreNonnullByDefault
/* renamed from: tv2  reason: default package */
public class tv2 implements ta0, nk1, wg3 {
    public static final /* synthetic */ tv2 P = new tv2();

    public static void A(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static void B(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void C(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static int D(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }

    public static void E(Class cls, Object obj) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void F(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    @Pure
    public static void G(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void H(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @Pure
    public static void I(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static boolean J(byte b) {
        return b > -65;
    }

    public static void a(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void b(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeBundle(bundle);
        A(parcel, s);
    }

    public static void c(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeByteArray(bArr);
        A(parcel, s);
    }

    public static void f(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeStrongBinder(iBinder);
        A(parcel, s);
    }

    public static void g(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void h(Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void i(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int s = s(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        A(parcel, s);
    }

    public static void k(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeString(str);
        A(parcel, s);
    }

    public static void l(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeStringArray(strArr);
        A(parcel, s);
    }

    public static void m(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeStringList(list);
        A(parcel, s);
    }

    public static void o(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int s = s(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                F(parcel, parcelable, i2);
            }
        }
        A(parcel, s);
    }

    public static void p(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int s = s(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                F(parcel, parcelable, 0);
            }
        }
        A(parcel, s);
    }

    public static int r(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalArgumentException(pt4.a("Out of range: %s", Long.valueOf(j)));
    }

    public static int s(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static yw2 t() {
        l92 l92Var = x92.G4;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            return zw2.c;
        }
        if (((Boolean) w82Var.c.a(x92.F4)).booleanValue()) {
            return zw2.a;
        }
        return zw2.e;
    }

    public static rj4 u(int i, int i2, da daVar) {
        cj4 o = rj4.o();
        ao4 o2 = kp4.o();
        int i3 = daVar.a;
        o2.d();
        kp4.q((kp4) o2.Q, i3);
        String str = daVar.b;
        o2.d();
        kp4.r((kp4) o2.Q, str);
        o2.d();
        kp4.s((kp4) o2.Q, i);
        o.d();
        rj4.r((rj4) o.Q, (kp4) o2.a());
        o.d();
        rj4.s((rj4) o.Q, i2);
        return (rj4) o.a();
    }

    public static /* bridge */ /* synthetic */ void v(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!J(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !J(b3) && !J(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw te5.b();
    }

    @Pure
    public static void w(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void x(dz4 dz4Var, String str) {
        zw4.J(dz4Var, new eg3(4, str), zw2.f);
    }

    public static boolean y(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !y((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (obj2.getClass().isArray() && length == Array.getLength(obj2)) {
                        for (int i = 0; i < length; i++) {
                            if (!wa0.a(Array.get(obj, i), Array.get(obj2, i))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static /* bridge */ /* synthetic */ void z(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!J(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!J(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw te5.b();
    }

    @Override // defpackage.ta0
    public Object d() {
        return new LinkedHashMap();
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((zp5) obj).n3();
    }

    @Override // defpackage.nk1
    public void j() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nk1
    public void n(ml1 ml1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nk1
    public pl1 q(int i, int i2) {
        throw new UnsupportedOperationException();
    }
}