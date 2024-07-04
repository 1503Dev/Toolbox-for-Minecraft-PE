package defpackage;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j52  reason: default package */
public final class j52 {
    public final m52 a;
    public final t62 b;
    public final boolean c;

    public j52() {
        this.b = u62.y();
        this.c = false;
        this.a = new m52();
    }

    public j52(m52 m52Var) {
        this.b = u62.y();
        this.a = m52Var;
        this.c = ((Boolean) w82.d.c.a(x92.c4)).booleanValue();
    }

    public final synchronized void a(i52 i52Var) {
        if (this.c) {
            try {
                i52Var.j(this.b);
            } catch (NullPointerException e) {
                jv5.A.g.f("AdMobClearcutLogger.modify", e);
            }
        }
    }

    public final synchronized void b(int i) {
        if (!this.c) {
            return;
        }
        if (((Boolean) w82.d.c.a(x92.d4)).booleanValue()) {
            d(i);
        } else {
            e(i);
        }
    }

    public final synchronized String c(int i) {
        jv5.A.j.getClass();
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", ((u62) this.b.Q).A(), Long.valueOf(SystemClock.elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((u62) this.b.h()).D(), 3));
    }

    public final synchronized void d(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(c(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        vz3.k("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    vz3.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        vz3.k("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    vz3.k("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            vz3.k("Could not find file for Clearcut");
        }
    }

    public final synchronized void e(int i) {
        t62 t62Var = this.b;
        t62Var.j();
        u62.E((u62) t62Var.Q);
        p92 p92Var = x92.a;
        ArrayList b = w82.d.a.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (true) {
            if (it.hasNext()) {
                for (String str : ((String) it.next()).split(",")) {
                    try {
                        arrayList.add(Long.valueOf(str));
                    } catch (NumberFormatException unused) {
                        vz3.k("Experiment ID is not a number");
                    }
                }
            } else {
                t62Var.j();
                u62.C((u62) t62Var.Q, arrayList);
                m52 m52Var = this.a;
                l52 l52Var = new l52(m52Var, ((u62) this.b.h()).D());
                int i2 = i - 1;
                l52Var.b = i2;
                synchronized (l52Var) {
                    m52Var.c.execute(new k52(0, l52Var));
                }
                vz3.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
            }
        }
    }
}