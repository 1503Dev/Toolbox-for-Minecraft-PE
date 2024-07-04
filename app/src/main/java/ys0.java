package defpackage;

import android.content.Context;
import androidx.databinding.f;
import androidx.databinding.g;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: ys0  reason: default package */
public final class ys0 implements xu0, qt4, wy4, nf3 {
    public final Object P;
    public final Object Q;

    public ys0(Context context) {
        this.Q = new f();
        File file = new File(context.getFilesDir(), "nbt_presets");
        File externalFilesDir = context.getExternalFilesDir(null);
        externalFilesDir = externalFilesDir != null ? new File(externalFilesDir, "nbt_presets") : externalFilesDir;
        if (externalFilesDir != null && !file.exists()) {
            file = externalFilesDir;
        }
        this.P = file;
        String[] list = file.list();
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.endsWith(".txt")) {
                arrayList.add(str.substring(0, str.length() - 4));
            }
        }
        Collections.sort(arrayList);
        ((g) this.Q).clear();
        ((g) this.Q).addAll(arrayList);
    }

    public /* synthetic */ ys0(oa3 oa3Var, wy4 wy4Var) {
        this.Q = oa3Var;
        this.P = wy4Var;
    }

    @Override // defpackage.qt4
    public final Object a() {
        return ((q92) this.Q).c(((w92) this.P).e);
    }

    public final void b(String str) {
        if (Collections.binarySearch((g) this.Q, str) < 0) {
            return;
        }
        ((g) this.Q).remove(str);
        new File((File) this.P, k6.b(str, ".txt")).delete();
    }

    public final String c(String str) {
        FileInputStream fileInputStream = new FileInputStream(new File((File) this.P, k6.b(str, ".txt")));
        int size = (int) fileInputStream.getChannel().size();
        byte[] bArr = new byte[size];
        int i = 0;
        while (true) {
            int read = fileInputStream.read(bArr, i, size - i);
            if (read > 0) {
                i += read;
            } else {
                return new String(bArr, StandardCharsets.UTF_8);
            }
        }
    }

    @Override // defpackage.xu0
    public final String d() {
        return (String) this.P;
    }

    @Override // defpackage.nf3
    /* renamed from: e */
    public final void mo9e(Object obj) {
        ((t64) obj).i((String) this.P, (String) this.Q);
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        zw2.e.execute(new cx1(4, (oa3) this.Q));
        ((wy4) this.P).f((ea3) obj);
    }

    @Override // defpackage.xu0
    public final void g(hs hsVar) {
        double floatValue;
        long longValue;
        int intValue;
        Object[] objArr = (Object[]) this.Q;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    hsVar.t(i);
                } else if (obj instanceof byte[]) {
                    hsVar.a((byte[]) obj, i);
                } else {
                    if (obj instanceof Float) {
                        floatValue = ((Float) obj).floatValue();
                    } else if (obj instanceof Double) {
                        floatValue = ((Double) obj).doubleValue();
                    } else {
                        if (obj instanceof Long) {
                            longValue = ((Long) obj).longValue();
                        } else {
                            if (obj instanceof Integer) {
                                intValue = ((Integer) obj).intValue();
                            } else if (obj instanceof Short) {
                                intValue = ((Short) obj).shortValue();
                            } else if (obj instanceof Byte) {
                                intValue = ((Byte) obj).byteValue();
                            } else if (obj instanceof String) {
                                hsVar.y(i, (String) obj);
                            } else if (obj instanceof Boolean) {
                                if (((Boolean) obj).booleanValue()) {
                                    longValue = 1;
                                } else {
                                    longValue = 0;
                                }
                            } else {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                            }
                            longValue = intValue;
                        }
                        hsVar.g(longValue, i);
                    }
                    hsVar.d(floatValue, i);
                }
            }
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        zw2.e.execute(new cx1(4, (oa3) this.Q));
        ((wy4) this.P).h(th);
    }

    public final void i(String str, String str2) {
        ((File) this.P).mkdir();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File((File) this.P, k6.b(str, ".txt"))));
        try {
            bufferedWriter.write(str2);
            bufferedWriter.close();
            int binarySearch = Collections.binarySearch((g) this.Q, str);
            if (binarySearch < 0) {
                ((g) this.Q).add((-binarySearch) - 1, str);
            }
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ ys0(Object obj, Object obj2) {
        this.P = obj;
        this.Q = obj2;
    }
}