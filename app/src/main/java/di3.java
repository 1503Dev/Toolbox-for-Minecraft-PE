package defpackage;

/* renamed from: di3  reason: default package */
public final class di3 implements lj5 {
    public final /* synthetic */ int a;

    public /* synthetic */ di3(int i) {
        this.a = i;
    }

    @Override // defpackage.uj5
    public final /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new ci3();
            case 1:
                return "interstitial";
            case 2:
                return new as3("ttc", ml4.SIGNALS);
            default:
                return new ii4();
        }
    }
}