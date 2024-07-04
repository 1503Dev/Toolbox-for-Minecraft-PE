package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* renamed from: ca2  reason: default package */
public final class ca2 {
    public String d;
    public Context e;
    public String f;
    public AtomicBoolean h;
    public File i;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(100);
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashMap c = new HashMap();
    public final HashSet g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public final LinkedHashMap a(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap3.get(str);
            ia2 ia2Var = (ia2) this.c.get(str);
            if (ia2Var == null) {
                ia2Var = ia2.a;
            }
            linkedHashMap3.put(str, ia2Var.a(str3, str2));
        }
        return linkedHashMap3;
    }

    public final void b(LinkedHashMap linkedHashMap, kt1 kt1Var) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (kt1Var != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty((String) kt1Var.a)) {
                sb.append("&it=");
                sb.append((String) kt1Var.a);
            }
            if (!TextUtils.isEmpty((String) kt1Var.b)) {
                sb.append("&blat=");
                sb.append((String) kt1Var.b);
            }
            uri = sb.toString();
        }
        if (this.h.get()) {
            File file = this.i;
            if (file != null) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file, true);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = null;
                    }
                } catch (IOException e) {
                    e = e;
                }
                try {
                    fileOutputStream.write(uri.getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                        return;
                    } catch (IOException e2) {
                        sv2.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                        return;
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    sv2.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            return;
                        } catch (IOException e4) {
                            sv2.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            sv2.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                        }
                    }
                    throw th;
                }
            }
            sv2.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        cu5 cu5Var = jv5.A.c;
        cu5.f(this.e, this.f, uri);
    }
}