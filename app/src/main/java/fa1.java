package defpackage;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: fa1  reason: default package */
public abstract class fa1 extends ua1 {
    public final HashSet<String> c;
    public final JSONObject d;
    public final long e;

    public fa1(ta1 ta1Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(ta1Var);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}