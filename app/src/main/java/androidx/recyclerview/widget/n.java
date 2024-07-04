package androidx.recyclerview.widget;

public final class n {
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;
    public boolean a = true;
    public int f = 0;
    public int g = 0;

    public final String toString() {
        StringBuilder b = e5.b("LayoutState{mAvailable=");
        b.append(this.b);
        b.append(", mCurrentPosition=");
        b.append(this.c);
        b.append(", mItemDirection=");
        b.append(this.d);
        b.append(", mLayoutDirection=");
        b.append(this.e);
        b.append(", mStartLine=");
        b.append(this.f);
        b.append(", mEndLine=");
        b.append(this.g);
        b.append('}');
        return b.toString();
    }
}