package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: vv2  reason: default package */
public final class vv2 {
    public static DynamiteModule a(Context context) {
        try {
            return DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new uv2(e);
        }
    }
}