package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: m4  reason: default package */
public class m4 extends Exception {
    @Deprecated
    public final Status P;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m4(Status status) {
        super(r3.toString());
        int i = status.Q;
        String str = status.R;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        this.P = status;
    }
}