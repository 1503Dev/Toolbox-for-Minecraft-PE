package defpackage;

import defpackage.al0;
import defpackage.d31;
import defpackage.lu;
import defpackage.ob;
import defpackage.ov;
import defpackage.sd0;
import defpackage.u60;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: xq0  reason: default package */
public abstract class xq0<T> {
    public static ov b(vl0 vl0Var, Method method) {
        Type genericReturnType;
        boolean z;
        Type[] genericParameterTypes;
        boolean z2;
        int i;
        int i2;
        sd0<?>[] sd0VarArr;
        String str;
        String str2;
        sd0<?>[] sd0VarArr2;
        sd0<?> sd0Var;
        sd0<?> rd0Var;
        sd0<?> sd0Var2;
        String str3;
        String value;
        String str4;
        String value2;
        String str5;
        String value3;
        al0.a aVar = new al0.a(vl0Var, method);
        Annotation[] annotationArr = aVar.c;
        int length = annotationArr.length;
        int i3 = 0;
        loop0: while (true) {
            String str6 = "HEAD";
            sd0<?> sd0Var3 = null;
            if (i3 < length) {
                Annotation annotation = annotationArr[i3];
                if (annotation instanceof wh) {
                    value = ((wh) annotation).value();
                    str4 = "DELETE";
                } else if (annotation instanceof qs) {
                    value = ((qs) annotation).value();
                    str4 = "GET";
                } else if (annotation instanceof cu) {
                    value3 = ((cu) annotation).value();
                    aVar.b(str6, false, value3);
                    i3++;
                } else {
                    if (annotation instanceof ed0) {
                        value2 = ((ed0) annotation).value();
                        str5 = "PATCH";
                    } else if (annotation instanceof gd0) {
                        value2 = ((gd0) annotation).value();
                        str5 = "POST";
                    } else if (annotation instanceof id0) {
                        value2 = ((id0) annotation).value();
                        str5 = "PUT";
                    } else if (annotation instanceof pa0) {
                        value = ((pa0) annotation).value();
                        str4 = "OPTIONS";
                    } else {
                        if (annotation instanceof du) {
                            du duVar = (du) annotation;
                            aVar.b(duVar.method(), duVar.hasBody(), duVar.path());
                        } else if (annotation instanceof mu) {
                            String[] value4 = ((mu) annotation).value();
                            if (value4.length != 0) {
                                lu.a aVar2 = new lu.a();
                                int length2 = value4.length;
                                for (int i4 = 0; i4 < length2; i4++) {
                                    str3 = value4[i4];
                                    int indexOf = str3.indexOf(58);
                                    if (indexOf == -1 || indexOf == 0 || indexOf == str3.length() - 1) {
                                        break loop0;
                                    }
                                    String substring = str3.substring(0, indexOf);
                                    String trim = str3.substring(indexOf + 1).trim();
                                    if ("Content-Type".equalsIgnoreCase(substring)) {
                                        try {
                                            aVar.t = e50.a(trim);
                                        } catch (IllegalArgumentException e) {
                                            throw d31.i(aVar.b, e, "Malformed content type: %s", trim);
                                        }
                                    } else {
                                        aVar2.a(substring, trim);
                                    }
                                }
                                aVar.s = new lu(aVar2);
                            } else {
                                throw d31.i(aVar.b, null, "@Headers annotation is empty.", new Object[0]);
                            }
                        } else if (annotation instanceof t60) {
                            if (!aVar.p) {
                                aVar.q = true;
                            } else {
                                throw d31.i(aVar.b, null, "Only one encoding annotation is allowed.", new Object[0]);
                            }
                        } else if (!(annotation instanceof gr)) {
                            continue;
                        } else if (!aVar.q) {
                            aVar.p = true;
                        } else {
                            throw d31.i(aVar.b, null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        i3++;
                    }
                    aVar.b(str5, true, value2);
                    i3++;
                }
                String str7 = str4;
                value3 = value;
                str6 = str7;
                aVar.b(str6, false, value3);
                i3++;
            } else if (aVar.n != null) {
                if (!aVar.o) {
                    if (!aVar.q) {
                        if (aVar.p) {
                            throw d31.i(aVar.b, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw d31.i(aVar.b, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length3 = aVar.d.length;
                aVar.v = new sd0[length3];
                int i5 = length3 - 1;
                int i6 = 0;
                while (i6 < length3) {
                    sd0<?>[] sd0VarArr3 = aVar.v;
                    Type type = aVar.e[i6];
                    Annotation[] annotationArr2 = aVar.d[i6];
                    if (i6 == i5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (annotationArr2 != null) {
                        int length4 = annotationArr2.length;
                        int i7 = 0;
                        while (i7 < length4) {
                            Annotation annotation2 = annotationArr2[i7];
                            int i8 = length3;
                            int i9 = i5;
                            int i10 = length4;
                            if (annotation2 instanceof v21) {
                                aVar.c(i6, type);
                                if (!aVar.m) {
                                    if (!aVar.i) {
                                        if (!aVar.j) {
                                            if (!aVar.k) {
                                                if (!aVar.l) {
                                                    if (aVar.r == null) {
                                                        aVar.m = true;
                                                        if (type != pv.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                                            throw d31.j(aVar.b, i6, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                                        }
                                                        sd0Var = new sd0.n(i6, aVar.b);
                                                        sd0VarArr2 = sd0VarArr3;
                                                        str2 = str6;
                                                    } else {
                                                        throw d31.j(aVar.b, i6, "@Url cannot be used with @%s URL", aVar.n);
                                                    }
                                                } else {
                                                    throw d31.j(aVar.b, i6, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                                }
                                            } else {
                                                throw d31.j(aVar.b, i6, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                            }
                                        } else {
                                            throw d31.j(aVar.b, i6, "A @Url parameter must not come after a @Query.", new Object[0]);
                                        }
                                    } else {
                                        throw d31.j(aVar.b, i6, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                } else {
                                    throw d31.j(aVar.b, i6, "Multiple @Url method annotations found.", new Object[0]);
                                }
                            } else {
                                if (annotation2 instanceof be0) {
                                    aVar.c(i6, type);
                                    if (!aVar.j) {
                                        if (!aVar.k) {
                                            if (!aVar.l) {
                                                if (!aVar.m) {
                                                    if (aVar.r != null) {
                                                        aVar.i = true;
                                                        be0 be0Var = (be0) annotation2;
                                                        String value5 = be0Var.value();
                                                        if (al0.a.y.matcher(value5).matches()) {
                                                            if (aVar.u.contains(value5)) {
                                                                aVar.a.f(type, annotationArr2);
                                                                sd0Var2 = new sd0.i<>(aVar.b, i6, value5, be0Var.encoded());
                                                            } else {
                                                                throw d31.j(aVar.b, i6, "URL \"%s\" does not contain \"{%s}\".", aVar.r, value5);
                                                            }
                                                        } else {
                                                            throw d31.j(aVar.b, i6, "@Path parameter name must match %s. Found: %s", al0.a.x.pattern(), value5);
                                                        }
                                                    } else {
                                                        throw d31.j(aVar.b, i6, "@Path can only be used with relative url on @%s", aVar.n);
                                                    }
                                                } else {
                                                    throw d31.j(aVar.b, i6, "@Path parameters may not be used with @Url.", new Object[0]);
                                                }
                                            } else {
                                                throw d31.j(aVar.b, i6, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                            }
                                        } else {
                                            throw d31.j(aVar.b, i6, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                        }
                                    } else {
                                        throw d31.j(aVar.b, i6, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                } else if (annotation2 instanceof wg0) {
                                    aVar.c(i6, type);
                                    wg0 wg0Var = (wg0) annotation2;
                                    String value6 = wg0Var.value();
                                    boolean encoded = wg0Var.encoded();
                                    Class<?> e2 = d31.e(type);
                                    aVar.j = true;
                                    if (Iterable.class.isAssignableFrom(e2)) {
                                        if (type instanceof ParameterizedType) {
                                            aVar.a.f(d31.d(0, (ParameterizedType) type), annotationArr2);
                                            sd0Var2 = new qd0(new sd0.j(value6, encoded));
                                        } else {
                                            throw d31.j(aVar.b, i6, e2.getSimpleName() + " must include generic type (e.g., " + e2.getSimpleName() + "<String>)", new Object[0]);
                                        }
                                    } else if (e2.isArray()) {
                                        aVar.a.f(al0.a.a(e2.getComponentType()), annotationArr2);
                                        sd0Var2 = new rd0(new sd0.j(value6, encoded));
                                    } else {
                                        aVar.a.f(type, annotationArr2);
                                        sd0Var2 = new sd0.j(value6, encoded);
                                    }
                                } else {
                                    if (annotation2 instanceof zg0) {
                                        aVar.c(i6, type);
                                        boolean encoded2 = ((zg0) annotation2).encoded();
                                        Class<?> e3 = d31.e(type);
                                        aVar.k = true;
                                        if (Iterable.class.isAssignableFrom(e3)) {
                                            if (type instanceof ParameterizedType) {
                                                aVar.a.f(d31.d(0, (ParameterizedType) type), annotationArr2);
                                                sd0Var2 = new qd0(new sd0.l(encoded2));
                                            } else {
                                                throw d31.j(aVar.b, i6, e3.getSimpleName() + " must include generic type (e.g., " + e3.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                        } else if (e3.isArray()) {
                                            aVar.a.f(al0.a.a(e3.getComponentType()), annotationArr2);
                                            sd0Var2 = new rd0(new sd0.l(encoded2));
                                        } else {
                                            aVar.a.f(type, annotationArr2);
                                            sd0Var = new sd0.l<>(encoded2);
                                            str2 = str6;
                                        }
                                    } else {
                                        str2 = str6;
                                        if (annotation2 instanceof yg0) {
                                            aVar.c(i6, type);
                                            Class<?> e4 = d31.e(type);
                                            aVar.l = true;
                                            if (Map.class.isAssignableFrom(e4)) {
                                                Type f = d31.f(type, e4, Map.class);
                                                if (f instanceof ParameterizedType) {
                                                    ParameterizedType parameterizedType = (ParameterizedType) f;
                                                    Type d = d31.d(0, parameterizedType);
                                                    if (String.class == d) {
                                                        aVar.a.f(d31.d(1, parameterizedType), annotationArr2);
                                                        sd0Var2 = new sd0.k<>(aVar.b, i6, ((yg0) annotation2).encoded());
                                                    } else {
                                                        throw d31.j(aVar.b, i6, "@QueryMap keys must be of type String: " + d, new Object[0]);
                                                    }
                                                } else {
                                                    throw d31.j(aVar.b, i6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                            } else {
                                                throw d31.j(aVar.b, i6, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                        } else if (annotation2 instanceof gu) {
                                            aVar.c(i6, type);
                                            String value7 = ((gu) annotation2).value();
                                            Class<?> e5 = d31.e(type);
                                            if (Iterable.class.isAssignableFrom(e5)) {
                                                if (type instanceof ParameterizedType) {
                                                    aVar.a.f(d31.d(0, (ParameterizedType) type), annotationArr2);
                                                    sd0Var2 = new qd0(new sd0.d(value7));
                                                } else {
                                                    throw d31.j(aVar.b, i6, e5.getSimpleName() + " must include generic type (e.g., " + e5.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                            } else if (e5.isArray()) {
                                                aVar.a.f(al0.a.a(e5.getComponentType()), annotationArr2);
                                                sd0Var2 = new rd0(new sd0.d(value7));
                                            } else {
                                                aVar.a.f(type, annotationArr2);
                                                sd0Var = new sd0.d<>(value7);
                                            }
                                        } else if (annotation2 instanceof ju) {
                                            if (type == lu.class) {
                                                sd0Var2 = new sd0.f(i6, aVar.b);
                                            } else {
                                                aVar.c(i6, type);
                                                Class<?> e6 = d31.e(type);
                                                if (Map.class.isAssignableFrom(e6)) {
                                                    Type f2 = d31.f(type, e6, Map.class);
                                                    if (f2 instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType2 = (ParameterizedType) f2;
                                                        Type d2 = d31.d(0, parameterizedType2);
                                                        if (String.class == d2) {
                                                            aVar.a.f(d31.d(1, parameterizedType2), annotationArr2);
                                                            sd0Var2 = new sd0.e<>(aVar.b, i6);
                                                        } else {
                                                            throw d31.j(aVar.b, i6, "@HeaderMap keys must be of type String: " + d2, new Object[0]);
                                                        }
                                                    } else {
                                                        throw d31.j(aVar.b, i6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw d31.j(aVar.b, i6, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                }
                                            }
                                        } else if (annotation2 instanceof xp) {
                                            aVar.c(i6, type);
                                            if (aVar.p) {
                                                xp xpVar = (xp) annotation2;
                                                String value8 = xpVar.value();
                                                boolean encoded3 = xpVar.encoded();
                                                aVar.f = true;
                                                Class<?> e7 = d31.e(type);
                                                if (Iterable.class.isAssignableFrom(e7)) {
                                                    if (type instanceof ParameterizedType) {
                                                        aVar.a.f(d31.d(0, (ParameterizedType) type), annotationArr2);
                                                        sd0Var2 = new qd0(new sd0.b(value8, encoded3));
                                                    } else {
                                                        throw d31.j(aVar.b, i6, e7.getSimpleName() + " must include generic type (e.g., " + e7.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                } else if (e7.isArray()) {
                                                    aVar.a.f(al0.a.a(e7.getComponentType()), annotationArr2);
                                                    sd0Var2 = new rd0(new sd0.b(value8, encoded3));
                                                } else {
                                                    aVar.a.f(type, annotationArr2);
                                                    sd0Var2 = new sd0.b(value8, encoded3);
                                                }
                                            } else {
                                                throw d31.j(aVar.b, i6, "@Field parameters can only be used with form encoding.", new Object[0]);
                                            }
                                        } else if (annotation2 instanceof yp) {
                                            aVar.c(i6, type);
                                            if (aVar.p) {
                                                Class<?> e8 = d31.e(type);
                                                if (Map.class.isAssignableFrom(e8)) {
                                                    Type f3 = d31.f(type, e8, Map.class);
                                                    if (f3 instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType3 = (ParameterizedType) f3;
                                                        Type d3 = d31.d(0, parameterizedType3);
                                                        if (String.class == d3) {
                                                            aVar.a.f(d31.d(1, parameterizedType3), annotationArr2);
                                                            aVar.f = true;
                                                            sd0Var2 = new sd0.c<>(aVar.b, i6, ((yp) annotation2).encoded());
                                                        } else {
                                                            throw d31.j(aVar.b, i6, "@FieldMap keys must be of type String: " + d3, new Object[0]);
                                                        }
                                                    } else {
                                                        throw d31.j(aVar.b, i6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw d31.j(aVar.b, i6, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                            } else {
                                                throw d31.j(aVar.b, i6, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                            }
                                        } else if (annotation2 instanceof ud0) {
                                            aVar.c(i6, type);
                                            if (aVar.q) {
                                                ud0 ud0Var = (ud0) annotation2;
                                                aVar.g = true;
                                                String value9 = ud0Var.value();
                                                Class<?> e9 = d31.e(type);
                                                if (value9.isEmpty()) {
                                                    if (Iterable.class.isAssignableFrom(e9)) {
                                                        if (type instanceof ParameterizedType) {
                                                            if (u60.b.class.isAssignableFrom(d31.e(d31.d(0, (ParameterizedType) type)))) {
                                                                sd0Var = new qd0(sd0.m.a);
                                                            } else {
                                                                throw d31.j(aVar.b, i6, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                        } else {
                                                            throw d31.j(aVar.b, i6, e9.getSimpleName() + " must include generic type (e.g., " + e9.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                    } else if (e9.isArray()) {
                                                        if (u60.b.class.isAssignableFrom(e9.getComponentType())) {
                                                            sd0Var2 = new rd0(sd0.m.a);
                                                        } else {
                                                            throw d31.j(aVar.b, i6, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                    } else if (u60.b.class.isAssignableFrom(e9)) {
                                                        sd0Var2 = sd0.m.a;
                                                    } else {
                                                        throw d31.j(aVar.b, i6, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                } else {
                                                    sd0VarArr2 = sd0VarArr3;
                                                    lu f4 = lu.f("Content-Disposition", ij.c("form-data; name=\"", value9, "\""), "Content-Transfer-Encoding", ud0Var.encoding());
                                                    if (Iterable.class.isAssignableFrom(e9)) {
                                                        if (type instanceof ParameterizedType) {
                                                            Type d4 = d31.d(0, (ParameterizedType) type);
                                                            if (!u60.b.class.isAssignableFrom(d31.e(d4))) {
                                                                rd0Var = new qd0(new sd0.g(aVar.b, i6, f4, aVar.a.d(d4, annotationArr2, aVar.c)));
                                                            } else {
                                                                throw d31.j(aVar.b, i6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                        } else {
                                                            throw d31.j(aVar.b, i6, e9.getSimpleName() + " must include generic type (e.g., " + e9.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                    } else if (e9.isArray()) {
                                                        Class<?> a = al0.a.a(e9.getComponentType());
                                                        if (!u60.b.class.isAssignableFrom(a)) {
                                                            rd0Var = new rd0(new sd0.g(aVar.b, i6, f4, aVar.a.d(a, annotationArr2, aVar.c)));
                                                        } else {
                                                            throw d31.j(aVar.b, i6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                    } else if (!u60.b.class.isAssignableFrom(e9)) {
                                                        sd0Var = new sd0.g<>(aVar.b, i6, f4, aVar.a.d(type, annotationArr2, aVar.c));
                                                    } else {
                                                        throw d31.j(aVar.b, i6, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                    sd0Var = rd0Var;
                                                }
                                            } else {
                                                throw d31.j(aVar.b, i6, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                        } else {
                                            sd0VarArr2 = sd0VarArr3;
                                            if (annotation2 instanceof vd0) {
                                                aVar.c(i6, type);
                                                if (aVar.q) {
                                                    aVar.g = true;
                                                    Class<?> e10 = d31.e(type);
                                                    if (Map.class.isAssignableFrom(e10)) {
                                                        Type f5 = d31.f(type, e10, Map.class);
                                                        if (f5 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType4 = (ParameterizedType) f5;
                                                            Type d5 = d31.d(0, parameterizedType4);
                                                            if (String.class == d5) {
                                                                Type d6 = d31.d(1, parameterizedType4);
                                                                if (!u60.b.class.isAssignableFrom(d31.e(d6))) {
                                                                    sd0Var = new sd0.h<>(aVar.b, i6, aVar.a.d(d6, annotationArr2, aVar.c), ((vd0) annotation2).encoding());
                                                                } else {
                                                                    throw d31.j(aVar.b, i6, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw d31.j(aVar.b, i6, "@PartMap keys must be of type String: " + d5, new Object[0]);
                                                            }
                                                        } else {
                                                            throw d31.j(aVar.b, i6, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw d31.j(aVar.b, i6, "@PartMap parameter type must be Map.", new Object[0]);
                                                    }
                                                } else {
                                                    throw d31.j(aVar.b, i6, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof ma) {
                                                aVar.c(i6, type);
                                                if (!aVar.p && !aVar.q) {
                                                    if (!aVar.h) {
                                                        try {
                                                            pg<T, vk0> d7 = aVar.a.d(type, annotationArr2, aVar.c);
                                                            aVar.h = true;
                                                            sd0Var = new sd0.a<>(aVar.b, i6, d7);
                                                        } catch (RuntimeException e11) {
                                                            throw d31.k(aVar.b, e11, i6, "Unable to create @Body converter for %s", type);
                                                        }
                                                    } else {
                                                        throw d31.j(aVar.b, i6, "Multiple @Body method annotations found.", new Object[0]);
                                                    }
                                                } else {
                                                    throw d31.j(aVar.b, i6, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof sv0) {
                                                aVar.c(i6, type);
                                                Class<?> e12 = d31.e(type);
                                                for (int i11 = i6 - 1; i11 >= 0; i11--) {
                                                    sd0<?> sd0Var4 = aVar.v[i11];
                                                    if ((sd0Var4 instanceof sd0.o) && ((sd0.o) sd0Var4).a.equals(e12)) {
                                                        Method method2 = aVar.b;
                                                        StringBuilder b = e5.b("@Tag type ");
                                                        b.append(e12.getName());
                                                        b.append(" is duplicate of parameter #");
                                                        b.append(i11 + 1);
                                                        b.append(" and would always overwrite its value.");
                                                        throw d31.j(method2, i6, b.toString(), new Object[0]);
                                                    }
                                                }
                                                sd0Var = new sd0.o<>(e12);
                                            } else {
                                                sd0Var = null;
                                            }
                                        }
                                        sd0Var = sd0Var2;
                                    }
                                    sd0VarArr2 = sd0VarArr3;
                                }
                                str2 = str6;
                                sd0Var = sd0Var2;
                                sd0VarArr2 = sd0VarArr3;
                            }
                            if (sd0Var != null) {
                                if (sd0Var3 == null) {
                                    sd0Var3 = sd0Var;
                                } else {
                                    throw d31.j(aVar.b, i6, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                            }
                            i7++;
                            length3 = i8;
                            i5 = i9;
                            length4 = i10;
                            str6 = str2;
                            sd0VarArr3 = sd0VarArr2;
                        }
                        i = length3;
                        i2 = i5;
                        sd0VarArr = sd0VarArr3;
                        str = str6;
                    } else {
                        i = length3;
                        i2 = i5;
                        sd0VarArr = sd0VarArr3;
                        str = str6;
                        sd0Var3 = null;
                    }
                    if (sd0Var3 == null) {
                        if (z2) {
                            try {
                                if (d31.e(type) == lg.class) {
                                    aVar.w = true;
                                    sd0Var3 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw d31.j(aVar.b, i6, "No Retrofit annotation found.", new Object[0]);
                    }
                    sd0VarArr[i6] = sd0Var3;
                    i6++;
                    sd0Var3 = null;
                    length3 = i;
                    i5 = i2;
                    str6 = str;
                }
                String str8 = str6;
                if (aVar.r == null && !aVar.m) {
                    throw d31.i(aVar.b, null, "Missing either @%s URL or @Url parameter.", aVar.n);
                }
                boolean z3 = aVar.p;
                if (!z3 && !aVar.q && !aVar.o && aVar.h) {
                    throw d31.i(aVar.b, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z3 && !aVar.f) {
                    throw d31.i(aVar.b, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar.q && !aVar.g) {
                    throw d31.i(aVar.b, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                al0 al0Var = new al0(aVar);
                Type genericReturnType2 = method.getGenericReturnType();
                if (!d31.g(genericReturnType2)) {
                    if (genericReturnType2 != Void.TYPE) {
                        boolean z4 = al0Var.k;
                        Annotation[] annotations = method.getAnnotations();
                        if (z4) {
                            Type type2 = ((ParameterizedType) method.getGenericParameterTypes()[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                            if (type2 instanceof WildcardType) {
                                type2 = ((WildcardType) type2).getLowerBounds()[0];
                            }
                            if (d31.e(type2) == ol0.class && (type2 instanceof ParameterizedType)) {
                                type2 = d31.d(0, (ParameterizedType) type2);
                                z = true;
                            } else {
                                z = false;
                            }
                            genericReturnType = new d31.b(null, pb.class, type2);
                            if (!d31.h(annotations, et0.class)) {
                                Annotation[] annotationArr3 = new Annotation[annotations.length + 1];
                                annotationArr3[0] = ft0.a;
                                System.arraycopy(annotations, 0, annotationArr3, 1, annotations.length);
                                annotations = annotationArr3;
                            }
                        } else {
                            genericReturnType = method.getGenericReturnType();
                            z = false;
                        }
                        try {
                            qb<?, ?> a2 = vl0Var.a(genericReturnType, annotations);
                            Type a3 = a2.a();
                            if (a3 != nl0.class) {
                                if (a3 != ol0.class) {
                                    if (al0Var.c.equals(str8) && !Void.class.equals(a3)) {
                                        throw d31.i(method, null, "HEAD method must use Void as response type.", new Object[0]);
                                    }
                                    try {
                                        pg<ql0, T> e13 = vl0Var.e(a3, method.getAnnotations());
                                        ob.a aVar3 = vl0Var.b;
                                        if (!z4) {
                                            return new ov.a(al0Var, aVar3, e13, a2);
                                        }
                                        if (z) {
                                            return new ov.c(al0Var, aVar3, e13, a2);
                                        }
                                        return new ov.b(al0Var, aVar3, e13, a2);
                                    } catch (RuntimeException e14) {
                                        throw d31.i(method, e14, "Unable to create converter for %s", a3);
                                    }
                                }
                                throw d31.i(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                            }
                            StringBuilder b2 = e5.b("'");
                            b2.append(d31.e(a3).getName());
                            b2.append("' is not a valid response body type. Did you mean ResponseBody?");
                            throw d31.i(method, null, b2.toString(), new Object[0]);
                        } catch (RuntimeException e15) {
                            throw d31.i(method, e15, "Unable to create call adapter for %s", genericReturnType);
                        }
                    }
                    throw d31.i(method, null, "Service methods cannot return void.", new Object[0]);
                }
                throw d31.i(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
            } else {
                throw d31.i(aVar.b, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
        throw d31.i(aVar.b, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str3);
    }

    @Nullable
    public abstract T a(Object[] objArr);
}