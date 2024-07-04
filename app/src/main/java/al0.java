package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: al0  reason: default package */
public final class al0 {
    public final Method a;
    public final pv b;
    public final String c;
    @Nullable
    public final String d;
    @Nullable
    public final lu e;
    @Nullable
    public final e50 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final sd0<?>[] j;
    public final boolean k;

    /* renamed from: al0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        public final vl0 a;
        public final Method b;
        public final Annotation[] c;
        public final Annotation[][] d;
        public final Type[] e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        @Nullable
        public String n;
        public boolean o;
        public boolean p;
        public boolean q;
        @Nullable
        public String r;
        @Nullable
        public lu s;
        @Nullable
        public e50 t;
        @Nullable
        public LinkedHashSet u;
        @Nullable
        public sd0<?>[] v;
        public boolean w;

        public a(vl0 vl0Var, Method method) {
            this.a = vl0Var;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, boolean z, String str2) {
            String str3 = this.n;
            if (str3 == null) {
                this.n = str;
                this.o = z;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (x.matcher(substring).find()) {
                        throw d31.i(this.b, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.r = str2;
                Matcher matcher = x.matcher(str2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (matcher.find()) {
                    linkedHashSet.add(matcher.group(1));
                }
                this.u = linkedHashSet;
                return;
            }
            throw d31.i(this.b, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i, Type type) {
            if (d31.g(type)) {
                throw d31.j(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public al0(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
        this.k = aVar.w;
    }
}