package io.mrarm.mctoolbox;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.View;
import defpackage.cg;
import defpackage.ph;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class RelaunchActivity extends Activity {
    public static boolean S = false;
    public ServerSocket P;
    public boolean Q = false;
    public boolean R = false;

    @SuppressLint({"PrivateApi"})
    public static void b(Context context) {
        Object invoke;
        if (S) {
            return;
        }
        try {
            try {
                invoke = ActivityManager.class.getDeclaredMethod("getService", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                invoke = Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
            }
            Class<?> cls = Class.forName("android.app.IActivityManager");
            Class<?> cls2 = Integer.TYPE;
            if (!((Boolean) cls.getDeclaredMethod("startInstrumentation", ComponentName.class, String.class, cls2, Bundle.class, Class.forName("android.app.IInstrumentationWatcher"), Class.forName("android.app.IUiAutomationConnection"), cls2, String.class).invoke(invoke, new ComponentName(context, RelaunchInstrumentation.class), null, 0, new Bundle(), null, null, Integer.valueOf(Process.myUserHandle().hashCode()), "armeabi-v7a")).booleanValue()) {
                throw new RuntimeException("Restart failed");
            }
            S = true;
            Log.i("RelaunchActivity", "Restart OK");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public final String a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getAssets().open("loading.html")));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            return "<h1>Loading</h1>";
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean b;
        super.onCreate(bundle);
        View view = new View(this);
        setContentView(view);
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo("com.mojang.minecraftpe", 0);
            i60 a = i60.a(this);
            if (!a.c(packageInfo.versionName, true) && !a.c(packageInfo.versionName, false)) {
                Intent intent = new Intent(this, ErrorActivity.class);
                intent.putExtra("error", "not_supported");
                startActivity(intent);
                finish();
                return;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (!a0.a()) {
                b = false;
            } else {
                b = a0.b(applicationInfo);
            }
            if (!b) {
                startActivity(new Intent(this, MinecraftActivity.class));
                finish();
            } else if (!a0.a()) {
                startActivity(new Intent(this, MinecraftActivity.class));
                finish();
            } else {
                try {
                    String a2 = a();
                    mk0 mk0Var = new mk0(0, this);
                    if (this.P == null) {
                        this.P = new ServerSocket(0);
                        new Thread(new pk0(0, this, a2, mk0Var)).start();
                        String b2 = bp.b("http://localhost:", this.P.getLocalPort(), "/");
                        ph.a aVar = new ph.a();
                        aVar.b.a = -12303292;
                        aVar.b.b = 0;
                        aVar.c = ActivityOptions.makeCustomAnimation(this, 2130771998, 2130771999).toBundle();
                        ph a3 = aVar.a();
                        a3.a.setPackage("com.android.chrome");
                        a3.a.addFlags(268435456);
                        try {
                            a3.a.setData(Uri.parse(b2));
                            Intent intent2 = a3.a;
                            Bundle bundle2 = a3.b;
                            Object obj = cg.a;
                            cg.a.b(this, intent2, bundle2);
                            view.postDelayed(new nk0(0, this), 100L);
                            view.postDelayed(new ok0(0, this), 3000L);
                            return;
                        } catch (Exception unused) {
                            b(this);
                            return;
                        }
                    }
                    throw new IllegalStateException();
                } catch (IOException unused2) {
                    b(this);
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Intent intent3 = new Intent(this, ErrorActivity.class);
            intent3.putExtra("error", "not_installed");
            startActivity(intent3);
            finish();
        }
    }
}