package defpackage;

import android.graphics.Bitmap;
import java.util.HashMap;

/* renamed from: j60  reason: default package */
public class j60 {
    public static final HashMap a = new HashMap();
    public static float b;
    public static float c;
    public static float d;
    public static float[] e;

    public static synchronized Bitmap a(int i, int i2) {
        Bitmap createBitmap;
        synchronized (j60.class) {
            HashMap hashMap = a;
            if (hashMap.containsKey(new xx(i, i2))) {
                throw new IllegalStateException();
            }
            createBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
            hashMap.put(new xx(i, i2), createBitmap);
        }
        return createBitmap;
    }

    public static synchronized void b(int i, int i2) {
        synchronized (j60.class) {
            a.remove(new xx(i, i2));
        }
    }

    public static float[] c() {
        return e;
    }

    public static synchronized float d() {
        float f;
        synchronized (j60.class) {
            f = d;
        }
        return f;
    }

    public static synchronized float e() {
        float f;
        synchronized (j60.class) {
            f = b;
        }
        return f;
    }

    public static synchronized float f() {
        float f;
        synchronized (j60.class) {
            f = c;
        }
        return f;
    }

    public static synchronized Bitmap g(int i, int i2) {
        Bitmap bitmap;
        synchronized (j60.class) {
            bitmap = (Bitmap) a.get(new xx(i, i2));
        }
        return bitmap;
    }

    public static synchronized float[] h(int i) {
        float[] fArr;
        synchronized (j60.class) {
            float[] fArr2 = e;
            if (fArr2 == null || fArr2.length != i * 2) {
                e = new float[i * 2];
            }
            fArr = e;
        }
        return fArr;
    }

    public static synchronized void i(float f, float f2, float f3) {
        synchronized (j60.class) {
            b = f;
            c = f2;
            d = f3;
        }
    }
}