package defpackage;

import defpackage.wv0;
import java.util.HashMap;

/* renamed from: ik */
public final /* synthetic */ class ik implements wv0.b {
    public static void a(String str, HashMap hashMap, String str2) {
        hashMap.put(str2, new jk(str));
    }

    public static /* synthetic */ String b(int i) {
        return i == 1 ? "BEGIN_ARRAY" : i == 2 ? "END_ARRAY" : i == 3 ? "BEGIN_OBJECT" : i == 4 ? "END_OBJECT" : i == 5 ? "NAME" : i == 6 ? "STRING" : i == 7 ? "NUMBER" : i == 8 ? "BOOLEAN" : i == 9 ? "NULL" : i == 10 ? "END_DOCUMENT" : "null";
    }

    @Override // defpackage.wv0.b
    public tv0 get() {
        return new jq();
    }
}