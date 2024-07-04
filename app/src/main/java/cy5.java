package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: cy5  reason: default package */
public final class cy5 extends eh3 {
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final SparseArray q;
    public final SparseBooleanArray r;

    @Deprecated
    public cy5() {
        this.q = new SparseArray();
        this.r = new SparseBooleanArray();
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = true;
    }

    public cy5(Context context) {
        CaptioningManager captioningManager;
        int i = zn4.a;
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.h = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.g = nv4.v(i >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Point t = zn4.t(context);
        int i2 = t.x;
        int i3 = t.y;
        this.a = i2;
        this.b = i3;
        this.c = true;
        this.q = new SparseArray();
        this.r = new SparseBooleanArray();
        this.k = true;
        this.l = true;
        this.m = true;
        this.n = true;
        this.o = true;
        this.p = true;
    }

    public /* synthetic */ cy5(dy5 dy5Var) {
        super(dy5Var);
        this.k = dy5Var.k;
        this.l = dy5Var.l;
        this.m = dy5Var.m;
        this.n = dy5Var.n;
        this.o = dy5Var.o;
        this.p = dy5Var.p;
        SparseArray sparseArray = dy5Var.q;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.q = sparseArray2;
        this.r = dy5Var.r.clone();
    }
}