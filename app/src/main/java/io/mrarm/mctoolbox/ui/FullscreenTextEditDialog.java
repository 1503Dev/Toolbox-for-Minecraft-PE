package io.mrarm.mctoolbox.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import io.mrarm.mctoolbox.ui.FullscreenTextEditDialog;

public final class FullscreenTextEditDialog extends m5 {
    public a R;
    public SpecialEditText S;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class SpecialEditText extends o5 {
        public Runnable S;

        public SpecialEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.S.run();
            }
            return super.onKeyPreIme(i, keyEvent);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        boolean a();
    }

    public FullscreenTextEditDialog(Context context) {
        super(context, 2131820554);
        a().q(1);
        setContentView(2131492918);
        SpecialEditText specialEditText = (SpecialEditText) findViewById(2131296397);
        this.S = specialEditText;
        specialEditText.S = new Runnable() { // from class: ls
            @Override // java.lang.Runnable
            public final void run() {
                FullscreenTextEditDialog.this.dismiss();
            }
        };
        findViewById(2131296395).setOnClickListener(new ms(this, 0));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Window window = getWindow();
        if (window != null) {
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getRootView().getWindowToken(), 2);
        }
        super.dismiss();
    }

    @Override // defpackage.m5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final Window window = getWindow();
        window.setSoftInputMode(5);
        window.setLayout(-1, -1);
        window.setFlags(1024, 1024);
        if (Build.VERSION.SDK_INT >= 24) {
            window.setSoftInputMode(21);
        } else {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ns
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    FullscreenTextEditDialog fullscreenTextEditDialog = FullscreenTextEditDialog.this;
                    Window window2 = window;
                    fullscreenTextEditDialog.getClass();
                    Rect rect = new Rect();
                    window2.getDecorView().getWindowVisibleDisplayFrame(rect);
                    ((ViewGroup.MarginLayoutParams) fullscreenTextEditDialog.findViewById(gi0.root).getLayoutParams()).bottomMargin = window2.getDecorView().getRootView().getHeight() - rect.height();
                    fullscreenTextEditDialog.findViewById(gi0.root).requestLayout();
                }
            });
        }
        this.S.requestFocus();
    }
}