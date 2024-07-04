package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: wq  reason: default package */
public final class wq {
    public static final g30<String, Typeface> a = new g30<>(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final os0<String, ArrayList<ag<a>>> d;

    /* renamed from: wq$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new yk0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new os0<>();
    }

    public static a a(String str, Context context, rq rqVar, int i) {
        int i2;
        Typeface a2 = a.a(str);
        if (a2 != null) {
            return new a(a2);
        }
        try {
            yq a3 = pq.a(context, rqVar);
            int i3 = a3.a;
            int i4 = 1;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                zq[] zqVarArr = a3.b;
                if (zqVarArr != null && zqVarArr.length != 0) {
                    for (zq zqVar : zqVarArr) {
                        int i5 = zqVar.e;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                            i2 = -3;
                        }
                    }
                    i4 = 0;
                }
                i2 = i4;
            }
            if (i2 != 0) {
                return new a(i2);
            }
            Typeface b2 = w11.a.b(context, a3.b, i);
            if (b2 != null) {
                a.b(str, b2);
                return new a(b2);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}