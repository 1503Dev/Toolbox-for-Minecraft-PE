package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* renamed from: bk1  reason: default package */
public final class bk1 {
    public String a;
    public List b;
    public String c;
    public c70 d;
    public String e;
    public String f;
    public Double g;
    public String h;
    public String i;
    public p31 j;
    public Object k;
    public Bundle l = new Bundle();
    public boolean m;
    public boolean n;

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[Catch: RemoteException -> 0x008f, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x008f, blocks: (B:42:0x0082, B:44:0x008a), top: B:59:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2 A[Catch: RemoteException -> 0x00ae, TRY_LEAVE, TryCatch #3 {RemoteException -> 0x00ae, blocks: (B:49:0x009a, B:51:0x00a2), top: B:63:0x009a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bk1(ve2 ve2Var) {
        String str;
        String str2;
        String str3;
        String str4;
        Double d;
        String str5;
        String str6;
        hw n;
        double b;
        Object obj = null;
        try {
            str = ve2Var.a.q();
        } catch (RemoteException e) {
            sv2.e("", e);
            str = null;
        }
        this.a = str;
        this.b = ve2Var.b;
        try {
            str2 = ve2Var.a.t();
        } catch (RemoteException e2) {
            sv2.e("", e2);
            str2 = null;
        }
        this.c = str2;
        this.d = ve2Var.c;
        try {
            str3 = ve2Var.a.m();
        } catch (RemoteException e3) {
            sv2.e("", e3);
            str3 = null;
        }
        this.e = str3;
        try {
            str4 = ve2Var.a.k();
        } catch (RemoteException e4) {
            sv2.e("", e4);
            str4 = null;
        }
        this.f = str4;
        try {
            b = ve2Var.a.b();
        } catch (RemoteException e5) {
            sv2.e("", e5);
        }
        if (b != -1.0d) {
            d = Double.valueOf(b);
            this.g = d;
            str5 = ve2Var.a.G();
            this.h = str5;
            str6 = ve2Var.a.s();
            this.i = str6;
            n = ve2Var.a.n();
            if (n != null) {
            }
            this.k = obj;
            this.m = true;
            this.n = true;
            if (ve2Var.a.f() != null) {
            }
            this.j = ve2Var.d;
        }
        d = null;
        this.g = d;
        try {
            str5 = ve2Var.a.G();
        } catch (RemoteException e6) {
            sv2.e("", e6);
            str5 = null;
        }
        this.h = str5;
        try {
            str6 = ve2Var.a.s();
        } catch (RemoteException e7) {
            sv2.e("", e7);
            str6 = null;
        }
        this.i = str6;
        try {
            n = ve2Var.a.n();
            if (n != null) {
                obj = va0.c0(n);
            }
        } catch (RemoteException e8) {
            sv2.e("", e8);
        }
        this.k = obj;
        this.m = true;
        this.n = true;
        try {
            if (ve2Var.a.f() != null) {
                ve2Var.d.a(ve2Var.a.f());
            }
        } catch (RemoteException e9) {
            sv2.e("Exception occurred while getting video controller", e9);
        }
        this.j = ve2Var.d;
    }
}