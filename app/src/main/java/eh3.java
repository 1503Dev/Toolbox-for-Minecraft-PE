package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: eh3  reason: default package */
public class eh3 {
    public int a;
    public int b;
    public boolean c;
    public final nv4 d;
    public final nv4 e;
    public final nv4 f;
    public nv4 g;
    public int h;
    public final HashMap i;
    public final HashSet j;

    @Deprecated
    public eh3() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = true;
        lv4 lv4Var = nv4.Q;
        nw4 nw4Var = nw4.T;
        this.d = nw4Var;
        this.e = nw4Var;
        this.f = nw4Var;
        this.g = nw4Var;
        this.h = 0;
        this.i = new HashMap();
        this.j = new HashSet();
    }

    public eh3(ai3 ai3Var) {
        this.a = ai3Var.a;
        this.b = ai3Var.b;
        this.c = ai3Var.c;
        this.d = ai3Var.d;
        this.e = ai3Var.e;
        this.f = ai3Var.f;
        this.g = ai3Var.g;
        this.h = ai3Var.h;
        this.j = new HashSet(ai3Var.j);
        this.i = new HashMap(ai3Var.i);
    }
}