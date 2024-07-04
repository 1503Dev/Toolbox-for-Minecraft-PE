package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

public final class b implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ TabLayout.h b;

    public b(TabLayout.h hVar, View view) {
        this.b = hVar;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a.getVisibility() == 0) {
            this.b.e(this.a);
        }
    }
}