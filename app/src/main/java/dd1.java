package defpackage;

import android.content.Context;
import defpackage.ke1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: dd1  reason: default package */
public final class dd1 implements ke1.a {
    public final /* synthetic */ ad1 a;

    public dd1(ad1 ad1Var) {
        this.a = ad1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // defpackage.ke1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ke1 ke1Var, rc1 rc1Var, Map<String, List<String>> map) {
        Context context;
        boolean z;
        boolean z2;
        boolean z3;
        nc1 n;
        String str;
        ad1 ad1Var = this.a;
        String str2 = ad1Var.x;
        if (ga1.P != null) {
            File file = new File(context.getFilesDir().getAbsolutePath() + "/adc3/7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            if (file.exists()) {
                ThreadPoolExecutor threadPoolExecutor = eg1.a;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            try {
                                try {
                                    int read = fileInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    messageDigest.update(bArr, 0, read);
                                } catch (IOException e) {
                                    throw new RuntimeException("Unable to process file for MD5", e);
                                }
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused) {
                                    t1.b(0, 0, "Exception on closing MD5 input stream", true);
                                }
                                throw th;
                            }
                        }
                        z = str2.equals(String.format("%40s", new BigInteger(1, messageDigest.digest()).toString(16)).replace(' ', '0'));
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                            t1.b(0, 0, "Exception on closing MD5 input stream", true);
                        }
                    } catch (FileNotFoundException unused3) {
                        n = ga1.h().n();
                        str = "Exception while getting FileInputStream";
                        n.d(0, 0, str, true);
                        z = false;
                        if (z) {
                        }
                        if (!ad1Var.F) {
                        }
                        if (ad1Var.F) {
                        }
                    }
                } catch (NoSuchAlgorithmException unused4) {
                    n = ga1.h().n();
                    str = "Exception while getting Digest";
                }
                if (z && !kd1.x0) {
                    ga1.h().n().d(0, 1, "Downloaded controller sha1 does not match, retrying.", false);
                    ad1Var.d();
                    return;
                }
                if (!ad1Var.F && !ad1Var.H) {
                    eg1.n(new ed1(ad1Var));
                }
                if (ad1Var.F && ad1Var.H) {
                    ad1Var.V = 0;
                    for (i2 i2Var : ad1Var.d.c.values()) {
                        if (i2Var.k == 5) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            ad1Var.V++;
                            fd1 fd1Var = new fd1(ad1Var);
                            synchronized (i2Var) {
                                if (i2Var.k == 6) {
                                    z3 = true;
                                } else {
                                    i2Var.b = fd1Var;
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                int i = ad1Var.V - 1;
                                ad1Var.V = i;
                                if (i == 0) {
                                    ad1Var.b();
                                }
                            }
                        }
                    }
                    for (z1 z1Var : ad1Var.d.f.values()) {
                        ad1Var.V++;
                        z1Var.setOnDestroyListenerOrCall(new gd1(ad1Var));
                    }
                    if (ad1Var.V == 0) {
                        ad1Var.b();
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
        }
        if (!ad1Var.F) {
            eg1.n(new ed1(ad1Var));
        }
        if (ad1Var.F) {
        }
    }
}