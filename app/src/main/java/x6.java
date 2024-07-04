package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.warkiz.widget.IndicatorSeekBar;

/* renamed from: x6  reason: default package */
public final class x6 extends View {
    public final /* synthetic */ View P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(Context context, IndicatorSeekBar indicatorSeekBar) {
        super(context);
        this.P = indicatorSeekBar;
    }

    @Override // android.view.View
    public final void getLocationOnScreen(int[] iArr) {
        this.P.getLocationOnScreen(iArr);
    }

    @Override // android.view.View
    public final IBinder getWindowToken() {
        return getApplicationWindowToken();
    }
}