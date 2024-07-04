package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ot1  reason: default package */
public final class ot1 {
    public final List a;
    public final byte[] b;

    public ot1(int i, String str, ArrayList arrayList, byte[] bArr) {
        this.a = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.b = bArr;
    }
}