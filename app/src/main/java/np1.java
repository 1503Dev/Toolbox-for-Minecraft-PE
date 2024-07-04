package defpackage;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: np1  reason: default package */
public final class np1 {
    public byte[] N;
    public ql1 T;
    public boolean U;
    public pl1 X;
    public int Y;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public ol1 j;
    public byte[] k;
    public al1 l;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = 0;
    public int r = -1;
    public float s = 0.0f;
    public float t = 0.0f;
    public float u = 0.0f;
    public byte[] v = null;
    public int w = -1;
    public boolean x = false;
    public int y = -1;
    public int z = -1;
    public int A = -1;
    public int B = 1000;
    public int C = 200;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0;
    public long S = 0;
    public boolean V = true;
    public String W = "eng";

    @EnsuresNonNull({"codecPrivate"})
    public final byte[] a(String str) {
        byte[] bArr = this.k;
        if (bArr != null) {
            return bArr;
        }
        throw jy2.a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }
}