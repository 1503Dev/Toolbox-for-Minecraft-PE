package defpackage;

import android.util.Log;

/* renamed from: cj5  reason: default package */
public final class cj5 extends fy4 {
    public final String Q;

    public cj5(String str) {
        super(12);
        this.Q = str;
    }

    @Override // defpackage.fy4
    public final void h(String str) {
        String str2 = this.Q;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}