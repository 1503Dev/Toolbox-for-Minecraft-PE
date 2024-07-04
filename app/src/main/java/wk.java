package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import io.mrarm.mctoolbox.ui.view.ColorAlphaPicker;
import io.mrarm.mctoolbox.ui.view.ColorHuePicker;
import io.mrarm.mctoolbox.ui.view.ColorPicker;

/* renamed from: wk  reason: default package */
public abstract class wk extends ViewDataBinding {
    public static final /* synthetic */ int q0 = 0;
    public final ColorAlphaPicker e0;
    public final ImageButton f0;
    public final LinearLayout g0;
    public final ColorHuePicker h0;
    public final ColorPicker i0;
    public final TextInputEditText j0;
    public final TextInputEditText k0;
    public final TextInputEditText l0;
    public final TextInputEditText m0;
    public final TextInputEditText n0;
    public View.OnClickListener o0;
    public View.OnClickListener p0;

    public wk(Object obj, View view, ColorAlphaPicker colorAlphaPicker, ImageButton imageButton, LinearLayout linearLayout, ColorHuePicker colorHuePicker, ColorPicker colorPicker, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5) {
        super(0, view, obj);
        this.e0 = colorAlphaPicker;
        this.f0 = imageButton;
        this.g0 = linearLayout;
        this.h0 = colorHuePicker;
        this.i0 = colorPicker;
        this.j0 = textInputEditText;
        this.k0 = textInputEditText2;
        this.l0 = textInputEditText3;
        this.m0 = textInputEditText4;
        this.n0 = textInputEditText5;
    }

    public abstract void R(View.OnClickListener onClickListener);

    public abstract void S(View.OnClickListener onClickListener);
}