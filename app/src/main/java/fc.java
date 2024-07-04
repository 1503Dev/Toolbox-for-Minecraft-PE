package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.cardview.widget.CardView;

/* renamed from: fc */
public final /* synthetic */ class fc {
    public static /* bridge */ /* synthetic */ void b(CardView cardView) {
        cardView.setClipToOutline(true);
    }

    public static /* bridge */ /* synthetic */ boolean d(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }
}