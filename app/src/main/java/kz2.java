package defpackage;

import java.util.HashMap;

/* renamed from: kz2  reason: default package */
public final class kz2 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ int S;
    public final /* synthetic */ long T;
    public final /* synthetic */ long U;
    public final /* synthetic */ boolean V;
    public final /* synthetic */ int W;
    public final /* synthetic */ int X;
    public final /* synthetic */ oz2 Y;

    public kz2(oz2 oz2Var, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.Y = oz2Var;
        this.P = str;
        this.Q = str2;
        this.R = i;
        this.S = i2;
        this.T = j;
        this.U = j2;
        this.V = z;
        this.W = i3;
        this.X = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.P);
        hashMap.put("cachedSrc", this.Q);
        hashMap.put("bytesLoaded", Integer.toString(this.R));
        hashMap.put("totalBytes", Integer.toString(this.S));
        hashMap.put("bufferedDuration", Long.toString(this.T));
        hashMap.put("totalDuration", Long.toString(this.U));
        hashMap.put("cacheReady", true != this.V ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.W));
        hashMap.put("playerPreparedCount", Integer.toString(this.X));
        oz2.k(this.Y, hashMap);
    }
}