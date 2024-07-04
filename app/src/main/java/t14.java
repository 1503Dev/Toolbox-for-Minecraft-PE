package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t14  reason: default package */
public final /* synthetic */ class t14 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ t14(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer.TrackInfo[] trackInfo;
        String string;
        String str;
        MediaFormat format;
        switch (this.P) {
            case 0:
                x64 x64Var = (x64) this.Q;
                Context context = (Context) this.R;
                synchronized (x64Var.e) {
                    x64Var.d(context);
                }
                return;
            case 1:
                qx2 qx2Var = (qx2) this.R;
                MediaPlayer mediaPlayer = (MediaPlayer) this.Q;
                HashMap hashMap = qx2.k0;
                if (((Boolean) w82.d.c.a(x92.x1)).booleanValue() && qx2Var.R != null && mediaPlayer != null && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
                    HashMap hashMap2 = new HashMap();
                    for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                        if (trackInfo2 != null) {
                            int trackType = trackInfo2.getTrackType();
                            if (trackType != 1) {
                                if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                    if (format.containsKey("mime")) {
                                        hashMap2.put("audioMime", format.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                        string = format.getString("codecs-string");
                                        str = "audioCodec";
                                        hashMap2.put(str, string);
                                    }
                                }
                            } else {
                                MediaFormat format2 = trackInfo2.getFormat();
                                if (format2 != null) {
                                    if (format2.containsKey("frame-rate")) {
                                        try {
                                            hashMap2.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                        } catch (ClassCastException unused) {
                                            hashMap2.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                        }
                                    }
                                    if (format2.containsKey("bitrate")) {
                                        Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                        qx2Var.j0 = valueOf;
                                        hashMap2.put("bitRate", String.valueOf(valueOf));
                                    }
                                    if (format2.containsKey("width") && format2.containsKey("height")) {
                                        hashMap2.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                    }
                                    if (format2.containsKey("mime")) {
                                        hashMap2.put("videoMime", format2.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                        string = format2.getString("codecs-string");
                                        str = "videoCodec";
                                        hashMap2.put(str, string);
                                    }
                                }
                            }
                        }
                    }
                    if (!hashMap2.isEmpty()) {
                        qx2Var.R.a("onMetadataEvent", hashMap2);
                    }
                }
                rx2 rx2Var = ((qx2) this.R).h0;
                if (rx2Var != null) {
                    ((vx2) rx2Var).f();
                    return;
                }
                return;
            case 2:
                int i = l03.l0;
                ((gy2) this.Q).a("onGcacheInfoEvent", (Map) this.R);
                return;
            default:
                String str2 = (String) this.R;
                final jt3 jt3Var = ((ht3) this.Q).P;
                int i2 = 5;
                final hm4 t = eb1.t(jt3Var.f, 5);
                t.f();
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject = new JSONObject(str2).getJSONObject("initializer_settings").getJSONObject("config");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        final String next = keys.next();
                        final hm4 t2 = eb1.t(jt3Var.f, i2);
                        t2.f();
                        t2.P(next);
                        final Object obj = new Object();
                        final bx2 bx2Var = new bx2();
                        dz4 G = zw4.G(bx2Var, ((Long) w82.d.c.a(x92.v1)).longValue(), TimeUnit.SECONDS, jt3Var.k);
                        jt3Var.l.b(next);
                        jt3Var.o.H(next);
                        jv5.A.j.getClass();
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        G.b(new Runnable() { // from class: et3
                            @Override // java.lang.Runnable
                            public final void run() {
                                jt3 jt3Var2 = jt3Var;
                                Object obj2 = obj;
                                bx2 bx2Var2 = bx2Var;
                                String str3 = next;
                                long j = elapsedRealtime;
                                hm4 hm4Var = t2;
                                jt3Var2.getClass();
                                synchronized (obj2) {
                                    if (!bx2Var2.isDone()) {
                                        jv5.A.j.getClass();
                                        jt3Var2.d(str3, (int) (SystemClock.elapsedRealtime() - j), "Timeout.", false);
                                        jt3Var2.l.a(str3, "timeout");
                                        jt3Var2.o.B(str3, "timeout");
                                        rm4 rm4Var = jt3Var2.p;
                                        hm4Var.H("Timeout");
                                        hm4Var.k0(false);
                                        rm4Var.c(hm4Var.n());
                                        bx2Var2.a(Boolean.FALSE);
                                    }
                                }
                            }
                        }, jt3Var.i);
                        arrayList.add(G);
                        final it3 it3Var = new it3(elapsedRealtime, bx2Var, jt3Var, t2, obj, next);
                        JSONObject optJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (optJSONObject != null) {
                            try {
                                JSONArray jSONArray = optJSONObject.getJSONArray("data");
                                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                    String optString = jSONObject2.optString("format", "");
                                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys2 = optJSONObject2.keys();
                                        while (keys2.hasNext()) {
                                            String next2 = keys2.next();
                                            bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                        }
                                    }
                                    arrayList2.add(new ei2(bundle, optString));
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                        jt3Var.d(next, 0, "", false);
                        try {
                            try {
                                final mj4 b = jt3Var.h.b(next, new JSONObject());
                                jt3Var.j.execute(new Runnable() { // from class: gt3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        jt3 jt3Var2 = jt3.this;
                                        mj4 mj4Var = b;
                                        ai2 ai2Var = it3Var;
                                        List list = arrayList2;
                                        String str3 = next;
                                        jt3Var2.getClass();
                                        try {
                                            try {
                                                Context context2 = (Context) jt3Var2.g.get();
                                                if (context2 == null) {
                                                    context2 = jt3Var2.f;
                                                }
                                                mj4Var.getClass();
                                                mj4Var.a.p3(new va0(context2), ai2Var, list);
                                            } catch (RemoteException e) {
                                                sv2.e("", e);
                                            }
                                        } catch (ni4 unused3) {
                                            ai2Var.D("Failed to initialize adapter. " + str3 + " does not implement the initialize() method.");
                                        }
                                    }
                                });
                            } catch (ni4 unused3) {
                                it3Var.D("Failed to create Adapter.");
                            }
                        } catch (RemoteException e) {
                            sv2.e("", e);
                        }
                        i2 = 5;
                    }
                    new oy4(nv4.t(arrayList), false, jt3Var.i, new Callable() { // from class: ft3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            jt3 jt3Var2 = jt3.this;
                            hm4 hm4Var = t;
                            jt3Var2.e.a(Boolean.TRUE);
                            rm4 rm4Var = jt3Var2.p;
                            hm4Var.k0(true);
                            rm4Var.c(hm4Var.n());
                            return null;
                        }
                    });
                    return;
                } catch (JSONException e2) {
                    vz3.l("Malformed CLD response", e2);
                    jt3Var.o.m("MalformedJson");
                    is3 is3Var = jt3Var.l;
                    synchronized (is3Var) {
                        l92 l92Var = x92.G1;
                        w82 w82Var = w82.d;
                        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                            if (!((Boolean) w82Var.c.a(x92.k7)).booleanValue()) {
                                HashMap e3 = is3Var.e();
                                e3.put("action", "aaia");
                                e3.put("aair", "MalformedJson");
                                is3Var.b.add(e3);
                            }
                        }
                        jt3Var.e.c(e2);
                        jv5.A.g.f("AdapterInitializer.updateAdapterStatus", e2);
                        rm4 rm4Var = jt3Var.p;
                        t.b(e2);
                        t.k0(false);
                        rm4Var.c(t.n());
                        return;
                    }
                }
        }
    }

    public t14(qx2 qx2Var, MediaPlayer mediaPlayer) {
        this.P = 1;
        this.R = qx2Var;
        this.Q = mediaPlayer;
    }

    public /* synthetic */ t14(x64 x64Var, Context context) {
        this.P = 0;
        this.Q = x64Var;
        this.R = context;
    }
}