package defpackage;

import defpackage.ob;
import javax.annotation.Nullable;

/* renamed from: ov  reason: default package */
public abstract class ov<ResponseT, ReturnT> extends xq0<ReturnT> {
    public final al0 a;
    public final ob.a b;
    public final pg<ql0, ResponseT> c;

    /* renamed from: ov$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a<ResponseT, ReturnT> extends ov<ResponseT, ReturnT> {
        public final qb<ResponseT, ReturnT> d;

        public a(al0 al0Var, ob.a aVar, pg<ql0, ResponseT> pgVar, qb<ResponseT, ReturnT> qbVar) {
            super(al0Var, aVar, pgVar);
            this.d = qbVar;
        }

        @Override // defpackage.ov
        public final Object c(mb0 mb0Var, Object[] objArr) {
            return this.d.b(mb0Var);
        }
    }

    /* renamed from: ov$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b<ResponseT> extends ov<ResponseT, Object> {
        public final qb<ResponseT, pb<ResponseT>> d;
        public final boolean e;

        public b(al0 al0Var, ob.a aVar, pg pgVar, qb qbVar) {
            super(al0Var, aVar, pgVar);
            this.d = qbVar;
            this.e = false;
        }

        @Override // defpackage.ov
        public final Object c(mb0 mb0Var, Object[] objArr) {
            pb pbVar = (pb) this.d.b(mb0Var);
            lg lgVar = (lg) objArr[objArr.length - 1];
            try {
                return this.e ? m00.b(pbVar, lgVar) : m00.a(pbVar, lgVar);
            } catch (Exception e) {
                return m00.d(e, lgVar);
            }
        }
    }

    /* renamed from: ov$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c<ResponseT> extends ov<ResponseT, Object> {
        public final qb<ResponseT, pb<ResponseT>> d;

        public c(al0 al0Var, ob.a aVar, pg<ql0, ResponseT> pgVar, qb<ResponseT, pb<ResponseT>> qbVar) {
            super(al0Var, aVar, pgVar);
            this.d = qbVar;
        }

        @Override // defpackage.ov
        public final Object c(mb0 mb0Var, Object[] objArr) {
            pb pbVar = (pb) this.d.b(mb0Var);
            lg lgVar = (lg) objArr[objArr.length - 1];
            try {
                return m00.c(pbVar, lgVar);
            } catch (Exception e) {
                return m00.d(e, lgVar);
            }
        }
    }

    public ov(al0 al0Var, ob.a aVar, pg<ql0, ResponseT> pgVar) {
        this.a = al0Var;
        this.b = aVar;
        this.c = pgVar;
    }

    @Override // defpackage.xq0
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return (ReturnT) c(new mb0(this.a, objArr, this.b, this.c), objArr);
    }

    @Nullable
    public abstract Object c(mb0 mb0Var, Object[] objArr);
}