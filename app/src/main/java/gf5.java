package defpackage;

import java.nio.charset.Charset;

/* renamed from: gf5  reason: default package */
public final class gf5 {
    public static final ef5 b = new ef5();
    public final ff5 a;

    public gf5() {
        mf5 mf5Var;
        mf5[] mf5VarArr = new mf5[2];
        mf5VarArr[0] = de5.a;
        try {
            mf5Var = (mf5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            mf5Var = b;
        }
        mf5VarArr[1] = mf5Var;
        ff5 ff5Var = new ff5(mf5VarArr);
        Charset charset = re5.a;
        this.a = ff5Var;
    }
}