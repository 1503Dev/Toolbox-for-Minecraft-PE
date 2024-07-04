package defpackage;

import android.content.Context;
import android.text.TextUtils;
import defpackage.wu0;

/* renamed from: s61  reason: default package */
public final class s61 implements wu0.c {
    public final /* synthetic */ Context a;

    public s61(Context context) {
        this.a = context;
    }

    @Override // defpackage.wu0.c
    public final wu0 a(wu0.b bVar) {
        Context context = this.a;
        String str = bVar.b;
        wu0.a aVar = bVar.c;
        if (aVar != null) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    return new fs(context, str, aVar, true);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}