package io.mrarm.yurai;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import com.mojang.minecraftpe.MainActivity;
import defpackage.cg;
import io.mrarm.yurai.msa.MSASingleton;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;

public abstract class YuraiActivity extends MainActivity {
    public AssetManager P;
    public String Q;
    public String R;
    public HookManager S;

    private String getGameLibraryDlopenPath() {
        return this.R;
    }

    private static native void nativeLoadLibrary();

    private static native void nativePatchDataLocations(long j, String str);

    public AssetManager getGameAssetManager() {
        return this.P;
    }

    public void n() {
        File file;
        this.S.c();
        nativeLoadLibrary();
        long j = this.S.a;
        Object obj = cg.a;
        if (Build.VERSION.SDK_INT >= 24) {
            file = cg.d.b(this);
        } else {
            String str = getApplicationInfo().dataDir;
            if (str != null) {
                file = new File(str);
            } else {
                file = null;
            }
        }
        nativePatchDataLocations(j, file.getAbsolutePath());
    }

    public abstract at o();

    @Override // com.mojang.minecraftpe.MainActivity, android.app.NativeActivity, android.app.Activity
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public void onCreate(Bundle bundle) {
        System.loadLibrary("yurai");
        if (isOnCreateCancelled()) {
            super.onCreate(bundle);
            return;
        }
        WeakReference<YuraiActivity> weakReference = d91.a;
        d91.a = new WeakReference<>(this);
        MSASingleton.getInstance(this);
        File a = ((jd0) o()).a("libc++_shared.so");
        if (a != null) {
            System.load(a.getAbsolutePath());
        }
        File a2 = ((jd0) o()).a("libgnustl_shared.so");
        if (a2 != null) {
            System.load(a2.getAbsolutePath());
        }
        System.load(((jd0) o()).a("libfmod.so").getAbsolutePath());
        String absolutePath = ((jd0) o()).a("libminecraftpe.so").getAbsolutePath();
        this.Q = absolutePath;
        this.R = absolutePath;
        int patchLoadLibrary = Sopatch.patchLoadLibrary(absolutePath, "libminecraftpe.so", getCacheDir().getAbsolutePath());
        if ((patchLoadLibrary & 128) != 0) {
            LibLoader.a(this.Q);
            this.R = "libminecraftpe.so";
        }
        if ((patchLoadLibrary & 1) != 0) {
            this.R = "libminecraftpe.so";
        }
        if ((patchLoadLibrary & 4) != 0) {
            this.Q = new File(getCacheDir(), "libminecraftpe.so").getAbsolutePath();
        }
        HookManager hookManager = new HookManager();
        this.S = hookManager;
        hookManager.a();
        n();
        this.S.b();
        System.load(this.Q);
        this.P = ((jd0) o()).d;
        super.onCreate(bundle);
    }

    @Override // com.mojang.minecraftpe.MainActivity
    public final InputStream openAssetFile(String str) {
        return this.P.open(str);
    }
}