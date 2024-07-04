package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* renamed from: o5  reason: default package */
public class o5 extends EditText implements ix0 {
    public final w4 P;
    public final l6 Q;
    public final e6 R;

    public o5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ih0.editTextStyle);
    }

    public o5(Context context, AttributeSet attributeSet, int i) {
        super(ex0.a(context), attributeSet, i);
        w4 w4Var = new w4(this);
        this.P = w4Var;
        w4Var.d(attributeSet, i);
        l6 l6Var = new l6(this);
        this.Q = l6Var;
        l6Var.d(attributeSet, i);
        l6Var.b();
        this.R = new e6(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.a();
        }
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    @Override // defpackage.ix0
    public ColorStateList getSupportBackgroundTintList() {
        w4 w4Var = this.P;
        if (w4Var != null) {
            return w4Var.b();
        }
        return null;
    }

    @Override // defpackage.ix0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w4 w4Var = this.P;
        if (w4Var != null) {
            return w4Var.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        e6 e6Var;
        if (Build.VERSION.SDK_INT < 28 && (e6Var = this.R) != null) {
            TextClassifier textClassifier = e6Var.b;
            if (textClassifier == null) {
                TextClassificationManager textClassificationManager = (TextClassificationManager) e6Var.a.getContext().getSystemService(TextClassificationManager.class);
                if (textClassificationManager != null) {
                    return textClassificationManager.getTextClassifier();
                }
                textClassifier = TextClassifier.NO_OP;
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p5.m(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xw0.f(callback, this));
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.h(colorStateList);
        }
    }

    @Override // defpackage.ix0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w4 w4Var = this.P;
        if (w4Var != null) {
            w4Var.i(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        l6 l6Var = this.Q;
        if (l6Var != null) {
            l6Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        e6 e6Var;
        if (Build.VERSION.SDK_INT < 28 && (e6Var = this.R) != null) {
            e6Var.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}