package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.dz;
import defpackage.zv;
import io.mrarm.mctoolbox.ui.view.PixelArtView;

/* renamed from: jl  reason: default package */
public abstract class jl extends ViewDataBinding {
    public final ImageButton e0;
    public final PixelArtView f0;
    public final PixelArtView g0;
    public final PixelArtView h0;
    public final PixelArtView i0;
    public final EditText j0;
    public final EditText k0;
    public final ImageButton l0;
    public final ImageView m0;
    public final TextView n0;
    public final FrameLayout o0;
    public View.OnClickListener p0;
    public za0<String> q0;
    public dz.a r0;
    public bb0 s0;
    public zv.b t0;
    public String u0;
    public Bitmap v0;
    public Runnable w0;
    public Runnable x0;
    public Runnable y0;

    public jl(Object obj, View view, ImageButton imageButton, PixelArtView pixelArtView, PixelArtView pixelArtView2, PixelArtView pixelArtView3, PixelArtView pixelArtView4, EditText editText, EditText editText2, ImageButton imageButton2, ImageView imageView, TextView textView, FrameLayout frameLayout) {
        super(2, view, obj);
        this.e0 = imageButton;
        this.f0 = pixelArtView;
        this.g0 = pixelArtView2;
        this.h0 = pixelArtView3;
        this.i0 = pixelArtView4;
        this.j0 = editText;
        this.k0 = editText2;
        this.l0 = imageButton2;
        this.m0 = imageView;
        this.n0 = textView;
        this.o0 = frameLayout;
    }

    public abstract void R(zv.b bVar);

    public abstract void S(Runnable runnable);

    public abstract void T(Bitmap bitmap);

    public abstract void U(Runnable runnable);

    public abstract void V(String str);

    public abstract void W(Runnable runnable);

    public abstract void X(View.OnClickListener onClickListener);

    public abstract void Y(dz.a aVar);

    public abstract void Z(bb0 bb0Var);

    public abstract void a0(za0<String> za0Var);
}