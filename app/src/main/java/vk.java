package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import io.mrarm.mctoolbox.DiagnosticActivity;
import io.mrarm.mctoolbox.MinecraftActivity;
import io.mrarm.mctoolbox.OssActivity;

/* renamed from: vk  reason: default package */
public final /* synthetic */ class vk implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ vk(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.P) {
            case 0:
                DiagnosticActivity diagnosticActivity = (DiagnosticActivity) this.Q;
                int i = DiagnosticActivity.d0;
                diagnosticActivity.getClass();
                diagnosticActivity.startActivity(new Intent(diagnosticActivity, MinecraftActivity.class));
                return;
            case 1:
                int i2 = yw.U;
                ((yw) this.Q).cancel();
                return;
            default:
                Context context = (Context) this.Q;
                int i3 = hr0.U;
                context.startActivity(new Intent(context, OssActivity.class));
                return;
        }
    }
}