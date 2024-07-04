package defpackage;

import android.media.MediaCodec;

/* renamed from: rj5  reason: default package */
public final class rj5 {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final aj5 j;

    public rj5() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = zn4.a >= 24 ? new aj5(cryptoInfo) : null;
    }
}