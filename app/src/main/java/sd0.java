package defpackage;

import defpackage.db;
import defpackage.lu;
import defpackage.u60;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* renamed from: sd0  reason: default package */
public abstract class sd0<T> {

    /* renamed from: sd0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a<T> extends sd0<T> {
        public final Method a;
        public final int b;
        public final pg<T, vk0> c;

        public a(Method method, int i, pg<T, vk0> pgVar) {
            this.a = method;
            this.b = i;
            this.c = pgVar;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable T t) {
            if (t != null) {
                try {
                    wk0Var.k = this.c.b(t);
                    return;
                } catch (IOException e) {
                    Method method = this.a;
                    int i = this.b;
                    throw d31.k(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            }
            throw d31.j(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* renamed from: sd0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b<T> extends sd0<T> {
        public final String a;
        public final pg<T, String> b;
        public final boolean c;

        public b(String str, boolean z) {
            db.d dVar = db.d.P;
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = dVar;
            this.c = z;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable T t) {
            String b;
            if (t == null || (b = this.b.b(t)) == null) {
                return;
            }
            wk0Var.a(this.a, this.c, b);
        }
    }

    /* renamed from: sd0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c<T> extends sd0<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public c(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                wk0Var.a(str, this.c, obj2);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw d31.j(method, i, "Field map value '" + value + "' converted to null by " + db.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw d31.j(this.a, this.b, ij.c("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw d31.j(this.a, this.b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw d31.j(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: sd0$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class d<T> extends sd0<T> {
        public final String a;
        public final pg<T, String> b;

        public d(String str) {
            db.d dVar = db.d.P;
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = dVar;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable T t) {
            String b;
            if (t == null || (b = this.b.b(t)) == null) {
                return;
            }
            wk0Var.b(this.a, b);
        }
    }

    /* renamed from: sd0$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class e<T> extends sd0<Map<String, T>> {
        public final Method a;
        public final int b;

        public e(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            wk0Var.b(str, value.toString());
                        } else {
                            throw d31.j(this.a, this.b, ij.c("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw d31.j(this.a, this.b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw d31.j(this.a, this.b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: sd0$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class f extends sd0<lu> {
        public final Method a;
        public final int b;

        public f(int i, Method method) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable lu luVar) {
            lu luVar2 = luVar;
            if (luVar2 != null) {
                lu.a aVar = wk0Var.f;
                aVar.getClass();
                int length = luVar2.a.length / 2;
                for (int i = 0; i < length; i++) {
                    aVar.b(luVar2.d(i), luVar2.g(i));
                }
                return;
            }
            throw d31.j(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: sd0$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class g<T> extends sd0<T> {
        public final Method a;
        public final int b;
        public final lu c;
        public final pg<T, vk0> d;

        public g(Method method, int i, lu luVar, pg<T, vk0> pgVar) {
            this.a = method;
            this.b = i;
            this.c = luVar;
            this.d = pgVar;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                wk0Var.c(this.c, this.d.b(t));
            } catch (IOException e) {
                Method method = this.a;
                int i = this.b;
                throw d31.j(method, i, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* renamed from: sd0$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class h<T> extends sd0<Map<String, T>> {
        public final Method a;
        public final int b;
        public final pg<T, vk0> c;
        public final String d;

        public h(Method method, int i, pg<T, vk0> pgVar, String str) {
            this.a = method;
            this.b = i;
            this.c = pgVar;
            this.d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            wk0Var.c(lu.f("Content-Disposition", ij.c("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d), (vk0) this.c.b(value));
                        } else {
                            throw d31.j(this.a, this.b, ij.c("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw d31.j(this.a, this.b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw d31.j(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: sd0$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class i<T> extends sd0<T> {
        public final Method a;
        public final int b;
        public final String c;
        public final pg<T, String> d;
        public final boolean e;

        public i(Method method, int i, String str, boolean z) {
            db.d dVar = db.d.P;
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = dVar;
            this.e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
        @Override // defpackage.sd0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(wk0 wk0Var, @Nullable T t) {
            String str;
            String replace;
            if (t != null) {
                String str2 = this.c;
                String b = this.d.b(t);
                boolean z = this.e;
                if (wk0Var.c != null) {
                    int length = b.length();
                    int i = 0;
                    while (i < length) {
                        int codePointAt = b.codePointAt(i);
                        int i2 = -1;
                        int i3 = 127;
                        if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                            i += Character.charCount(codePointAt);
                        } else {
                            za zaVar = new za();
                            zaVar.X(0, i, b);
                            za zaVar2 = null;
                            while (i < length) {
                                int codePointAt2 = b.codePointAt(i);
                                if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                                    if (codePointAt2 >= 32 && codePointAt2 < i3 && " \"<>^`{}|\\?#".indexOf(codePointAt2) == i2 && (z || (codePointAt2 != 47 && codePointAt2 != 37))) {
                                        zaVar.Y(codePointAt2);
                                    } else {
                                        if (zaVar2 == null) {
                                            zaVar2 = new za();
                                        }
                                        zaVar2.Y(codePointAt2);
                                        while (!zaVar2.n()) {
                                            int readByte = zaVar2.readByte() & 255;
                                            zaVar.S(37);
                                            char[] cArr = wk0.l;
                                            zaVar.S(cArr[(readByte >> 4) & 15]);
                                            zaVar.S(cArr[readByte & 15]);
                                        }
                                    }
                                }
                                i += Character.charCount(codePointAt2);
                                i2 = -1;
                                i3 = 127;
                            }
                            str = zaVar.M();
                            String str3 = wk0Var.c;
                            replace = str3.replace("{" + str2 + "}", str);
                            if (wk0.m.matcher(replace).matches()) {
                                wk0Var.c = replace;
                                return;
                            }
                            throw new IllegalArgumentException(k6.b("@Path parameters shouldn't perform path traversal ('.' or '..'): ", b));
                        }
                    }
                    str = b;
                    String str32 = wk0Var.c;
                    replace = str32.replace("{" + str2 + "}", str);
                    if (wk0.m.matcher(replace).matches()) {
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                throw d31.j(this.a, this.b, qq.d(e5.b("Path parameter \""), this.c, "\" value must not be null."), new Object[0]);
            }
        }
    }

    /* renamed from: sd0$j */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class j<T> extends sd0<T> {
        public final String a;
        public final pg<T, String> b;
        public final boolean c;

        public j(String str, boolean z) {
            db.d dVar = db.d.P;
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = dVar;
            this.c = z;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable T t) {
            String b;
            if (t == null || (b = this.b.b(t)) == null) {
                return;
            }
            wk0Var.d(this.a, this.c, b);
        }
    }

    /* renamed from: sd0$k */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class k<T> extends sd0<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public k(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                wk0Var.d(str, this.c, obj2);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw d31.j(method, i, "Query map value '" + value + "' converted to null by " + db.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw d31.j(this.a, this.b, ij.c("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw d31.j(this.a, this.b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw d31.j(this.a, this.b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: sd0$l */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class l<T> extends sd0<T> {
        public final boolean a;

        public l(boolean z) {
            this.a = z;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable T t) {
            if (t == null) {
                return;
            }
            wk0Var.d(t.toString(), this.a, null);
        }
    }

    /* renamed from: sd0$m */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class m extends sd0<u60.b> {
        public static final m a = new m();

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable u60.b bVar) {
            u60.b bVar2 = bVar;
            if (bVar2 != null) {
                wk0Var.i.c.add(bVar2);
            }
        }
    }

    /* renamed from: sd0$n */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class n extends sd0<Object> {
        public final Method a;
        public final int b;

        public n(int i, Method method) {
            this.a = method;
            this.b = i;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable Object obj) {
            if (obj != null) {
                wk0Var.c = obj.toString();
                return;
            }
            throw d31.j(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: sd0$o */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class o<T> extends sd0<T> {
        public final Class<T> a;

        public o(Class<T> cls) {
            this.a = cls;
        }

        @Override // defpackage.sd0
        public final void a(wk0 wk0Var, @Nullable T t) {
            wk0Var.e.d(this.a, t);
        }
    }

    public abstract void a(wk0 wk0Var, @Nullable T t);
}