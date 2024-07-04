package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: em0  reason: default package */
public final class em0 implements xu0, Closeable {
    public static final TreeMap<Integer, em0> X = new TreeMap<>();
    public volatile String P;
    public final long[] Q;
    public final double[] R;
    public final String[] S;
    public final byte[][] T;
    public final int[] U;
    public final int V;
    public int W;

    public em0(int i) {
        this.V = i;
        int i2 = i + 1;
        this.U = new int[i2];
        this.Q = new long[i2];
        this.R = new double[i2];
        this.S = new String[i2];
        this.T = new byte[i2];
    }

    public static em0 a(int i, String str) {
        TreeMap<Integer, em0> treeMap = X;
        synchronized (treeMap) {
            Map.Entry<Integer, em0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                em0 value = ceilingEntry.getValue();
                value.P = str;
                value.W = i;
                return value;
            }
            em0 em0Var = new em0(i);
            em0Var.P = str;
            em0Var.W = i;
            return em0Var;
        }
    }

    public final void E(int i, String str) {
        this.U[i] = 4;
        this.S[i] = str;
    }

    public final void F() {
        TreeMap<Integer, em0> treeMap = X;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.V), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.xu0
    public final String d() {
        return this.P;
    }

    @Override // defpackage.xu0
    public final void g(hs hsVar) {
        for (int i = 1; i <= this.W; i++) {
            int i2 = this.U[i];
            if (i2 == 1) {
                hsVar.t(i);
            } else if (i2 == 2) {
                hsVar.g(this.Q[i], i);
            } else if (i2 == 3) {
                hsVar.d(this.R[i], i);
            } else if (i2 == 4) {
                hsVar.y(i, this.S[i]);
            } else if (i2 == 5) {
                hsVar.a(this.T[i], i);
            }
        }
    }

    public final void t(long j, int i) {
        this.U[i] = 2;
        this.Q[i] = j;
    }

    public final void y(int i) {
        this.U[i] = 1;
    }
}