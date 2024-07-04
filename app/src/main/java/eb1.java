package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: eb1  reason: default package */
public class eb1 implements nf1, wg3 {
    public static final /* synthetic */ eb1 P = new eb1();
    public static final g93 Q = new g93(1);
    public static final jk4 R = new jk4();

    public static long b(ic1 ic1Var, String str, long j) {
        long optLong;
        synchronized (ic1Var.a) {
            optLong = ic1Var.a.optLong(str, j);
        }
        return optLong;
    }

    public static nr c(ic1 ic1Var, String str) {
        nr nrVar;
        synchronized (ic1Var.a) {
            JSONArray optJSONArray = ic1Var.a.optJSONArray(str);
            if (optJSONArray != null) {
                nrVar = new nr(optJSONArray);
            } else {
                nrVar = new nr();
            }
        }
        return nrVar;
    }

    public static ic1 d(String str, String str2) {
        String sb;
        try {
            return new ic1(str);
        } catch (JSONException e) {
            if (str2 == null) {
                sb = "";
            } else {
                StringBuilder c = yg.c(str2, ": ");
                c.append(e.toString());
                sb = c.toString();
            }
            ga1.h().n().d(0, 0, sb, true);
            return new ic1();
        }
    }

    public static ic1 f(ic1... ic1VarArr) {
        ic1 ic1Var = new ic1();
        for (ic1 ic1Var2 : ic1VarArr) {
            if (ic1Var2 != null) {
                synchronized (ic1Var.a) {
                    synchronized (ic1Var2.a) {
                        Iterator<String> keys = ic1Var2.a.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            try {
                                ic1Var.a.put(next, ic1Var2.a.get(next));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
            }
        }
        return ic1Var;
    }

    public static void g(ic1 ic1Var, String str, double d) {
        try {
            synchronized (ic1Var.a) {
                ic1Var.a.put(str, d);
            }
        } catch (JSONException unused) {
            StringBuilder b = e5.b("JSON error in ADCJSON putDouble(): ");
            b.append(" with key: " + str);
            b.append(" and value: " + d);
            t1.b(0, 0, b.toString(), true);
        }
    }

    public static void h(ic1 ic1Var, String str, nr nrVar) {
        try {
            synchronized (ic1Var.a) {
                ic1Var.a.put(str, (JSONArray) nrVar.b);
            }
        } catch (JSONException e) {
            StringBuilder b = e5.b("JSON error in ADCJSON putArray(): ");
            b.append(e.toString());
            b.append(" with key: " + str);
            b.append(" and value: " + nrVar);
            t1.b(0, 0, b.toString(), true);
        }
    }

    public static void i(ic1 ic1Var, String str, ic1 ic1Var2) {
        try {
            synchronized (ic1Var.a) {
                ic1Var.a.put(str, ic1Var2.a);
            }
        } catch (JSONException e) {
            StringBuilder b = e5.b("JSON error in ADCJSON putObject(): ");
            b.append(e.toString());
            b.append(" with key: " + str);
            b.append(" and value: " + ic1Var2);
            t1.b(0, 0, b.toString(), true);
        }
    }

    public static void j(ic1 ic1Var, String str, String str2) {
        try {
            ic1Var.b(str, str2);
        } catch (JSONException e) {
            StringBuilder b = e5.b("JSON error in ADCJSON putString(): ");
            b.append(e.toString());
            b.append(" with key: " + str);
            b.append(" and value: " + str2);
            t1.b(0, 0, b.toString(), true);
        }
    }

    public static String[] k(nr nrVar) {
        String[] strArr;
        synchronized (((JSONArray) nrVar.b)) {
            strArr = new String[((JSONArray) nrVar.b).length()];
            for (int i = 0; i < ((JSONArray) nrVar.b).length(); i++) {
                strArr[i] = nrVar.g(i);
            }
        }
        return strArr;
    }

    public static void l(int i, ic1 ic1Var, String str) {
        try {
            ic1Var.e(i, str);
        } catch (JSONException e) {
            StringBuilder b = e5.b("JSON error in ADCJSON putInteger(): ");
            b.append(e.toString());
            b.append(" with key: " + str);
            b.append(" and value: " + i);
            t1.b(0, 0, b.toString(), true);
        }
    }

    public static void m(ic1 ic1Var, String str, boolean z) {
        try {
            synchronized (ic1Var.a) {
                ic1Var.a.put(str, z);
            }
        } catch (JSONException e) {
            StringBuilder b = e5.b("JSON error in ADCJSON putBoolean(): ");
            b.append(e.toString());
            b.append(" with key: " + str);
            b.append(" and value: " + z);
            t1.b(0, 0, b.toString(), true);
        }
    }

    public static ic1 n(String str) {
        try {
            ga1.h().m().getClass();
            String sb = kf1.a(str, false).toString();
            return d(sb, "loadObject from filepath " + str);
        } catch (IOException e) {
            StringBuilder b = e5.b("IOException in ADCJSON's loadObject: ");
            b.append(e.toString());
            ga1.h().n().d(0, 0, b.toString(), true);
            return new ic1();
        }
    }

    public static String o(ic1 ic1Var, String str) {
        String valueOf;
        synchronized (ic1Var.a) {
            if (!ic1Var.a.isNull(str)) {
                Object opt = ic1Var.a.opt(str);
                if (opt instanceof String) {
                    valueOf = (String) opt;
                } else if (opt != null) {
                    valueOf = String.valueOf(opt);
                }
                return valueOf;
            }
            return null;
        }
    }

    public static final lg p(lg lgVar) {
        lg lgVar2;
        hy.e("$this$intercepted", lgVar);
        if (!(lgVar instanceof ng)) {
            lgVar2 = null;
        } else {
            lgVar2 = lgVar;
        }
        ng ngVar = (ng) lgVar2;
        if (ngVar != null && (lgVar = ngVar.Q) == null) {
            ug ugVar = ngVar.R;
            hy.c(ugVar);
            og ogVar = (og) ugVar.get();
            if (ogVar == null || (lgVar = ogVar.b()) == null) {
                lgVar = ngVar;
            }
            ngVar.Q = lgVar;
        }
        return lgVar;
    }

    public static void q(ic1 ic1Var, String str) {
        try {
            kf1 m = ga1.h().m();
            String ic1Var2 = ic1Var.toString();
            m.getClass();
            kf1.b(str, false, ic1Var2);
        } catch (IOException e) {
            StringBuilder b = e5.b("IOException in ADCJSON's saveObject: ");
            b.append(e.toString());
            t1.b(0, 0, b.toString(), true);
        }
    }

    public static void r(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void s(lg lgVar) {
        hy.e("frame", lgVar);
    }

    public static hm4 t(Context context, int i) {
        ya2 ya2Var;
        if (rm4.b()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        ya2Var = fb2.c;
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        ya2Var = fb2.d;
                        break;
                    case 5:
                        ya2Var = fb2.b;
                        break;
                }
            } else {
                ya2Var = fb2.e;
            }
            if (((Boolean) ya2Var.d()).booleanValue()) {
                return new jm4(context, i);
            }
        }
        return new ym4();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int u(Context context, dp4 dp4Var) {
        String str;
        int i;
        FileInputStream fileInputStream;
        byte[] bArr;
        String str2;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            str = "No lib/";
        } else {
            File[] listFiles = file.listFiles(new fx4(Pattern.compile(".*\\.so$", 2)));
            if (listFiles != null && listFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(listFiles[0]);
                    bArr = new byte[20];
                } catch (IOException e) {
                    w(null, e.toString(), dp4Var);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] != 2) {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s != 3) {
                            if (s != 40) {
                                if (s != 62) {
                                    if (s == 183) {
                                        fileInputStream.close();
                                        i = 6;
                                    }
                                } else {
                                    fileInputStream.close();
                                    i = 7;
                                }
                            } else {
                                fileInputStream.close();
                                i = 3;
                            }
                        } else {
                            fileInputStream.close();
                            i = 5;
                        }
                        if (i == 1000) {
                            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
                            String property = System.getProperty(vv0.a(21));
                            if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                                try {
                                    String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                                    if (strArr != null && strArr.length > 0) {
                                        property = strArr[0];
                                    }
                                } catch (IllegalAccessException | NoSuchFieldException e2) {
                                    dp4Var.c(2024, 0L, e2);
                                }
                                property = Build.CPU_ABI;
                                if (property == null) {
                                    property = Build.CPU_ABI2;
                                }
                            }
                            if (TextUtils.isEmpty(property)) {
                                w(null, "Empty dev arch", dp4Var);
                            } else if (!property.equalsIgnoreCase("i686") && !property.equalsIgnoreCase("x86")) {
                                if (property.equalsIgnoreCase("x86_64")) {
                                    i = 7;
                                } else if (property.equalsIgnoreCase("arm64-v8a")) {
                                    i = 6;
                                } else if (!property.equalsIgnoreCase("armeabi-v7a") && !property.equalsIgnoreCase("armv71")) {
                                    w(null, property, dp4Var);
                                } else {
                                    i = 3;
                                }
                            } else {
                                i = 5;
                            }
                            i = 1;
                        }
                        if (i != 1) {
                            if (i != 3) {
                                if (i != 5) {
                                    if (i != 6) {
                                        if (i != 7) {
                                            str2 = "null";
                                        } else {
                                            str2 = "X86_64";
                                        }
                                    } else {
                                        str2 = "ARM64";
                                    }
                                } else {
                                    str2 = "X86";
                                }
                            } else {
                                str2 = "ARM7";
                            }
                        } else {
                            str2 = "UNSUPPORTED";
                        }
                        dp4Var.b(5018, str2);
                        return i;
                    }
                    w(bArr, null, dp4Var);
                }
                fileInputStream.close();
                i = 1;
                if (i == 1000) {
                }
                if (i != 1) {
                }
                dp4Var.b(5018, str2);
                return i;
            }
            str = "No .so";
        }
        dp4Var.b(5017, str);
        i = 1000;
        if (i == 1000) {
        }
        if (i != 1) {
        }
        dp4Var.b(5018, str2);
        return i;
    }

    public static hm4 v(Context context, int i, int i2, pn5 pn5Var) {
        boolean matches;
        hm4 t = t(context, i);
        if (!(t instanceof jm4)) {
            return t;
        }
        t.f();
        t.a(i2);
        String str = pn5Var.e0;
        if (TextUtils.isEmpty(str)) {
            matches = false;
        } else {
            matches = Pattern.matches((String) w82.d.c.a(x92.s7), str);
        }
        if (matches) {
            t.D(pn5Var.e0);
        }
        return t;
    }

    public static final void w(byte[] bArr, String str, dp4 dp4Var) {
        StringBuilder b = e5.b("os.arch:");
        b.append(System.getProperty(vv0.a(21)));
        b.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                b.append("supported_abis:");
                b.append(Arrays.toString(strArr));
                b.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        b.append("CPU_ABI:");
        b.append(Build.CPU_ABI);
        b.append(";CPU_ABI2:");
        b.append(Build.CPU_ABI2);
        b.append(";");
        if (bArr != null) {
            b.append("ELF:");
            b.append(Arrays.toString(bArr));
            b.append(";");
        }
        if (str != null) {
            b.append("dbg:");
            b.append(str);
            b.append(";");
        }
        dp4Var.b(4007, b.toString());
    }

    @Override // defpackage.nf1
    public /* bridge */ /* synthetic */ void a(Object obj) {
        wd1 wd1Var = (wd1) obj;
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((sb0) obj).a();
    }
}