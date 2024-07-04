package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import io.mrarm.mctoolbox.ui.view.AutoClearErrorTextInputLayout;

/* renamed from: pl  reason: default package */
public abstract class pl extends ViewDataBinding {
    public final ImageButton e0;
    public final TextInputEditText f0;
    public final AutoClearErrorTextInputLayout g0;
    public final TextInputEditText h0;
    public final AutoClearErrorTextInputLayout i0;
    public final TextView j0;
    public boolean k0;
    public View.OnClickListener l0;
    public View.OnClickListener m0;
    public View.OnClickListener n0;

    public pl(Object obj, View view, ImageButton imageButton, TextInputEditText textInputEditText, AutoClearErrorTextInputLayout autoClearErrorTextInputLayout, TextInputEditText textInputEditText2, AutoClearErrorTextInputLayout autoClearErrorTextInputLayout2, TextView textView) {
        super(0, view, obj);
        this.e0 = imageButton;
        this.f0 = textInputEditText;
        this.g0 = autoClearErrorTextInputLayout;
        this.h0 = textInputEditText2;
        this.i0 = autoClearErrorTextInputLayout2;
        this.j0 = textView;
    }

    public abstract void R(View.OnClickListener onClickListener);

    public abstract void S(View.OnClickListener onClickListener);

    public abstract void T(View.OnClickListener onClickListener);

    public abstract void U(boolean z);
}