package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: pf5  reason: default package */
public final class pf5 {
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
                ed5 ed5Var = gd5.Q;
                sb.append(mh.y(new ed5(((String) obj).getBytes(re5.a))));
                sb.append('\"');
            } else if (obj instanceof gd5) {
                sb.append(": \"");
                sb.append(mh.y((gd5) obj));
                sb.append('\"');
            } else if (obj instanceof ie5) {
                sb.append(" {");
                c((ie5) obj, sb, i + 2);
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                a(sb, i3, "key", entry2.getKey());
                a(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
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

    public static void c(nf5 nf5Var, StringBuilder sb, int i) {
        int i2;
        Object obj;
        Method method;
        String substring;
        Object l;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = nf5Var.getClass().getDeclaredMethods();
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
                l = ie5.l(nf5Var, method2, new Object[0]);
            } else if (substring2.endsWith("Map") && !substring2.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                substring = substring2.substring(0, substring2.length() - 3);
                l = ie5.l(nf5Var, method, new Object[0]);
            } else {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object l2 = ie5.l(nf5Var, method4, new Object[0]);
                        if (method5 == null) {
                            if (l2 instanceof Boolean) {
                                if (!((Boolean) l2).booleanValue()) {
                                }
                                a(sb, i, substring2, l2);
                            } else if (l2 instanceof Integer) {
                                if (((Integer) l2).intValue() == 0) {
                                }
                                a(sb, i, substring2, l2);
                            } else if (l2 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) l2).floatValue()) == 0) {
                                }
                                a(sb, i, substring2, l2);
                            } else if (l2 instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) l2).doubleValue()) == 0) {
                                }
                                a(sb, i, substring2, l2);
                            } else {
                                if (l2 instanceof String) {
                                    obj = "";
                                } else if (l2 instanceof gd5) {
                                    obj = gd5.Q;
                                } else if (l2 instanceof nf5) {
                                    if (l2 == ((nf5) l2).b()) {
                                    }
                                    a(sb, i, substring2, l2);
                                } else {
                                    if ((l2 instanceof Enum) && ((Enum) l2).ordinal() == 0) {
                                    }
                                    a(sb, i, substring2, l2);
                                }
                                if (l2.equals(obj)) {
                                }
                                a(sb, i, substring2, l2);
                            }
                        } else {
                            if (!((Boolean) ie5.l(nf5Var, method5, new Object[0])).booleanValue()) {
                            }
                            a(sb, i, substring2, l2);
                        }
                    }
                }
                i2 = 3;
            }
            a(sb, i, substring, l);
            i2 = 3;
        }
        if (!(nf5Var instanceof ge5)) {
            pg5 pg5Var = ((ie5) nf5Var).zzc;
            if (pg5Var != null) {
                for (int i4 = 0; i4 < pg5Var.a; i4++) {
                    a(sb, i, String.valueOf(pg5Var.b[i4] >>> 3), pg5Var.c[i4]);
                }
                return;
            }
            return;
        }
        ge5 ge5Var = (ge5) nf5Var;
        throw null;
    }
}