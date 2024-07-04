package com.xbox.httpclient;

import android.content.Context;
import android.net.ConnectivityManager;
import defpackage.nb0;
import defpackage.uk0;
import java.io.IOException;

public final class HttpClientRequest {
    public static final nb0 SHARED_CLIENT;
    private final uk0.a request = new uk0.a();

    static {
        nb0.b bVar = new nb0.b();
        nv nvVar = new nv();
        nvVar.a = 1;
        bVar.e.add(nvVar);
        bVar.u = false;
        SHARED_CLIENT = new nb0(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void OnRequestCompleted(long j, HttpClientResponse httpClientResponse);

    /* JADX INFO: Access modifiers changed from: private */
    public native void OnRequestFailed(long j, String str);

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    public void doRequestAsync(final long j) {
        nb0 nb0Var = SHARED_CLIENT;
        uk0 a = this.request.a();
        nb0Var.getClass();
        xj0.c(nb0Var, a, false).a(new tb() { // from class: com.xbox.httpclient.HttpClientRequest.1
            @Override // defpackage.tb
            public void onFailure(ob obVar, IOException iOException) {
                HttpClientRequest.this.OnRequestFailed(j, iOException.getClass().getCanonicalName());
            }

            @Override // defpackage.tb
            public void onResponse(ob obVar, nl0 nl0Var) {
                HttpClientRequest httpClientRequest = HttpClientRequest.this;
                long j2 = j;
                httpClientRequest.OnRequestCompleted(j2, new HttpClientResponse(nl0Var, j2));
            }
        });
    }

    public void setHttpHeader(String str, String str2) {
        this.request.c.a(str, str2);
    }

    public void setHttpMethodAndBody(String str, long j, String str2, long j2) {
        e50 e50Var = null;
        if (j2 != 0) {
            uk0.a aVar = this.request;
            if (str2 != null) {
                try {
                    e50Var = e50.a(str2);
                } catch (IllegalArgumentException unused) {
                }
            }
            aVar.b(str, new HttpClientRequestBody(j, e50Var, j2));
        } else if (str.equals("POST") || str.equals("PUT")) {
            this.request.b(str, vk0.create((e50) null, new byte[0]));
        } else {
            this.request.b(str, null);
        }
    }

    public void setHttpUrl(String str) {
        if (str.equals("https://vortex.data.microsoft.com/collect/v1")) {
            str = "http://127.0.0.1/";
        }
        this.request.f(str);
    }

    public void setHttpMethodAndBody(String str, String str2, byte[] bArr) {
        uk0.a aVar;
        vk0 vk0Var = null;
        e50 e50Var = null;
        if (bArr != null && bArr.length > 0) {
            uk0.a aVar2 = this.request;
            try {
                e50Var = e50.a(str2);
            } catch (IllegalArgumentException unused) {
            }
            aVar2.b(str, vk0.create(e50Var, bArr));
            return;
        }
        if (str.equals("POST") || str.equals("PUT")) {
            aVar = this.request;
            vk0Var = vk0.create((e50) null, new byte[0]);
        } else {
            aVar = this.request;
        }
        aVar.b(str, vk0Var);
    }
}