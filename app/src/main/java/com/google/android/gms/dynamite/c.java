package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0021b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0021b c0021b = new DynamiteModule.b.C0021b();
        c0021b.a = aVar.a(context, str);
        int b = aVar.b(context, str, true);
        c0021b.b = b;
        int i = c0021b.a;
        if (i == 0) {
            if (b == 0) {
                c0021b.c = 0;
                return c0021b;
            }
            i = 0;
        }
        if (i >= b) {
            c0021b.c = -1;
        } else {
            c0021b.c = 1;
        }
        return c0021b;
    }
}