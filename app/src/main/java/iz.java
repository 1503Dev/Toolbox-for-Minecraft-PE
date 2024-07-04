package defpackage;

import android.graphics.SurfaceTexture;
import defpackage.el0;
import defpackage.uk0;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* renamed from: iz  reason: default package */
public final /* synthetic */ class iz implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ iz(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        MessageDigest messageDigest;
        FileInputStream fileInputStream;
        byte[] bArr;
        switch (this.P) {
            case 0:
                ((SurfaceTexture) this.Q).release();
                return;
            case 1:
                ((zf0) this.Q).invalidateSelf();
                return;
            case 2:
                ((yz0) this.Q).a();
                return;
            default:
                el0.b bVar = (el0.b) this.Q;
                if (bVar.c.exists()) {
                    File file = bVar.c;
                    try {
                        messageDigest = MessageDigest.getInstance("SHA-1");
                        fileInputStream = new FileInputStream(file);
                        bArr = new byte[524288];
                    } catch (Exception unused) {
                        str = "";
                    }
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            fileInputStream.close();
                            byte[] digest = messageDigest.digest();
                            StringBuilder sb = new StringBuilder(digest.length * 2);
                            int length = digest.length;
                            for (int i = 0; i < length; i++) {
                                sb.append(String.format("%02x", Integer.valueOf(digest[i] & 255)));
                            }
                            str = sb.toString();
                            if (str.equals(bVar.b)) {
                                h21.a(new g80(1, bVar));
                                return;
                            }
                        }
                    }
                }
                uk0.a aVar = new uk0.a();
                aVar.f(bVar.a);
                uk0 a = aVar.a();
                nb0 nb0Var = el0.this.a;
                nb0Var.getClass();
                xj0.c(nb0Var, a, false).a(new fl0(bVar));
                return;
        }
    }
}