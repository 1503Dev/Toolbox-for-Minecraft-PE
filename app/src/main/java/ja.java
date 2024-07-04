package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: ja  reason: default package */
public class ja implements wg3 {
    public static Method Q;
    public static boolean R;
    public static Field S;
    public static boolean T;
    public static final float[][] P = {new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, -1.0f, 1.0f}, new float[]{0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 1.0f}};
    public static final /* synthetic */ ja U = new ja();

    public static void a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static byte[] b(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    public static short[] c(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    public static byte[][] d(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                bArr[i][i2] = (byte) sArr[i][i2];
            }
        }
        return bArr;
    }

    public static short[][] f(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance(Short.TYPE, bArr.length, bArr[0].length);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                sArr[i][i2] = (short) (bArr[i][i2] & 255);
            }
        }
        return sArr;
    }

    public static byte[][][] g(short[][][] sArr) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        byte[][][] bArr = (byte[][][]) Array.newInstance(Byte.TYPE, length, sArr2.length, sArr2[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                for (int i3 = 0; i3 < sArr[0][0].length; i3++) {
                    bArr[i][i2][i3] = (byte) sArr[i][i2][i3];
                }
            }
        }
        return bArr;
    }

    public static short[][][] h(byte[][][] bArr) {
        int length = bArr.length;
        byte[][] bArr2 = bArr[0];
        short[][][] sArr = (short[][][]) Array.newInstance(Short.TYPE, length, bArr2.length, bArr2[0].length);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                for (int i3 = 0; i3 < bArr[0][0].length; i3++) {
                    sArr[i][i2][i3] = (short) (bArr[i][i2][i3] & 255);
                }
            }
        }
        return sArr;
    }

    public static boolean i(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= sArr[length] == sArr2[length];
        }
        return z;
    }

    public static boolean j(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= i(sArr[length], sArr2[length]);
        }
        return z;
    }

    public static String k(String str, String str2) {
        Pattern pattern = jb1.a;
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        vj.b(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str2.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        int[][] iArr2 = (int[][]) arrayList.toArray((int[][]) Array.newInstance(Integer.TYPE, 0, 2));
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + 16);
        if (jb1.b(str2, sb, jb1.b, str3, iArr2) || jb1.a(str2, sb, jb1.a, str3, iArr2) || jb1.b(str2, sb, jb1.d, str3, iArr2) || jb1.a(str2, sb, jb1.c, str3, iArr2) || jb1.b(str2, sb, jb1.f, str3, iArr2) || jb1.a(str2, sb, jb1.e, str3, iArr2) || jb1.a(str2, sb, jb1.g, str3, iArr2)) {
            return sb.toString();
        }
        return k6.b(str3, str2);
    }

    public static int p(int i) {
        if (i != 0) {
            if (i != 1) {
                return i != 1000 ? 0 : 1001;
            }
            return 2;
        }
        return 1;
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((zp5) obj).b();
    }

    public void l(View view, int i, int i2, int i3, int i4) {
        if (!R) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                Q = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            R = true;
        }
        Method method = Q;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void m(View view, int i) {
        if (!T) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            T = true;
        }
        Field field = S;
        if (field != null) {
            try {
                S.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void n(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            n(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void o(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            o(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}