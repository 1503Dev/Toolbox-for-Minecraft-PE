package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: h34  reason: default package */
public final class h34 {
    public static volatile h34 i;
    public final String a;
    public final dk b;
    public final ExecutorService c;
    public final t6 d;
    public int e;
    public boolean f;
    public final String g;
    public volatile ky2 h;

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(4:62|63|64|(17:66|(1:5)(1:61)|6|7|8|9|(2:54|55)|11|12|(8:50|51|(4:42|43|44|(2:46|47))|(4:35|36|37|(4:39|(2:19|(1:21)(3:(1:30)|31|(1:33)))(1:34)|22|(2:24|25)(2:27|28)))|17|(0)(0)|22|(0)(0))|14|(0)|(0)|17|(0)(0)|22|(0)(0)))|3|(0)(0)|6|7|8|9|(0)|11|12|(0)|14|(0)|(0)|17|(0)(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        r3 = r13.getPackageName();
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h34(Context context, String str, Bundle bundle) {
        boolean z;
        boolean z2;
        String str2;
        String packageName;
        boolean z3;
        boolean z4;
        Application application;
        int identifier;
        String string;
        boolean z5;
        if (str != null) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                z2 = true;
                if (z2) {
                    str2 = "FA";
                } else {
                    str2 = "FA-Ads";
                }
                this.a = str2;
                this.b = dk.a;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new gm3());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.c = Executors.unconfigurableExecutorService(threadPoolExecutor);
                this.d = new t6(this);
                new ArrayList();
                packageName = context.getResources().getResourcePackageName(ti0.common_google_play_services_unknown_issue);
                Resources resources = context.getResources();
                if (TextUtils.isEmpty(packageName)) {
                    try {
                        packageName = context.getResources().getResourcePackageName(ti0.common_google_play_services_unknown_issue);
                    } catch (Resources.NotFoundException unused2) {
                        packageName = context.getPackageName();
                    }
                }
                identifier = resources.getIdentifier("google_app_id", "string", packageName);
                if (identifier != 0) {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused3) {
                    }
                    if (string != null) {
                        try {
                            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                            z5 = true;
                        } catch (ClassNotFoundException unused4) {
                            z5 = false;
                        }
                        if (!z5) {
                            this.g = null;
                            this.f = true;
                            Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                            return;
                        }
                    }
                    if (str != null) {
                        try {
                            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                            z3 = true;
                        } catch (ClassNotFoundException unused5) {
                            z3 = false;
                        }
                        if (!z3) {
                            z4 = true;
                            if (z4) {
                                this.g = "fa";
                                if (str != null) {
                                    Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                                } else {
                                    if (false ^ (str == null)) {
                                        Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                                    }
                                }
                            } else {
                                this.g = "am";
                            }
                            b(new re3(this, str, context, bundle));
                            application = (Application) context.getApplicationContext();
                            if (application != null) {
                                Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
                                return;
                            } else {
                                application.registerActivityLifecycleCallbacks(new m24(this));
                                return;
                            }
                        }
                    }
                    z4 = false;
                    if (z4) {
                    }
                    b(new re3(this, str, context, bundle));
                    application = (Application) context.getApplicationContext();
                    if (application != null) {
                    }
                }
                string = null;
                if (string != null) {
                }
                if (str != null) {
                }
                z4 = false;
                if (z4) {
                }
                b(new re3(this, str, context, bundle));
                application = (Application) context.getApplicationContext();
                if (application != null) {
                }
            }
        }
        z2 = false;
        if (z2) {
        }
        this.a = str2;
        this.b = dk.a;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new gm3());
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor2);
        this.d = new t6(this);
        new ArrayList();
        packageName = context.getResources().getResourcePackageName(ti0.common_google_play_services_unknown_issue);
        Resources resources2 = context.getResources();
        if (TextUtils.isEmpty(packageName)) {
        }
        identifier = resources2.getIdentifier("google_app_id", "string", packageName);
        if (identifier != 0) {
        }
        string = null;
        if (string != null) {
        }
        if (str != null) {
        }
        z4 = false;
        if (z4) {
        }
        b(new re3(this, str, context, bundle));
        application = (Application) context.getApplicationContext();
        if (application != null) {
        }
    }

    public final void a(Exception exc, boolean z, boolean z2) {
        this.f |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            b(new wk3(this, exc));
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    public final void b(gu3 gu3Var) {
        this.c.execute(gu3Var);
    }
}