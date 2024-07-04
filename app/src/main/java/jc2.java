package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: jc2  reason: default package */
public final class jc2 extends RelativeLayout {
    public static final float[] Q = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    public AnimationDrawable P;

    public jc2(Context context, ic2 ic2Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        uf0.f(ic2Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(Q, null, null));
        shapeDrawable.getPaint().setColor(ic2Var.S);
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(ic2Var.P)) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(ic2Var.P);
            textView.setTextColor(ic2Var.T);
            textView.setTextSize(ic2Var.U);
            mv2 mv2Var = n62.f.a;
            textView.setPadding(mv2.k(context, 4), 0, mv2.k(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        ArrayList arrayList = ic2Var.Q;
        if (arrayList != null && arrayList.size() > 1) {
            this.P = new AnimationDrawable();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    this.P.addFrame((Drawable) va0.c0(((lc2) it.next()).e()), ic2Var.V);
                } catch (Exception e) {
                    sv2.e("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.P);
        } else if (arrayList.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) va0.c0(((lc2) arrayList.get(0)).e()));
            } catch (Exception e2) {
                sv2.e("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.P;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}