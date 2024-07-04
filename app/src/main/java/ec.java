package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.jm0;

/* renamed from: ec  reason: default package */
public final class ec extends hc {

    /* renamed from: ec$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jm0.a {
        @Override // defpackage.jm0.a
        public final void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // defpackage.jc
    public final void i() {
        jm0.r = new a();
    }
}