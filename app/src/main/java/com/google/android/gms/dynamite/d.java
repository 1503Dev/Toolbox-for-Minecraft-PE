package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class d implements DynamiteModule.b.a {
    public final int a;

    public d(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str) {
        return this.a;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str, boolean z) {
        return 0;
    }
}