package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: pv  reason: default package */
public final class pv {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List<String> f;
    @Nullable
    public final List<String> g;
    @Nullable
    public final String h;
    public final String i;

    /* renamed from: pv$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        @Nullable
        public String a;
        @Nullable
        public String d;
        public final ArrayList f;
        @Nullable
        public ArrayList g;
        @Nullable
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final pv a() {
            if (this.a != null) {
                if (this.d != null) {
                    return new pv(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:117:0x021c
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public final void b(@javax.annotation.Nullable defpackage.pv r23, java.lang.String r24) {
            /*
                Method dump skipped, instructions count: 1001
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pv.a.b(pv, java.lang.String):void");
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str3 = this.d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int i = this.e;
            if (i != -1 || this.a != null) {
                if (i == -1) {
                    i = pv.d(this.a);
                }
                String str4 = this.a;
                if (str4 == null || i != pv.d(str4)) {
                    sb.append(':');
                    sb.append(i);
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append('/');
                sb.append((String) arrayList.get(i2));
            }
            if (this.g != null) {
                sb.append('?');
                pv.j(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    public pv(a aVar) {
        List<String> list;
        this.a = aVar.a;
        String str = aVar.b;
        this.b = k(0, str.length(), str, false);
        String str2 = aVar.c;
        this.c = k(0, str2.length(), str2, false);
        this.d = aVar.d;
        int i = aVar.e;
        this.e = i == -1 ? d(aVar.a) : i;
        this.f = l(aVar.f, false);
        ArrayList arrayList = aVar.g;
        if (arrayList != null) {
            list = l(arrayList, true);
        } else {
            list = null;
        }
        this.g = list;
        String str3 = aVar.h;
        this.h = str3 != null ? k(0, str3.length(), str3, false) : null;
        this.i = aVar.toString();
    }

    public static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m(i3, i2, str)))) && (codePointAt != 43 || !z3)))) {
                i3 += Character.charCount(codePointAt);
            } else {
                za zaVar = new za();
                zaVar.X(i, i3, str);
                za zaVar2 = null;
                while (i3 < i2) {
                    int codePointAt2 = str.codePointAt(i3);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            if (z) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            zaVar.X(0, str3.length(), str3);
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < 128 || !z4) && str2.indexOf(codePointAt2) == -1 && (codePointAt2 != 37 || (z && (!z2 || m(i3, i2, str)))))) {
                            zaVar.Y(codePointAt2);
                        } else {
                            if (zaVar2 == null) {
                                zaVar2 = new za();
                            }
                            zaVar2.Y(codePointAt2);
                            while (!zaVar2.n()) {
                                int readByte = zaVar2.readByte() & 255;
                                zaVar.S(37);
                                char[] cArr = j;
                                zaVar.S(cArr[(readByte >> 4) & 15]);
                                zaVar.S(cArr[readByte & 15]);
                            }
                        }
                    }
                    i3 += Character.charCount(codePointAt2);
                }
                return zaVar.M();
            }
        }
        return str.substring(i, i2);
    }

    public static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4);
    }

    public static String c(String str, boolean z) {
        return a(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", z, false, true, true);
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void j(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static String k(int i, int i2, String str, boolean z) {
        int i3;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt != '%' && (charAt != '+' || !z)) {
                i4++;
            } else {
                za zaVar = new za();
                zaVar.X(i, i4, str);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37 && (i3 = i4 + 2) < i2) {
                        int e = c31.e(str.charAt(i4 + 1));
                        int e2 = c31.e(str.charAt(i3));
                        if (e != -1 && e2 != -1) {
                            zaVar.S((e << 4) + e2);
                            i4 = i3;
                        }
                        zaVar.Y(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            zaVar.S(32);
                        }
                        zaVar.Y(codePointAt);
                    }
                    i4 += Character.charCount(codePointAt);
                }
                return zaVar.M();
            }
        }
        return str.substring(i, i2);
    }

    public static List l(List list, boolean z) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str2 = (String) list.get(i);
            if (str2 != null) {
                str = k(0, str2.length(), str2, z);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean m(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && c31.e(str.charAt(i + 1)) != -1 && c31.e(str.charAt(i3)) != -1;
    }

    public static ArrayList n(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    public final String e() {
        if (this.c.isEmpty()) {
            return "";
        }
        int indexOf = this.i.indexOf(64);
        return this.i.substring(this.i.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof pv) && ((pv) obj).i.equals(this.i);
    }

    public final String f() {
        int indexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        return this.i.substring(indexOf, c31.g(indexOf, str, str.length(), "?#"));
    }

    public final ArrayList g() {
        int indexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        int g = c31.g(indexOf, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < g) {
            int i = indexOf + 1;
            int h = c31.h(this.i, i, g, '/');
            arrayList.add(this.i.substring(i, h));
            indexOf = h;
        }
        return arrayList;
    }

    @Nullable
    public final String h() {
        if (this.g == null) {
            return null;
        }
        int indexOf = this.i.indexOf(63) + 1;
        String str = this.i;
        return this.i.substring(indexOf, c31.h(str, indexOf, str.length(), '#'));
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return this.i.substring(length, c31.g(length, str, str.length(), ":@"));
    }

    public final String o() {
        a aVar;
        try {
            aVar = new a();
            aVar.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        aVar.getClass();
        aVar.b = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        aVar.c = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return aVar.a().i;
    }

    public final URI p() {
        int i;
        ArrayList arrayList;
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = i();
        aVar.c = e();
        aVar.d = this.d;
        if (this.e != d(this.a)) {
            i = this.e;
        } else {
            i = -1;
        }
        aVar.e = i;
        aVar.f.clear();
        aVar.f.addAll(g());
        String h = h();
        String str = null;
        if (h != null) {
            arrayList = n(b(h, " \"'<>#", true, false, true, true));
        } else {
            arrayList = null;
        }
        aVar.g = arrayList;
        if (this.h != null) {
            str = this.i.substring(this.i.indexOf(35) + 1);
        }
        aVar.h = str;
        int size = aVar.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            aVar.f.set(i2, b((String) aVar.f.get(i2), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = aVar.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str2 = (String) aVar.g.get(i3);
                if (str2 != null) {
                    aVar.g.set(i3, b(str2, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str3 = aVar.h;
        if (str3 != null) {
            aVar.h = b(str3, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}