package defpackage;

import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;

/* renamed from: q3  reason: default package */
public final class q3 implements NestedScrollView.b {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public q3(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // androidx.core.widget.NestedScrollView.b
    public final void a(NestedScrollView nestedScrollView, int i) {
        AlertController.b(nestedScrollView, this.a, this.b);
    }
}