package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: my  reason: default package */
public final /* synthetic */ class my implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ my(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ForegroundColorSpan foregroundColorSpan;
        switch (this.P) {
            case 0:
                ((ny) this.Q).f((Runnable) this.R);
                return;
            default:
                v20 v20Var = (v20) this.Q;
                String str = (String) this.R;
                Pattern pattern = v20.i;
                v20Var.getClass();
                Matcher matcher = v20.i.matcher(str);
                ce ceVar = new ce();
                if (v20Var.e == 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < v20Var.d.length()) {
                            if (v20Var.d.charAt(i2) != '\n') {
                                i2++;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                    if (i2 != -1) {
                        CharSequence charSequence = v20Var.d;
                        ceVar.a(charSequence.subSequence(i2 + 1, charSequence.length()), new Object[0]);
                    }
                } else {
                    ceVar.a(v20Var.d, new Object[0]);
                }
                ceVar.a("\n", new Object[0]);
                int i3 = 0;
                while (matcher.find()) {
                    ceVar.a(str.subSequence(i3, matcher.start()), new Object[0]);
                    String group = matcher.group(1);
                    if (group.equals("0")) {
                        ceVar.b(ForegroundColorSpan.class);
                    } else if (group.startsWith("38;5;")) {
                        try {
                            i = Integer.parseInt(group.substring(5));
                        } catch (NumberFormatException unused) {
                            i = -1;
                        }
                        if (i == 40) {
                            foregroundColorSpan = new ForegroundColorSpan(-8271996);
                        } else if (i == 75) {
                            foregroundColorSpan = new ForegroundColorSpan(-10177034);
                        } else if (i == 166) {
                            foregroundColorSpan = new ForegroundColorSpan(-30107);
                        } else if (i == 196) {
                            foregroundColorSpan = new ForegroundColorSpan(-1739917);
                        }
                        SpannableStringBuilder spannableStringBuilder = ceVar.a;
                        spannableStringBuilder.setSpan(foregroundColorSpan, spannableStringBuilder.length(), ceVar.a.length(), 18);
                    } else {
                        Log.e("LogOverlay", "Unknown cmd: " + group);
                    }
                    i3 = matcher.end();
                }
                ceVar.a(str.subSequence(i3, str.length()), new Object[0]);
                ceVar.b(ForegroundColorSpan.class);
                SpannableStringBuilder spannableStringBuilder2 = ceVar.a;
                v20Var.d = spannableStringBuilder2;
                v20Var.c.setText(spannableStringBuilder2);
                int i4 = v20Var.e;
                if (i4 > 0) {
                    v20Var.e = i4 - 1;
                    return;
                }
                return;
        }
    }
}