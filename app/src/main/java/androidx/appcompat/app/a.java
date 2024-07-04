package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController P;
    public final /* synthetic */ AlertController.b Q;

    public a(AlertController.b bVar, AlertController alertController) {
        this.Q = bVar;
        this.P = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.Q.m.onClick(this.P.b, i);
        if (this.Q.o) {
            return;
        }
        this.P.b.dismiss();
    }
}