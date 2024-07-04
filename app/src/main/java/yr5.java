package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: yr5  reason: default package */
public final class yr5 extends AsyncTask {
    public final /* synthetic */ gu5 a;

    public /* synthetic */ yr5(gu5 gu5Var) {
        this.a = gu5Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            gu5 gu5Var = this.a;
            gu5Var.W = (rz1) gu5Var.R.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            sv2.h("", e);
        }
        gu5 gu5Var2 = this.a;
        gu5Var2.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) ab2.d.d());
        builder.appendQueryParameter("query", gu5Var2.T.d);
        builder.appendQueryParameter("pubId", gu5Var2.T.b);
        builder.appendQueryParameter("mappver", gu5Var2.T.f);
        TreeMap treeMap = gu5Var2.T.c;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri build = builder.build();
        rz1 rz1Var = gu5Var2.W;
        if (rz1Var != null) {
            try {
                build = rz1.c(build, rz1Var.b.f(gu5Var2.S));
            } catch (sz1 e2) {
                sv2.h("Unable to process ad data", e2);
            }
        }
        return ij.c(gu5Var2.q(), "#", build.getEncodedQuery());
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.a.U;
        if (webView != null && str != null) {
            webView.loadUrl(str);
        }
    }
}