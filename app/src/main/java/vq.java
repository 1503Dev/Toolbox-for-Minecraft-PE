package defpackage;

import defpackage.wq;
import java.util.ArrayList;

/* renamed from: vq  reason: default package */
public final class vq implements ag<wq.a> {
    public final /* synthetic */ String a;

    public vq(String str) {
        this.a = str;
    }

    @Override // defpackage.ag
    /* renamed from: a */
    public final void accept(wq.a aVar) {
        synchronized (wq.c) {
            os0<String, ArrayList<ag<wq.a>>> os0Var = wq.d;
            ArrayList<ag<wq.a>> orDefault = os0Var.getOrDefault(this.a, null);
            if (orDefault == null) {
                return;
            }
            os0Var.remove(this.a);
            for (int i = 0; i < orDefault.size(); i++) {
                orDefault.get(i).accept(aVar);
            }
        }
    }
}