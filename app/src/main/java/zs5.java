package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: zs5  reason: default package */
public final class zs5 extends FrameLayout implements View.OnClickListener {
    public final ImageButton P;
    public final bn1 Q;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zs5(Activity activity, as5 as5Var, bn1 bn1Var) {
        super(activity);
        boolean z;
        Resources a;
        Drawable drawable;
        int i;
        this.Q = bn1Var;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(activity);
        this.P = imageButton;
        String str = (String) w82.d.c.a(x92.N0);
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        if (z && !TextUtils.isEmpty(str) && !"default".equals(str) && (a = jv5.A.g.a()) != null) {
            try {
            } catch (Resources.NotFoundException unused) {
                sv2.b("Close button resource not found, falling back to default.");
            }
            if ("white".equals(str)) {
                i = uh0.admob_close_button_white_circle_black_cross;
            } else {
                i = "black".equals(str) ? uh0.admob_close_button_black_circle_white_cross : i;
                drawable = null;
                ImageButton imageButton2 = this.P;
                if (drawable != null) {
                    imageButton2.setImageResource(17301527);
                } else {
                    imageButton2.setImageDrawable(drawable);
                    this.P.setScaleType(ImageView.ScaleType.CENTER);
                }
            }
            drawable = a.getDrawable(i);
            ImageButton imageButton22 = this.P;
            if (drawable != null) {
            }
        } else {
            imageButton.setImageResource(17301527);
        }
        this.P.setBackgroundColor(0);
        this.P.setOnClickListener(this);
        ImageButton imageButton3 = this.P;
        mv2 mv2Var = n62.f.a;
        imageButton3.setPadding(mv2.k(activity, as5Var.a), mv2.k(activity, 0), mv2.k(activity, as5Var.b), mv2.k(activity, as5Var.c));
        this.P.setContentDescription("Interstitial close button");
        addView(this.P, new FrameLayout.LayoutParams(mv2.k(activity, as5Var.d + as5Var.a + as5Var.b), mv2.k(activity, as5Var.d + as5Var.c), 17));
        n92 n92Var = x92.O0;
        w82 w82Var = w82.d;
        long longValue = ((Long) w82Var.c.a(n92Var)).longValue();
        if (longValue <= 0) {
            return;
        }
        ar5 ar5Var = ((Boolean) w82Var.c.a(x92.P0)).booleanValue() ? new ar5(this) : null;
        this.P.setAlpha(0.0f);
        this.P.animate().alpha(1.0f).setDuration(longValue).setListener(ar5Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bn1 bn1Var = this.Q;
        if (bn1Var != null) {
            qn5 qn5Var = (qn5) bn1Var;
            qn5Var.j0 = 2;
            qn5Var.Q.finish();
        }
    }
}