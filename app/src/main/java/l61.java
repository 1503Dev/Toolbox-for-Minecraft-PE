package defpackage;

import android.view.View;
import android.view.WindowId;

/* renamed from: l61  reason: default package */
public final class l61 implements m61 {
    public final WindowId a;

    public l61(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l61) && ((l61) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}