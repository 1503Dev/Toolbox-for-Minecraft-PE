package defpackage;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: vo  reason: default package */
public abstract class vo {
    public TextInputLayout a;
    public Context b;
    public CheckableImageButton c;

    public vo(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        this.b = textInputLayout.getContext();
        this.c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }
}