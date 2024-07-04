package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

/* renamed from: fx3  reason: default package */
public final class fx3 {
    public final Date a;
    public final ArrayList b;
    public final int c;
    public final Set d;
    public final Bundle e;
    public final int f;
    public final Set g;
    public final Bundle h;
    public final Set i;
    public final boolean j;
    public final int k;

    public fx3(lw3 lw3Var) {
        this.a = lw3Var.g;
        this.b = lw3Var.h;
        this.c = lw3Var.i;
        this.d = Collections.unmodifiableSet(lw3Var.a);
        this.e = lw3Var.b;
        Collections.unmodifiableMap(lw3Var.c);
        this.f = lw3Var.j;
        this.g = Collections.unmodifiableSet(lw3Var.d);
        this.h = lw3Var.e;
        this.i = Collections.unmodifiableSet(lw3Var.f);
        this.j = lw3Var.k;
        this.k = lw3Var.l;
    }
}