package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sv4  reason: default package */
public abstract class sv4 extends iv4 implements Set {
    public static final /* synthetic */ int R = 0;
    @CheckForNull
    public transient nv4 Q;

    public static int r(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            gt4.e("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
            d = highestOneBit;
            Double.isNaN(d);
            Double.isNaN(d);
        } while (d * 0.7d < max);
        return highestOneBit;
    }

    @SafeVarargs
    public static sv4 t(eb4 eb4Var, eb4 eb4Var2, eb4 eb4Var3, eb4 eb4Var4, kd4 kd4Var, Object... objArr) {
        re4 re4Var = new nc4() { // from class: re4
            @Override // defpackage.nc4
            public final /* synthetic */ int a() {
                return 0;
            }

            @Override // defpackage.nc4
            public final dz4 c() {
                return zw4.C(new mc4() { // from class: se4
                    @Override // defpackage.mc4
                    public final void b(Object obj) {
                        try {
                            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        };
        Object[] objArr2 = new Object[12];
        objArr2[0] = eb4Var;
        objArr2[1] = eb4Var2;
        objArr2[2] = eb4Var3;
        objArr2[3] = eb4Var4;
        objArr2[4] = re4Var;
        objArr2[5] = kd4Var;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return u(12, objArr2);
    }

    public static sv4 u(int i, Object... objArr) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                int r = r(i);
                Object[] objArr2 = new Object[r];
                int i2 = r - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int c = gv4.c(hashCode);
                        while (true) {
                            int i6 = c & i2;
                            Object obj2 = objArr2[i6];
                            if (obj2 == null) {
                                objArr[i4] = obj;
                                objArr2[i6] = obj;
                                i3 += hashCode;
                                i4++;
                                break;
                            } else if (!obj2.equals(obj)) {
                                c++;
                            }
                        }
                    } else {
                        throw new NullPointerException(k6.a("at index ", i5));
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new ax4(obj3);
                }
                if (r(i4) < r / 2) {
                    return u(i4, objArr);
                }
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    z = true;
                }
                if (z) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new tw4(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new ax4(obj4);
        }
        return tw4.Y;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof sv4) && (this instanceof tw4)) {
            sv4 sv4Var = (sv4) obj;
            sv4Var.getClass();
            if ((sv4Var instanceof tw4) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return zw4.w(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zw4.m(this);
    }

    @Override // defpackage.iv4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // defpackage.iv4
    public nv4 n() {
        nv4 nv4Var = this.Q;
        if (nv4Var == null) {
            nv4 s = s();
            this.Q = s;
            return s;
        }
        return nv4Var;
    }

    public nv4 s() {
        Object[] array = toArray();
        lv4 lv4Var = nv4.Q;
        return nv4.s(array.length, array);
    }
}