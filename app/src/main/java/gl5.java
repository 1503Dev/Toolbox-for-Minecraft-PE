package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: gl5  reason: default package */
public final class gl5 {
    public final Context a;
    public dj4 b;
    public vk5 c;
    public wk5 d;
    public qt4 e;
    public qt4 f;
    public fl5 g;
    public Looper h;
    public pm5 i;
    public int j;
    public boolean k;
    public ao5 l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public pk5 q;

    public gl5(Context context, u04 u04Var) {
        vk5 vk5Var = new vk5(u04Var);
        wk5 wk5Var = new wk5(context);
        dz1 dz1Var = new dz1(5, context);
        ar arVar = ar.V;
        fl5 fl5Var = new fl5(context);
        context.getClass();
        this.a = context;
        this.c = vk5Var;
        this.d = wk5Var;
        this.e = dz1Var;
        this.f = arVar;
        this.g = fl5Var;
        int i = zn4.a;
        Looper myLooper = Looper.myLooper();
        this.h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.i = pm5.b;
        this.j = 1;
        this.k = true;
        this.l = ao5.c;
        this.q = new pk5(zn4.q(20L), zn4.q(500L));
        this.b = dx3.a;
        this.m = 500L;
        this.n = 2000L;
        this.o = true;
    }
}