package defpackage;

import android.util.Log;

/* renamed from: y20  reason: default package */
public abstract class y20 {
    public static y20 a;

    /* renamed from: y20$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends y20 {
        public int b;

        public a(int i) {
            this.b = i;
        }

        @Override // defpackage.y20
        public final void a(String str, String str2, Throwable... thArr) {
            if (this.b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // defpackage.y20
        public final void b(String str, String str2, Throwable... thArr) {
            if (this.b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // defpackage.y20
        public final void d(String str, String str2, Throwable... thArr) {
            if (this.b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // defpackage.y20
        public final void f(String str, String str2, Throwable... thArr) {
            if (this.b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized y20 c() {
        y20 y20Var;
        synchronized (y20.class) {
            if (a == null) {
                a = new a(3);
            }
            y20Var = a;
        }
        return y20Var;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}