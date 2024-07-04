package defpackage;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: zp  reason: default package */
public abstract class zp implements aq {
    public static final a P;
    public static final /* synthetic */ zp[] Q;

    /* renamed from: zp$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public enum a extends zp {
        public a() {
            super("IDENTITY", 0);
        }

        @Override // defpackage.aq
        public final String b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a();
        P = aVar;
        Q = new zp[]{aVar, new zp() { // from class: zp.b
            @Override // defpackage.aq
            public final String b(Field field) {
                return zp.f(field.getName());
            }
        }, new zp() { // from class: zp.c
            @Override // defpackage.aq
            public final String b(Field field) {
                return zp.f(zp.e(field.getName(), " "));
            }
        }, new zp() { // from class: zp.d
            @Override // defpackage.aq
            public final String b(Field field) {
                return zp.e(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        }, new zp() { // from class: zp.e
            @Override // defpackage.aq
            public final String b(Field field) {
                return zp.e(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        }, new zp() { // from class: zp.f
            @Override // defpackage.aq
            public final String b(Field field) {
                return zp.e(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public zp() {
        throw null;
    }

    public zp(String str, int i) {
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String f(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static zp valueOf(String str) {
        return (zp) Enum.valueOf(zp.class, str);
    }

    public static zp[] values() {
        return (zp[]) Q.clone();
    }
}