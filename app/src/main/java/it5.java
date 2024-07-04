package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* renamed from: it5  reason: default package */
public final class it5 extends gk5 {
    public long h;
    public int i;
    public int j;

    public it5() {
        super(2);
        this.j = 32;
    }

    @Override // defpackage.gk5
    public final void b() {
        super.b();
        this.i = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(gk5 gk5Var) {
        boolean z;
        tv2.G(!gk5Var.a(1073741824));
        tv2.G(!gk5Var.a(268435456));
        tv2.G(!gk5Var.a(4));
        int i = this.i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i < this.j && gk5Var.a(RecyclerView.UNDEFINED_DURATION) == a(RecyclerView.UNDEFINED_DURATION)) {
                ByteBuffer byteBuffer = gk5Var.c;
                if (byteBuffer != null && (r3 = this.c) != null) {
                }
            }
            return false;
        }
        int i2 = this.i;
        this.i = i2 + 1;
        if (i2 == 0) {
            this.e = gk5Var.e;
            if (gk5Var.a(1)) {
                this.a = 1;
            }
        }
        if (gk5Var.a(RecyclerView.UNDEFINED_DURATION)) {
            this.a = RecyclerView.UNDEFINED_DURATION;
        }
        ByteBuffer byteBuffer2 = gk5Var.c;
        if (byteBuffer2 != null) {
            c(byteBuffer2.remaining());
            this.c.put(byteBuffer2);
        }
        this.h = gk5Var.e;
        return true;
    }
}