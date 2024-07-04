package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements l {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // androidx.appcompat.view.menu.l
    public final void b(f fVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}