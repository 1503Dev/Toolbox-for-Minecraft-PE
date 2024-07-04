package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;

public class BottomSheetBehaviorMod<T extends View> extends BottomSheetBehavior<T> {
    public a L;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public BottomSheetBehaviorMod() {
    }

    public BottomSheetBehaviorMod(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final boolean F(View view, float f) {
        int i;
        if (!super.F(view, f)) {
            return false;
        }
        a aVar = this.L;
        if (aVar == null) {
            return true;
        }
        q4 q4Var = (q4) aVar;
        AppBottomSheetDialog appBottomSheetDialog = q4Var.a;
        ViewGroup viewGroup = q4Var.b;
        float f2 = q4Var.c;
        if (!appBottomSheetDialog.T && view.getTop() <= viewGroup.getHeight() * 0.8f) {
            int top = view.getTop();
            int height = viewGroup.getHeight();
            BottomSheetBehavior bottomSheetBehavior = appBottomSheetDialog.S;
            if (bottomSheetBehavior.e) {
                i = -1;
            } else {
                i = bottomSheetBehavior.d;
            }
            if ((top <= (height - i) / 2 && f <= f2 / 2.0f) || appBottomSheetDialog.getCurrentFocus() == null) {
                return false;
            }
            ((InputMethodManager) appBottomSheetDialog.getContext().getSystemService("input_method")).hideSoftInputFromWindow(appBottomSheetDialog.getCurrentFocus().getWindowToken(), 0);
            return false;
        }
        return true;
    }
}