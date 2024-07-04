package defpackage;

import java.util.HashMap;

/* renamed from: jz2  reason: default package */
public final class jz2 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ long R;
    public final /* synthetic */ long S;
    public final /* synthetic */ long T;
    public final /* synthetic */ long U;
    public final /* synthetic */ long V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ oz2 Z;

    public jz2(oz2 oz2Var, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.Z = oz2Var;
        this.P = str;
        this.Q = str2;
        this.R = j;
        this.S = j2;
        this.T = j3;
        this.U = j4;
        this.V = j5;
        this.W = z;
        this.X = i;
        this.Y = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.P);
        hashMap.put("cachedSrc", this.Q);
        hashMap.put("bufferedDuration", Long.toString(this.R));
        hashMap.put("totalDuration", Long.toString(this.S));
        if (((Boolean) w82.d.c.a(x92.x1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.T));
            hashMap.put("qoeCachedBytes", Long.toString(this.U));
            hashMap.put("totalBytes", Long.toString(this.V));
            jv5.A.j.getClass();
            hashMap.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        if (true != this.W) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("cacheReady", str);
        hashMap.put("playerCount", Integer.toString(this.X));
        hashMap.put("playerPreparedCount", Integer.toString(this.Y));
        oz2.k(this.Z, hashMap);
    }
}