package com.xbox.httpclient;

import defpackage.lu;
import defpackage.nb0;
import defpackage.uk0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HttpClientWebSocket extends d61 {
    private final lu.a openHeaders = new lu.a();
    private final long owner;
    private c61 webSocket;

    public HttpClientWebSocket(long j) {
        this.owner = j;
    }

    private uk0 buildRequest(String str) {
        uk0.a aVar = new uk0.a();
        aVar.f(str);
        lu.a aVar2 = this.openHeaders;
        aVar2.getClass();
        ArrayList arrayList = aVar2.a;
        lu.a aVar3 = new lu.a();
        Collections.addAll(aVar3.a, (String[]) arrayList.toArray(new String[arrayList.size()]));
        aVar.c = aVar3;
        return aVar.a();
    }

    private native void onBinaryMessage(ByteBuffer byteBuffer);

    private native void onClose(int i);

    private native void onFailure();

    private native void onMessage(String str);

    private native void onOpen();

    public void addHeader(String str, String str2) {
        this.openHeaders.a(str, str2);
    }

    public void connect(String str, String str2) {
        this.openHeaders.a("Sec-WebSocket-Protocol", str2);
        nb0 nb0Var = HttpClientRequest.SHARED_CLIENT;
        uk0 buildRequest = buildRequest(str);
        nb0Var.getClass();
        ek0 ek0Var = new ek0(buildRequest, this, new Random(), nb0Var.o0);
        nb0.b bVar = new nb0.b(nb0Var);
        bVar.g = new ep();
        ArrayList arrayList = new ArrayList(ek0.v);
        ig0 ig0Var = ig0.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(ig0Var) && !arrayList.contains(ig0.HTTP_1_1)) {
            throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
        } else if (arrayList.contains(ig0Var) && arrayList.size() > 1) {
            throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
        } else if (!arrayList.contains(ig0.HTTP_1_0)) {
            if (!arrayList.contains(null)) {
                arrayList.remove(ig0.SPDY_3);
                bVar.c = Collections.unmodifiableList(arrayList);
                nb0 nb0Var2 = new nb0(bVar);
                uk0 uk0Var = ek0Var.a;
                uk0Var.getClass();
                uk0.a aVar = new uk0.a(uk0Var);
                aVar.c.d("Upgrade", "websocket");
                aVar.c.d("Connection", "Upgrade");
                aVar.c.d("Sec-WebSocket-Key", ek0Var.e);
                aVar.c.d("Sec-WebSocket-Version", "13");
                uk0 a = aVar.a();
                dy.a.getClass();
                xj0 c = xj0.c(nb0Var2, a, true);
                ek0Var.f = c;
                c.a(new dk0(ek0Var, a));
                this.webSocket = ek0Var;
                return;
            }
            throw new IllegalArgumentException("protocols must not contain null");
        } else {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }
    }

    public void disconnect(int i) {
        ((ek0) this.webSocket).b(i);
    }

    @Override // defpackage.d61
    public void onClosed(c61 c61Var, int i, String str) {
        onClose(i);
    }

    @Override // defpackage.d61
    public void onFailure(c61 c61Var, Throwable th, nl0 nl0Var) {
        onFailure();
    }

    @Override // defpackage.d61
    public void onMessage(c61 c61Var, fb fbVar) {
        onBinaryMessage(fbVar.b());
    }

    @Override // defpackage.d61
    public void onMessage(c61 c61Var, String str) {
        onMessage(str);
    }

    @Override // defpackage.d61
    public void onOpen(c61 c61Var, nl0 nl0Var) {
        onOpen();
    }

    public boolean sendBinaryMessage(ByteBuffer byteBuffer) {
        c61 c61Var = this.webSocket;
        char[] cArr = fb.S;
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return ((ek0) c61Var).f(2, new fb(bArr));
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean sendMessage(String str) {
        ek0 ek0Var = (ek0) this.webSocket;
        ek0Var.getClass();
        if (str != null) {
            return ek0Var.f(1, fb.h(str));
        }
        throw new NullPointerException("text == null");
    }
}