package com.xbox.httpclient;

import java.io.IOException;

public final class HttpClientResponse {
    private long handle;
    private final nl0 response;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class NativeOutputStream {
        private NativeOutputStream() {
        }

        public native int nativeWrite(long j, byte[] bArr, int i, int i2);
    }

    public HttpClientResponse(nl0 nl0Var, long j) {
        this.response = nl0Var;
        this.handle = j;
    }

    public String getHeaderNameAtIndex(int i) {
        return this.response.U.d(i);
    }

    public String getHeaderValueAtIndex(int i) {
        return this.response.U.g(i);
    }

    public int getNumHeaders() {
        return this.response.U.a.length / 2;
    }

    public void getResponseBodyBytes() {
        NativeOutputStream nativeOutputStream = new NativeOutputStream();
        bb y = this.response.V.y();
        byte[] bArr = new byte[16384];
        while (true) {
            try {
                int read = y.read(bArr);
                if (read == -1) {
                    break;
                }
                nativeOutputStream.nativeWrite(this.handle, bArr, 0, read);
            } catch (IOException unused) {
            }
        }
        this.response.close();
    }

    public byte[] getResponseBodyBytesLegacy() {
        try {
            return this.response.V.d();
        } catch (IOException unused) {
            return null;
        }
    }

    public int getResponseCode() {
        return this.response.R;
    }
}