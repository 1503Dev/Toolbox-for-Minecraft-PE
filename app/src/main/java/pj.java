package defpackage;

import android.content.Context;
import defpackage.bm0;
import defpackage.wu0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: pj  reason: default package */
public final class pj {
    public final wu0.c a;
    public final Context b;
    public final String c;
    public final bm0.c d;
    public final List<bm0.b> e;
    public final Executor f;
    public final Executor g;
    public final boolean h;
    public final boolean i;

    public pj(Context context, String str, wu0.c cVar, bm0.c cVar2, ArrayList arrayList, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = cVar2;
        this.e = arrayList;
        this.f = executor;
        this.g = executor2;
        this.h = z2;
        this.i = z3;
    }

    public final boolean a(int i, int i2) {
        return !((i > i2) && this.i) && this.h;
    }
}