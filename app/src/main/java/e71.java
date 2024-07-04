package defpackage;

/* renamed from: e71  reason: default package */
public final class e71 implements d71 {
    public final bm0 a;
    public final a b;

    /* renamed from: e71$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends yo<c71> {
        public a(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // defpackage.yo
        public final void d(is isVar, c71 c71Var) {
            c71 c71Var2 = c71Var;
            String str = c71Var2.a;
            if (str == null) {
                isVar.t(1);
            } else {
                isVar.y(1, str);
            }
            String str2 = c71Var2.b;
            if (str2 == null) {
                isVar.t(2);
            } else {
                isVar.y(2, str2);
            }
        }
    }

    public e71(bm0 bm0Var) {
        this.a = bm0Var;
        this.b = new a(bm0Var);
    }
}