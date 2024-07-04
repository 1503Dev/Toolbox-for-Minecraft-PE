package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r42  reason: default package */
public final class r42 {
    public final Object a = new Object();
    public String b = "";
    public String c = "";
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public cu3 g;

    public static void e(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            cu5.i.post(new q32(context, str, z, z2));
        } else {
            sv2.f("Can not create dialog without Activity Context");
        }
    }

    public static final String h(Context context, String str, String str2) {
        String valueOf;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", jv5.A.c.r(context, str2));
        new dl2(context);
        ri2 a = dl2.a(0, str, hashMap, null);
        try {
            return (String) a.get(((Integer) w82.d.c.a(x92.V3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            valueOf = String.valueOf(str);
            str3 = "Interrupted while retrieving a response from: ";
            sv2.e(str3.concat(valueOf), e);
            a.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            e = e2;
            valueOf = String.valueOf(str);
            str3 = "Timeout while retrieving a response from: ";
            sv2.e(str3.concat(valueOf), e);
            a.cancel(true);
            return null;
        } catch (Exception e3) {
            sv2.e("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    public final void a(Context context) {
        cu3 cu3Var;
        if (((Boolean) w82.d.c.a(x92.M7)).booleanValue() && (cu3Var = this.g) != null) {
            cu3Var.d(new b22(this, context), bu3.DEBUG_MENU);
        }
    }

    public final void b(Context context, String str, String str2) {
        cu5 cu5Var = jv5.A.c;
        cu5.m(context, i(context, (String) w82.d.c.a(x92.R3), str, str2));
    }

    public final void c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = i(context, (String) w82.d.c.a(x92.U3), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        cu5 cu5Var = jv5.A.c;
        cu5.f(context, str, buildUpon.build().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r4 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        synchronized (this.a) {
            this.e = z;
            if (((Boolean) w82.d.c.a(x92.M7)).booleanValue()) {
                jv5.A.g.b().w(z);
                cu3 cu3Var = this.g;
                if (cu3Var != null) {
                    if (!cu3Var.r) {
                        if (z) {
                            cu3Var.h();
                            if (!cu3Var.p) {
                                cu3Var.m();
                            }
                        }
                        if (!cu3Var.f()) {
                            cu3Var.l();
                        }
                    }
                }
            }
        }
    }

    public final boolean f(Context context, String str, String str2) {
        p92 p92Var = x92.T3;
        w82 w82Var = w82.d;
        String h = h(context, i(context, (String) w82Var.c.a(p92Var), str, str2).toString(), str2);
        if (TextUtils.isEmpty(h)) {
            sv2.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(h.trim()).optString("debug_mode"));
            d(equals);
            if (((Boolean) w82Var.c.a(x92.M7)).booleanValue()) {
                nl5 b = jv5.A.g.b();
                if (true != equals) {
                    str = "";
                }
                b.v(str);
            }
            return equals;
        } catch (JSONException e) {
            sv2.h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final boolean g(Context context, String str, String str2, String str3) {
        boolean z;
        if (!TextUtils.isEmpty(str2)) {
            synchronized (this.a) {
                z = this.d;
            }
            if (z) {
                sv2.b("Sending troubleshooting signals to the server.");
                c(context, str, str2, str3);
                return true;
            }
            return false;
        }
        return false;
    }

    public final Uri i(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                cu5 cu5Var = jv5.A.c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    gw.k(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    sv2.b("Error reading from internal storage.");
                    str5 = "";
                }
                this.b = str5;
                if (TextUtils.isEmpty(str5)) {
                    cu5 cu5Var2 = jv5.A.c;
                    String uuid = UUID.randomUUID().toString();
                    this.b = uuid;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(uuid.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        sv2.e("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}