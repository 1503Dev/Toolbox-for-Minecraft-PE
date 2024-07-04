package defpackage;

import android.util.Log;
import defpackage.el0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: fl0  reason: default package */
public final class fl0 implements tb {
    public final /* synthetic */ el0.b a;

    public fl0(el0.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.tb
    public final void onFailure(ob obVar, IOException iOException) {
        StringBuilder b = e5.b("Failed to download file: ");
        b.append(this.a.a);
        Log.e("ResourceLoader", b.toString());
        iOException.printStackTrace();
        el0.b bVar = this.a;
        bVar.getClass();
        h21.a(new s20(1, bVar));
    }

    @Override // defpackage.tb
    public final void onResponse(ob obVar, nl0 nl0Var) {
        File file = this.a.c;
        Logger logger = rb0.a;
        if (file != null) {
            vj0 vj0Var = new vj0(new ob0(new FileOutputStream(file), new cx0()));
            vj0Var.o(nl0Var.V.y());
            vj0Var.close();
            el0.b bVar = this.a;
            bVar.getClass();
            h21.a(new g80(1, bVar));
            return;
        }
        throw new IllegalArgumentException("file == null");
    }
}