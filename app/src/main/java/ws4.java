package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: ws4  reason: default package */
public final class ws4 extends xq4 {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public ws4(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // defpackage.fv4
    public final long a(kz4 kz4Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        int i = RecyclerView.MAX_SCROLL_DURATION;
        try {
            Uri uri = kz4Var.a;
            this.f = uri;
            g(kz4Var);
            if ("content".equals(kz4Var.a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
            }
            this.g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new bs4(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), RecyclerView.MAX_SCROLL_DURATION);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.h = fileInputStream;
            if (length != -1 && kz4Var.d > length) {
                throw new bs4(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(kz4Var.d + startOffset) - startOffset;
            if (skip == kz4Var.d) {
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.i = j;
                        if (j < 0) {
                            throw new bs4(null, 2008);
                        }
                    }
                } else {
                    long j2 = length - skip;
                    this.i = j2;
                    if (j2 < 0) {
                        throw new bs4(null, 2008);
                    }
                    j = j2;
                }
                long j3 = kz4Var.e;
                if (j3 != -1) {
                    if (j != -1) {
                        j3 = Math.min(j, j3);
                    }
                    this.i = j3;
                }
                this.j = true;
                h(kz4Var);
                long j4 = kz4Var.e;
                return j4 != -1 ? j4 : this.i;
            }
            throw new bs4(null, 2008);
        } catch (bs4 e) {
            throw e;
        } catch (IOException e2) {
            if (true == (e2 instanceof FileNotFoundException)) {
                i = 2005;
            }
            throw new bs4(e2, i);
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
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            f();
                        }
                    }
                } catch (IOException e) {
                    throw new bs4(e, RecyclerView.MAX_SCROLL_DURATION);
                }
            } catch (IOException e2) {
                throw new bs4(e2, RecyclerView.MAX_SCROLL_DURATION);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        f();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new bs4(e3, RecyclerView.MAX_SCROLL_DURATION);
                }
            } catch (Throwable th2) {
                this.g = null;
                if (this.j) {
                    this.j = false;
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
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new bs4(e, RecyclerView.MAX_SCROLL_DURATION);
                }
            }
            FileInputStream fileInputStream = this.h;
            int i3 = zn4.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            long j2 = this.i;
            if (j2 != -1) {
                this.i = j2 - read;
            }
            v(read);
            return read;
        }
        return -1;
    }
}