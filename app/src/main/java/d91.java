package defpackage;

import android.os.Bundle;
import io.mrarm.yurai.YuraiActivity;
import io.mrarm.yurai.msa.SecurityScope;
import io.mrarm.yurai.xbox.CLLInstance;
import java.lang.ref.WeakReference;

/* renamed from: d91  reason: default package */
public final class d91 {
    public static WeakReference<YuraiActivity> a;
    public static final SecurityScope b = new SecurityScope("user.auth.xboxlive.com", "mbi_ssl");
    public static CLLInstance c;

    /* renamed from: d91$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final int a;
        public final String b;
        public final String c;

        public a(String str, String str2, int i) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public static a a(int i, String str) {
            return new a(str, null, i);
        }
    }

    public static void a(String str, boolean z) {
        long j;
        Bundle bundle = new Bundle();
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        bundle.putLong("success", j);
        bundle.putString("result", str);
        j91.b.a(bundle, "xbl_silent_login");
    }
}