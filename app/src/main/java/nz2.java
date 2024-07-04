package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: nz2  reason: default package */
public final class nz2 implements Runnable {
    public final /* synthetic */ String P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ String S;
    public final /* synthetic */ oz2 T;

    public nz2(oz2 oz2Var, String str, String str2, String str3, String str4) {
        this.T = oz2Var;
        this.P = str;
        this.Q = str2;
        this.R = str3;
        this.S = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.P);
        if (!TextUtils.isEmpty(this.Q)) {
            hashMap.put("cachedSrc", this.Q);
        }
        String str2 = this.R;
        switch (str2.hashCode()) {
            case -1947652542:
                if (str2.equals("interrupted")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1396664534:
                if (str2.equals("badUrl")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1347010958:
                if (str2.equals("inProgress")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -659376217:
                if (str2.equals("contentLengthMissing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -642208130:
                if (str2.equals("playerFailed")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3387234:
                if (str2.equals("noop")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (str2.equals("error")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 6:
            case 7:
                str = "io";
                break;
            case '\b':
            case '\t':
                str = "network";
                break;
            case '\n':
            case 11:
                str = "policy";
                break;
            default:
                str = "internal";
                break;
        }
        hashMap.put("type", str);
        hashMap.put("reason", this.R);
        if (!TextUtils.isEmpty(this.S)) {
            hashMap.put("message", this.S);
        }
        oz2.k(this.T, hashMap);
    }
}