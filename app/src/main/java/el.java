package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.uo;

/* renamed from: el  reason: default package */
public abstract class el extends ViewDataBinding {
    public final ImageView e0;
    public final TextInputEditText f0;
    public uo.a g0;

    public el(Object obj, View view, ImageView imageView, TextInputEditText textInputEditText) {
        super(1, view, obj);
        this.e0 = imageView;
        this.f0 = textInputEditText;
    }
}