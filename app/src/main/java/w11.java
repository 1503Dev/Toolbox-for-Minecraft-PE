package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.il0;
import defpackage.wq;
import defpackage.xq;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@SuppressLint({"NewApi"})
/* renamed from: w11  reason: default package */
public final class w11 {
    public static final e21 a;
    public static final g30<String, Typeface> b;

    /* renamed from: w11$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends ar {
        public il0.c W;

        public a(il0.c cVar) {
            this.W = cVar;
        }
    }

    static {
        e21 e21Var;
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            e21Var = new b21();
        } else if (i >= 28) {
            e21Var = new a21();
        } else if (i >= 26) {
            e21Var = new z11();
        } else {
            if (i >= 24) {
                Method method = y11.d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    e21Var = new y11();
                }
            }
            if (i >= 21) {
                e21Var = new x11();
            } else {
                e21Var = new e21();
            }
        }
        a = e21Var;
        b = new g30<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, xq.a aVar, Resources resources, int i, int i2, il0.c cVar, boolean z) {
        Typeface a2;
        Typeface typeface;
        int i3;
        Handler handler;
        if (aVar instanceof xq.d) {
            xq.d dVar = (xq.d) aVar;
            String str = dVar.d;
            a2 = null;
            boolean z2 = false;
            if (str != null && !str.isEmpty()) {
                typeface = Typeface.create(str, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (cVar != null) {
                    cVar.b(typeface);
                }
                return typeface;
            }
            if (!z ? cVar == null : dVar.c == 0) {
                z2 = true;
            }
            if (z) {
                i3 = dVar.b;
            } else {
                i3 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            a aVar2 = new a(cVar);
            rq rqVar = dVar.a;
            wb wbVar = new wb(aVar2, handler2);
            if (z2) {
                g30<String, Typeface> g30Var = wq.a;
                String str2 = rqVar.e + "-" + i2;
                Typeface a3 = wq.a.a(str2);
                if (a3 != null) {
                    handler2.post(new ub(aVar2, a3));
                    a2 = a3;
                } else if (i3 == -1) {
                    wq.a a4 = wq.a(str2, context, rqVar, i2);
                    wbVar.a(a4);
                    a2 = a4.a;
                } else {
                    try {
                        try {
                            try {
                                wq.a aVar3 = (wq.a) wq.b.submit(new sq(str2, context, rqVar, i2)).get(i3, TimeUnit.MILLISECONDS);
                                wbVar.a(aVar3);
                                a2 = aVar3.a;
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        wbVar.b.post(new vb(wbVar.a, -3));
                    }
                }
            } else {
                g30<String, Typeface> g30Var2 = wq.a;
                String str3 = rqVar.e + "-" + i2;
                Typeface a5 = wq.a.a(str3);
                if (a5 != null) {
                    handler2.post(new ub(aVar2, a5));
                    a2 = a5;
                } else {
                    tq tqVar = new tq(wbVar);
                    synchronized (wq.c) {
                        os0<String, ArrayList<ag<wq.a>>> os0Var = wq.d;
                        ArrayList<ag<wq.a>> orDefault = os0Var.getOrDefault(str3, null);
                        if (orDefault != null) {
                            orDefault.add(tqVar);
                        } else {
                            ArrayList<ag<wq.a>> arrayList = new ArrayList<>();
                            arrayList.add(tqVar);
                            os0Var.put(str3, arrayList);
                            uq uqVar = new uq(str3, context, rqVar, i2);
                            ThreadPoolExecutor threadPoolExecutor = wq.b;
                            vq vqVar = new vq(str3);
                            if (Looper.myLooper() == null) {
                                handler = new Handler(Looper.getMainLooper());
                            } else {
                                handler = new Handler();
                            }
                            threadPoolExecutor.execute(new zk0(handler, uqVar, vqVar));
                        }
                    }
                }
            }
        } else {
            a2 = a.a(context, (xq.b) aVar, resources, i2);
            if (cVar != null) {
                if (a2 != null) {
                    cVar.b(a2);
                } else {
                    cVar.a(-3);
                }
            }
        }
        if (a2 != null) {
            b.b(b(resources, i, i2), a2);
        }
        return a2;
    }

    public static String b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}