package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.databinding.ViewDataBinding;
import com.warkiz.widget.IndicatorSeekBar;
import defpackage.ie;
import defpackage.me;
import io.mrarm.mctoolbox.ui.view.AutoClearErrorTextInputLayout;

/* renamed from: yk  reason: default package */
public abstract class yk extends ViewDataBinding {
    public final ImageButton e0;
    public final AutoClearErrorTextInputLayout f0;
    public final IndicatorSeekBar g0;
    public final EditText h0;
    public final EditText i0;
    public final EditText j0;
    public me.b k0;
    public int l0;
    public String m0;
    public String n0;
    public View.OnClickListener o0;
    public View.OnClickListener p0;
    public View.OnClickListener q0;
    public ie.b r0;

    public yk(Object obj, View view, ImageButton imageButton, AutoClearErrorTextInputLayout autoClearErrorTextInputLayout, IndicatorSeekBar indicatorSeekBar, EditText editText, EditText editText2, EditText editText3) {
        super(0, view, obj);
        this.e0 = imageButton;
        this.f0 = autoClearErrorTextInputLayout;
        this.g0 = indicatorSeekBar;
        this.h0 = editText;
        this.i0 = editText2;
        this.j0 = editText3;
    }

    public abstract void R(View.OnClickListener onClickListener);

    public abstract void S(String str);

    public abstract void T(View.OnClickListener onClickListener);

    public abstract void U(View.OnClickListener onClickListener);

    public abstract void V(int i);

    public abstract void W(boolean z);

    public abstract void X(me.b bVar);

    public abstract void Y(String str);

    public abstract void Z(ie.b bVar);
}