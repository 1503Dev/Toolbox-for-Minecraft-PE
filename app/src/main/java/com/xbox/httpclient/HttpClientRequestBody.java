package com.xbox.httpclient;

import java.io.IOException;

public class HttpClientRequestBody extends vk0 {
    private long contentLength;
    private e50 contentType;
    private byte[] data;
    private long handle;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class NativeInputStream {
        private NativeInputStream() {
        }

        public native int nativeRead(long j, long j2, byte[] bArr, long j3, long j4);
    }

    public HttpClientRequestBody(long j, e50 e50Var, long j2) {
        this.handle = j;
        this.contentType = e50Var;
        this.contentLength = j2;
    }

    private void debugWriteTo(ab abVar) {
        if (this.data == null) {
            NativeInputStream nativeInputStream = new NativeInputStream();
            this.data = new byte[(int) this.contentLength];
            long j = 0;
            while (true) {
                long j2 = this.contentLength;
                if (j >= j2) {
                    break;
                }
                int nativeRead = nativeInputStream.nativeRead(this.handle, j, this.data, 0L, j2 - j);
                if (nativeRead == -1) {
                    throw new IOException("Failed to read from native buffer");
                }
                j += nativeRead;
            }
        }
        abVar.write(this.data);
    }

    @Override // defpackage.vk0
    public long contentLength() {
        return this.contentLength;
    }

    @Override // defpackage.vk0
    public e50 contentType() {
        return this.contentType;
    }

    @Override // defpackage.vk0
    public void writeTo(ab abVar) {
        NativeInputStream nativeInputStream = new NativeInputStream();
        int min = (int) Math.min(this.contentLength, 16384L);
        byte[] bArr = new byte[min];
        long j = 0;
        while (true) {
            long j2 = this.contentLength;
            if (j >= j2) {
                return;
            }
            int nativeRead = nativeInputStream.nativeRead(this.handle, j, bArr, 0L, Math.min(j2 - j, min));
            if (nativeRead == -1) {
                throw new IOException("Failed to read from native buffer");
            }
            abVar.write(bArr, 0, nativeRead);
            j += nativeRead;
        }
    }
}