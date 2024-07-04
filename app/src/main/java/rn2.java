package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: rn2  reason: default package */
public final class rn2 extends yn2 {
    public final Map R;
    public final Activity S;
    public final String T;
    public final long U;
    public final long V;
    public final String W;
    public final String X;

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rn2(y03 y03Var, Map map) {
        super(y03Var, "createCalendarEvent");
        long j;
        String str;
        this.R = map;
        this.S = y03Var.g();
        this.T = g("description");
        this.W = g("summary");
        String str2 = (String) map.get("start_ticks");
        long j2 = -1;
        if (str2 != null) {
            try {
                j = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                j = -1;
            }
            this.U = j;
            str = (String) this.R.get("end_ticks");
            if (str != null) {
                try {
                    j2 = Long.parseLong(str);
                } catch (NumberFormatException unused2) {
                }
            }
            this.V = j2;
            this.X = g("location");
        }
        j = -1;
        this.U = j;
        str = (String) this.R.get("end_ticks");
        if (str != null) {
        }
        this.V = j2;
        this.X = g("location");
    }

    public final String g(String str) {
        return TextUtils.isEmpty((CharSequence) this.R.get(str)) ? "" : (String) this.R.get(str);
    }
}