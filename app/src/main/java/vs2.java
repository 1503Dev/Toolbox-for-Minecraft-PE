package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: vs2  reason: default package */
public final class vs2 implements ys2 {
    public static final List l = Collections.synchronizedList(new ArrayList());
    public final ph5 a;
    public final LinkedHashMap b;
    public final Context e;
    public boolean f;
    public final ws2 g;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Object h = new Object();
    public HashSet i = new HashSet();
    public boolean j = false;
    public boolean k = false;

    public vs2(Context context, xv2 xv2Var, ws2 ws2Var, String str) {
        if (ws2Var != null) {
            this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            this.b = new LinkedHashMap();
            this.g = ws2Var;
            for (String str2 : ws2Var.T) {
                this.i.add(str2.toLowerCase(Locale.ENGLISH));
            }
            this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
            ph5 w = ri5.w();
            w.j();
            ri5.M((ri5) w.Q, 9);
            w.j();
            ri5.B((ri5) w.Q, str);
            w.j();
            ri5.C((ri5) w.Q, str);
            qh5 w2 = rh5.w();
            String str3 = this.g.P;
            if (str3 != null) {
                w2.j();
                rh5.y((rh5) w2.Q, str3);
            }
            w.j();
            ri5.E((ri5) w.Q, (rh5) w2.h());
            ni5 w3 = oi5.w();
            boolean c = c81.a(this.e).c();
            w3.j();
            oi5.A((oi5) w3.Q, c);
            String str4 = xv2Var.P;
            if (str4 != null) {
                w3.j();
                oi5.y((oi5) w3.Q, str4);
            }
            jt jtVar = jt.b;
            Context context2 = this.e;
            jtVar.getClass();
            long a = jt.a(context2);
            if (a > 0) {
                w3.j();
                oi5.z((oi5) w3.Q, a);
            }
            w.j();
            ri5.J((ri5) w.Q, (oi5) w3.h());
            this.a = w;
            return;
        }
        throw new NullPointerException("SafeBrowsing config is not present.");
    }

    @Override // defpackage.ys2
    public final void W(String str) {
        synchronized (this.h) {
            try {
                if (str == null) {
                    ph5 ph5Var = this.a;
                    ph5Var.j();
                    ri5.H((ri5) ph5Var.Q);
                } else {
                    ph5 ph5Var2 = this.a;
                    ph5Var2.j();
                    ri5.G((ri5) ph5Var2.Q, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ys2
    public final void X(String str, Map map, int i) {
        String str2;
        String str3;
        synchronized (this.h) {
            int i2 = 1;
            if (i == 3) {
                try {
                    this.k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b.containsKey(str)) {
                if (i == 3) {
                    li5 li5Var = (li5) this.b.get(str);
                    li5Var.j();
                    mi5.F((mi5) li5Var.Q, 4);
                }
                return;
            }
            li5 x = mi5.x();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            i2 = 0;
                        } else {
                            i2 = 4;
                        }
                    } else {
                        i2 = 3;
                    }
                } else {
                    i2 = 2;
                }
            }
            if (i2 != 0) {
                x.j();
                mi5.F((mi5) x.Q, i2);
            }
            int size = this.b.size();
            x.j();
            mi5.A((mi5) x.Q, size);
            x.j();
            mi5.B((mi5) x.Q, str);
            ai5 w = di5.w();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        str2 = (String) entry.getKey();
                    } else {
                        str2 = "";
                    }
                    if (entry.getValue() != null) {
                        str3 = (String) entry.getValue();
                    } else {
                        str3 = "";
                    }
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        yh5 w2 = zh5.w();
                        ed5 ed5Var = gd5.Q;
                        Charset charset = re5.a;
                        ed5 ed5Var2 = new ed5(str2.getBytes(charset));
                        w2.j();
                        zh5.y((zh5) w2.Q, ed5Var2);
                        ed5 ed5Var3 = new ed5(str3.getBytes(charset));
                        w2.j();
                        zh5.z((zh5) w2.Q, ed5Var3);
                        w.j();
                        di5.y((di5) w.Q, (zh5) w2.h());
                    }
                }
            }
            x.j();
            mi5.C((mi5) x.Q, (di5) w.h());
            this.b.put(str, x);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ys2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(View view) {
        Bitmap bitmap;
        if (!this.g.R || this.j) {
            return;
        }
        cu5 cu5Var = jv5.A.c;
        Bitmap bitmap2 = null;
        if (view != null) {
            try {
                boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                view.setDrawingCacheEnabled(true);
                Bitmap drawingCache = view.getDrawingCache();
                if (drawingCache != null) {
                    bitmap = Bitmap.createBitmap(drawingCache);
                } else {
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e) {
                    e = e;
                    sv2.e("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
            } catch (RuntimeException e2) {
                e = e2;
                bitmap = null;
            }
            if (bitmap != null) {
                try {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (width != 0 && height != 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(createBitmap);
                        view.layout(0, 0, width, height);
                        view.draw(canvas);
                        bitmap2 = createBitmap;
                    }
                    sv2.g("Width or height of view is zero");
                } catch (RuntimeException e3) {
                    sv2.e("Fail to capture the webview", e3);
                }
            } else {
                bitmap2 = bitmap;
            }
        }
        if (bitmap2 != null) {
            eg4.n("Failed to capture the webview bitmap.");
            return;
        }
        this.j = true;
        us2 us2Var = new us2(0, this, bitmap2);
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            us2Var.run();
        } else {
            zw2.a.execute(us2Var);
        }
    }

    @Override // defpackage.ys2
    public final ws2 a() {
        return this.g;
    }

    @Override // defpackage.ys2
    public final void b() {
        synchronized (this.h) {
            this.b.keySet();
            zy4 C = zw4.C(Collections.emptyMap());
            ts2 ts2Var = new ts2(0, this);
            yw2 yw2Var = zw2.f;
            ay4 F = zw4.F(C, ts2Var, yw2Var);
            dz4 G = zw4.G(F, 10L, TimeUnit.SECONDS, zw2.d);
            zw4.J(F, new bo5(G), yw2Var);
            l.add(G);
        }
    }

    @Override // defpackage.ys2
    public final boolean g() {
        return this.g.R && !this.j;
    }
}