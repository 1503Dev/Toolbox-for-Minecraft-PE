package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fg2  reason: default package */
public final class fg2 extends gv1 {
    public final Object b0;
    public final ri2 c0;
    public final /* synthetic */ byte[] d0;
    public final /* synthetic */ Map e0;
    public final /* synthetic */ rv2 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg2(int i, String str, ri2 ri2Var, hf2 hf2Var, byte[] bArr, HashMap hashMap, rv2 rv2Var) {
        super(i, str, hf2Var);
        this.d0 = bArr;
        this.e0 = hashMap;
        this.f0 = rv2Var;
        this.b0 = new Object();
        this.c0 = ri2Var;
    }

    @Override // defpackage.gv1
    public final lv1 b(yu1 yu1Var) {
        String str;
        String str2;
        try {
            byte[] bArr = yu1Var.b;
            Map map = yu1Var.c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(yu1Var.b);
        }
        return new lv1(str, bw1.b(yu1Var));
    }

    @Override // defpackage.gv1
    public final Map f() {
        Map map = this.e0;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // defpackage.gv1
    public final void h(Object obj) {
        ri2 ri2Var;
        String str = (String) obj;
        rv2 rv2Var = this.f0;
        rv2Var.getClass();
        if (rv2.c() && str != null) {
            rv2Var.d("onNetworkResponseBody", new a53(str.getBytes()));
        }
        synchronized (this.b0) {
            ri2Var = this.c0;
        }
        ri2Var.a(str);
    }

    @Override // defpackage.gv1
    public final byte[] m() {
        byte[] bArr = this.d0;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}