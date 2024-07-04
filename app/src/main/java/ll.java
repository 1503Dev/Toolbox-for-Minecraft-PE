package defpackage;

import android.view.View;
import android.widget.ImageButton;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textfield.TextInputEditText;

/* renamed from: ll  reason: default package */
public abstract class ll extends ViewDataBinding {
    public final ImageButton e0;
    public final TextInputEditText f0;
    public final FlexboxLayout g0;
    public boolean h0;
    public View.OnClickListener i0;
    public View.OnClickListener j0;

    public ll(Object obj, View view, ImageButton imageButton, TextInputEditText textInputEditText, FlexboxLayout flexboxLayout) {
        super(0, view, obj);
        this.e0 = imageButton;
        this.f0 = textInputEditText;
        this.g0 = flexboxLayout;
    }

    public abstract void R(View.OnClickListener onClickListener);

    public abstract void S(boolean z);

    public abstract void T(View.OnClickListener onClickListener);
}