package defpackage;

import android.content.Context;
import defpackage.e11;
import io.mrarm.mctoolbox.bridge.b;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: yc0  reason: default package */
public class yc0 implements vz<iw> {
    public final Type a = new a().b;
    public final Context b;
    public final io.mrarm.mctoolbox.bridge.a c;
    public final sv d;
    public final wv e;
    public final zv f;
    public final tv g;
    public final uv h;

    /* renamed from: yc0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends u11<List<iw>> {
    }

    public yc0(Context context, b bVar, ny0 ny0Var, wv wvVar, iy0 iy0Var, tv tvVar, ve0 ve0Var) {
        this.b = context;
        this.c = bVar;
        this.d = ny0Var;
        this.e = wvVar;
        this.f = iy0Var;
        this.g = tvVar;
        this.h = ve0Var;
    }

    @Override // defpackage.vz
    public final Object a(wz wzVar, e11.a aVar) {
        Object c;
        zz o = wzVar.o();
        String q = o.r("type").q();
        if (q != null) {
            iw b = b(q);
            if (b != null) {
                if (b instanceof xc0) {
                    xc0 xc0Var = (xc0) b;
                    xc0Var.b = this.g;
                    xc0Var.c = this.h;
                    xc0Var.i(this.b, o);
                }
                if ((b instanceof jw) && o.r("items") != null) {
                    jw jwVar = (jw) b;
                    wz r = o.r("items");
                    Type type = this.a;
                    xt xtVar = e11.this.c;
                    xtVar.getClass();
                    if (r == null) {
                        c = null;
                    } else {
                        c = xtVar.c(new g00(r), type);
                    }
                    jwVar.d((List) c);
                }
                return b;
            }
            throw new a00(k6.b("Unknown type: ", q));
        }
        throw new a00("Type is null");
    }

    public iw b(String str) {
        char c = 65535;
        switch (str.hashCode()) {
            case -1422950858:
                if (str.equals("action")) {
                    c = 0;
                    break;
                }
                break;
            case -899647263:
                if (str.equals("slider")) {
                    c = 1;
                    break;
                }
                break;
            case -868304044:
                if (str.equals("toggle")) {
                    c = 2;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 3;
                    break;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 4;
                    break;
                }
                break;
            case 1286305040:
                if (str.equals("block_list")) {
                    c = 5;
                    break;
                }
                break;
            case 1956012306:
                if (str.equals("command_list")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new g1(this.c, this.d);
            case 1:
                return new it0(this.c);
            case 2:
                return new px0(this.c);
            case 3:
                return new nw0(this.c);
            case 4:
                return new pd(this.c);
            case 5:
                return new ia(this.c);
            case 6:
                return new ne(this.f, this.e);
            default:
                return null;
        }
    }
}