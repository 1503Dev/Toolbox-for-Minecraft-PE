package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.warkiz.widget.IndicatorSeekBar;

/* renamed from: rl  reason: default package */
public abstract class rl extends ViewDataBinding {
    public final ImageButton e0;
    public final IndicatorSeekBar f0;
    public final CheckBox g0;
    public final Button h0;
    public final Button i0;
    public final Button j0;
    public final CheckBox k0;
    public final Button l0;
    public final CheckBox m0;
    public final TextView n0;
    public boolean o0;
    public View.OnClickListener p0;
    public ya0 q0;
    public ya0 r0;
    public ya0 s0;

    public rl(Object obj, View view, ImageButton imageButton, IndicatorSeekBar indicatorSeekBar, CheckBox checkBox, Button button, Button button2, Button button3, CheckBox checkBox2, Button button4, CheckBox checkBox3, TextView textView) {
        super(3, view, obj);
        this.e0 = imageButton;
        this.f0 = indicatorSeekBar;
        this.g0 = checkBox;
        this.h0 = button;
        this.i0 = button2;
        this.j0 = button3;
        this.k0 = checkBox2;
        this.l0 = button4;
        this.m0 = checkBox3;
        this.n0 = textView;
    }

    public abstract void R(boolean z);

    public abstract void S(View.OnClickListener onClickListener);

    public abstract void T(ya0 ya0Var);

    public abstract void U(ya0 ya0Var);

    public abstract void V(ya0 ya0Var);
}