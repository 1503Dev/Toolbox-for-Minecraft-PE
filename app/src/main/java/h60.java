package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.InputStream;

/* renamed from: h60  reason: default package */
public final class h60 {
    public final Context a;

    public h60(Context context) {
        try {
            this.a = context.createPackageContext("com.mojang.minecraftpe", 2);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public final Bitmap a(String str, String str2) {
        int indexOf = str2.indexOf(":");
        String substring = indexOf != -1 ? str2.substring(0, indexOf) : "vanilla";
        if (indexOf != -1) {
            str2 = str2.substring(indexOf + 1);
        }
        try {
            try {
                AssetManager assets = this.a.getAssets();
                InputStream open = assets.open("assets/resource_packs/" + substring + "/" + str + str2 + ".png");
                Bitmap decodeStream = BitmapFactory.decodeStream(open);
                if (open != null) {
                    open.close();
                }
                return decodeStream;
            } catch (Exception e) {
                Log.e("MinecraftResources", "Failed to open texture: " + str2);
                e.printStackTrace();
                return null;
            }
        } catch (Exception unused) {
            AssetManager assets2 = this.a.getAssets();
            InputStream open2 = assets2.open("resource_packs/" + substring + "/" + str + str2 + ".png");
            Bitmap decodeStream2 = BitmapFactory.decodeStream(open2);
            if (open2 != null) {
                open2.close();
            }
            return decodeStream2;
        }
    }
}