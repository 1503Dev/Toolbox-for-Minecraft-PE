package defpackage;

import defpackage.lu;
import defpackage.nl0;
import defpackage.rg;
import defpackage.uk0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: wa  reason: default package */
public final class wa implements cy {
    public final rg a;

    public wa(rg rgVar) {
        this.a = rgVar;
    }

    @Override // defpackage.cy
    public final nl0 a(bk0 bk0Var) {
        boolean z;
        uk0 uk0Var = bk0Var.e;
        uk0Var.getClass();
        uk0.a aVar = new uk0.a(uk0Var);
        vk0 vk0Var = uk0Var.d;
        if (vk0Var != null) {
            e50 contentType = vk0Var.contentType();
            if (contentType != null) {
                aVar.c.d("Content-Type", contentType.a);
            }
            long contentLength = vk0Var.contentLength();
            if (contentLength != -1) {
                aVar.c.d("Content-Length", Long.toString(contentLength));
                aVar.c("Transfer-Encoding");
            } else {
                aVar.c.d("Transfer-Encoding", "chunked");
                aVar.c("Content-Length");
            }
        }
        if (uk0Var.a("Host") == null) {
            aVar.c.d("Host", c31.k(uk0Var.a, false));
        }
        if (uk0Var.a("Connection") == null) {
            aVar.c.d("Connection", "Keep-Alive");
        }
        if (uk0Var.a("Accept-Encoding") == null && uk0Var.a("Range") == null) {
            aVar.c.d("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        ((rg.a) this.a).getClass();
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                qg qgVar = (qg) emptyList.get(i);
                sb.append(qgVar.a);
                sb.append('=');
                sb.append(qgVar.b);
            }
            aVar.c.d("Cookie", sb.toString());
        }
        if (uk0Var.a("User-Agent") == null) {
            aVar.c.d("User-Agent", "okhttp/3.14.7");
        }
        nl0 a = bk0Var.a(aVar.a());
        mv.d(this.a, uk0Var.a, a.U);
        nl0.a aVar2 = new nl0.a(a);
        aVar2.a = uk0Var;
        if (z && "gzip".equalsIgnoreCase(a.d("Content-Encoding")) && mv.b(a)) {
            bu buVar = new bu(a.V.y());
            lu.a e = a.U.e();
            e.c("Content-Encoding");
            e.c("Content-Length");
            ArrayList arrayList = e.a;
            lu.a aVar3 = new lu.a();
            Collections.addAll(aVar3.a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar2.f = aVar3;
            String d = a.d("Content-Type");
            Logger logger = rb0.a;
            aVar2.g = new ck0(d, -1L, new wj0(buVar));
        }
        return aVar2.a();
    }
}