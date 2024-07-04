package defpackage;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.math.BigInteger;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: av2  reason: default package */
public final class av2 implements mc2 {
    public final /* synthetic */ int P;
    public Object Q;
    public Object R;

    public av2(int i) {
        this.P = i;
        if (i != 4) {
            this.Q = BigInteger.ONE;
            this.R = "0";
            return;
        }
        ac1 ac1Var = new ac1();
        this.Q = ac1Var;
        this.R = new mb1(ac1Var);
    }

    @Override // defpackage.mc2
    /* renamed from: a */
    public final JSONObject mo6a() {
        return ((ym3) this.Q).t();
    }

    @Override // defpackage.mc2
    public final JSONObject c() {
        switch (this.P) {
            case 1:
                return (JSONObject) this.Q;
            default:
                return ((ym3) this.Q).m();
        }
    }

    @Override // defpackage.mc2
    public final void d() {
        nw4 nw4Var = am3.e0;
        Map o = ((ym3) this.Q).o();
        if (o != null) {
            int i = nw4Var.S;
            int i2 = 0;
            while (i2 < i) {
                Object obj = o.get((String) nw4Var.get(i2));
                i2++;
                if (obj != null) {
                    ((ym3) this.Q).onClick((ViewGroup) this.R);
                    return;
                }
            }
        }
    }

    @Override // defpackage.mc2
    public final void g(MotionEvent motionEvent) {
        ((ym3) this.Q).onTouch(null, motionEvent);
    }

    public /* synthetic */ av2(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }
}