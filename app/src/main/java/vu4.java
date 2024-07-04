package defpackage;

import java.util.Map;

/* renamed from: vu4  reason: default package */
public final class vu4 extends lu4 {
    public final Object P;
    public int Q;
    public final /* synthetic */ xu4 R;

    public vu4(xu4 xu4Var, int i) {
        this.R = xu4Var;
        Object[] objArr = xu4Var.R;
        objArr.getClass();
        this.P = objArr[i];
        this.Q = i;
    }

    public final void a() {
        int i = this.Q;
        if (i != -1 && i < this.R.size()) {
            Object obj = this.P;
            xu4 xu4Var = this.R;
            int i2 = this.Q;
            Object[] objArr = xu4Var.R;
            objArr.getClass();
            if (dt4.l(obj, objArr[i2])) {
                return;
            }
        }
        xu4 xu4Var2 = this.R;
        Object obj2 = this.P;
        Object obj3 = xu4.Y;
        this.Q = xu4Var2.d(obj2);
    }

    @Override // defpackage.lu4, java.util.Map.Entry
    public final Object getKey() {
        return this.P;
    }

    @Override // defpackage.lu4, java.util.Map.Entry
    public final Object getValue() {
        Map a = this.R.a();
        if (a != null) {
            return a.get(this.P);
        }
        a();
        int i = this.Q;
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.R.S;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map a = this.R.a();
        if (a != null) {
            return a.put(this.P, obj);
        }
        a();
        int i = this.Q;
        if (i == -1) {
            this.R.put(this.P, obj);
            return null;
        }
        Object[] objArr = this.R.S;
        objArr.getClass();
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}