package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;

/* renamed from: w20  reason: default package */
public final class w20 {
    public final Context a;
    public final File b = new File(Environment.getExternalStorageDirectory(), "ToolboxLog.txt");
    public Process c;
    public boolean d;

    public w20(Context context) {
        this.a = context;
    }

    public final void a(boolean z) {
        if (z) {
            b();
        } else if (this.d) {
            this.d = false;
            if (Build.VERSION.SDK_INT >= 26) {
                this.c.destroyForcibly();
            } else {
                this.c.destroy();
            }
            try {
                this.c.waitFor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void b() {
        if (this.d) {
            return;
        }
        try {
            Runtime runtime = Runtime.getRuntime();
            this.c = runtime.exec(new String[]{"sh", "-c", "logcat -b all >> " + this.b.getAbsolutePath()});
            new Thread(new ja0(1, this)).start();
            Context context = this.a;
            Toast.makeText(context, "Logcat is being saved to: " + this.b.getAbsolutePath(), 0).show();
        } catch (IOException unused) {
            Toast.makeText(this.a, "Failed to start logcat recorder", 0).show();
        }
        this.d = true;
    }
}