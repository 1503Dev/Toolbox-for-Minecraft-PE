package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: pz1  reason: default package */
public class pz1 extends oz1 {
    public static final Object o0 = new Object();
    public static boolean p0 = false;
    public static long q0;
    public static vz1 r0;
    public static t02 s0;
    public static m02 t0;
    public boolean k0;
    public final String l0;
    public q02 m0;
    public final HashMap n0;

    public pz1(Context context, String str, boolean z) {
        super(context);
        this.k0 = false;
        this.n0 = new HashMap();
        this.l0 = str;
        this.k0 = z;
    }

    public static l02 p(Context context, boolean z) {
        if (oz1.j0 == null) {
            synchronized (o0) {
                if (oz1.j0 == null) {
                    l02 a = l02.a(context, z);
                    if (a.p) {
                        try {
                            if (((Boolean) w82.d.c.a(x92.B2)).booleanValue()) {
                                a.c("hunjs8A/5DNYOOAMFalGgcT5i4IxfyPvlvtXNFOaD034Wz4GSxVvrwBSs7k+Xuhr", "SWC7heB+iJvjMtyDTDnMRbHSVyBQ/kwwuxCjVwpzEBg=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        a.c("Nh+w10G1n7Da4ABjUIxN+bi57DvusNUcn9VqpF1GXimOuh+Booa8zjDH+Fzh+CdP", "2aR451s+WavC28PZAI1OicYdxdf9H8e1m2qQ6Vd7HNY=", Context.class);
                        a.c("gRiEqMdygJbXVwKGpJJS0XfYaGpCoNDcsHcIyHSZIcdpg+a2r1SI+bnO9R0NWRI0", "EBqSzSIe3Rjv1o1jIB+xCBngdhv60cOxeintd9wp68g=", Context.class);
                        a.c("Jdw9xFuo4OHuL+Waf9VEkBs6M7XtRhuX3PknFoicWEjQXQ4CENXY5MXEEK1WPoR/", "NFKyR+VbXbtroBTvca7ACsz/BEp9N5Lv9/EMVuAgXOo=", Context.class);
                        a.c("9Ibp0iX8frxcDol5LCDOary7OEblvzOEr0WtPn69zRxHnh2qqHn8v0kanoAZtnND", "icVSPKCsokOqk/nN9ldgEGzs48x1unFAjrOT1dBDO7k=", Context.class);
                        a.c("I+xlh/5GUzBsQHWA4Anrxm/J1H2aa2zRtcwvegQCTHllS1Tl5YGYaDcQHq23j0mf", "i/S3Ms1xTrAJGHFn1omMI5XPFfDzyhz5oaagmOhDNQg=", Context.class);
                        Class cls = Boolean.TYPE;
                        a.c("/eWSSnmYTOwLgnyjztZ17bt5eITOkf8Wjh78RPrx7GUZwaLGo/MX2SyicRamXiG+", "tvpwr35XXUfFfc9l/XoM3WDKfcmrAeKjBJbIgi/9trQ=", Context.class, cls);
                        a.c("7sn4HHbUg+T4b9n1KPrutL8tcrilMYlvs7RJQ5pmfB/1m2qwJzRoxivnCVXu/U+z", "apLnpmRDpCfdu10ORTmQ+sdRCmiB4EA8hGSHUeA9nD0=", Context.class);
                        a.c("kwtXYBCvBLfWcikGQlC0YCCiAi3jf0v8mKFP3Rqx70Jf0cytKZO4qWHMAffIVrkU", "nMO31gtWkn27JzpwW/zLPiiIPhLCWt7BVghY/Hyr+TE=", Context.class);
                        a.c("Tw8s+i46jU7h4eAAIyqjRm6Qx2s08AiuQFiQiAnvTc/m6i7qS69Zqr0xce6FwG0s", "dBvoahw90QxEayGvM7wPL8uyGyjAlcLulgarkCbJ360=", MotionEvent.class, DisplayMetrics.class);
                        a.c("5kaSofNlVXtCUNlGdVeQWvaOP7NTIA28WhQGVqYMr2+1W5DIZ4rAeif/Ixnxac6c", "6DjMpZpwaW5op66Lef2rZgfmub82/L76U+lowNvybUI=", MotionEvent.class, DisplayMetrics.class);
                        a.c("GZmNPeawNfdnWxeYT+Jkvj7Vlk5JycUitv3JUjomoDekPAkUoGh0m7MOHceNe5l+", "ehe3LQxKXFrt/NNsQSZhaLiz0oEhy5ctQpqWTqSg+00=", new Class[0]);
                        a.c("HiRHV0+7iHel8ouy3rC3Vh6JmfAaV6+B5y9bcOz6v6RtgCUkDJJ1u0Sc7x4KnqIM", "XIDT/tdnEZKwO9t3IF1TXzt4lSi3aThE4MpcZzXzgu8=", new Class[0]);
                        a.c("NVotBewebesTf3yaQqbfIHsAQGGO5mYV6zcO8zQG+1Te4y/3fFN6rm5Uo4mLM7YY", "Tgl2ye65VdPWpGRA4PcAavXIUkvdg+RB2j/Kpy7fLYc=", new Class[0]);
                        a.c("kqx1em1yk7MpX3m25KaHLmM/cmSaigSw7EiXU2reD6DVU/yG3Bj+ID2Om7QFkYwd", "7E6XPHHgJYFzxm7py5uavXz1wvEMAaDOWzYZ4RGmH8Q=", new Class[0]);
                        a.c("CNH0HFMOMU1Nrmid580u5GwyoVtbweFPAsHIvna6oGuy7GvzbjYQOB8wix+zhJ0t", "afOCxwiNZt1pFw/pjRCeFiRYbGwWcjibO33q64LhR0M=", new Class[0]);
                        a.c("mC2vnvn09mABIg+Z3lW4jT9JiWpty1Pg+VYrat/OBbcFnzi+qVKsaQnZ8pNi1wxq", "8G9c9fsfPvjJxInHRs9Zm9vZr56UYrRb8WMC1rhyiOA=", new Class[0]);
                        a.c("AEKrzIydHngo8q7U2b8x25JI4cfZS+4qAP315Zd3WikH6poIulxYQwD/LrG8ezMS", "vKrEk100dPKKqaxICALjJbVlJ7Gg4dfwKwDEqSKZDKo=", Context.class, cls, String.class);
                        a.c("FZw69K6puYJxxRxEPnIcPhNWMb6KJOCrIG9Jmt7OCzqsABzt6hhEAApiISZy7jIX", "bNQyCiIh4bApN5OPBGky2u9xZmVV2JI0QXAUD4Niu0E=", StackTraceElement[].class);
                        a.c("W/9c3Hd1yf7t5yHhoE/TlmEcdgBJrlLUo34Voj/Idw5FIbJ80EX+SS3nO2jLEMGu", "gqK1fJWMt2lYn7O2X7ompi2Bw14HxMMjzTnJdiQom2Q=", View.class, DisplayMetrics.class, cls, cls);
                        a.c("Bh5pClYU50tw4hiHvABH1pMF0C7RYCQSvKvFr+ZMSOJwQxEU/7HcV4ByjdhbUI8z", "nFFCV0RNg4jne34kh3cuJ7Rctyd77rnT1UYT4k6WJUQ=", Context.class, cls);
                        a.c("KT2Tv8TPKs8B/+lHkvvu6s01+PimOKMOvsBTxmvtb79k6T7ZyFNxwI/cZRLVhJ7V", "0IMe0hZjzvPOj0FU8vVpI60XmFXXOxBk0ZbCWvkG8dU=", View.class, Activity.class, cls);
                        a.c("xg6GNdV7fYR9czDPsYCpiIl0/69vO40WnrUnsYSb5exMDfWVVhFT+7O8xMnCz7QV", "mckfj+6L7YQAG+Kc7UoytYIs9AbnOm5Xq8IrT+DQQ5M=", Long.TYPE);
                        a.c("tV0LU7DrA7iCf0C6Jd6FHxawHMuTsVT6LNt0TOb/cblXH7T5JtR+TGOIdFUS28/f", "1Bl17hQq0WWTvmWWEgdcU2HCh9GQdFF/nionC9ho0WU=", new Class[0]);
                        try {
                            if (((Boolean) w82.d.c.a(x92.G2)).booleanValue()) {
                                a.c("+Lr3mNK9DiW6aOFsrAhw/ufFUWF1jNkYNrUOryhl9dmdhxcK7UxVybCFjyLF5UVn", "z6qQV45Nmnz8yfEHycE7xvBh5frOehaJSTK9o+9gqcg=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        a.c("3U0cjCPkA8fmy+qqbK7WJ2AhtyNFccQtIqqvzcvTqob91cu5tr66zNiNrkLc8aJb", "15gLcM46Z4orUYIpbooVfBRJ135AlZRFOmzWaSvqSHg=", Context.class);
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (((Boolean) w82.d.c.a(x92.H2)).booleanValue()) {
                                    Class cls2 = Long.TYPE;
                                    a.c("2wtcCTLoT7a0RzNv8L+mVKR+6NVfukO9BpKgsaOGTiHGeYqcI7vlZYOTUtiUYK5a", "PuuRKBgJ4ot1aOnWjIUdGlqyRoZ6ZOMOeX7ZmvGezGg=", NetworkCapabilities.class, cls2, cls2);
                                }
                            }
                        } catch (IllegalStateException unused3) {
                        }
                        try {
                            if (((Boolean) w82.d.c.a(x92.c2)).booleanValue()) {
                                a.c("sGX187VmldVivMx8d2G9ijy8IexWLJjVBriaGlzwhpHKAK1AG3if6ICXfcjwXboZ", "IowIKykYnY6WZolnjAhl1KeEVDwldWZiaxuj9ry3exU=", List.class);
                            }
                        } catch (IllegalStateException unused4) {
                        }
                        try {
                            if (((Boolean) w82.d.c.a(x92.b2)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                a.c("fyLPA28mp7uPyBOReRADDijv3FZ1tUGnt5ZGr7JsU06e7RVIoG/wHKNRMf3WJSQe", "soiTax1jBnD3649O45Tb84AswyowGJo3bnB66jWq5Kw=", cls3, cls3, cls3, cls3);
                            }
                        } catch (IllegalStateException unused5) {
                        }
                        try {
                            if (((Boolean) w82.d.c.a(x92.a2)).booleanValue()) {
                                a.c("C2cxj1PqlGI/7sXzj/vQoDZCGl/mHCTxIbvQCRFAKNnzfg9WbUpjhk8QJWw60E8Q", "faUXYiGUMq7bQIeIkZZxqavg/5i6OivEyj0LKDXCfso=", long[].class, Context.class, View.class);
                            }
                        } catch (IllegalStateException unused6) {
                        }
                    }
                    oz1.j0 = a;
                }
            }
        }
        return oz1.j0;
    }

    public static n02 q(l02 l02Var, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method b = l02Var.b("Tw8s+i46jU7h4eAAIyqjRm6Qx2s08AiuQFiQiAnvTc/m6i7qS69Zqr0xce6FwG0s", "dBvoahw90QxEayGvM7wPL8uyGyjAlcLulgarkCbJ360=");
        if (b == null || motionEvent == null) {
            throw new d02();
        }
        try {
            return new n02((String) b.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new d02(e);
        }
    }

    public static synchronized void t(Context context, boolean z) {
        vz1 vz1Var;
        synchronized (pz1.class) {
            if (!p0) {
                q0 = System.currentTimeMillis() / 1000;
                oz1.j0 = p(context, z);
                l92 l92Var = x92.H2;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    if (context != null) {
                        vz1Var = new vz1((ConnectivityManager) context.getSystemService("connectivity"));
                    } else {
                        vz1Var = null;
                    }
                    r0 = vz1Var;
                }
                ExecutorService executorService = oz1.j0.b;
                if (((Boolean) w82Var.c.a(x92.I2)).booleanValue() && executorService != null) {
                    s0 = new t02(context, executorService, t02.e);
                }
                if (((Boolean) w82Var.c.a(x92.b2)).booleanValue()) {
                    t0 = new m02();
                }
                p0 = true;
            }
        }
    }

    public static final void u(List list) {
        ExecutorService executorService;
        if (oz1.j0 != null && (executorService = oz1.j0.b) != null && !list.isEmpty()) {
            try {
                executorService.invokeAll(list, ((Long) w82.d.c.a(x92.W1)).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                StringWriter stringWriter = new StringWriter();
                e.printStackTrace(new PrintWriter(stringWriter));
                Log.d("pz1", String.format("class methods got exception: %s", stringWriter.toString()));
            }
        }
    }

    @Override // defpackage.oz1
    public final long a(StackTraceElement[] stackTraceElementArr) {
        Method b = oz1.j0.b("FZw69K6puYJxxRxEPnIcPhNWMb6KJOCrIG9Jmt7OCzqsABzt6hhEAApiISZy7jIX", "bNQyCiIh4bApN5OPBGky2u9xZmVV2JI0QXAUD4Niu0E=");
        if (b == null || stackTraceElementArr == null) {
            throw new d02();
        }
        try {
            return new e02((String) b.invoke(null, stackTraceElementArr)).a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new d02(e);
        }
    }

    @Override // defpackage.nz1
    public final void c(View view) {
        if (!((Boolean) w82.d.c.a(x92.Z1)).booleanValue()) {
            return;
        }
        if (this.m0 == null) {
            l02 l02Var = oz1.j0;
            this.m0 = new q02(l02Var.a, l02Var.q);
        }
        this.m0.b(view);
    }

    @Override // defpackage.oz1
    public final gx1 j(Context context, View view, Activity activity) {
        t02 t02Var = s0;
        if (t02Var != null && t02Var.d) {
            t02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) w82.d.c.a(x92.b2)).booleanValue()) {
            m02 m02Var = t0;
            m02Var.h = m02Var.g;
            m02Var.g = SystemClock.uptimeMillis();
        }
        gx1 X = ey1.X();
        if (!TextUtils.isEmpty(this.l0)) {
            String str = this.l0;
            X.j();
            ey1.y0((ey1) X.Q, str);
        }
        s(p(context, this.k0), X, view, activity, true, context);
        return X;
    }

    @Override // defpackage.oz1
    public final gx1 k(Context context) {
        t02 t02Var = s0;
        if (t02Var != null && t02Var.d) {
            t02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) w82.d.c.a(x92.b2)).booleanValue()) {
            m02 m02Var = t0;
            m02Var.b = m02Var.a;
            m02Var.a = SystemClock.uptimeMillis();
        }
        gx1 X = ey1.X();
        if (!TextUtils.isEmpty(this.l0)) {
            String str = this.l0;
            X.j();
            ey1.y0((ey1) X.Q, str);
        }
        l02 p = p(context, this.k0);
        if (p.b != null) {
            u(r(p, context, X));
        }
        return X;
    }

    @Override // defpackage.oz1
    public final gx1 l(Context context, View view, Activity activity) {
        t02 t02Var = s0;
        if (t02Var != null && t02Var.d) {
            t02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) w82.d.c.a(x92.b2)).booleanValue()) {
            t0.a(context, view);
        }
        gx1 X = ey1.X();
        String str = this.l0;
        X.j();
        ey1.y0((ey1) X.Q, str);
        s(p(context, this.k0), X, view, activity, false, context);
        return X;
    }

    @Override // defpackage.oz1
    public final n02 m(MotionEvent motionEvent) {
        Method b = oz1.j0.b("5kaSofNlVXtCUNlGdVeQWvaOP7NTIA28WhQGVqYMr2+1W5DIZ4rAeif/Ixnxac6c", "6DjMpZpwaW5op66Lef2rZgfmub82/L76U+lowNvybUI=");
        if (b == null || motionEvent == null) {
            throw new d02();
        }
        try {
            return new n02((String) b.invoke(null, motionEvent, this.h0));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new d02(e);
        }
    }

    public ArrayList r(l02 l02Var, Context context, gx1 gx1Var) {
        int i;
        long j;
        long j2;
        long j3;
        if (l02Var.l != null) {
            i = mz1.b();
        } else {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        ArrayList arrayList = new ArrayList();
        if (!l02Var.p) {
            gx1Var.j();
            ey1.I0((ey1) gx1Var.Q, 16384L);
            return arrayList;
        }
        arrayList.add(new b12(l02Var, gx1Var, i, context));
        arrayList.add(new e12(l02Var, gx1Var, q0, i));
        arrayList.add(new o12(l02Var, gx1Var, i));
        arrayList.add(new r12(l02Var, gx1Var, i, context));
        arrayList.add(new w12(l02Var, gx1Var, i));
        arrayList.add(new x02(l02Var, gx1Var, i, context));
        arrayList.add(new c12(l02Var, gx1Var, i));
        arrayList.add(new n12(l02Var, gx1Var, i));
        arrayList.add(new p12(l02Var, gx1Var, i));
        arrayList.add(new d12(l02Var, gx1Var, i));
        arrayList.add(new j12(l02Var, gx1Var, i));
        arrayList.add(new x12(l02Var, gx1Var, i));
        arrayList.add(new w02(l02Var, gx1Var, i));
        arrayList.add(new u12(l02Var, gx1Var, i));
        arrayList.add(new s12(l02Var, gx1Var, i));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) w82.d.c.a(x92.H2)).booleanValue()) {
                t02 t02Var = s0;
                if (t02Var != null) {
                    if (t02Var.d) {
                        j3 = t02Var.b - t02Var.a;
                    } else {
                        j3 = -1;
                    }
                    long j4 = t02Var.c;
                    t02Var.c = -1L;
                    j2 = j4;
                    j = j3;
                } else {
                    j = -1;
                    j2 = -1;
                }
                arrayList.add(new m12(l02Var, gx1Var, i, r0, j, j2));
            }
        }
        l92 l92Var = x92.G2;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            arrayList.add(new q12(l02Var, gx1Var, i));
        }
        arrayList.add(new k12(l02Var, gx1Var, i));
        if (((Boolean) w82Var.c.a(x92.K2)).booleanValue()) {
            arrayList.add(new v02(l02Var, gx1Var, i));
        }
        return arrayList;
    }

    public final void s(l02 l02Var, gx1 gx1Var, View view, Activity activity, boolean z, Context context) {
        List list;
        int i;
        c22 l12Var;
        boolean z2;
        Long l;
        int i2;
        boolean z3;
        MotionEvent motionEvent;
        int i3 = 1;
        if (!l02Var.p) {
            gx1Var.j();
            ey1.I0((ey1) gx1Var.Q, 16384L);
            list = Arrays.asList(new g12(l02Var, gx1Var));
        } else {
            synchronized (this) {
                try {
                    try {
                        n02 q = q(l02Var, this.P, this.h0);
                        Long l2 = q.a;
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            gx1Var.j();
                            ey1.E0((ey1) gx1Var.Q, longValue);
                        }
                        Long l3 = q.b;
                        if (l3 != null) {
                            long longValue2 = l3.longValue();
                            gx1Var.j();
                            ey1.F0((ey1) gx1Var.Q, longValue2);
                        }
                        Long l4 = q.c;
                        if (l4 != null) {
                            long longValue3 = l4.longValue();
                            gx1Var.j();
                            ey1.G0((ey1) gx1Var.Q, longValue3);
                        }
                        if (this.g0) {
                            Long l5 = q.d;
                            if (l5 != null) {
                                long longValue4 = l5.longValue();
                                gx1Var.j();
                                ey1.z((ey1) gx1Var.Q, longValue4);
                            }
                            Long l6 = q.e;
                            if (l6 != null) {
                                long longValue5 = l6.longValue();
                                gx1Var.j();
                                ey1.A((ey1) gx1Var.Q, longValue5);
                            }
                        }
                    } catch (d02 unused) {
                    }
                    ay1 w = by1.w();
                    if (this.R > 0) {
                        DisplayMetrics displayMetrics = this.h0;
                        char[] cArr = o02.a;
                        if (displayMetrics != null && displayMetrics.density != 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            long a = o02.a(this.Y, displayMetrics);
                            w.j();
                            by1.K((by1) w.Q, a);
                            long a2 = o02.a(this.d0 - this.b0, this.h0);
                            w.j();
                            by1.L((by1) w.Q, a2);
                            long a3 = o02.a(this.e0 - this.c0, this.h0);
                            w.j();
                            by1.M((by1) w.Q, a3);
                            long a4 = o02.a(this.b0, this.h0);
                            w.j();
                            by1.P((by1) w.Q, a4);
                            long a5 = o02.a(this.c0, this.h0);
                            w.j();
                            by1.Q((by1) w.Q, a5);
                            if (this.g0 && (motionEvent = this.P) != null) {
                                long a6 = o02.a(((this.b0 - this.d0) + motionEvent.getRawX()) - this.P.getX(), this.h0);
                                if (a6 != 0) {
                                    w.j();
                                    by1.N((by1) w.Q, a6);
                                }
                                long a7 = o02.a(((this.c0 - this.e0) + this.P.getRawY()) - this.P.getY(), this.h0);
                                if (a7 != 0) {
                                    w.j();
                                    by1.O((by1) w.Q, a7);
                                }
                            }
                        }
                    }
                    try {
                        n02 m = m(this.P);
                        Long l7 = m.a;
                        if (l7 != null) {
                            long longValue6 = l7.longValue();
                            w.j();
                            by1.y((by1) w.Q, longValue6);
                        }
                        Long l8 = m.b;
                        if (l8 != null) {
                            long longValue7 = l8.longValue();
                            w.j();
                            by1.z((by1) w.Q, longValue7);
                        }
                        long longValue8 = m.c.longValue();
                        w.j();
                        by1.G((by1) w.Q, longValue8);
                        if (this.g0) {
                            Long l9 = m.e;
                            if (l9 != null) {
                                long longValue9 = l9.longValue();
                                w.j();
                                by1.A((by1) w.Q, longValue9);
                            }
                            Long l10 = m.d;
                            if (l10 != null) {
                                long longValue10 = l10.longValue();
                                w.j();
                                by1.E((by1) w.Q, longValue10);
                            }
                            Long l11 = m.f;
                            if (l11 != null) {
                                if (l11.longValue() != 0) {
                                    i2 = 2;
                                } else {
                                    i2 = 1;
                                }
                                w.j();
                                by1.R((by1) w.Q, i2);
                            }
                            long j = this.S;
                            if (j > 0) {
                                DisplayMetrics displayMetrics2 = this.h0;
                                char[] cArr2 = o02.a;
                                if (displayMetrics2 != null && displayMetrics2.density != 0.0f) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    double d = this.X;
                                    double d2 = j;
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    l = Long.valueOf(Math.round(d / d2));
                                } else {
                                    l = null;
                                }
                                if (l != null) {
                                    long longValue11 = l.longValue();
                                    w.j();
                                    by1.B((by1) w.Q, longValue11);
                                } else {
                                    w.j();
                                    by1.C((by1) w.Q);
                                }
                                double d3 = this.W;
                                double d4 = this.S;
                                Double.isNaN(d3);
                                Double.isNaN(d4);
                                Double.isNaN(d3);
                                Double.isNaN(d4);
                                Double.isNaN(d3);
                                Double.isNaN(d4);
                                long round = Math.round(d3 / d4);
                                w.j();
                                by1.F((by1) w.Q, round);
                            }
                            Long l12 = m.i;
                            if (l12 != null) {
                                long longValue12 = l12.longValue();
                                w.j();
                                by1.I((by1) w.Q, longValue12);
                            }
                            Long l13 = m.j;
                            if (l13 != null) {
                                long longValue13 = l13.longValue();
                                w.j();
                                by1.H((by1) w.Q, longValue13);
                            }
                            Long l14 = m.k;
                            if (l14 != null) {
                                if (l14.longValue() != 0) {
                                    i3 = 2;
                                }
                                w.j();
                                by1.S((by1) w.Q, i3);
                            }
                        }
                    } catch (d02 unused2) {
                    }
                    long j2 = this.V;
                    if (j2 > 0) {
                        w.j();
                        by1.J((by1) w.Q, j2);
                    }
                    gx1Var.j();
                    ey1.N((ey1) gx1Var.Q, (by1) w.h());
                    long j3 = this.R;
                    if (j3 > 0) {
                        gx1Var.j();
                        ey1.E((ey1) gx1Var.Q, j3);
                    }
                    long j4 = this.S;
                    if (j4 > 0) {
                        gx1Var.j();
                        ey1.C((ey1) gx1Var.Q, j4);
                    }
                    long j5 = this.T;
                    if (j5 > 0) {
                        gx1Var.j();
                        ey1.B((ey1) gx1Var.Q, j5);
                    }
                    long j6 = this.U;
                    if (j6 > 0) {
                        gx1Var.j();
                        ey1.F((ey1) gx1Var.Q, j6);
                    }
                    try {
                        int size = this.Q.size() - 1;
                        if (size > 0) {
                            gx1Var.j();
                            ey1.P((ey1) gx1Var.Q);
                            for (int i4 = 0; i4 < size; i4++) {
                                n02 q2 = q(oz1.j0, (MotionEvent) this.Q.get(i4), this.h0);
                                ay1 w2 = by1.w();
                                long longValue14 = q2.a.longValue();
                                w2.j();
                                by1.y((by1) w2.Q, longValue14);
                                long longValue15 = q2.b.longValue();
                                w2.j();
                                by1.z((by1) w2.Q, longValue15);
                                gx1Var.j();
                                ey1.O((ey1) gx1Var.Q, (by1) w2.h());
                            }
                        }
                    } catch (d02 unused3) {
                        gx1Var.j();
                        ey1.P((ey1) gx1Var.Q);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (l02Var.b != null) {
                if (l02Var.l != null) {
                    i = mz1.b();
                } else {
                    i = RecyclerView.UNDEFINED_DURATION;
                }
                arrayList.add(new g12(l02Var, gx1Var));
                arrayList.add(new o12(l02Var, gx1Var, i));
                arrayList.add(new e12(l02Var, gx1Var, q0, i));
                arrayList.add(new d12(l02Var, gx1Var, i));
                arrayList.add(new n12(l02Var, gx1Var, i));
                arrayList.add(new p12(l02Var, gx1Var, i));
                arrayList.add(new j12(l02Var, gx1Var, i));
                arrayList.add(new c12(l02Var, gx1Var, i));
                arrayList.add(new x12(l02Var, gx1Var, i));
                arrayList.add(new w02(l02Var, gx1Var, i));
                arrayList.add(new u12(l02Var, gx1Var, i));
                arrayList.add(new t12(l02Var, gx1Var, i, new Throwable().getStackTrace()));
                arrayList.add(new y12(l02Var, gx1Var, i, view));
                arrayList.add(new s12(l02Var, gx1Var, i));
                l92 l92Var = x92.X1;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    arrayList.add(new u02(l02Var, gx1Var, i, view, activity));
                }
                if (((Boolean) w82Var.c.a(x92.K2)).booleanValue()) {
                    arrayList.add(new v02(l02Var, gx1Var, i));
                }
                if (z) {
                    if (((Boolean) w82Var.c.a(x92.Z1)).booleanValue()) {
                        l12Var = new v12(l02Var, gx1Var, i, this.m0);
                        arrayList.add(l12Var);
                    }
                } else {
                    try {
                        if (((Boolean) w82Var.c.a(x92.a2)).booleanValue()) {
                            arrayList.add(new i12(l02Var, gx1Var, i, this.n0, view, context));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) w82.d.c.a(x92.b2)).booleanValue()) {
                            arrayList.add(new h12(l02Var, gx1Var, i, t0));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    if (((Boolean) w82.d.c.a(x92.c2)).booleanValue()) {
                        l12Var = new l12(l02Var, gx1Var, i, this.i0);
                        arrayList.add(l12Var);
                    }
                }
            }
            list = arrayList;
        }
        u(list);
    }
}