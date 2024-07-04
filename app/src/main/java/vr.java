package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition$EpicenterCallback;

/* renamed from: vr  reason: default package */
public final class vr extends Transition$EpicenterCallback {
    public final /* synthetic */ Rect a;

    public vr(Rect rect) {
        this.a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}