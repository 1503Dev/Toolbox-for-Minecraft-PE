package defpackage;

import defpackage.wv0;

/* renamed from: ho  reason: default package */
public final /* synthetic */ class ho implements ix, wv0.b {
    public static String b(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    @Override // defpackage.ix
    public String a(float f) {
        return String.valueOf(ko.g[(int) f]);
    }

    @Override // defpackage.wv0.b
    public tv0 get() {
        return new eb();
    }
}