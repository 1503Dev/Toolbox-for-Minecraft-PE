package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class b implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0021b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0021b c0021b = new DynamiteModule.b.C0021b();
        int b = aVar.b(context, str, true);
        c0021b.b = b;
        if (b != 0) {
            c0021b.c = 1;
        } else {
            int a = aVar.a(context, str);
            c0021b.a = a;
            if (a != 0) {
                c0021b.c = -1;
            }
        }
        return c0021b;
    }
}