package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xn2  reason: default package */
public final class xn2 extends yn2 implements mg2 {
    public final y03 R;
    public final Context S;
    public final WindowManager T;
    public final k92 U;
    public DisplayMetrics V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;
    public int d0;

    public xn2(l13 l13Var, Context context, k92 k92Var) {
        super(l13Var, "");
        this.X = -1;
        this.Y = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.R = l13Var;
        this.S = context;
        this.U = k92Var;
        this.T = (WindowManager) context.getSystemService("window");
    }

    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        int i;
        boolean z;
        JSONObject jSONObject;
        y03 y03Var = (y03) obj;
        this.V = new DisplayMetrics();
        Display defaultDisplay = this.T.getDefaultDisplay();
        defaultDisplay.getMetrics(this.V);
        this.W = this.V.density;
        this.Z = defaultDisplay.getRotation();
        mv2 mv2Var = n62.f.a;
        DisplayMetrics displayMetrics = this.V;
        this.X = Math.round(displayMetrics.widthPixels / displayMetrics.density);
        DisplayMetrics displayMetrics2 = this.V;
        this.Y = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
        Activity g = this.R.g();
        if (g != null && g.getWindow() != null) {
            cu5 cu5Var = jv5.A.c;
            int[] i2 = cu5.i(g);
            this.a0 = Math.round(i2[0] / this.V.density);
            i = Math.round(i2[1] / this.V.density);
        } else {
            this.a0 = this.X;
            i = this.Y;
        }
        this.b0 = i;
        if (this.R.L().b()) {
            this.c0 = this.X;
            this.d0 = this.Y;
        } else {
            this.R.measure(0, 0);
        }
        int i3 = this.X;
        int i4 = this.Y;
        int i5 = this.a0;
        int i6 = this.b0;
        float f = this.W;
        try {
            ((y03) this.P).p("onScreenInfoChanged", new JSONObject().put("width", i3).put("height", i4).put("maxSizeWidth", i5).put("maxSizeHeight", i6).put("density", f).put("rotation", this.Z));
        } catch (JSONException e) {
            sv2.e("Error occurred while obtaining screen information.", e);
        }
        k92 k92Var = this.U;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        boolean a = k92Var.a(intent);
        k92 k92Var2 = this.U;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean a2 = k92Var2.a(intent2);
        k92 k92Var3 = this.U;
        k92Var3.getClass();
        boolean a3 = k92Var3.a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        k92 k92Var4 = this.U;
        if (((Boolean) lx2.a(k92Var4.a, j92.a)).booleanValue() && c81.a(k92Var4.a).a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z = true;
        } else {
            z = false;
        }
        y03 y03Var2 = this.R;
        try {
            jSONObject = new JSONObject().put("sms", a2).put("tel", a).put("calendar", a3).put("storePicture", z).put("inlineVideo", true);
        } catch (JSONException e2) {
            sv2.e("Error occurred while obtaining the MRAID capabilities.", e2);
            jSONObject = null;
        }
        y03Var2.p("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.R.getLocationOnScreen(iArr);
        n62 n62Var = n62.f;
        g(n62Var.a.d(this.S, iArr[0]), n62Var.a.d(this.S, iArr[1]));
        if (sv2.j(2)) {
            sv2.f("Dispatching Ready Event.");
        }
        try {
            ((y03) this.P).p("onReadyEventReceived", new JSONObject().put("js", this.R.k().P));
        } catch (JSONException e3) {
            sv2.e("Error occurred while dispatching ready Event.", e3);
        }
    }

    public final void g(int i, int i2) {
        int i3;
        Context context = this.S;
        int i4 = 0;
        if (context instanceof Activity) {
            cu5 cu5Var = jv5.A.c;
            i3 = cu5.j((Activity) context)[0];
        } else {
            i3 = 0;
        }
        if (this.R.L() == null || !this.R.L().b()) {
            int width = this.R.getWidth();
            int height = this.R.getHeight();
            if (((Boolean) w82.d.c.a(x92.L)).booleanValue()) {
                if (width == 0) {
                    if (this.R.L() != null) {
                        width = this.R.L().c;
                    } else {
                        width = 0;
                    }
                }
                if (height == 0) {
                    if (this.R.L() != null) {
                        i4 = this.R.L().b;
                    }
                    n62 n62Var = n62.f;
                    this.c0 = n62Var.a.d(this.S, width);
                    this.d0 = n62Var.a.d(this.S, i4);
                }
            }
            i4 = height;
            n62 n62Var2 = n62.f;
            this.c0 = n62Var2.a.d(this.S, width);
            this.d0 = n62Var2.a.d(this.S, i4);
        }
        int i5 = i2 - i3;
        int i6 = this.c0;
        try {
            ((y03) this.P).p("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i5).put("width", i6).put("height", this.d0));
        } catch (JSONException e) {
            sv2.e("Error occurred while dispatching default position.", e);
        }
        tn2 tn2Var = this.R.R().i0;
        if (tn2Var != null) {
            tn2Var.T = i;
            tn2Var.U = i2;
        }
    }
}