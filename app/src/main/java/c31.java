package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.lu;
import defpackage.nb0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: c31  reason: default package */
public final class c31 {
    public static final byte[] a;
    public static final String[] b = new String[0];
    public static final lu c = lu.f(new String[0]);
    public static final pl0 d;
    public static final cd0 e;
    public static final Charset f;
    public static final Charset g;
    public static final TimeZone h;
    public static final a31 i;
    public static final Method j;
    public static final Pattern k;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0107, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r1v12, types: [a31] */
    static {
        byte[] bArr = new byte[0];
        a = bArr;
        za zaVar = new za();
        zaVar.m7write(bArr);
        Method method = null;
        d = new pl0(null, 0, zaVar);
        vk0.create((e50) null, bArr);
        fb[] fbVarArr = {fb.f("efbbbf"), fb.f("feff"), fb.f("fffe"), fb.f("0000ffff"), fb.f("ffff0000")};
        int i2 = cd0.R;
        ArrayList arrayList = new ArrayList(Arrays.asList(fbVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(-1);
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList2.set(Collections.binarySearch(arrayList, fbVarArr[i4]), Integer.valueOf(i4));
        }
        if (((fb) arrayList.get(0)).n() != 0) {
            int i5 = 0;
            while (i5 < arrayList.size()) {
                fb fbVar = (fb) arrayList.get(i5);
                int i6 = i5 + 1;
                int i7 = i6;
                while (i7 < arrayList.size()) {
                    fb fbVar2 = (fb) arrayList.get(i7);
                    fbVar2.getClass();
                    if (!fbVar2.m(fbVar, fbVar.n())) {
                        break;
                    } else if (fbVar2.n() != fbVar.n()) {
                        if (((Integer) arrayList2.get(i7)).intValue() > ((Integer) arrayList2.get(i5)).intValue()) {
                            arrayList.remove(i7);
                            arrayList2.remove(i7);
                        } else {
                            i7++;
                        }
                    } else {
                        throw new IllegalArgumentException("duplicate option: " + fbVar2);
                    }
                }
                i5 = i6;
            }
            za zaVar2 = new za();
            cd0.g(0L, zaVar2, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i8 = (int) (zaVar2.Q / 4);
            int[] iArr = new int[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                iArr[i9] = zaVar2.readInt();
            }
            if (zaVar2.n()) {
                e = new cd0((fb[]) fbVarArr.clone(), iArr);
                f = Charset.forName("UTF-32BE");
                g = Charset.forName("UTF-32LE");
                h = TimeZone.getTimeZone("GMT");
                i = new Comparator() { // from class: a31
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((String) obj).compareTo((String) obj2);
                    }
                };
                try {
                    method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
                } catch (Exception unused) {
                }
                j = method;
                k = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                return;
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public static Charset a(bb bbVar, Charset charset) {
        int s = bbVar.s(e);
        if (s != -1) {
            if (s != 0) {
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s == 4) {
                                return g;
                            }
                            throw new AssertionError();
                        }
                        return f;
                    }
                    return StandardCharsets.UTF_16LE;
                }
                return StandardCharsets.UTF_16BE;
            }
            return StandardCharsets.UTF_8;
        }
        return charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d9, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str) {
        InetAddress f2;
        boolean z = true;
        int i2 = 0;
        int i3 = -1;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                f2 = f(1, str.length() - 1, str);
            } else {
                f2 = f(0, str.length(), str);
            }
            if (f2 == null) {
                return null;
            }
            byte[] address = f2.getAddress();
            if (address.length == 16) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i3 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                za zaVar = new za();
                while (i2 < address.length) {
                    if (i2 == i3) {
                        zaVar.S(58);
                        i2 += i5;
                        if (i2 == 16) {
                            zaVar.S(58);
                        }
                    } else {
                        if (i2 > 0) {
                            zaVar.S(58);
                        }
                        zaVar.U(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                        i2 += 2;
                    }
                }
                return zaVar.M();
            } else if (address.length == 4) {
                return f2.getHostAddress();
            } else {
                throw new AssertionError(ij.c("Invalid IPv6 address: '", str, "'"));
            }
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            int i8 = 0;
            while (true) {
                if (i8 < lowerCase.length()) {
                    char charAt = lowerCase.charAt(i8);
                    if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                        break;
                    }
                    i8++;
                } else {
                    z = false;
                    break;
                }
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!o(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static int e(char c2) {
        if (c2 < '0' || c2 > '9') {
            char c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                c3 = 'A';
                if (c2 < 'A' || c2 > 'F') {
                    return -1;
                }
            }
            return (c2 - c3) + 10;
        }
        return c2 - '0';
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d7, code lost:
        if (r7 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00da, code lost:
        if (r8 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dc, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f6, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InetAddress f(int i2, int i3, String str) {
        boolean z;
        int i4;
        int i5 = 16;
        byte[] bArr = new byte[16];
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        int i11 = i2;
        while (true) {
            if (i11 < i3) {
                if (i8 == i5) {
                    return null;
                }
                int i12 = i11 + 2;
                if (i12 <= i3 && str.regionMatches(i11, "::", i7, 2)) {
                    if (i9 != i6) {
                        return null;
                    }
                    i8 += 2;
                    i9 = i8;
                    if (i12 != i3) {
                        i10 = i12;
                        i11 = i10;
                        int i13 = 0;
                        while (i11 < i3) {
                        }
                        i4 = i11 - i10;
                        if (i4 == 0) {
                            break;
                        }
                        break;
                    }
                    break;
                }
                if (i8 != 0) {
                    if (str.regionMatches(i11, ":", i7, 1)) {
                        i11++;
                    } else if (!str.regionMatches(i11, ".", i7, 1)) {
                        return null;
                    } else {
                        int i14 = i8 - 2;
                        int i15 = i14;
                        loop2: while (true) {
                            if (i10 < i3) {
                                if (i15 == i5) {
                                    break;
                                }
                                if (i15 != i14) {
                                    if (str.charAt(i10) != '.') {
                                        break;
                                    }
                                    i10++;
                                }
                                int i16 = i10;
                                int i17 = 0;
                                while (i16 < i3) {
                                    char charAt = str.charAt(i16);
                                    if (charAt < '0' || charAt > '9') {
                                        break;
                                    } else if ((i17 == 0 && i10 != i16) || (i17 = ((i17 * 10) + charAt) - 48) > 255) {
                                        break loop2;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (i16 - i10 == 0) {
                                    break;
                                }
                                bArr[i15] = (byte) i17;
                                i15++;
                                i10 = i16;
                                i5 = 16;
                            } else if (i15 == i14 + 4) {
                                z = true;
                            }
                        }
                        z = false;
                        if (!z) {
                            return null;
                        }
                        i8 += 2;
                    }
                }
                i10 = i11;
                i11 = i10;
                int i132 = 0;
                while (i11 < i3) {
                    int e2 = e(str.charAt(i11));
                    if (e2 == -1) {
                        break;
                    }
                    i132 = (i132 << 4) + e2;
                    i11++;
                }
                i4 = i11 - i10;
                if (i4 == 0 || i4 > 4) {
                    break;
                }
                int i18 = i8 + 1;
                bArr[i8] = (byte) ((i132 >>> 8) & 255);
                i8 = i18 + 1;
                bArr[i18] = (byte) (i132 & 255);
                i5 = 16;
                i6 = -1;
                i7 = 0;
            } else {
                break;
            }
        }
        return null;
    }

    public static int g(int i2, String str, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int h(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean i(mt0 mt0Var, TimeUnit timeUnit) {
        try {
            return r(mt0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String j(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String k(pv pvVar, boolean z) {
        String str;
        if (pvVar.d.contains(":")) {
            str = qq.d(e5.b("["), pvVar.d, "]");
        } else {
            str = pvVar.d;
        }
        if (z || pvVar.e != pv.d(pvVar.a)) {
            StringBuilder c2 = yg.c(str, ":");
            c2.append(pvVar.e);
            return c2.toString();
        }
        return str;
    }

    public static <T> List<T> l(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    public static <T> List<T> m(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static String[] n(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean o(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean p(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean q(pv pvVar, pv pvVar2) {
        if (pvVar.d.equals(pvVar2.d) && pvVar.e == pvVar2.e && pvVar.a.equals(pvVar2.a)) {
            return true;
        }
        return false;
    }

    public static boolean r(mt0 mt0Var, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = mt0Var.c().e() ? mt0Var.c().c() - nanoTime : Long.MAX_VALUE;
        mt0Var.c().d(Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            za zaVar = new za();
            while (mt0Var.q(zaVar, 8192L) != -1) {
                zaVar.a();
            }
            int i3 = (c2 > RecyclerView.FOREVER_NS ? 1 : (c2 == RecyclerView.FOREVER_NS ? 0 : -1));
            cx0 c3 = mt0Var.c();
            if (i3 == 0) {
                c3.a();
            } else {
                c3.d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i4 = (c2 > RecyclerView.FOREVER_NS ? 1 : (c2 == RecyclerView.FOREVER_NS ? 0 : -1));
            cx0 c4 = mt0Var.c();
            if (i4 == 0) {
                c4.a();
            } else {
                c4.d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            int i5 = (c2 > RecyclerView.FOREVER_NS ? 1 : (c2 == RecyclerView.FOREVER_NS ? 0 : -1));
            cx0 c5 = mt0Var.c();
            if (i5 == 0) {
                c5.a();
            } else {
                c5.d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int s(int i2, int i3, String str) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int t(int i2, int i3, String str) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static lu u(ArrayList arrayList) {
        lu.a aVar = new lu.a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hu huVar = (hu) it.next();
            nb0.a aVar2 = dy.a;
            String q = huVar.a.q();
            String q2 = huVar.b.q();
            aVar2.getClass();
            aVar.b(q, q2);
        }
        return new lu(aVar);
    }

    public static String v(int i2, int i3, String str) {
        int s = s(i2, i3, str);
        return str.substring(s, t(s, i3, str));
    }
}