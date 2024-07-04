package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;

/* renamed from: d31  reason: default package */
public final class d31 {
    public static final Type[] a = new Type[0];

    /* renamed from: d31$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a implements GenericArrayType {
        public final Type P;

        public a(Type type) {
            this.P = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && d31.b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.P;
        }

        public final int hashCode() {
            return this.P.hashCode();
        }

        public final String toString() {
            return d31.n(this.P) + "[]";
        }
    }

    /* renamed from: d31$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b implements ParameterizedType {
        @Nullable
        public final Type P;
        public final Type Q;
        public final Type[] R;

        public b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                d31.a(type3);
            }
            this.P = type;
            this.Q = type2;
            this.R = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && d31.b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.R.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public final Type getOwnerType() {
            return this.P;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.Q;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.R) ^ this.Q.hashCode();
            Type type = this.P;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.R;
            if (typeArr.length == 0) {
                return d31.n(this.Q);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(d31.n(this.Q));
            sb.append("<");
            sb.append(d31.n(this.R[0]));
            for (int i = 1; i < this.R.length; i++) {
                sb.append(", ");
                sb.append(d31.n(this.R[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: d31$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c implements WildcardType {
        public final Type P;
        @Nullable
        public final Type Q;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                d31.a(type);
                this.Q = null;
                this.P = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            d31.a(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.Q = typeArr2[0];
            this.P = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && d31.b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.Q;
            return type != null ? new Type[]{type} : d31.a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.P};
        }

        public final int hashCode() {
            Type type = this.Q;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.P.hashCode() + 31);
        }

        public final String toString() {
            StringBuilder b;
            Type type;
            if (this.Q != null) {
                b = e5.b("? super ");
                type = this.Q;
            } else if (this.P == Object.class) {
                return "?";
            } else {
                b = e5.b("? extends ");
                type = this.P;
            }
            b.append(d31.n(type));
            return b.toString();
        }
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return c(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type d(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    public static Class<?> e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return e(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type f(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return l(type, cls, c(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean g(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (g(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return g(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    public static boolean h(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException i(Method method, @Nullable Exception exc, String str, Object... objArr) {
        StringBuilder c2 = yg.c(String.format(str, objArr), "\n    for method ");
        c2.append(method.getDeclaringClass().getSimpleName());
        c2.append(".");
        c2.append(method.getName());
        return new IllegalArgumentException(c2.toString(), exc);
    }

    public static IllegalArgumentException j(Method method, int i, String str, Object... objArr) {
        StringBuilder c2 = yg.c(str, " (parameter #");
        c2.append(i + 1);
        c2.append(")");
        return i(method, null, c2.toString(), objArr);
    }

    public static IllegalArgumentException k(Method method, Exception exc, int i, String str, Object... objArr) {
        StringBuilder c2 = yg.c(str, " (parameter #");
        c2.append(i + 1);
        c2.append(")");
        return i(method, exc, c2.toString(), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[LOOP:0: B:2:0x0000->B:24:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type l(Type type, Class<?> cls, Type type2) {
        TypeVariable typeVariable;
        boolean z;
        Class cls2;
        TypeVariable typeVariable2;
        while (true) {
            int i = 0;
            if (typeVariable instanceof TypeVariable) {
                TypeVariable typeVariable3 = (TypeVariable) typeVariable;
                GenericDeclaration genericDeclaration = typeVariable3.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type c2 = c(type, cls, cls2);
                    if (c2 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        while (i < typeParameters.length) {
                            if (typeVariable3.equals(typeParameters[i])) {
                                typeVariable2 = ((ParameterizedType) c2).getActualTypeArguments()[i];
                                if (typeVariable2 != typeVariable3) {
                                    return typeVariable2;
                                }
                                typeVariable = typeVariable2;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                typeVariable2 = typeVariable3;
                if (typeVariable2 != typeVariable3) {
                }
            } else {
                if (typeVariable instanceof Class) {
                    Class cls3 = (Class) typeVariable;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type l = l(type, cls, componentType);
                        if (componentType != l) {
                            return new a(l);
                        }
                        return cls3;
                    }
                }
                if (typeVariable instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) typeVariable;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type l2 = l(type, cls, genericComponentType);
                    if (genericComponentType != l2) {
                        return new a(l2);
                    }
                    return genericArrayType;
                } else if (typeVariable instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) typeVariable;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type l3 = l(type, cls, ownerType);
                    if (l3 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type l4 = l(type, cls, actualTypeArguments[i]);
                        if (l4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = l4;
                        }
                        i++;
                    }
                    if (z) {
                        return new b(l3, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                } else {
                    boolean z2 = typeVariable instanceof WildcardType;
                    WildcardType wildcardType = typeVariable;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) typeVariable;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type l5 = l(type, cls, lowerBounds[0]);
                            wildcardType = wildcardType2;
                            if (l5 != lowerBounds[0]) {
                                return new c(new Type[]{Object.class}, new Type[]{l5});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type l6 = l(type, cls, upperBounds[0]);
                                wildcardType = wildcardType2;
                                if (l6 != upperBounds[0]) {
                                    return new c(new Type[]{l6}, a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        }
    }

    public static void m(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String n(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}