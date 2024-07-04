package defpackage;

/* renamed from: ce3  reason: default package */
public final class ce3 implements ui3 {
    public final ui3[] a;

    public ce3(ui3... ui3VarArr) {
        this.a = ui3VarArr;
    }

    @Override // defpackage.ui3
    public final zh3 a(Class cls) {
        ui3[] ui3VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            ui3 ui3Var = ui3VarArr[i];
            if (ui3Var.b(cls)) {
                return ui3Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.ui3
    public final boolean b(Class cls) {
        ui3[] ui3VarArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (ui3VarArr[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}