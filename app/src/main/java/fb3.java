package defpackage;

import android.util.JsonReader;
import java.util.regex.Matcher;

/* renamed from: fb3  reason: default package */
public final class fb3 implements wy4, bz1, dx2, e74, wg3, yb0, v64 {
    public final /* synthetic */ int P;
    public Object Q;

    public /* synthetic */ fb3(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.dx2, defpackage.e74
    /* renamed from: a */
    public final void mo1a() {
        switch (this.P) {
            case 2:
                vz3.k("Rejecting reference for JS Engine.");
                ((jj2) this.Q).c();
                return;
            default:
                synchronized (((b74) this.Q)) {
                }
                return;
        }
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r0v111 ?? I:??[int, boolean])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r171, byte[] r172) {
        /*
            Method dump skipped, instructions count: 2746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb3.b(byte[], byte[]):void");
    }

    @Override // defpackage.yb0
    public final void c(yv0 yv0Var) {
        hr4 hr4Var = (hr4) this.Q;
        if (yv0Var.j()) {
            hr4Var.cancel(false);
        } else if (yv0Var.l()) {
            hr4Var.h(yv0Var.i());
        } else {
            Exception h = yv0Var.h();
            if (h == null) {
                throw new IllegalStateException();
            }
            hr4Var.i(h);
        }
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 6:
                el4 el4Var = (el4) this.Q;
                ((pl4) obj).h((ml4) el4Var.P, el4Var.Q);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        switch (this.P) {
            case 0:
                rq2 rq2Var = (rq2) obj;
                ((hb3) this.Q).f.r0(true);
                return;
            case 3:
                hi4 hi4Var = (hi4) obj;
                if (((Boolean) w82.d.c.a(x92.f5)).booleanValue()) {
                    hz3 hz3Var = ((mv3) this.Q).e;
                    int i = ((ci4) hi4Var.b.Q).e;
                    synchronized (hz3Var.g) {
                        hz3Var.b = i;
                    }
                    hz3 hz3Var2 = ((mv3) this.Q).e;
                    long j = ((ci4) hi4Var.b.Q).f;
                    synchronized (hz3Var2.h) {
                        hz3Var2.c = j;
                    }
                    return;
                }
                return;
            default:
                synchronized (((b74) this.Q)) {
                    ((b74) this.Q).R = ((ea3) obj).f;
                    ((ea3) obj).a();
                }
                return;
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        switch (this.P) {
            case 0:
                ((hb3) this.Q).f.r0(false);
                return;
            default:
                if (((Boolean) w82.d.c.a(x92.f5)).booleanValue()) {
                    Matcher matcher = mv3.h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        hz3 hz3Var = ((mv3) this.Q).e;
                        int parseInt = Integer.parseInt(group);
                        synchronized (hz3Var.g) {
                            hz3Var.b = parseInt;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fb3(JsonReader jsonReader) {
        char c;
        this.P = 5;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals("description")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                jsonReader.nextInt();
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.Q = str;
    }

    public /* synthetic */ fb3(fz1 fz1Var) {
        this.P = 1;
        this.Q = fz1Var;
    }

    public fb3(jj2 jj2Var) {
        this.P = 2;
        this.Q = jj2Var;
    }

    public /* synthetic */ fb3(io5 io5Var) {
        this.P = 8;
        this.Q = io5Var;
    }
}