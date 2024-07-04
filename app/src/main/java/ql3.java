package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ql3  reason: default package */
public final class ql3 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            b(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(vx.w(new p52(((String) obj).getBytes(z13.a))));
                sb.append('\"');
            } else if (obj instanceof y82) {
                sb.append(": \"");
                sb.append(vx.w((y82) obj));
                sb.append('\"');
            } else if (obj instanceof ox2) {
                sb.append(" {");
                c((ox2) obj, sb, i + 2);
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                a(sb, i3, "key", entry2.getKey());
                a(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            }
        }
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void c(fk3 fk3Var, StringBuilder sb, int i) {
        int i2;
        Object obj;
        Method method;
        String substring;
        Object d;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = fk3Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i2);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                d = ox2.d(fk3Var, method2, new Object[0]);
            } else if (substring2.endsWith("Map") && !substring2.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                substring = substring2.substring(0, substring2.length() - 3);
                d = ox2.d(fk3Var, method, new Object[0]);
            } else {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object d2 = ox2.d(fk3Var, method4, new Object[0]);
                        if (method5 == null) {
                            if (d2 instanceof Boolean) {
                                if (!((Boolean) d2).booleanValue()) {
                                }
                                a(sb, i, substring2, d2);
                            } else if (d2 instanceof Integer) {
                                if (((Integer) d2).intValue() == 0) {
                                }
                                a(sb, i, substring2, d2);
                            } else if (d2 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) d2).floatValue()) == 0) {
                                }
                                a(sb, i, substring2, d2);
                            } else if (d2 instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) d2).doubleValue()) == 0) {
                                }
                                a(sb, i, substring2, d2);
                            } else {
                                if (d2 instanceof String) {
                                    obj = "";
                                } else if (d2 instanceof y82) {
                                    obj = y82.Q;
                                } else if (d2 instanceof fk3) {
                                    if (d2 == ((fk3) d2).e()) {
                                    }
                                    a(sb, i, substring2, d2);
                                } else {
                                    if ((d2 instanceof Enum) && ((Enum) d2).ordinal() == 0) {
                                    }
                                    a(sb, i, substring2, d2);
                                }
                                if (d2.equals(obj)) {
                                }
                                a(sb, i, substring2, d2);
                            }
                        } else {
                            if (!((Boolean) ox2.d(fk3Var, method5, new Object[0])).booleanValue()) {
                            }
                            a(sb, i, substring2, d2);
                        }
                    }
                }
                i2 = 3;
            }
            a(sb, i, substring, d);
            i2 = 3;
        }
        if (!(fk3Var instanceof zt2)) {
            u54 u54Var = ((ox2) fk3Var).zzc;
            if (u54Var != null) {
                for (int i4 = 0; i4 < u54Var.a; i4++) {
                    a(sb, i, String.valueOf(u54Var.b[i4] >>> 3), u54Var.c[i4]);
                }
                return;
            }
            return;
        }
        zt2 zt2Var = (zt2) fk3Var;
        throw null;
    }
}