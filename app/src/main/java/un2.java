package defpackage;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* renamed from: un2  reason: default package */
public final class un2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ wn2 R;

    public un2(wn2 wn2Var, String str, String str2) {
        this.R = wn2Var;
        this.P = str;
        this.Q = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.R.R.getSystemService("download");
        try {
            String str = this.P;
            String str2 = this.Q;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            cu5 cu5Var = jv5.A.c;
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.R.c("Could not store picture.");
        }
    }
}