package defpackage;

import android.content.ContentValues;
import defpackage.xd1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wd1  reason: default package */
public final class wd1 {
    public final int a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* renamed from: wd1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final String a;
        public final xd1 b;

        public a(String str, xd1 xd1Var) {
            this.a = str;
            this.b = xd1Var;
        }
    }

    public wd1(int i) {
        this.a = i;
    }

    public final ic1 a() {
        String str;
        int i;
        String asString;
        Object obj;
        ic1 ic1Var = new ic1();
        eb1.l(this.a, ic1Var, "version");
        for (Map.Entry entry : this.b.entrySet()) {
            ic1 ic1Var2 = new ic1();
            Iterator it = ((ArrayList) entry.getValue()).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                nr nrVar = new nr();
                xd1 xd1Var = aVar.b;
                xd1Var.getClass();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < xd1Var.b.size(); i2++) {
                    if (i2 >= 0 && i2 < xd1Var.b.size()) {
                        ContentValues contentValues = (ContentValues) xd1Var.b.get(i2);
                        StringBuilder sb = new StringBuilder();
                        for (int i3 = 0; i3 < xd1Var.a.size(); i3++) {
                            if (i3 >= 0 && i3 < xd1Var.a.size()) {
                                i = ((xd1.a) xd1Var.a.get(i3)).c;
                            } else {
                                i = -1;
                            }
                            if (i == 3) {
                                asString = "\"";
                                sb.append("\"");
                                sb.append(contentValues.get(xd1Var.a(i3)));
                            } else {
                                asString = contentValues.getAsString(xd1Var.a(i3));
                            }
                            sb.append(asString);
                            if (i3 == xd1Var.a.size() - 1) {
                                obj = "";
                            } else {
                                obj = ',';
                            }
                            sb.append(obj);
                        }
                        str = sb.toString();
                    } else {
                        str = null;
                    }
                    arrayList.add(str);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    nrVar.d((String) it2.next());
                }
                eb1.h(ic1Var2, aVar.a, nrVar);
            }
            eb1.i(ic1Var, (String) entry.getKey(), ic1Var2);
        }
        return ic1Var;
    }
}