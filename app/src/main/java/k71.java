package defpackage;

import android.os.Build;
import androidx.work.ListenableWorker;
import defpackage.lc0;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: k71  reason: default package */
public abstract class k71 {
    public UUID a;
    public l71 b;
    public Set<String> c;

    /* renamed from: k71$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a<B extends a<?, ?>, W extends k71> {
        public l71 b;
        public HashSet c = new HashSet();
        public UUID a = UUID.randomUUID();

        public a(Class<? extends ListenableWorker> cls) {
            this.b = new l71(this.a.toString(), cls.getName());
            this.c.add(cls.getName());
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r5 == false) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final lc0 a() {
            boolean z;
            lc0 lc0Var = new lc0((lc0.a) this);
            sf sfVar = this.b.j;
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i >= 24) {
                if (sfVar.h.a.size() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!sfVar.d && !sfVar.b && (i < 23 || !sfVar.c)) {
                z2 = false;
            }
            if (this.b.q && z2) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.a = UUID.randomUUID();
            l71 l71Var = new l71(this.b);
            this.b = l71Var;
            l71Var.a = this.a.toString();
            return lc0Var;
        }
    }

    public k71(UUID uuid, l71 l71Var, HashSet hashSet) {
        this.a = uuid;
        this.b = l71Var;
        this.c = hashSet;
    }
}