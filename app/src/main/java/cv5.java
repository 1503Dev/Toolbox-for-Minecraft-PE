package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: cv5  reason: default package */
public final class cv5 extends qn5 {
    public cv5(Activity activity) {
        super(activity);
    }

    @Override // defpackage.qn5, defpackage.po2
    public final void a2(Bundle bundle) {
        vz3.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.j0 = 4;
        this.Q.finish();
    }
}