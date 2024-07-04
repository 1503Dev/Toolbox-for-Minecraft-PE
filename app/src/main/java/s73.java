package defpackage;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: s73  reason: default package */
public final class s73 implements lj5 {
    public final uj5 a;
    public final uj5 b;

    public s73(uj5 uj5Var, uj5 uj5Var2) {
        this.a = uj5Var;
        this.b = uj5Var2;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        j73 j73Var = (j73) this.a.c();
        yw2 yw2Var = zw2.a;
        tv2.C(yw2Var);
        Set emptySet = ((JSONObject) this.b.c()) == null ? Collections.emptySet() : Collections.singleton(new ii3(j73Var, yw2Var));
        tv2.C(emptySet);
        return emptySet;
    }
}