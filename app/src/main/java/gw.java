package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import org.json.JSONObject;

@Deprecated
/* renamed from: gw  reason: default package */
public final class gw implements wj2, xj2, aa3, o55 {
    public static final int[] P = new int[0];
    public static final Object[] Q = new Object[0];
    public static char[] R = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] S = {-1, -1, -1, -3};
    public static final int[] T = {1, 0, 0, 4, -2, -1, 3, -4};
    public static final int[] U = {-1, -1, -1, -5, 1, 0, -4, 3};
    public static final z92 V = new z92(2);
    public static final j93 W = new j93(1);
    public static final su3 X = new su3(0);
    public static final /* synthetic */ gw Y = new gw();
    public static final v22 Z = new v22(2);
    public static final /* synthetic */ gw a0 = new gw();

    public static void d(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append('\"');
                    } else {
                        if (obj instanceof String) {
                            String obj2 = obj.toString();
                            if (obj2.startsWith("{")) {
                                sb.append(obj2);
                            } else {
                                sb.append('\"');
                                sb.append(obj2);
                            }
                        } else {
                            sb.append(obj);
                        }
                        sb.append(",");
                    }
                    sb.append('\"');
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new cc1(webView, sb2));
                return;
            } else {
                webView.loadUrl(sb2);
                return;
            }
        }
        String b = k6.b("The WebView is null for ", str);
        if (y91.a.booleanValue() && !TextUtils.isEmpty(b)) {
            Log.i("OMIDLIB", b);
        }
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        int i = (int) j4;
        iArr3[3] = i;
        if (((int) (j4 >>> 32)) != 0 || ((i >>> 1) >= 2147483646 && z61.U(iArr3, S))) {
            g(iArr3);
        }
    }

    public static void g(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) ((4294967295L & iArr[3]) + 2 + j2);
    }

    public static int h(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ (-1);
    }

    public static int i(int i, long j, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ (-1);
    }

    public static void j(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long k(InputStream inputStream, OutputStream outputStream, boolean z) {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    j(inputStream);
                    j(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            j(inputStream);
            j(outputStream);
        }
        return j;
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        z61.z0(iArr, iArr2, iArr4);
        m(iArr4, iArr3);
    }

    public static void m(int[] iArr, int[] iArr2) {
        long j = 4294967295L & iArr[7];
        long j2 = (iArr[3] & 4294967295L) + j;
        long j3 = (iArr[6] & 4294967295L) + (j << 1);
        long j4 = (iArr[2] & 4294967295L) + j3;
        long j5 = (iArr[5] & 4294967295L) + (j3 << 1);
        long j6 = (iArr[1] & 4294967295L) + j5;
        long j7 = (iArr[4] & 4294967295L) + (j5 << 1);
        long j8 = (iArr[0] & 4294967295L) + j7;
        iArr2[0] = (int) j8;
        long j9 = j6 + (j8 >>> 32);
        iArr2[1] = (int) j9;
        long j10 = j4 + (j9 >>> 32);
        iArr2[2] = (int) j10;
        long j11 = j2 + (j7 << 1) + (j10 >>> 32);
        iArr2[3] = (int) j11;
        n(iArr2, (int) (j11 >>> 32));
    }

    public static void n(int[] iArr, int i) {
        while (i != 0) {
            long j = i & 4294967295L;
            long j2 = (iArr[0] & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (4294967295L & iArr[3]) + (j << 1) + j3;
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    public static void o(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        z61.b1(iArr, iArr3);
        m(iArr3, iArr2);
    }

    public static void p(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        z61.b1(iArr, iArr3);
        while (true) {
            m(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.b1(iArr2, iArr3);
        }
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.i1(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (iArr3[2] & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (((4294967295L & iArr3[3]) - 2) + j2);
        }
    }

    @Override // defpackage.aa3, defpackage.qt4
    public cs3 a() {
        return null;
    }

    @Override // defpackage.wj2
    public /* bridge */ /* synthetic */ Object b(JSONObject jSONObject) {
        return jSONObject;
    }

    @Override // defpackage.o55
    public ja c(r65 r65Var) {
        o35 o35Var;
        f65 f65Var = q35.a;
        if (((p65) r65Var).a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                pb5 z = pb5.z(((p65) r65Var).c, ud5.c);
                if (z.w() == 0) {
                    int i = ((p65) r65Var).e;
                    int b = cm0.b(i);
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 4) {
                                    int a = e1.a(i);
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a);
                                }
                            } else {
                                o35Var = o35.d;
                            }
                        }
                        o35Var = o35.c;
                    } else {
                        o35Var = o35.b;
                    }
                    return k35.q(o35Var, ee4.d(z.A().g()), ((p65) r65Var).f);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (te5 unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
    }

    @Override // defpackage.xj2
    public /* bridge */ /* synthetic */ JSONObject f(Object obj) {
        return (JSONObject) obj;
    }
}