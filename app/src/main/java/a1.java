package defpackage;

import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.z0;
import io.mrarm.yurai.msa.AccountList;
import io.mrarm.yurai.xbox.XboxLoginActivity;

/* renamed from: a1  reason: default package */
public final class a1 implements z0.a {
    public z0 a;
    public b b;
    public z0.a c;

    public a1(XboxLoginActivity xboxLoginActivity, AccountList accountList) {
        z0 z0Var = new z0(xboxLoginActivity, accountList);
        this.a = z0Var;
        z0Var.e = this;
        RecyclerView recyclerView = new RecyclerView(xboxLoginActivity);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(this.a);
        TypedArray obtainStyledAttributes = xboxLoginActivity.obtainStyledAttributes(new int[]{hh0.dialogPreferredPadding});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        int applyDimension = dimensionPixelSize - ((int) TypedValue.applyDimension(1, 8.0f, xboxLoginActivity.getResources().getDisplayMetrics()));
        recyclerView.setPadding(0, applyDimension, 0, applyDimension);
        b.a aVar = new b.a(xboxLoginActivity);
        int i = vi0.msa_pick_account;
        AlertController.b bVar = aVar.a;
        bVar.d = bVar.a.getText(i);
        aVar.a.n = recyclerView;
        this.b = aVar.a();
    }

    @Override // defpackage.z0.a
    public final void a(String str, String str2) {
        z0.a aVar = this.c;
        if (aVar != null) {
            aVar.a(str, str2);
        }
        this.b.dismiss();
    }

    @Override // defpackage.z0.a
    public final void b() {
        z0.a aVar = this.c;
        if (aVar != null) {
            aVar.b();
        }
        this.b.dismiss();
    }
}