package defpackage;

import android.content.Context;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gc1  reason: default package */
public final class gc1 extends yc1 {
    public String x0;
    public String y0;

    public gc1(Context context, int i, rc1 rc1Var) {
        super(context, i, rc1Var);
        this.x0 = "";
        this.y0 = "";
    }

    @Override // defpackage.fb1
    /* renamed from: A */
    public final void u(Exception exc) {
        ga1.h().n().d(0, 0, exc.getClass().toString() + " during metadata injection w/ metadata = " + getInfo().q("metadata"), true);
        i2 remove = ga1.h().k().c.remove(getInfo().q("ad_session_id"));
        if (remove != null) {
            remove.b();
        }
    }

    public final String B() {
        boolean z;
        String str;
        if (this.y0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Pattern compile = Pattern.compile("script\\s*src\\s*=\\s*\"mraid.js\"");
            hy.d("Pattern.compile(pattern)", compile);
            String str2 = "script src=\"file://" + getMraidFilepath() + '\"';
            String str3 = this.y0;
            hy.e("input", str3);
            hy.e("replacement", str2);
            String replaceFirst = compile.matcher(str3).replaceFirst(str2);
            hy.d("nativePattern.matcher(in…replaceFirst(replacement)", replaceFirst);
            return replaceFirst;
        }
        FileInputStream fileInputStream = new FileInputStream(this.x0);
        try {
            StringBuilder sb = new StringBuilder(fileInputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read < 0) {
                    break;
                }
                sb.append(new String(bArr, 0, read, qc.a));
            }
            if (lu0.D(this.x0, ".html")) {
                str = sb.toString();
            } else {
                str = "<html><script>" + ((Object) sb) + "</script></html>";
            }
            vj.l(fileInputStream, null);
            return str;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vj.l(fileInputStream, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.fb1, defpackage.jd1
    public final void b() {
        long j;
        if (!getDestroyed()) {
            dc1 dc1Var = new dc1(this);
            if (this.v0) {
                j = 1000;
            } else {
                j = 0;
            }
            eg1.e(j, dc1Var);
        }
    }

    @Override // defpackage.yc1, defpackage.fb1, defpackage.ka1
    public final void o() {
        ic1 ic1Var;
        rc1 message = getMessage();
        if (message == null) {
            ic1Var = null;
        } else {
            ic1Var = message.b;
        }
        if (ic1Var == null) {
            ic1Var = new ic1();
        }
        this.x0 = ic1Var.q("filepath");
        this.y0 = ic1Var.q("interstitial_html");
        super.o();
    }

    @Override // defpackage.ka1
    public final void p() {
        ic1 ic1Var;
        String q;
        boolean z;
        try {
            rc1 message = getMessage();
            if (message == null) {
                ic1Var = null;
            } else {
                ic1Var = message.b;
            }
            if (ic1Var == null) {
                ic1Var = new ic1();
            }
            String s = s(B(), eb1.d(ic1Var.n("info").q("metadata"), null).q("iab_filepath"));
            Pattern compile = Pattern.compile("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;");
            hy.d("Pattern.compile(pattern)", compile);
            String quoteReplacement = Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + ((Object) q) + ';');
            hy.e("input", s);
            hy.e("replacement", quoteReplacement);
            String replaceFirst = compile.matcher(s).replaceFirst(quoteReplacement);
            hy.d("nativePattern.matcher(in…replaceFirst(replacement)", replaceFirst);
            String mUrl = getMUrl();
            if (mUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mUrl = getBaseUrl();
            }
            loadDataWithBaseURL(mUrl, replaceFirst, "text/html", null, null);
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException e) {
            u(e);
        }
    }

    @Override // defpackage.ka1
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.fb1
    public final /* synthetic */ String x(ic1 ic1Var) {
        return this.y0.length() > 0 ? "" : super.x(ic1Var);
    }
}