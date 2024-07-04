package defpackage;

import android.os.AsyncTask;

/* renamed from: ua1  reason: default package */
public abstract class ua1 extends AsyncTask<Object, Void, String> {
    public a a;
    public final b b;

    /* renamed from: ua1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    /* renamed from: ua1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
    }

    public ua1(b bVar) {
        this.b = bVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            nb1 nb1Var = (nb1) aVar;
            nb1Var.c = null;
            nb1Var.a();
        }
    }
}