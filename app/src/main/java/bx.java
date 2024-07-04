package defpackage;

import io.mrarm.mctoolbox.ui.c;

/* renamed from: bx  reason: default package */
public final /* synthetic */ class bx implements c.C0038c.a.InterfaceC0039a {
    public static /* synthetic */ void b(String str, int i) {
        if (i == 0) {
            throw new IllegalArgumentException(str);
        }
    }

    @Override // io.mrarm.mctoolbox.ui.c.C0038c.a.InterfaceC0039a
    public tv0 a(String str) {
        return new gb(Byte.parseByte(str));
    }
}