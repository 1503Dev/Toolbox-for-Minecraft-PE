package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* renamed from: l41  reason: default package */
public abstract class l41<T> {
    public static int b;
    public static final HashMap c = new HashMap();
    public final int a;

    /* renamed from: l41$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a<T> {
        j41 a(Context context);
    }

    public l41() {
        int i = b;
        b = i + 1;
        this.a = i;
        c.put(Integer.valueOf(i), this);
    }

    public abstract j41 a(Context context, RecyclerView recyclerView);
}