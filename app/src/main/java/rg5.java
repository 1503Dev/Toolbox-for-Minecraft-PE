package defpackage;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: rg5  reason: default package */
public final class rg5 extends xq4 {
    public final byte[] e;
    public final DatagramPacket f;
    public Uri g;
    public DatagramSocket h;
    public MulticastSocket i;
    public InetAddress j;
    public boolean k;
    public int l;

    public rg5() {
        super(true);
        byte[] bArr = new byte[RecyclerView.MAX_SCROLL_DURATION];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, (int) RecyclerView.MAX_SCROLL_DURATION);
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        Uri uri = kz4Var.a;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        g(kz4Var);
        try {
            this.j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, port);
            if (this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.j);
                this.h = this.i;
            } else {
                this.h = new DatagramSocket(inetSocketAddress);
            }
            this.h.setSoTimeout(8000);
            this.k = true;
            h(kz4Var);
            return -1L;
        } catch (IOException e) {
            throw new zf5(2001, e);
        } catch (SecurityException e2) {
            throw new zf5(2006, e2);
        }
    }

    @Override // defpackage.fv4
    public final Uri d() {
        return this.g;
    }

    @Override // defpackage.fv4
    public final void i() {
        this.g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.j;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.i = null;
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.j = null;
        this.l = 0;
        if (this.k) {
            this.k = false;
            f();
        }
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.l == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                datagramSocket.getClass();
                datagramSocket.receive(this.f);
                int length = this.f.getLength();
                this.l = length;
                v(length);
            } catch (SocketTimeoutException e) {
                throw new zf5(2002, e);
            } catch (IOException e2) {
                throw new zf5(2001, e2);
            }
        }
        int length2 = this.f.getLength();
        int i3 = this.l;
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, length2 - i3, bArr, i, min);
        this.l -= min;
        return min;
    }
}