package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: xz2  reason: default package */
public final class xz2 extends SSLSocketFactory {
    public final SSLSocketFactory a = (SSLSocketFactory) SSLSocketFactory.getDefault();
    public final /* synthetic */ yz2 b;

    public xz2(yz2 yz2Var) {
        this.b = yz2Var;
    }

    public final void a(Socket socket) {
        int i = this.b.r;
        if (i > 0) {
            socket.setReceiveBufferSize(i);
        }
        this.b.s.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.a.createSocket(str, i, inetAddress, i2);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.a.createSocket(socket, str, i, z);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }
}