package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: j32  reason: default package */
public final class j32 extends Thread {
    public boolean P;
    public boolean Q;
    public final Object R;
    public final b32 S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final String b0;
    public final boolean c0;
    public final boolean d0;
    public final boolean e0;

    public j32() {
        b32 b32Var = new b32();
        this.P = false;
        this.Q = false;
        this.S = b32Var;
        this.R = new Object();
        this.U = ((Long) eb2.d.d()).intValue();
        this.V = ((Long) eb2.a.d()).intValue();
        this.W = ((Long) eb2.e.d()).intValue();
        this.X = ((Long) eb2.c.d()).intValue();
        m92 m92Var = x92.M;
        w82 w82Var = w82.d;
        this.Y = ((Integer) w82Var.c.a(m92Var)).intValue();
        this.Z = ((Integer) w82Var.c.a(x92.N)).intValue();
        this.a0 = ((Integer) w82Var.c.a(x92.O)).intValue();
        this.T = ((Long) eb2.f.d()).intValue();
        this.b0 = (String) w82Var.c.a(x92.Q);
        this.c0 = ((Boolean) w82Var.c.a(x92.R)).booleanValue();
        this.d0 = ((Boolean) w82Var.c.a(x92.S)).booleanValue();
        this.e0 = ((Boolean) w82Var.c.a(x92.T)).booleanValue();
        setName("ContentFetchTask");
    }

    public final ru1 b(View view, a32 a32Var) {
        if (view == null) {
            return new ru1(0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (!TextUtils.isEmpty(text)) {
                a32Var.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                return new ru1(1, 0);
            }
            return new ru1(0, 0);
        } else if ((view instanceof WebView) && !(view instanceof y03)) {
            WebView webView = (WebView) view;
            synchronized (a32Var.g) {
                a32Var.m++;
            }
            webView.post(new i32(this, a32Var, webView, globalVisibleRect));
            return new ru1(0, 1);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                ru1 b = b(viewGroup.getChildAt(i3), a32Var);
                i += b.a;
                i2 += b.b;
            }
            return new ru1(i, i2);
        } else {
            return new ru1(0, 0);
        }
    }

    public final void c() {
        synchronized (this.R) {
            this.Q = true;
            sv2.b("ContentFetchThread: paused, pause = true");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        View view;
        Application application;
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            f32 f32Var = jv5.A.f;
            synchronized (f32Var.a) {
                d32 d32Var = f32Var.b;
                view = null;
                if (d32Var != null) {
                    application = d32Var.Q;
                } else {
                    application = null;
                }
            }
            if (application != null) {
                ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                KeyguardManager keyguardManager = (KeyguardManager) application.getSystemService("keyguard");
                if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (Process.myPid() == next.pid) {
                            if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) application.getSystemService("power")) != null && powerManager.isScreenOn()) {
                                try {
                                    Activity a = jv5.A.f.a();
                                    if (a == null) {
                                        str = "ContentFetchThread: no activity. Sleeping.";
                                    } else {
                                        try {
                                            if (a.getWindow() != null && a.getWindow().getDecorView() != null) {
                                                view = a.getWindow().getDecorView().findViewById(16908290);
                                            }
                                        } catch (Exception e) {
                                            jv5.A.g.f("ContentFetchTask.extractContent", e);
                                            sv2.b("Failed getting root view of activity. Content not extracted.");
                                        }
                                        if (view != null) {
                                            view.post(new g32(this, view));
                                        }
                                    }
                                } catch (InterruptedException e2) {
                                    sv2.e("Error in ContentFetchTask", e2);
                                } catch (Exception e3) {
                                    sv2.e("Error in ContentFetchTask", e3);
                                    jv5.A.g.f("ContentFetchTask.run", e3);
                                }
                            }
                        }
                    }
                }
            }
            str = "ContentFetchTask: sleeping";
            sv2.b(str);
            c();
            Thread.sleep(this.T * 1000);
            synchronized (this.R) {
                while (this.Q) {
                    try {
                        sv2.b("ContentFetchTask: waiting");
                        this.R.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}