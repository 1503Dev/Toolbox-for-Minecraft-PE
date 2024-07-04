package defpackage;

import android.view.Choreographer;
import androidx.databinding.ViewDataBinding;

/* renamed from: f41  reason: default package */
public final class f41 implements Choreographer.FrameCallback {
    public final /* synthetic */ ViewDataBinding P;

    public f41(ViewDataBinding viewDataBinding) {
        this.P = viewDataBinding;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.P.Q.run();
    }
}