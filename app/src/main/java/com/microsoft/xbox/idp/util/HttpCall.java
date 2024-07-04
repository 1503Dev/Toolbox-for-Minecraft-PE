package com.microsoft.xbox.idp.util;

import java.io.InputStream;

public class HttpCall {
    private final long id;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface Callback {
        void processHttpError(int i, int i2, long j, String str);

        void processResponse(InputStream inputStream);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface CallbackWithHeaders {
        void processHttpError(int i, int i2, String str, HttpHeaders httpHeaders);

        void processResponse(int i, long j, InputStream inputStream, HttpHeaders httpHeaders);
    }

    public HttpCall(String str, String str2, String str3) {
        this.id = create(str, str2, str3, true);
    }

    public HttpCall(String str, String str2, String str3, boolean z) {
        this.id = create(str, str2, str3, z);
    }

    private static native long create(String str, String str2, String str3, boolean z);

    private static native void delete(long j);

    public void finalize() {
        delete(this.id);
        super.finalize();
    }

    public native void getResponseAsync(Callback callback);

    public native void getResponseAsync(CallbackWithHeaders callbackWithHeaders);

    public native void setContentTypeHeaderValue(String str);

    public native void setCustomHeader(String str, String str2);

    public native void setLongHttpCall(boolean z);

    public native void setRequestBody(String str);

    public native void setRequestBody(byte[] bArr);

    public native void setRetryAllowed(boolean z);

    public native void setXboxContractVersionHeaderValue(String str);
}