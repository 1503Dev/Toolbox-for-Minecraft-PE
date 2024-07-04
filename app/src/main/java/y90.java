package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: y90  reason: default package */
public final class y90 {
    public Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public z90 j;
    public Bundle l;
    public String m;
    public boolean n;
    public Notification o;
    @Deprecated
    public ArrayList<String> p;
    public ArrayList<w90> b = new ArrayList<>();
    public ArrayList<he0> c = new ArrayList<>();
    public ArrayList<w90> d = new ArrayList<>();
    public boolean i = true;
    public boolean k = false;

    public y90(Context context, String str) {
        Notification notification = new Notification();
        this.o = notification;
        this.a = context;
        this.m = str;
        notification.when = System.currentTimeMillis();
        this.o.audioStreamType = -1;
        this.h = 0;
        this.p = new ArrayList<>();
        this.n = true;
    }

    public static CharSequence a(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final void b(x90 x90Var) {
        if (this.j != x90Var) {
            this.j = x90Var;
            if (x90Var.a != this) {
                x90Var.a = this;
                b(x90Var);
            }
        }
    }
}