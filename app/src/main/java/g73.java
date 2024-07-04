package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g73  reason: default package */
public final class g73 implements xj2 {
    public final Context P;
    public final o22 Q;
    public final PowerManager R;

    public g73(Context context, o22 o22Var) {
        this.P = context;
        this.Q = o22Var;
        this.R = (PowerManager) context.getSystemService("power");
    }

    @Override // defpackage.xj2
    /* renamed from: a */
    public final JSONObject f(i73 i73Var) {
        boolean isScreenOn;
        boolean z;
        JSONObject jSONObject;
        Integer valueOf;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        r22 r22Var = i73Var.e;
        if (r22Var == null) {
            jSONObject = new JSONObject();
        } else if (this.Q.b != null) {
            boolean z2 = r22Var.a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.Q.d).put("activeViewJSON", this.Q.b).put("timestamp", i73Var.c).put("adFormat", this.Q.a).put("hashCode", this.Q.c).put("isMraid", false).put("isStopped", false).put("isPaused", i73Var.b).put("isNative", this.Q.e);
            if (Build.VERSION.SDK_INT >= 20) {
                isScreenOn = this.R.isInteractive();
            } else {
                isScreenOn = this.R.isScreenOn();
            }
            JSONObject put2 = put.put("isScreenOn", isScreenOn);
            jv5 jv5Var = jv5.A;
            xk1 xk1Var = jv5Var.h;
            synchronized (xk1Var) {
                z = xk1Var.a;
            }
            JSONObject put3 = put2.put("appMuted", z).put("appVolume", jv5Var.h.a());
            AudioManager audioManager = (AudioManager) this.P.getApplicationContext().getSystemService("audio");
            float f = 0.0f;
            if (audioManager != null) {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = audioManager.getStreamVolume(3);
                if (streamMaxVolume != 0) {
                    f = streamVolume / streamMaxVolume;
                }
            }
            put3.put("deviceVolume", f);
            l92 l92Var = x92.H4;
            w82 w82Var = w82.d;
            if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                AudioManager audioManager2 = (AudioManager) this.P.getApplicationContext().getSystemService("audio");
                if (audioManager2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(audioManager2.getMode());
                }
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.P.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", r22Var.b).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", r22Var.c.top).put("bottom", r22Var.c.bottom).put("left", r22Var.c.left).put("right", r22Var.c.right)).put("adBox", new JSONObject().put("top", r22Var.d.top).put("bottom", r22Var.d.bottom).put("left", r22Var.d.left).put("right", r22Var.d.right)).put("globalVisibleBox", new JSONObject().put("top", r22Var.e.top).put("bottom", r22Var.e.bottom).put("left", r22Var.e.left).put("right", r22Var.e.right)).put("globalVisibleBoxVisible", r22Var.f).put("localVisibleBox", new JSONObject().put("top", r22Var.g.top).put("bottom", r22Var.g.bottom).put("left", r22Var.g.left).put("right", r22Var.g.right)).put("localVisibleBoxVisible", r22Var.h).put("hitBox", new JSONObject().put("top", r22Var.i.top).put("bottom", r22Var.i.bottom).put("left", r22Var.i.left).put("right", r22Var.i.right)).put("screenDensity", this.P.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", i73Var.a);
            if (((Boolean) w82Var.c.a(x92.a1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = r22Var.k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(i73Var.d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}