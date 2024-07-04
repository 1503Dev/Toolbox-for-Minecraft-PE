package defpackage;

import defpackage.h10;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: o11  reason: default package */
public final class o11 {
    public static final u A;
    public static final t11 B;
    public static final w C;
    public static final q11 a = new q11(Class.class, new k11(new k()));
    public static final q11 b = new q11(BitSet.class, new k11(new v()));
    public static final y c;
    public static final r11 d;
    public static final r11 e;
    public static final r11 f;
    public static final r11 g;
    public static final q11 h;
    public static final q11 i;
    public static final q11 j;
    public static final b k;
    public static final q11 l;
    public static final r11 m;
    public static final h n;
    public static final i o;
    public static final q11 p;
    public static final q11 q;
    public static final q11 r;
    public static final q11 s;
    public static final q11 t;
    public static final t11 u;
    public static final q11 v;
    public static final q11 w;
    public static final r x;
    public static final s11 y;
    public static final q11 z;

    /* renamed from: o11$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends l11<AtomicIntegerArray> {
        @Override // defpackage.l11
        public final AtomicIntegerArray a(c00 c00Var) {
            ArrayList arrayList = new ArrayList();
            c00Var.a();
            while (c00Var.H()) {
                try {
                    arrayList.add(Integer.valueOf(c00Var.M()));
                } catch (NumberFormatException e) {
                    throw new e00(e);
                }
            }
            c00Var.y();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, AtomicIntegerArray atomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            i00Var.d();
            int length = atomicIntegerArray2.length();
            for (int i = 0; i < length; i++) {
                i00Var.L(atomicIntegerArray2.get(i));
            }
            i00Var.y();
        }
    }

    /* renamed from: o11$a0 */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a0 extends l11<Number> {
        @Override // defpackage.l11
        public final Number a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            try {
                return Short.valueOf((short) c00Var.M());
            } catch (NumberFormatException e) {
                throw new e00(e);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Number number) {
            i00Var.N(number);
        }
    }

    /* renamed from: o11$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends l11<Number> {
        @Override // defpackage.l11
        public final Number a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            try {
                return Long.valueOf(c00Var.N());
            } catch (NumberFormatException e) {
                throw new e00(e);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Number number) {
            i00Var.N(number);
        }
    }

    /* renamed from: o11$b0 */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b0 extends l11<Number> {
        @Override // defpackage.l11
        public final Number a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            try {
                return Integer.valueOf(c00Var.M());
            } catch (NumberFormatException e) {
                throw new e00(e);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Number number) {
            i00Var.N(number);
        }
    }

    /* renamed from: o11$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends l11<Number> {
        @Override // defpackage.l11
        public final Number a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            return Float.valueOf((float) c00Var.L());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Number number) {
            i00Var.N(number);
        }
    }

    /* renamed from: o11$c0 */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c0 extends l11<AtomicInteger> {
        @Override // defpackage.l11
        public final AtomicInteger a(c00 c00Var) {
            try {
                return new AtomicInteger(c00Var.M());
            } catch (NumberFormatException e) {
                throw new e00(e);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, AtomicInteger atomicInteger) {
            i00Var.L(atomicInteger.get());
        }
    }

    /* renamed from: o11$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends l11<Number> {
        @Override // defpackage.l11
        public final Number a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            return Double.valueOf(c00Var.L());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Number number) {
            i00Var.N(number);
        }
    }

    /* renamed from: o11$d0 */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d0 extends l11<AtomicBoolean> {
        @Override // defpackage.l11
        public final AtomicBoolean a(c00 c00Var) {
            return new AtomicBoolean(c00Var.K());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, AtomicBoolean atomicBoolean) {
            i00Var.P(atomicBoolean.get());
        }
    }

    /* renamed from: o11$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends l11<Number> {
        @Override // defpackage.l11
        public final Number a(c00 c00Var) {
            int U = c00Var.U();
            int b = cm0.b(U);
            if (b != 5 && b != 6) {
                if (b == 8) {
                    c00Var.Q();
                    return null;
                }
                StringBuilder b2 = e5.b("Expecting number, got: ");
                b2.append(ik.b(U));
                throw new e00(b2.toString());
            }
            return new v00(c00Var.S());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Number number) {
            i00Var.N(number);
        }
    }

    /* renamed from: o11$e0 */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class e0<T extends Enum<T>> extends l11<T> {
        public final HashMap a = new HashMap();
        public final HashMap b = new HashMap();

        public e0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    wq0 wq0Var = (wq0) cls.getField(name).getAnnotation(wq0.class);
                    if (wq0Var != null) {
                        name = wq0Var.value();
                        for (String str : wq0Var.alternate()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(name, t);
                    this.b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        @Override // defpackage.l11
        public final Object a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            return (Enum) this.a.get(c00Var.S());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Object obj) {
            Enum r3 = (Enum) obj;
            i00Var.O(r3 == null ? null : (String) this.b.get(r3));
        }
    }

    /* renamed from: o11$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f extends l11<Character> {
        @Override // defpackage.l11
        public final Character a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            String S = c00Var.S();
            if (S.length() == 1) {
                return Character.valueOf(S.charAt(0));
            }
            throw new e00(k6.b("Expecting character, got: ", S));
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Character ch) {
            Character ch2 = ch;
            i00Var.O(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* renamed from: o11$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g extends l11<String> {
        @Override // defpackage.l11
        public final String a(c00 c00Var) {
            int U = c00Var.U();
            if (U != 9) {
                return U == 8 ? Boolean.toString(c00Var.K()) : c00Var.S();
            }
            c00Var.Q();
            return null;
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, String str) {
            i00Var.O(str);
        }
    }

    /* renamed from: o11$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h extends l11<BigDecimal> {
        @Override // defpackage.l11
        public final BigDecimal a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            try {
                return new BigDecimal(c00Var.S());
            } catch (NumberFormatException e) {
                throw new e00(e);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, BigDecimal bigDecimal) {
            i00Var.N(bigDecimal);
        }
    }

    /* renamed from: o11$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class i extends l11<BigInteger> {
        @Override // defpackage.l11
        public final BigInteger a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            try {
                return new BigInteger(c00Var.S());
            } catch (NumberFormatException e) {
                throw new e00(e);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, BigInteger bigInteger) {
            i00Var.N(bigInteger);
        }
    }

    /* renamed from: o11$j */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class j extends l11<StringBuilder> {
        @Override // defpackage.l11
        public final StringBuilder a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            return new StringBuilder(c00Var.S());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, StringBuilder sb) {
            StringBuilder sb2 = sb;
            i00Var.O(sb2 == null ? null : sb2.toString());
        }
    }

    /* renamed from: o11$k */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class k extends l11<Class> {
        @Override // defpackage.l11
        public final Class a(c00 c00Var) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Class cls) {
            StringBuilder b = e5.b("Attempted to serialize java.lang.Class: ");
            b.append(cls.getName());
            b.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(b.toString());
        }
    }

    /* renamed from: o11$l */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class l extends l11<StringBuffer> {
        @Override // defpackage.l11
        public final StringBuffer a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            return new StringBuffer(c00Var.S());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, StringBuffer stringBuffer) {
            StringBuffer stringBuffer2 = stringBuffer;
            i00Var.O(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    /* renamed from: o11$m */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class m extends l11<URL> {
        @Override // defpackage.l11
        public final URL a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
            } else {
                String S = c00Var.S();
                if (!"null".equals(S)) {
                    return new URL(S);
                }
            }
            return null;
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, URL url) {
            URL url2 = url;
            i00Var.O(url2 == null ? null : url2.toExternalForm());
        }
    }

    /* renamed from: o11$n */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class n extends l11<URI> {
        @Override // defpackage.l11
        public final URI a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
            } else {
                try {
                    String S = c00Var.S();
                    if (!"null".equals(S)) {
                        return new URI(S);
                    }
                } catch (URISyntaxException e) {
                    throw new xz(e);
                }
            }
            return null;
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, URI uri) {
            URI uri2 = uri;
            i00Var.O(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* renamed from: o11$o */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class o extends l11<InetAddress> {
        @Override // defpackage.l11
        public final InetAddress a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            return InetAddress.getByName(c00Var.S());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, InetAddress inetAddress) {
            InetAddress inetAddress2 = inetAddress;
            i00Var.O(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    /* renamed from: o11$p */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class p extends l11<UUID> {
        @Override // defpackage.l11
        public final UUID a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            return UUID.fromString(c00Var.S());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, UUID uuid) {
            UUID uuid2 = uuid;
            i00Var.O(uuid2 == null ? null : uuid2.toString());
        }
    }

    /* renamed from: o11$q */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class q extends l11<Currency> {
        @Override // defpackage.l11
        public final Currency a(c00 c00Var) {
            return Currency.getInstance(c00Var.S());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Currency currency) {
            i00Var.O(currency.getCurrencyCode());
        }
    }

    /* renamed from: o11$r */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class r implements m11 {

        /* renamed from: o11$r$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a extends l11<Timestamp> {
            public final /* synthetic */ l11 a;

            public a(l11 l11Var) {
                this.a = l11Var;
            }

            @Override // defpackage.l11
            public final Timestamp a(c00 c00Var) {
                Date date = (Date) this.a.a(c00Var);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // defpackage.l11
            public final void b(i00 i00Var, Timestamp timestamp) {
                this.a.b(i00Var, timestamp);
            }
        }

        @Override // defpackage.m11
        public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
            if (u11Var.a != Timestamp.class) {
                return null;
            }
            xtVar.getClass();
            return new a(xtVar.f(new u11<>(Date.class)));
        }
    }

    /* renamed from: o11$s */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class s extends l11<Calendar> {
        @Override // defpackage.l11
        public final Calendar a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            c00Var.d();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (c00Var.U() != 4) {
                String O = c00Var.O();
                int M = c00Var.M();
                if ("year".equals(O)) {
                    i = M;
                } else if ("month".equals(O)) {
                    i2 = M;
                } else if ("dayOfMonth".equals(O)) {
                    i3 = M;
                } else if ("hourOfDay".equals(O)) {
                    i4 = M;
                } else if ("minute".equals(O)) {
                    i5 = M;
                } else if ("second".equals(O)) {
                    i6 = M;
                }
            }
            c00Var.E();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Calendar calendar) {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                i00Var.H();
                return;
            }
            i00Var.g();
            i00Var.F("year");
            i00Var.L(calendar2.get(1));
            i00Var.F("month");
            i00Var.L(calendar2.get(2));
            i00Var.F("dayOfMonth");
            i00Var.L(calendar2.get(5));
            i00Var.F("hourOfDay");
            i00Var.L(calendar2.get(11));
            i00Var.F("minute");
            i00Var.L(calendar2.get(12));
            i00Var.F("second");
            i00Var.L(calendar2.get(13));
            i00Var.E();
        }
    }

    /* renamed from: o11$t */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class t extends l11<Locale> {
        @Override // defpackage.l11
        public final Locale a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c00Var.S(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            return nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Locale locale) {
            Locale locale2 = locale;
            i00Var.O(locale2 == null ? null : locale2.toString());
        }
    }

    /* renamed from: o11$u */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class u extends l11<wz> {
        public static wz c(c00 c00Var) {
            int b = cm0.b(c00Var.U());
            if (b != 0) {
                if (b != 2) {
                    if (b != 5) {
                        if (b != 6) {
                            if (b != 7) {
                                if (b == 8) {
                                    c00Var.Q();
                                    return yz.P;
                                }
                                throw new IllegalArgumentException();
                            }
                            return new b00(Boolean.valueOf(c00Var.K()));
                        }
                        return new b00(new v00(c00Var.S()));
                    }
                    return new b00(c00Var.S());
                }
                zz zzVar = new zz();
                c00Var.d();
                while (c00Var.H()) {
                    String O = c00Var.O();
                    wz c = c(c00Var);
                    h10<String, wz> h10Var = zzVar.P;
                    if (c == null) {
                        c = yz.P;
                    }
                    h10Var.put(O, c);
                }
                c00Var.E();
                return zzVar;
            }
            qz qzVar = new qz();
            c00Var.a();
            while (c00Var.H()) {
                Object c2 = c(c00Var);
                if (c2 == null) {
                    c2 = yz.P;
                }
                qzVar.P.add(c2);
            }
            c00Var.y();
            return qzVar;
        }

        public static void d(wz wzVar, i00 i00Var) {
            boolean z;
            if (wzVar != null && !(wzVar instanceof yz)) {
                if (wzVar instanceof b00) {
                    b00 p = wzVar.p();
                    Serializable serializable = p.P;
                    if (serializable instanceof Number) {
                        i00Var.N(p.r());
                    } else if (serializable instanceof Boolean) {
                        i00Var.P(p.g());
                    } else {
                        i00Var.O(p.q());
                    }
                } else if (wzVar instanceof qz) {
                    i00Var.d();
                    Iterator<wz> it = wzVar.n().iterator();
                    while (it.hasNext()) {
                        d(it.next(), i00Var);
                    }
                    i00Var.y();
                } else if (wzVar instanceof zz) {
                    i00Var.g();
                    h10 h10Var = h10.this;
                    h10.e eVar = h10Var.T.S;
                    int i = h10Var.S;
                    while (true) {
                        h10.e eVar2 = h10Var.T;
                        if (eVar != eVar2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (eVar != eVar2) {
                                if (h10Var.S == i) {
                                    h10.e eVar3 = eVar.S;
                                    i00Var.F((String) eVar.U);
                                    d((wz) eVar.V, i00Var);
                                    eVar = eVar3;
                                } else {
                                    throw new ConcurrentModificationException();
                                }
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            i00Var.E();
                            return;
                        }
                    }
                } else {
                    StringBuilder b = e5.b("Couldn't write ");
                    b.append(wzVar.getClass());
                    throw new IllegalArgumentException(b.toString());
                }
            } else {
                i00Var.H();
            }
        }

        @Override // defpackage.l11
        public final /* bridge */ /* synthetic */ wz a(c00 c00Var) {
            return c(c00Var);
        }

        @Override // defpackage.l11
        public final /* bridge */ /* synthetic */ void b(i00 i00Var, wz wzVar) {
            d(wzVar, i00Var);
        }
    }

    /* renamed from: o11$v */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class v extends l11<BitSet> {
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
            if (r7.M() != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
            r1 = r5;
         */
        @Override // defpackage.l11
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final BitSet a(c00 c00Var) {
            boolean z;
            BitSet bitSet = new BitSet();
            c00Var.a();
            int U = c00Var.U();
            int i = 0;
            while (U != 2) {
                int b = cm0.b(U);
                boolean z2 = true;
                if (b != 5) {
                    if (b != 6) {
                        if (b == 7) {
                            z = c00Var.K();
                        } else {
                            StringBuilder b2 = e5.b("Invalid bitset value type: ");
                            b2.append(ik.b(U));
                            throw new e00(b2.toString());
                        }
                    }
                } else {
                    String S = c00Var.S();
                    try {
                    } catch (NumberFormatException unused) {
                        throw new e00(k6.b("Error: Expecting: bitset number value (1, 0), Found: ", S));
                    }
                }
                if (z) {
                    bitSet.set(i);
                }
                i++;
                U = c00Var.U();
            }
            c00Var.y();
            return bitSet;
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            i00Var.d();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                i00Var.L(bitSet2.get(i) ? 1L : 0L);
            }
            i00Var.y();
        }
    }

    /* renamed from: o11$w */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class w implements m11 {
        @Override // defpackage.m11
        public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
            Class<? super T> cls = u11Var.a;
            if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new e0(cls);
            }
            return null;
        }
    }

    /* renamed from: o11$x */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class x extends l11<Boolean> {
        @Override // defpackage.l11
        public final Boolean a(c00 c00Var) {
            int U = c00Var.U();
            if (U != 9) {
                return Boolean.valueOf(U == 6 ? Boolean.parseBoolean(c00Var.S()) : c00Var.K());
            }
            c00Var.Q();
            return null;
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Boolean bool) {
            i00Var.M(bool);
        }
    }

    /* renamed from: o11$y */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class y extends l11<Boolean> {
        @Override // defpackage.l11
        public final Boolean a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            return Boolean.valueOf(c00Var.S());
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Boolean bool) {
            Boolean bool2 = bool;
            i00Var.O(bool2 == null ? "null" : bool2.toString());
        }
    }

    /* renamed from: o11$z */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class z extends l11<Number> {
        @Override // defpackage.l11
        public final Number a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            try {
                return Byte.valueOf((byte) c00Var.M());
            } catch (NumberFormatException e) {
                throw new e00(e);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Number number) {
            i00Var.N(number);
        }
    }

    static {
        x xVar = new x();
        c = new y();
        d = new r11(Boolean.TYPE, Boolean.class, xVar);
        e = new r11(Byte.TYPE, Byte.class, new z());
        f = new r11(Short.TYPE, Short.class, new a0());
        g = new r11(Integer.TYPE, Integer.class, new b0());
        h = new q11(AtomicInteger.class, new k11(new c0()));
        i = new q11(AtomicBoolean.class, new k11(new d0()));
        j = new q11(AtomicIntegerArray.class, new k11(new a()));
        k = new b();
        new c();
        new d();
        l = new q11(Number.class, new e());
        m = new r11(Character.TYPE, Character.class, new f());
        g gVar = new g();
        n = new h();
        o = new i();
        p = new q11(String.class, gVar);
        q = new q11(StringBuilder.class, new j());
        r = new q11(StringBuffer.class, new l());
        s = new q11(URL.class, new m());
        t = new q11(URI.class, new n());
        u = new t11(InetAddress.class, new o());
        v = new q11(UUID.class, new p());
        w = new q11(Currency.class, new k11(new q()));
        x = new r();
        y = new s11(Calendar.class, GregorianCalendar.class, new s());
        z = new q11(Locale.class, new t());
        u uVar = new u();
        A = uVar;
        B = new t11(wz.class, uVar);
        C = new w();
    }
}