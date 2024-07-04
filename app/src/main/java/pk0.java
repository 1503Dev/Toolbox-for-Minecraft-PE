package defpackage;

import android.content.Context;
import defpackage.bf0;
import defpackage.zv;
import io.mrarm.mctoolbox.RelaunchActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

/* renamed from: pk0  reason: default package */
public final /* synthetic */ class pk0 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;

    public /* synthetic */ pk0(int i, Object obj, Object obj2, Object obj3) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
        this.S = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        String readLine;
        switch (this.P) {
            case 0:
                RelaunchActivity relaunchActivity = (RelaunchActivity) this.Q;
                String str = (String) this.R;
                Runnable runnable2 = (Runnable) this.S;
                boolean z = RelaunchActivity.S;
                relaunchActivity.getClass();
                try {
                    Socket accept = relaunchActivity.P.accept();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                    do {
                        readLine = bufferedReader.readLine();
                        if (readLine != null) {
                        }
                        OutputStream outputStream = accept.getOutputStream();
                        outputStream.write(("HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nConnection: Closed\r\n\r\n" + str).getBytes("UTF-8"));
                        outputStream.close();
                        runnable2.run();
                        return;
                    } while (!readLine.equals(""));
                    OutputStream outputStream2 = accept.getOutputStream();
                    outputStream2.write(("HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nConnection: Closed\r\n\r\n" + str).getBytes("UTF-8"));
                    outputStream2.close();
                    runnable2.run();
                    return;
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
            default:
                final Context context = (Context) this.R;
                final bf0.b bVar = (bf0.b) this.S;
                int i = bf0.U;
                iy0 iy0Var = (iy0) ((zv) this.Q);
                if (iy0Var.M() == null) {
                    runnable = new nz0(1, context);
                } else {
                    zv.a[] N = iy0Var.N();
                    final ArrayList arrayList = new ArrayList();
                    for (zv.a aVar : N) {
                        arrayList.add(new bf0.c(aVar));
                    }
                    runnable = new Runnable() { // from class: ze0
                        @Override // java.lang.Runnable
                        public final void run() {
                            new bf0(context, arrayList, bVar).show();
                        }
                    };
                }
                h21.a(runnable);
                return;
        }
    }
}