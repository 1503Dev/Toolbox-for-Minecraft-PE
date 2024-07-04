package defpackage;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;

/* renamed from: tc  reason: default package */
public final class tc extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public tc(Chip chip) {
        this.a = chip;
    }

    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        a aVar = this.a.S;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}