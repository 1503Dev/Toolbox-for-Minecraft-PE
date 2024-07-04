package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ad0;
import defpackage.iw;
import defpackage.l41;

/* renamed from: ad0  reason: default package */
public final class ad0 extends fj {
    public static final k41 f;

    /* renamed from: ad0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends at0<Object> {
        public a(View view) {
            super(view);
        }
    }

    /* renamed from: ad0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends RecyclerView.n {
        public final Paint a;
        public final float b;
        public final float c;

        public b(Context context) {
            Paint paint = new Paint();
            this.a = paint;
            paint.setColor(context.getResources().getColor(2131099701));
            this.b = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
            this.c = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void e(Canvas canvas, RecyclerView recyclerView) {
            int childCount = recyclerView.getChildCount();
            int i = 0;
            boolean z = false;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    Object item = ad0.this.c.getItem(childAdapterPosition);
                    if (item instanceof px0) {
                        px0 px0Var = (px0) item;
                        z |= px0Var.n.isRunning();
                        float floatValue = ((Float) px0Var.n.getAnimatedValue()).floatValue();
                        if (floatValue != 0.0f) {
                            float translationY = (childAt.getTranslationY() + childAt.getBottom()) - this.c;
                            while (true) {
                                i++;
                                if (i >= childCount) {
                                    break;
                                }
                                View childAt2 = recyclerView.getChildAt(i);
                                int childAdapterPosition2 = recyclerView.getChildAdapterPosition(childAt2);
                                Object a = ad0.this.c.a(childAdapterPosition2);
                                if (childAdapterPosition2 != -1) {
                                    if (a != item) {
                                        translationY = (childAt2.getTranslationY() + childAt2.getTop()) - this.c;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (i == childCount) {
                                translationY = recyclerView.getHeight();
                            }
                            i--;
                            canvas.drawRect(0.0f, childAt.getTranslationY() + childAt.getTop() + this.c, this.b * floatValue, translationY, this.a);
                        }
                    }
                }
                i++;
            }
            canvas.drawRect(0.0f, 0.0f, 0, 20.0f, this.a);
            if (z) {
                recyclerView.post(new no(1, recyclerView));
            }
        }
    }

    /* renamed from: ad0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c implements iw.a {
        public RecyclerView a;
        public vv b;

        public c(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override // defpackage.iw.a
        public final void a(iw iwVar) {
            this.a.invalidate();
        }
    }

    static {
        l41.a aVar = new l41.a() { // from class: zc0
            @Override // defpackage.l41.a
            public final j41 a(Context context) {
                return new ad0.a(new View(context));
            }
        };
        int i = l41.b;
        f = new k41(aVar);
    }

    public final void n(vv vvVar) {
        oj ojVar = new oj();
        vvVar.f(ojVar);
        ojVar.o(new ct0(null, f));
        m(ojVar);
    }
}