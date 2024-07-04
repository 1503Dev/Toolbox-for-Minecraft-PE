package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;

/* renamed from: ln1  reason: default package */
public final class ln1 implements zv1, wg3, v64 {
    public final /* synthetic */ int P;
    public Object Q;
    public final Object R;

    public ln1() {
        this.P = 0;
        this.Q = new ByteArrayOutputStream(512);
        this.R = new DataOutputStream((ByteArrayOutputStream) this.Q);
    }

    @Override // defpackage.zv1
    public final File a() {
        if (((File) this.Q) == null) {
            this.Q = new File(((Context) this.R).getCacheDir(), "volley");
        }
        return (File) this.Q;
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 4:
                ((r6) obj).i((String) this.Q, (String) this.R);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }

    public /* synthetic */ ln1(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    public ln1(Context context) {
        this.P = 1;
        this.R = context;
        this.Q = null;
    }
}