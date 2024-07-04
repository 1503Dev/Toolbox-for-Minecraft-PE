package io.mrarm.mctoolbox;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.databinding.f;
import com.mojang.minecraftpe.MainActivity;
import defpackage.i60;
import io.mrarm.mctoolbox.MinecraftActivity;
import io.mrarm.mctoolbox.bridge.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class MinecraftActivity extends AppCompatYuraiActivity {
    public cy0 U;
    public PackageInfo V;
    public jd0 W;
    public xz0 X;
    public qz0 Y;
    public h70 Z;
    public sy0 a0;
    public tc0 b0;
    public ut0 c0;
    public qg0 d0;
    public String e0;

    public static void r(final int i) {
        h21.a(new Runnable() { // from class: g60
            @Override // java.lang.Runnable
            public final void run() {
                MinecraftActivity.s(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(int i) {
        MinecraftActivity minecraftActivity = (MinecraftActivity) MainActivity.currentMainActivity.get();
        if ((i & 256) != 0) {
            Iterator it = minecraftActivity.X.d.c.iterator();
            while (it.hasNext()) {
                ow owVar = (ow) it.next();
                if (owVar.isVisible().Q) {
                    List<lw> d = owVar.d();
                    int i2 = i & 255;
                    if (i2 < d.size()) {
                        d.get(i2).d();
                    }
                }
            }
        }
        f fVar = minecraftActivity.X.i;
        if (i < fVar.size()) {
            ((y21) fVar.get(i)).a.d();
        }
    }

    private static native void u(AssetManager assetManager);

    private static native void v(boolean z);

    public static void w(boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        ((MinecraftActivity) MainActivity.currentMainActivity.get()).setCursorLocked(z);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        qg0 qg0Var = this.d0;
        return qg0Var != null ? qg0Var : super.getPackageManager();
    }

    @Override // io.mrarm.yurai.YuraiActivity
    public final void n() {
        super.n();
        t();
        System.loadLibrary(this.e0);
        u(getAssets());
    }

    @Override // io.mrarm.yurai.YuraiActivity
    public final at o() {
        return this.W;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xz0 xz0Var = this.X;
        if (xz0Var != null) {
            xz0Var.o.H(true);
        }
    }

    @Override // io.mrarm.mctoolbox.AppCompatYuraiActivity, io.mrarm.yurai.YuraiActivity, com.mojang.minecraftpe.MainActivity, android.app.NativeActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean b;
        boolean b2;
        String str;
        try {
            int i = 0;
            this.V = getPackageManager().getPackageInfo("com.mojang.minecraftpe", 0);
            this.W = new jd0(this);
            String installerPackageName = getPackageManager().getInstallerPackageName("com.mojang.minecraftpe");
            if (installerPackageName != null && installerPackageName.startsWith("com.android") && installerPackageName.endsWith("ending") && installerPackageName.contains(".v") && installerPackageName.length() == 19) {
                PreferenceManager.getDefaultSharedPreferences(this).edit().putString("test", "0").apply();
            }
            i60 a = i60.a(this);
            if (!a.c(this.V.versionName, true) && !a.c(this.V.versionName, false)) {
                Intent intent = new Intent(this, ErrorActivity.class);
                intent.putExtra("error", "not_supported");
                startActivity(intent);
                cancelOnCreate();
                super.onCreate(bundle);
                finish();
                return;
            }
            ApplicationInfo applicationInfo = this.V.applicationInfo;
            if (!a0.a()) {
                b = false;
            } else {
                b = a0.b(applicationInfo);
            }
            if (b && a.c(this.V.versionName, true)) {
                Intent intent2 = new Intent(this, ErrorActivity.class);
                intent2.putExtra("error", "not_supported_64bit_on_32bit");
                startActivity(intent2);
                cancelOnCreate();
                super.onCreate(bundle);
                finish();
                return;
            }
            ApplicationInfo applicationInfo2 = this.V.applicationInfo;
            if (!a0.a()) {
                b2 = false;
            } else {
                b2 = a0.b(applicationInfo2);
            }
            if (b2) {
                startActivity(new Intent(this, RelaunchActivity.class));
                cancelOnCreate();
                super.onCreate(bundle);
            } else if (a0.a() && !a.c(this.V.versionName, true)) {
                Intent intent3 = new Intent(this, ErrorActivity.class);
                intent3.putExtra("error", "not_supported_64bit");
                startActivity(intent3);
                cancelOnCreate();
                super.onCreate(bundle);
                finish();
            } else if (!a0.a() && !a.c(this.V.versionName, false)) {
                Intent intent4 = new Intent(this, ErrorActivity.class);
                intent4.putExtra("error", "not_supported_32bit");
                startActivity(intent4);
                cancelOnCreate();
                super.onCreate(bundle);
                finish();
            } else if (!PreferenceManager.getDefaultSharedPreferences(this).contains("test")) {
                Intent intent5 = new Intent(this, ErrorActivity.class);
                intent5.putExtra("error", "test");
                startActivity(intent5);
                cancelOnCreate();
                super.onCreate(bundle);
                finish();
            } else {
                String str2 = this.V.versionName;
                boolean a2 = a0.a();
                Iterator<i60.b> it = a.a.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        i60.b next = it.next();
                        if (str2.equals(next.a) && next.c == a2) {
                            str = next.b;
                            break;
                        }
                    } else {
                        str = null;
                        break;
                    }
                }
                this.e0 = str;
                if (!a0.a()) {
                    this.Z = new h70(this, this.e0);
                }
                t();
                if (Build.VERSION.SDK_INT < 24 && this.Z != null) {
                    this.d0 = new qg0(super.getPackageManager(), getClass().getName(), this.Z.a.getAbsolutePath());
                }
                super.onCreate(bundle);
                this.d0 = null;
                qz0 qz0Var = new qz0(this, b.o());
                this.Y = qz0Var;
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(qz0Var.a.getFilesDir(), "toolbox.json"));
                    try {
                        int size = (int) fileInputStream.getChannel().size();
                        byte[] bArr = new byte[size];
                        while (i < size) {
                            int read = fileInputStream.read(bArr, i, size - i);
                            if (read != -1) {
                                i += read;
                            } else {
                                throw new IOException();
                            }
                        }
                        ((b) qz0Var.b).v(new String(bArr, "UTF-8"));
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                } catch (Exception e) {
                    Log.e("ToolboxUIStorage", "Error during config loading");
                    e.printStackTrace();
                }
                this.Y.a();
                this.a0 = new sy0();
                this.U = new cy0(this);
                this.b0 = new tc0(this, b.o(), this.a0.a);
                this.c0 = new ut0(this, this.a0.a, b.o(), iy0.K(), this.b0);
                ve0 ve0Var = new ve0(this, this.b0);
                b o = b.o();
                this.X = new xz0(this, ve0Var, this.U, by0.b(), iy0.K(), o);
                v(true);
                this.U.a();
                this.U.b();
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.e("MinecraftActivity", "Game not found");
            Intent intent6 = new Intent(this, ErrorActivity.class);
            intent6.putExtra("error", "not_installed");
            startActivity(intent6);
            cancelOnCreate();
            super.onCreate(bundle);
            finish();
        }
    }

    @Override // io.mrarm.mctoolbox.AppCompatYuraiActivity, com.mojang.minecraftpe.MainActivity, android.app.NativeActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        qz0 qz0Var = this.Y;
        if (qz0Var != null) {
            qz0Var.b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xz0 xz0Var = this.X;
        if (xz0Var != null) {
            xz0Var.o.H(true);
        }
    }

    @Override // com.mojang.minecraftpe.MainActivity, android.app.NativeActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        ut0 ut0Var = this.c0;
        if (ut0Var != null) {
            ut0Var.a(false);
        }
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ut0 ut0Var = this.c0;
        if (ut0Var != null) {
            ut0Var.a(true);
        }
    }

    public final void t() {
        File a = this.W.a("libc++_shared.so");
        if (a != null || (a = this.W.a("libgnustl_shared.so")) != null) {
            System.load(a.getAbsolutePath());
        } else {
            System.loadLibrary("gnustl_shared");
        }
    }
}