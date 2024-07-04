package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: vk0  reason: default package */
public abstract class vk0 {

    /* renamed from: vk0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends vk0 {
        public final /* synthetic */ e50 a;
        public final /* synthetic */ fb b;

        public a(e50 e50Var, fb fbVar) {
            this.a = e50Var;
            this.b = fbVar;
        }

        @Override // defpackage.vk0
        public final long contentLength() {
            return this.b.n();
        }

        @Override // defpackage.vk0
        @Nullable
        public final e50 contentType() {
            return this.a;
        }

        @Override // defpackage.vk0
        public final void writeTo(ab abVar) {
            abVar.A(this.b);
        }
    }

    /* renamed from: vk0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends vk0 {
        public final /* synthetic */ e50 a;
        public final /* synthetic */ int b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ int d;

        public b(e50 e50Var, byte[] bArr, int i, int i2) {
            this.a = e50Var;
            this.b = i;
            this.c = bArr;
            this.d = i2;
        }

        @Override // defpackage.vk0
        public final long contentLength() {
            return this.b;
        }

        @Override // defpackage.vk0
        @Nullable
        public final e50 contentType() {
            return this.a;
        }

        @Override // defpackage.vk0
        public final void writeTo(ab abVar) {
            abVar.write(this.c, this.d, this.b);
        }
    }

    /* renamed from: vk0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends vk0 {
        public final /* synthetic */ e50 a;
        public final /* synthetic */ File b;

        public c(e50 e50Var, File file) {
            this.a = e50Var;
            this.b = file;
        }

        @Override // defpackage.vk0
        public final long contentLength() {
            return this.b.length();
        }

        @Override // defpackage.vk0
        @Nullable
        public final e50 contentType() {
            return this.a;
        }

        @Override // defpackage.vk0
        public final void writeTo(ab abVar) {
            File file = this.b;
            Logger logger = rb0.a;
            if (file != null) {
                pb0 pb0Var = new pb0(new FileInputStream(file), new cx0());
                try {
                    abVar.o(pb0Var);
                    pb0Var.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            pb0Var.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            throw new IllegalArgumentException("file == null");
        }
    }

    public static vk0 create(@Nullable e50 e50Var, fb fbVar) {
        return new a(e50Var, fbVar);
    }

    public static vk0 create(@Nullable e50 e50Var, File file) {
        if (file != null) {
            return new c(e50Var, file);
        }
        throw new NullPointerException("file == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vk0 create(@Nullable e50 e50Var, String str) {
        Charset charset;
        String str2;
        Charset charset2 = StandardCharsets.UTF_8;
        if (e50Var != null) {
            try {
                str2 = e50Var.c;
            } catch (IllegalArgumentException unused) {
            }
            if (str2 != null) {
                charset = Charset.forName(str2);
                if (charset == null) {
                    charset = StandardCharsets.UTF_8;
                    try {
                        e50Var = e50.a(e50Var + "; charset=utf-8");
                    } catch (IllegalArgumentException unused2) {
                        e50Var = null;
                    }
                }
                charset2 = charset;
            }
            charset = null;
            if (charset == null) {
            }
            charset2 = charset;
        }
        return create(e50Var, str.getBytes(charset2));
    }

    public static vk0 create(@Nullable e50 e50Var, byte[] bArr) {
        return create(e50Var, bArr, 0, bArr.length);
    }

    public long contentLength() {
        return -1L;
    }

    @Nullable
    public abstract e50 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(ab abVar);

    public static vk0 create(@Nullable e50 e50Var, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long length = bArr.length;
            long j = i;
            long j2 = i2;
            byte[] bArr2 = c31.a;
            if ((j | j2) < 0 || j > length || length - j < j2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new b(e50Var, bArr, i2, i);
        }
        throw new NullPointerException("content == null");
    }
}