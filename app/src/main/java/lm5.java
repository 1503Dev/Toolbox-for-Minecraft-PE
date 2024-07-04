package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: lm5  reason: default package */
public final class lm5 extends r82 {
    public final /* synthetic */ qn5 b;

    public /* synthetic */ lm5(qn5 qn5Var) {
        this.b = qn5Var;
    }

    @Override // defpackage.r82
    public final void a() {
        BitmapDrawable bitmapDrawable;
        js2 js2Var = jv5.A.u;
        Bitmap bitmap = (Bitmap) js2Var.a.get(Integer.valueOf(this.b.R.d0.U));
        if (bitmap != null) {
            qn5 qn5Var = this.b;
            Activity activity = qn5Var.Q;
            tl5 tl5Var = qn5Var.R.d0;
            boolean z = tl5Var.S;
            float f = tl5Var.T;
            if (z && f > 0.0f && f <= 25.0f) {
                try {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                    RenderScript create = RenderScript.create(activity);
                    ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                    Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                    Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                    create2.setRadius(f);
                    create2.setInput(createFromBitmap);
                    create2.forEach(createFromBitmap2);
                    createFromBitmap2.copyTo(createBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                }
            } else {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
            }
            cu5.i.post(new yk5(0, this, bitmapDrawable));
        }
    }
}