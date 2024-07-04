package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class c extends vo {
    public final a d;
    public final b e;
    public final C0032c f;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c cVar = c.this;
            cVar.c.setChecked(!c.c(cVar));
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
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            c cVar = c.this;
            cVar.c.setChecked(!c.c(cVar));
            editText.removeTextChangedListener(c.this.d);
            editText.addTextChangedListener(c.this.d);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class C0032c implements TextInputLayout.g {
        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            EditText editText = c.this.a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(c.c(c.this) ? null : PasswordTransformationMethod.getInstance());
            editText.setSelection(selectionEnd);
        }
    }

    public c(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a();
        this.e = new b();
        this.f = new C0032c();
    }

    public static boolean c(c cVar) {
        EditText editText = cVar.a.getEditText();
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vo
    public final void a() {
        this.a.setEndIconDrawable(z5.b(this.b, wh0.design_password_eye));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(ui0.password_toggle_content_description));
        this.a.setEndIconOnClickListener(new d());
        TextInputLayout textInputLayout2 = this.a;
        b bVar = this.e;
        textInputLayout2.E0.add(bVar);
        if (textInputLayout2.R != null) {
            bVar.a(textInputLayout2);
        }
        TextInputLayout textInputLayout3 = this.a;
        textInputLayout3.I0.add(this.f);
    }
}