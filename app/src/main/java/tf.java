package defpackage;

import java.io.InputStream;

/* renamed from: tf  reason: default package */
public final class tf extends InputStream {
    public final kl5 P;
    public boolean Q = true;
    public InputStream R;

    public tf(kl5 kl5Var) {
        this.P = kl5Var;
    }

    @Override // java.io.InputStream
    public final int read() {
        q qVar;
        if (this.R == null) {
            if (!this.Q || (qVar = (q) this.P.a()) == null) {
                return -1;
            }
            this.Q = false;
            this.R = qVar.g();
        }
        while (true) {
            int read = this.R.read();
            if (read >= 0) {
                return read;
            }
            q qVar2 = (q) this.P.a();
            if (qVar2 == null) {
                this.R = null;
                return -1;
            }
            this.R = qVar2.g();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        q qVar;
        int i3 = 0;
        if (this.R == null) {
            if (!this.Q || (qVar = (q) this.P.a()) == null) {
                return -1;
            }
            this.Q = false;
            this.R = qVar.g();
        }
        while (true) {
            int read = this.R.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                q qVar2 = (q) this.P.a();
                if (qVar2 == null) {
                    this.R = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.R = qVar2.g();
            }
        }
    }
}