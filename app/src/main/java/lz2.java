package defpackage;

import java.util.HashMap;

/* renamed from: lz2  reason: default package */
public final class lz2 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ oz2 S;

    public lz2(oz2 oz2Var, String str, String str2, int i) {
        this.S = oz2Var;
        this.P = str;
        this.Q = str2;
        this.R = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.P);
        hashMap.put("cachedSrc", this.Q);
        hashMap.put("totalBytes", Integer.toString(this.R));
        oz2.k(this.S, hashMap);
    }
}