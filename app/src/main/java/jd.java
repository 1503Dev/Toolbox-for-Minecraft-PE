package defpackage;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: jd  reason: default package */
public final class jd {
    @Nullable
    public final Account a;
    public final Set<Scope> b;
    public final Set<Scope> c;
    @Nullable
    public final View d;
    public final String e;
    public final String f;
    public final ds0 g;
    public Integer h;

    /* renamed from: jd$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        @Nullable
        public Account a;
        public g7<Scope> b;
        public String c;
        public String d;
    }

    public jd(@Nullable Account account, g7 g7Var, String str, String str2) {
        ds0 ds0Var = ds0.b;
        this.a = account;
        Set<Scope> emptySet = g7Var == null ? Collections.emptySet() : Collections.unmodifiableSet(g7Var);
        this.b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.d = null;
        this.e = str;
        this.f = str2;
        this.g = ds0Var;
        HashSet hashSet = new HashSet(emptySet);
        for (og1 og1Var : emptyMap.values()) {
            og1Var.getClass();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}