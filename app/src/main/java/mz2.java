package defpackage;

import java.util.HashMap;

/* renamed from: mz2  reason: default package */
public final class mz2 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ long R;
    public final /* synthetic */ oz2 S;

    public mz2(oz2 oz2Var, String str, String str2, long j) {
        this.S = oz2Var;
        this.P = str;
        this.Q = str2;
        this.R = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.P);
        hashMap.put("cachedSrc", this.Q);
        hashMap.put("totalDuration", Long.toString(this.R));
        oz2.k(this.S, hashMap);
    }
}