package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: uk1  reason: default package */
public final class uk1 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final void a(yt2 yt2Var) {
        int i = 0;
        while (true) {
            et2[] et2VarArr = yt2Var.P;
            if (i < et2VarArr.length) {
                et2 et2Var = et2VarArr[i];
                if (et2Var instanceof bo1) {
                    bo1 bo1Var = (bo1) et2Var;
                    if ("iTunSMPB".equals(bo1Var.R) && b(bo1Var.S)) {
                        return;
                    }
                } else if (et2Var instanceof no1) {
                    no1 no1Var = (no1) et2Var;
                    if ("com.apple.iTunes".equals(no1Var.Q) && "iTunSMPB".equals(no1Var.R) && b(no1Var.S)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = zn4.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}