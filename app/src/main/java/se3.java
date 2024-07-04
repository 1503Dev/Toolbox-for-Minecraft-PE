package defpackage;

import java.nio.charset.Charset;

/* renamed from: se3  reason: default package */
public final class se3 {
    public static final jd3 b = new jd3();
    public final ce3 a;

    public se3() {
        ui3 ui3Var;
        ui3[] ui3VarArr = new ui3[2];
        ui3VarArr[0] = ls2.a;
        try {
            ui3Var = (ui3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            ui3Var = b;
        }
        ui3VarArr[1] = ui3Var;
        ce3 ce3Var = new ce3(ui3VarArr);
        Charset charset = z13.a;
        this.a = ce3Var;
    }
}