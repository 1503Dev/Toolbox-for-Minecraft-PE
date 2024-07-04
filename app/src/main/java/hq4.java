package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: hq4  reason: default package */
public final class hq4 extends xq4 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public hq4(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        try {
            Uri uri = kz4Var.a;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            g(kz4Var);
            InputStream open = this.e.open(path, 1);
            this.g = open;
            if (open.skip(kz4Var.d) >= kz4Var.d) {
                long j = kz4Var.e;
                if (j != -1) {
                    this.h = j;
                } else {
                    long available = this.g.available();
                    this.h = available;
                    if (available == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                h(kz4Var);
                return this.h;
            }
            throw new lp4(2008, null);
        } catch (lp4 e) {
            throw e;
        } catch (IOException e2) {
            throw new lp4(true != (e2 instanceof FileNotFoundException) ? RecyclerView.MAX_SCROLL_DURATION : 2005, e2);
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
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.i) {
                    this.i = false;
                    f();
                }
            } catch (IOException e) {
                throw new lp4(RecyclerView.MAX_SCROLL_DURATION, e);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.i) {
                this.i = false;
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
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new lp4(RecyclerView.MAX_SCROLL_DURATION, e);
                }
            }
            InputStream inputStream = this.g;
            int i3 = zn4.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.h;
            if (j2 != -1) {
                this.h = j2 - read;
            }
            v(read);
            return read;
        }
        return -1;
    }
}