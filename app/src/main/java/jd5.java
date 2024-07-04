package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: jd5  reason: default package */
public final class jd5 extends xq4 {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public FileInputStream i;
    public long j;
    public boolean k;

    public jd5(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (r1.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    @Override // defpackage.fv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(kz4 kz4Var) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j;
        Uri uri = kz4Var.a;
        this.g = uri;
        try {
            try {
                if (!TextUtils.equals("rawresource", uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (TextUtils.equals("android.resource", uri.getScheme())) {
                        String path = uri.getPath();
                        path.getClass();
                        if (path.startsWith("/")) {
                            path = path.substring(1);
                        }
                        String host = uri.getHost();
                        parseInt = this.e.getIdentifier((TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":")).concat(String.valueOf(path)), "raw", this.f);
                        if (parseInt == 0) {
                            throw new rc5(2005, "Resource not found.", null);
                        }
                        g(kz4Var);
                        openRawResourceFd = this.e.openRawResourceFd(parseInt);
                        this.h = openRawResourceFd;
                        if (openRawResourceFd == null) {
                            long length = openRawResourceFd.getLength();
                            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                            this.i = fileInputStream;
                            if (length != -1) {
                                try {
                                    if (kz4Var.d > length) {
                                        throw new rc5(2008, null, null);
                                    }
                                } catch (rc5 e) {
                                    throw e;
                                } catch (IOException e2) {
                                    throw new rc5(RecyclerView.MAX_SCROLL_DURATION, null, e2);
                                }
                            }
                            long startOffset = openRawResourceFd.getStartOffset();
                            long skip = fileInputStream.skip(kz4Var.d + startOffset) - startOffset;
                            if (skip == kz4Var.d) {
                                if (length == -1) {
                                    FileChannel channel = fileInputStream.getChannel();
                                    if (channel.size() == 0) {
                                        this.j = -1L;
                                        j = -1;
                                    } else {
                                        j = channel.size() - channel.position();
                                        this.j = j;
                                        if (j < 0) {
                                            throw new rc5(2008, null, null);
                                        }
                                    }
                                } else {
                                    j = length - skip;
                                    this.j = j;
                                    if (j < 0) {
                                        throw new bw4(2008);
                                    }
                                }
                                long j2 = kz4Var.e;
                                if (j2 != -1) {
                                    if (j != -1) {
                                        j2 = Math.min(j, j2);
                                    }
                                    this.j = j2;
                                }
                                this.k = true;
                                h(kz4Var);
                                long j3 = kz4Var.e;
                                return j3 != -1 ? j3 : this.j;
                            }
                            throw new rc5(2008, null, null);
                        }
                        throw new rc5(RecyclerView.MAX_SCROLL_DURATION, "Resource is compressed: ".concat(String.valueOf(uri)), null);
                    }
                    throw new rc5(1004, "URI must either use scheme rawresource or android.resource", null);
                }
                openRawResourceFd = this.e.openRawResourceFd(parseInt);
                this.h = openRawResourceFd;
                if (openRawResourceFd == null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new rc5(2005, null, e3);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            g(kz4Var);
        } catch (NumberFormatException unused) {
            throw new rc5(1004, "Resource identifier must be an integer.", null);
        }
    }

    @Override // defpackage.fv4
    public final Uri d() {
        return this.g;
    }

    @Override // defpackage.fv4
    public final void i() {
        this.g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new rc5(RecyclerView.MAX_SCROLL_DURATION, null, e);
                    }
                } finally {
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        f();
                    }
                }
            } catch (IOException e2) {
                throw new rc5(RecyclerView.MAX_SCROLL_DURATION, null, e2);
            }
        } catch (Throwable th) {
            this.i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        f();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new rc5(RecyclerView.MAX_SCROLL_DURATION, null, e3);
                }
            } catch (Throwable th2) {
                this.h = null;
                if (this.k) {
                    this.k = false;
                    f();
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.gv5
    public final int x(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new rc5(RecyclerView.MAX_SCROLL_DURATION, null, e);
                }
            }
            FileInputStream fileInputStream = this.i;
            int i3 = zn4.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                if (this.j == -1) {
                    return -1;
                }
                throw new rc5(RecyclerView.MAX_SCROLL_DURATION, "End of stream reached having not read sufficient data.", new EOFException());
            }
            long j2 = this.j;
            if (j2 != -1) {
                this.j = j2 - read;
            }
            v(read);
            return read;
        }
        return -1;
    }
}