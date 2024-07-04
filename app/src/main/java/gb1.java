package defpackage;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gb1  reason: default package */
public final class gb1 extends WebMessagePort.WebMessageCallback {
    public final /* synthetic */ fb1 a;

    public gb1(fb1 fb1Var) {
        this.a = fb1Var;
    }

    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        String data;
        List list;
        if (webMessage != null && (data = webMessage.getData()) != null) {
            fb1 fb1Var = this.a;
            Pattern compile = Pattern.compile(":");
            hy.d("Pattern.compile(pattern)", compile);
            Matcher matcher = compile.matcher(data);
            if (!matcher.find()) {
                list = Collections.singletonList(data.toString());
                hy.d("java.util.Collections.singletonList(element)", list);
            } else {
                ArrayList arrayList = new ArrayList(2);
                int i = 0;
                do {
                    arrayList.add(data.subSequence(i, matcher.start()).toString());
                    i = matcher.end();
                    if (arrayList.size() == 1) {
                        break;
                    }
                } while (matcher.find());
                arrayList.add(data.subSequence(i, data.length()).toString());
                list = arrayList;
            }
            if (list.size() == 2 && hy.a(list.get(0), fb1Var.q0)) {
                ga1.h().o().e(eb1.d((String) list.get(1), null));
            }
        }
    }
}