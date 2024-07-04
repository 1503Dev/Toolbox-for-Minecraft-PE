package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: cz2  reason: default package */
public final class cz2 implements mg2 {
    @Override // defpackage.mg2
    public final void b(Object obj, Map map) {
        float parseFloat;
        gy2 gy2Var = (gy2) obj;
        q13 q = gy2Var.q();
        if (q == null) {
            try {
                q13 q13Var = new q13(gy2Var, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                gy2Var.y(q13Var);
                q = q13Var;
            } catch (NullPointerException | NumberFormatException e) {
                sv2.e("Unable to parse videoMeta message.", e);
                jv5.A.g.f("VideoMetaGmsgHandler.onGmsg", e);
                return;
            }
        }
        float parseFloat2 = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat3 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        if (TextUtils.isEmpty(str)) {
            parseFloat = 0.0f;
        } else {
            parseFloat = Float.parseFloat(str);
        }
        if (sv2.j(3)) {
            sv2.b("Video Meta GMSG: currentTime : " + parseFloat3 + " , duration : " + parseFloat2 + " , isMuted : " + equals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        q.u4(parseFloat3, parseFloat2, i, equals, parseFloat);
    }
}