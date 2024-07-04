package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.zs0;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;
import io.mrarm.mctoolbox.ui.view.ColorAlphaPicker;
import io.mrarm.mctoolbox.ui.view.ColorHuePicker;
import io.mrarm.mctoolbox.ui.view.ColorPicker;
import io.mrarm.mctoolbox.ui.view.a;

/* renamed from: zd  reason: default package */
public final class zd extends AppBottomSheetDialog {
    public a U;
    public wk V;
    public boolean W;

    /* renamed from: zd$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public zd(Context context, int i) {
        super(context);
        this.W = false;
        setContentView(2131492916);
        View findViewById = findViewById(2131296365);
        int i2 = wk.q0;
        DataBinderMapperImpl dataBinderMapperImpl = jj.a;
        wk wkVar = (wk) jj.a.b(ViewDataBinding.H(null), findViewById, 2131492916);
        this.V = wkVar;
        wkVar.R(new View.OnClickListener() { // from class: rd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zd.this.dismiss();
            }
        });
        this.V.S(new sd(0, this));
        wk wkVar2 = this.V;
        final ColorPicker colorPicker = wkVar2.i0;
        ColorHuePicker colorHuePicker = wkVar2.h0;
        colorPicker.f0 = colorHuePicker;
        colorPicker.setHue(colorHuePicker.getValue());
        colorHuePicker.g0.add(new a.InterfaceC0040a() { // from class: qd
            @Override // io.mrarm.mctoolbox.ui.view.a.InterfaceC0040a
            public final void a(float f) {
                ColorPicker.this.setHue(f);
            }
        });
        ColorPicker colorPicker2 = this.V.i0;
        colorPicker2.g0.add(new ColorPicker.a() { // from class: td
            @Override // io.mrarm.mctoolbox.ui.view.ColorPicker.a
            public final void a(int i3) {
                zd zdVar = zd.this;
                if (zdVar.W) {
                    return;
                }
                zdVar.g((i3 & 16777215) | (((int) (zdVar.V.e0.getValue() * 255.0f)) << 24), zdVar.V.i0);
            }
        });
        ColorAlphaPicker colorAlphaPicker = this.V.e0;
        colorAlphaPicker.g0.add(new a.InterfaceC0040a() { // from class: ud
            @Override // io.mrarm.mctoolbox.ui.view.a.InterfaceC0040a
            public final void a(float f) {
                zd zdVar = zd.this;
                if (zdVar.W) {
                    return;
                }
                zdVar.g((((int) (f * 255.0f)) << 24) | (zdVar.V.i0.getColor() & 16777215), zdVar.V.e0);
            }
        });
        this.V.m0.addTextChangedListener(new zs0(new yd0(this)));
        this.V.n0.addTextChangedListener(new zs0(new vd(0, this)));
        this.V.l0.addTextChangedListener(new zs0(new zs0.a() { // from class: wd
            @Override // defpackage.zs0.a
            public final void afterTextChanged(Editable editable) {
                zd zdVar = zd.this;
                zdVar.e(zdVar.V.l0, editable, 8);
            }
        }));
        this.V.k0.addTextChangedListener(new zs0(new xd(this)));
        this.V.j0.addTextChangedListener(new zs0(new yd(this)));
        g(i, null);
    }

    public final void e(TextInputEditText textInputEditText, Editable editable, int i) {
        if (this.W) {
            return;
        }
        try {
            g(((Integer.parseInt(editable.toString()) & 255) << i) | ((this.V.i0.getColor() | (((int) (this.V.e0.getValue() * 255.0f)) << 24)) & ((255 << i) ^ (-1))), textInputEditText);
        } catch (NumberFormatException unused) {
        }
    }

    public final void g(int i, View view) {
        this.W = true;
        String format = String.format("#%08x", Integer.valueOf(i));
        ColorPicker colorPicker = this.V.i0;
        if (view != colorPicker) {
            colorPicker.setColor(i);
        }
        ColorAlphaPicker colorAlphaPicker = this.V.e0;
        if (view != colorAlphaPicker) {
            colorAlphaPicker.setColor((-16777216) | i);
            this.V.e0.setValue(Color.alpha(i) / 255.0f);
        }
        TextInputEditText textInputEditText = this.V.m0;
        if (view != textInputEditText) {
            textInputEditText.setText(format);
        }
        TextInputEditText textInputEditText2 = this.V.n0;
        if (view != textInputEditText2) {
            textInputEditText2.setText(String.valueOf(Color.red(i)));
        }
        TextInputEditText textInputEditText3 = this.V.l0;
        if (view != textInputEditText3) {
            textInputEditText3.setText(String.valueOf(Color.green(i)));
        }
        TextInputEditText textInputEditText4 = this.V.k0;
        if (view != textInputEditText4) {
            textInputEditText4.setText(String.valueOf(Color.blue(i)));
        }
        TextInputEditText textInputEditText5 = this.V.j0;
        if (view != textInputEditText5) {
            textInputEditText5.setText(String.valueOf(Color.alpha(i)));
        }
        this.W = false;
    }
}