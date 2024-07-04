package defpackage;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* renamed from: s3  reason: default package */
public final class s3 implements AbsListView.OnScrollListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public s3(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.b(absListView, this.a, this.b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}