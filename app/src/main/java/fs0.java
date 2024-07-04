package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* renamed from: fs0  reason: default package */
public abstract class fs0 extends ViewDataBinding {
    public static final /* synthetic */ int k0 = 0;
    public final ImageView e0;
    public final TextView f0;
    public final ImageView g0;
    public final TextView h0;
    public String i0;
    public String j0;

    public fs0(Object obj, View view, ImageView imageView, TextView textView, ImageView imageView2, TextView textView2) {
        super(0, view, obj);
        this.e0 = imageView;
        this.f0 = textView;
        this.g0 = imageView2;
        this.h0 = textView2;
    }

    public abstract void R(String str);

    public abstract void S(String str);
}