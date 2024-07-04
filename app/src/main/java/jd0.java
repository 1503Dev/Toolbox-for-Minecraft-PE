package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: jd0  reason: default package */
public final class jd0 implements at {
    public final String a;
    public final File b;
    public final String[] c;
    public final AssetManager d;

    public jd0(Context context) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.mojang.minecraftpe", 0);
        this.a = packageInfo.versionName;
        this.b = new File(packageInfo.applicationInfo.nativeLibraryDir);
        if (Build.VERSION.SDK_INT >= 21) {
            this.c = packageInfo.applicationInfo.splitSourceDirs;
        } else {
            this.c = null;
        }
        this.d = context.createPackageContext("com.mojang.minecraftpe", 2).getAssets();
    }

    public final File a(String str) {
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str2 : strArr) {
                try {
                    ZipFile zipFile = new ZipFile(str2);
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        String name = nextElement.getName();
                        if (name.startsWith("lib/")) {
                            int lastIndexOf = name.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                name = name.substring(lastIndexOf + 1);
                            }
                            if (name.equals(str) && nextElement.getCompressedSize() >= nextElement.getSize()) {
                                File file = new File(str2 + "!/" + nextElement.getName());
                                zipFile.close();
                                return file;
                            }
                        }
                    }
                    zipFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        File file2 = new File(this.b, str);
        if (file2.exists()) {
            return file2;
        }
        return null;
    }
}