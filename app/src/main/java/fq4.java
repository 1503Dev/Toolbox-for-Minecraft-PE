package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fq4  reason: default package */
public final class fq4 {
    public final h22 a;
    public final File b;
    public final File c;
    public final File d;
    public byte[] e;

    public fq4(h22 h22Var, File file, File file2, File file3) {
        this.a = h22Var;
        this.b = file;
        this.c = file3;
        this.d = file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        FileInputStream fileInputStream2 = null;
        if (this.e == null) {
            try {
                fileInputStream = new FileInputStream(this.d);
                try {
                    ArrayList arrayList = new ArrayList();
                    int i = 256;
                    while (true) {
                        byte[] bArr3 = new byte[i];
                        int i2 = 0;
                        while (i2 < i) {
                            int read = fileInputStream.read(bArr3, i2, i - i2);
                            if (read == -1) {
                                break;
                            }
                            i2 += read;
                        }
                        ed5 G = i2 == 0 ? null : gd5.G(bArr3, 0, i2);
                        if (G == null) {
                            break;
                        }
                        arrayList.add(G);
                        i = Math.min(i + i, 8192);
                    }
                    bArr2 = gd5.F(arrayList).g();
                    gw.j(fileInputStream);
                } catch (IOException unused) {
                    gw.j(fileInputStream);
                    bArr2 = null;
                    this.e = bArr2;
                    bArr = this.e;
                    if (bArr != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    gw.j(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.e = bArr2;
        }
        bArr = this.e;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}