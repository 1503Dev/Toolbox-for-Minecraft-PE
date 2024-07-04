package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: f50  reason: default package */
public final class f50 extends FrameLayout {
    public d50 P;
    public boolean Q;
    public ImageView.ScaleType R;
    public boolean S;
    public s82 T;
    public d60 U;

    public f50(Context context) {
        super(context);
    }

    public d50 getMediaContent() {
        return this.P;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        ed2 ed2Var;
        this.S = true;
        this.R = scaleType;
        d60 d60Var = this.U;
        if (d60Var != null && (ed2Var = ((f70) d60Var.Q).Q) != null && scaleType != null) {
            try {
                ed2Var.N3(new va0(scaleType));
            } catch (RemoteException e) {
                sv2.e("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    public void setMediaContent(d50 d50Var) {
        this.Q = true;
        this.P = d50Var;
        s82 s82Var = this.T;
        if (s82Var != null) {
            ((f70) s82Var.Q).b(d50Var);
        }
    }
}