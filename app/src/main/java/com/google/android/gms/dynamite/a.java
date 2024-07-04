package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class a implements DynamiteModule.b.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str) {
        return DynamiteModule.a(context, str);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str, boolean z) {
        return DynamiteModule.d(context, str, z);
    }
}