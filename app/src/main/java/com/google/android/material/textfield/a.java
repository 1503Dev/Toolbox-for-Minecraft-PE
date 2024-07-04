package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class a extends vo {
    public final C0029a d;
    public final b e;
    public AnimatorSet f;
    public ValueAnimator g;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class C0029a implements TextWatcher {
        public C0029a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z;
            if (editable.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!a.this.a.g()) {
                    a.this.g.cancel();
                    a.this.f.start();
                    return;
                }
                return;
            }
            a.this.f.cancel();
            a.this.g.start();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            boolean z;
            EditText editText = textInputLayout.getEditText();
            if (editText.getText().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            textInputLayout.setEndIconVisible(z);
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(a.this.d);
            editText.addTextChangedListener(a.this.d);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.a.getEditText().setText((CharSequence) null);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new C0029a();
        this.e = new b();
    }

    @Override // defpackage.vo
    public final void a() {
        this.a.setEndIconDrawable(z5.b(this.b, wh0.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(ui0.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new c());
        TextInputLayout textInputLayout2 = this.a;
        b bVar = this.e;
        textInputLayout2.E0.add(bVar);
        if (textInputLayout2.R != null) {
            bVar.a(textInputLayout2);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(i4.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new id(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = i4.a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new hd(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f.addListener(new fd(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new hd(this));
        this.g = ofFloat3;
        ofFloat3.addListener(new gd(this));
    }
}