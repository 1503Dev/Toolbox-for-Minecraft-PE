package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import io.mrarm.mctoolbox.bridge.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: nz0  reason: default package */
public final /* synthetic */ class nz0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ nz0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                final qz0 qz0Var = (qz0) this.Q;
                synchronized (qz0Var) {
                    qz0Var.e = true;
                }
                final File file = new File(qz0Var.a.getFilesDir(), "toolbox.json");
                AsyncTask.SERIAL_EXECUTOR.execute(new Runnable() { // from class: pz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        qz0 qz0Var2 = qz0.this;
                        File file2 = file;
                        byte[] bytes = ((b) qz0Var2.b).q().getBytes();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            fileOutputStream.write(bytes, 0, bytes.length);
                            fileOutputStream.close();
                        } catch (IOException e) {
                            Log.e("ToolboxUIStorage", "Failed to save config");
                            e.printStackTrace();
                        }
                    }
                });
                return;
            default:
                int i = bf0.U;
                Toast.makeText((Context) this.Q, 2131755120, 0).show();
                return;
        }
    }
}