package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

/* renamed from: a  reason: default package */
public final class a {
    public static final Type[] a = new Type[0];

    /* renamed from: a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class C0000a implements GenericArrayType, Serializable {
        public final Type P;

        public C0000a(Type type) {
            this.P = a.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a.c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.P;
        }

        public final int hashCode() {
            return this.P.hashCode();
        }

        public final String toString() {
            return a.h(this.P) + "[]";
        }
    }

    /* renamed from: a$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b implements ParameterizedType, Serializable {
        public final Type P;
        public final Type Q;
        public final Type[] R;

        public b(Type type, Type type2, Type... typeArr) {
            Type a;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                n42.b(z2);
            }
            if (type == null) {
                a = null;
            } else {
                a = a.a(type);
            }
            this.P = a;
            this.Q = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.R = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                this.R[i].getClass();
                a.b(this.R[i]);
                Type[] typeArr3 = this.R;
                typeArr3[i] = a.a(typeArr3[i]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.R.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
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
            int length = this.R.length;
            if (length == 0) {
                return a.h(this.Q);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(a.h(this.Q));
            sb.append("<");
            sb.append(a.h(this.R[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(a.h(this.R[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: a$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c implements WildcardType, Serializable {
        public final Type P;
        public final Type Q;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            n42.b(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            n42.b(z2);
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                a.b(typeArr2[0]);
                n42.b(typeArr[0] == Object.class);
                this.Q = a.a(typeArr2[0]);
                this.P = Object.class;
                return;
            }
            typeArr[0].getClass();
            a.b(typeArr[0]);
            this.Q = null;
            this.P = a.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a.c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.Q;
            return type != null ? new Type[]{type} : a.a;
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
            b.append(a.h(type));
            return b.toString();
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0000a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0000a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static void b(Type type) {
        n42.b(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean c(Type type, Type type2) {
        boolean z;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z = false;
            } else {
                z = true;
            }
            if (z && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
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
                    return d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            n42.b(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return e(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static Type f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        n42.b(cls2.isAssignableFrom(cls));
        return g(type, cls, d(type, cls, cls2), new HashSet());
    }

    public static Type g(Type type, Class cls, Type type2, HashSet hashSet) {
        Type[] typeArr;
        Type[] typeArr2;
        boolean z;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (hashSet.contains(typeVariable)) {
                    return type2;
                }
                hashSet.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type d = d(type, cls, cls2);
                    if (d instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) d).getActualTypeArguments()[i];
                                continue;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type g = g(type, cls, componentType, hashSet);
                        if (componentType != g) {
                            return new C0000a(g);
                        }
                        return cls3;
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type g2 = g(type, cls, genericComponentType, hashSet);
                    if (genericComponentType != g2) {
                        return new C0000a(g2);
                    }
                    return genericArrayType;
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type g3 = g(type, cls, ownerType, hashSet);
                    if (g3 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type g4 = g(type, cls, actualTypeArguments[i], hashSet);
                        if (g4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = g4;
                        }
                        i++;
                    }
                    if (z) {
                        return new b(g3, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                } else {
                    boolean z2 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type g5 = g(type, cls, lowerBounds[0], hashSet);
                            wildcardType = wildcardType2;
                            if (g5 != lowerBounds[0]) {
                                if (g5 instanceof WildcardType) {
                                    typeArr2 = ((WildcardType) g5).getLowerBounds();
                                } else {
                                    typeArr2 = new Type[]{g5};
                                }
                                return new c(new Type[]{Object.class}, typeArr2);
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type g6 = g(type, cls, upperBounds[0], hashSet);
                                wildcardType = wildcardType2;
                                if (g6 != upperBounds[0]) {
                                    if (g6 instanceof WildcardType) {
                                        typeArr = ((WildcardType) g6).getUpperBounds();
                                    } else {
                                        typeArr = new Type[]{g6};
                                    }
                                    return new c(typeArr, a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    public static String h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}