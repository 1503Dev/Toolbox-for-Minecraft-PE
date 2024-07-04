package defpackage;

/* renamed from: ys4  reason: default package */
public abstract class ys4 implements ht4 {
    public abstract boolean a(char c);

    @Override // defpackage.ht4
    @Deprecated
    public final /* synthetic */ boolean e(Object obj) {
        return a(((Character) obj).charValue());
    }
}