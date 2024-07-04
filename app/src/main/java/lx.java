package defpackage;

import android.util.Log;
import defpackage.zv;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: lx  reason: default package */
public final /* synthetic */ class lx implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ lx(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ox oxVar = (ox) this.Q;
                zv.b[] bVarArr = (zv.b[]) this.R;
                ny nyVar = oxVar.P;
                if (nyVar != null) {
                    nyVar.g(bVarArr);
                }
                oxVar.post(new nx(0, oxVar));
                return;
            case 1:
                v20 v20Var = (v20) this.Q;
                Process process = (Process) this.R;
                if (v20Var.h && v20Var.f == process) {
                    v20Var.f = null;
                    v20Var.g = null;
                    v20Var.a();
                    return;
                }
                return;
            default:
                yz0 yz0Var = (yz0) this.Q;
                yz0Var.getClass();
                byte[] bytes = ((String) this.R).getBytes();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(yz0Var.a.getFilesDir(), "toolbox_ui.json"));
                    fileOutputStream.write(bytes, 0, bytes.length);
                    fileOutputStream.close();
                    return;
                } catch (IOException e) {
                    Log.e("ToolboxUIStorage", "Failed to save UI config");
                    e.printStackTrace();
                    return;
                }
        }
    }
}