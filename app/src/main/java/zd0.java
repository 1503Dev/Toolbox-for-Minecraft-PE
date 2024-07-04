package defpackage;

import defpackage.ns0;
import defpackage.r2;
import defpackage.rs0;
import defpackage.tv;
import java.util.Objects;

/* renamed from: zd0  reason: default package */
public final class zd0 implements ns0.c {
    public final /* synthetic */ tv.a a;

    /* renamed from: zd0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements rs0.a {
        public a() {
        }
    }

    public zd0(r2.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.ns0.c
    public final void a(rs0 rs0Var) {
        this.a.c();
        rs0Var.b.g = new a();
        tv.a aVar = this.a;
        Objects.requireNonNull(aVar);
        rs0Var.b.h = new yd0(aVar);
        rs0Var.a();
    }

    @Override // defpackage.ns0.c
    public final void b() {
        this.a.b();
    }
}