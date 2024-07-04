package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class WorkerParameters {
    public UUID a;
    public b b;
    public HashSet c;
    public a d;
    public int e;
    public Executor f;
    public bw0 g;
    public u71 h;
    public fg0 i;
    public er j;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, b bVar, List list, a aVar, int i, ExecutorService executorService, bw0 bw0Var, t71 t71Var, j71 j71Var, x61 x61Var) {
        this.a = uuid;
        this.b = bVar;
        this.c = new HashSet(list);
        this.d = aVar;
        this.e = i;
        this.f = executorService;
        this.g = bw0Var;
        this.h = t71Var;
        this.i = j71Var;
        this.j = x61Var;
    }
}