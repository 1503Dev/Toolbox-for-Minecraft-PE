package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: rc  reason: default package */
public final class rc extends h0 {
    public final /* synthetic */ CheckableImageButton d;

    public rc(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    @Override // defpackage.h0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.isChecked());
    }

    @Override // defpackage.h0
    public final void d(View view, s0 s0Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, s0Var.a);
        s0Var.a.setCheckable(this.d.S);
        s0Var.a.setChecked(this.d.isChecked());
    }
}