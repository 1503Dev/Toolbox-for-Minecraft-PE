package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: v5  reason: default package */
public class v5 {
    public static final int[] c = {16843067, 16843068};
    public final ProgressBar a;
    public Bitmap b;

    public v5(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i) {
        hx0 m = hx0.m(this.a.getContext(), attributeSet, c, i);
        Drawable f = m.f(0);
        if (f != null) {
            ProgressBar progressBar = this.a;
            if (f instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable b = b(animationDrawable.getFrame(i2), true);
                    b.setLevel(10000);
                    animationDrawable2.addFrame(b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                f = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f);
        }
        Drawable f2 = m.f(1);
        if (f2 != null) {
            this.a.setProgressDrawable(b(f2, false));
        }
        m.n();
    }

    public final Drawable b(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof y71) {
            y71 y71Var = (y71) drawable;
            Drawable b = y71Var.b();
            if (b != null) {
                y71Var.a(b(b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = b(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.b == null) {
                this.b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}