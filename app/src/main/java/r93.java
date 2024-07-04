package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* renamed from: r93  reason: default package */
public final class r93 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final Context P;
    public View Q;

    public r93(Context context) {
        super(context);
        this.P = context;
    }

    public static r93 a(Context context, View view, yh4 yh4Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        r93 r93Var = new r93(context);
        if (!yh4Var.u.isEmpty() && (resources = r93Var.P.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zh4 zh4Var = (zh4) yh4Var.u.get(0);
            float f = displayMetrics.density;
            r93Var.setLayoutParams(new FrameLayout.LayoutParams((int) (zh4Var.a * f), (int) (zh4Var.b * f)));
        }
        r93Var.Q = view;
        r93Var.addView(view);
        gx2 gx2Var = jv5.A.z;
        ix2 ix2Var = new ix2(r93Var, r93Var);
        ViewTreeObserver f2 = ix2Var.f();
        if (f2 != null) {
            ix2Var.n(f2);
        }
        hx2 hx2Var = new hx2(r93Var, r93Var);
        ViewTreeObserver f3 = hx2Var.f();
        if (f3 != null) {
            hx2Var.n(f3);
        }
        JSONObject jSONObject = yh4Var.h0;
        RelativeLayout relativeLayout = new RelativeLayout(r93Var.P);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            r93Var.b(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            r93Var.b(optJSONObject2, relativeLayout, 12);
        }
        r93Var.addView(relativeLayout);
        return r93Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.P);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double optDouble = jSONObject.optDouble("padding", 0.0d);
        n62 n62Var = n62.f;
        mv2 mv2Var = n62Var.a;
        int k = mv2.k(this.P, (int) optDouble);
        textView.setPadding(0, k, 0, k);
        double optDouble2 = jSONObject.optDouble("height", 15.0d);
        mv2 mv2Var2 = n62Var.a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, mv2.k(this.P, (int) optDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.Q.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.Q.setY(-iArr[1]);
    }
}