package defpackage;

/* renamed from: ov5  reason: default package */
public final class ov5 extends lr2 {
    public ov5(int i, long j, Object obj) {
        super(obj, -1, -1, j, i);
    }

    public ov5(long j, Object obj) {
        super(j, obj);
    }

    public ov5(Object obj) {
        super(-1L, obj);
    }

    public ov5(lr2 lr2Var) {
        super(lr2Var);
    }

    public final ov5 b(Object obj) {
        lr2 lr2Var;
        if (this.a.equals(obj)) {
            lr2Var = this;
        } else {
            lr2Var = new lr2(obj, this.b, this.c, this.d, this.e);
        }
        return new ov5(lr2Var);
    }

    public ov5(Object obj, int i, int i2, long j) {
        super(obj, i, i2, j, -1);
    }
}