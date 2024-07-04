package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public class AutoClearErrorTextInputLayout extends TextInputLayout {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            AutoClearErrorTextInputLayout.this.setError(null);
            AutoClearErrorTextInputLayout.this.setErrorEnabled(false);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public AutoClearErrorTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view instanceof EditText) {
            ((EditText) view).addTextChangedListener(new a());
        }
    }
}