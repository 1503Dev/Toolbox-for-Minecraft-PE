package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: k75  reason: default package */
public final class k75 extends xq4 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public k75() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
        if (r1 != false) goto L33;
     */
    @Override // defpackage.fv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(kz4 kz4Var) {
        boolean b;
        Uri uri = kz4Var.a;
        this.f = uri;
        g(kz4Var);
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(kz4Var.d);
                long j = kz4Var.e;
                if (j == -1) {
                    j = this.e.length() - kz4Var.d;
                }
                this.g = j;
                if (j >= 0) {
                    this.h = true;
                    h(kz4Var);
                    return this.g;
                }
                throw new w65(2008, null, null);
            } catch (IOException e) {
                throw new w65(RecyclerView.MAX_SCROLL_DURATION, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (zn4.a >= 21) {
                    b = d65.b(e2.getCause());
                }
                i = 2005;
                throw new w65(i, e2);
            }
            throw new w65(1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2);
        } catch (SecurityException e3) {
            throw new w65(2006, e3);
        } catch (RuntimeException e4) {
            throw new w65(RecyclerView.MAX_SCROLL_DURATION, e4);
        }
    }

    @Override // defpackage.fv4
    public final Uri d() {
        return this.f;
    }

    @Override // defpackage.fv4
    public final void i() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    f();
                }
            } catch (IOException e) {
                throw new w65(RecyclerView.MAX_SCROLL_DURATION, e);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                f();
            }
            throw th;
        }
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = zn4.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                v(read);
            }
            return read;
        } catch (IOException e) {
            throw new w65(RecyclerView.MAX_SCROLL_DURATION, e);
        }
    }
}