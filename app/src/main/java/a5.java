package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: a5  reason: default package */
public final class a5 extends CheckedTextView {
    public static final int[] Q = {16843016};
    public final l6 P;

    public a5(Context context, AttributeSet attributeSet) {
        super(ex0.a(context), attributeSet, 16843720);
        l6 l6Var = new l6(this);
        this.P = l6Var;
        l6Var.d(attributeSet, 16843720);
        l6Var.b();
        hx0 m = hx0.m(getContext(), attributeSet, Q, 16843720);
        setCheckMarkDrawable(m.e(0));
        m.n();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        l6 l6Var = this.P;
        if (l6Var != null) {
            l6Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        p5.m(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(z5.b(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(xw0.f(callback, this));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        l6 l6Var = this.P;
        if (l6Var != null) {
            l6Var.e(context, i);
        }
    }
}