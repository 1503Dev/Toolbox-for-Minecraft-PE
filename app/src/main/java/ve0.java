package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.ah0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* renamed from: ve0  reason: default package */
public final class ve0 implements ba, uv, ug0 {
    public final aa a;
    public final tc0 b;
    public final ArrayList c;
    public final HashMap d;
    public final b e;
    public boolean f;

    /* renamed from: ve0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a {
        public gt0 b;
        public sg0 c;
        public final za0<String> d = new za0<>();
        public final String a = "premium_weekly";
    }

    /* renamed from: ve0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends a {
        public b() {
        }
    }

    public ve0(Context context, tc0 tc0Var) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new HashMap();
        b bVar = new b();
        this.e = bVar;
        this.f = false;
        this.b = tc0Var;
        arrayList.add(bVar);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar instanceof b) {
                this.d.put(aVar.a, aVar);
            }
        }
        if (context != null) {
            aa aaVar = new aa(context, this, true);
            this.a = aaVar;
            aaVar.l(this);
            return;
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }

    public final void a() {
        da daVar;
        this.f = false;
        ArrayList arrayList = new ArrayList(Collections.singletonList("premium_weekly"));
        final aa aaVar = this.a;
        final te0 te0Var = new te0(this);
        if (!aaVar.h()) {
            daVar = qa2.i;
        } else if (TextUtils.isEmpty("subs")) {
            m82.e("BillingClient", "Please fix the input params. SKU type can't be empty.");
            daVar = qa2.d;
        } else {
            final ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    arrayList2.add(new au2(str));
                } else {
                    throw new IllegalArgumentException("SKU must be set.");
                }
            }
            if (aaVar.p(new Callable() { // from class: fs5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String str2;
                    int i;
                    int i2;
                    List list;
                    int i3;
                    int i4;
                    Bundle I1;
                    String str3;
                    boolean z;
                    aa aaVar2 = aa.this;
                    String str4 = r2;
                    List list2 = arrayList2;
                    te0 te0Var2 = te0Var;
                    aaVar2.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    int size = list2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            int i6 = i5 + 20;
                            if (i6 > size) {
                                i2 = size;
                            } else {
                                i2 = i6;
                            }
                            ArrayList arrayList4 = new ArrayList(list2.subList(i5, i2));
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            int size2 = arrayList4.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                arrayList5.add(((au2) arrayList4.get(i7)).a);
                            }
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("ITEM_ID_LIST", arrayList5);
                            bundle.putString("playBillingLibraryVersion", aaVar2.Q);
                            try {
                                if (aaVar2.a0) {
                                    pz3 pz3Var = aaVar2.U;
                                    String packageName = aaVar2.T.getPackageName();
                                    int i8 = aaVar2.X;
                                    boolean z2 = aaVar2.g0;
                                    list = list2;
                                    if (aaVar2.f0 && aaVar2.h0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    String str5 = aaVar2.Q;
                                    i3 = size;
                                    Bundle bundle2 = new Bundle();
                                    i4 = i6;
                                    if (i8 >= 9) {
                                        bundle2.putString("playBillingLibraryVersion", str5);
                                    }
                                    if (i8 >= 9 && z2) {
                                        bundle2.putBoolean("enablePendingPurchases", true);
                                    }
                                    if (z) {
                                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                    }
                                    if (i8 >= 14) {
                                        ArrayList<String> arrayList6 = new ArrayList<>();
                                        ArrayList<String> arrayList7 = new ArrayList<>();
                                        ArrayList arrayList8 = new ArrayList();
                                        int i9 = 0;
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        for (int size3 = arrayList4.size(); i9 < size3; size3 = size3) {
                                            au2 au2Var = (au2) arrayList4.get(i9);
                                            arrayList6.add(null);
                                            z3 |= !TextUtils.isEmpty(null);
                                            arrayList7.add(null);
                                            z4 |= !TextUtils.isEmpty(null);
                                            arrayList8.add(0);
                                            i9++;
                                            arrayList4 = arrayList4;
                                        }
                                        if (z3) {
                                            bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList6);
                                        }
                                        if (z4) {
                                            bundle2.putStringArrayList("SKU_OFFER_ID_LIST", arrayList7);
                                        }
                                    }
                                    I1 = pz3Var.X0(packageName, str4, bundle, bundle2);
                                } else {
                                    list = list2;
                                    i3 = size;
                                    i4 = i6;
                                    I1 = aaVar2.U.I1(aaVar2.T.getPackageName(), str4, bundle);
                                }
                                if (I1 == null) {
                                    str3 = "querySkuDetailsAsync got null sku details list";
                                    break;
                                } else if (!I1.containsKey("DETAILS_LIST")) {
                                    i = m82.a(I1, "BillingClient");
                                    str2 = m82.c(I1, "BillingClient");
                                    if (i != 0) {
                                        m82.e("BillingClient", "getSkuDetails() failed. Response code: " + i);
                                    } else {
                                        m82.e("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                    }
                                } else {
                                    ArrayList<String> stringArrayList = I1.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList == null) {
                                        str3 = "querySkuDetailsAsync got null response list";
                                        break;
                                    }
                                    for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                                        try {
                                            gt0 gt0Var = new gt0(stringArrayList.get(i10));
                                            m82.d("BillingClient", "Got sku details: ".concat(gt0Var.toString()));
                                            arrayList3.add(gt0Var);
                                        } catch (JSONException e) {
                                            m82.f("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                                            str2 = "Error trying to decode SkuDetails.";
                                            arrayList3 = null;
                                            i = 6;
                                            da daVar2 = new da();
                                            daVar2.a = i;
                                            daVar2.b = str2;
                                            te0Var2.c(daVar2, arrayList3);
                                            return null;
                                        }
                                    }
                                    list2 = list;
                                    size = i3;
                                    i5 = i4;
                                }
                            } catch (Exception e2) {
                                m82.f("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                                str2 = "Service connection is disconnected.";
                                i = -1;
                            }
                        } else {
                            str2 = "";
                            i = 0;
                            break;
                        }
                    }
                    m82.e("BillingClient", str3);
                    str2 = "Item is unavailable for purchase.";
                    i = 4;
                    arrayList3 = null;
                    da daVar22 = new da();
                    daVar22.a = i;
                    daVar22.b = str2;
                    te0Var2.c(daVar22, arrayList3);
                    return null;
                }
            }, 30000L, new d06(0, te0Var), aaVar.m()) == null) {
                if (aaVar.P != 0 && aaVar.P != 3) {
                    daVar = qa2.g;
                } else {
                    daVar = qa2.i;
                }
            } else {
                return;
            }
        }
        te0Var.c(daVar, null);
    }

    public final void b(da daVar) {
        if (daVar.a != 0) {
            return;
        }
        a();
        tc0 tc0Var = this.b;
        tc0Var.h = new re0(this);
        if (tc0Var.i) {
            tc0Var.c();
        }
        aa aaVar = this.a;
        ah0.a aVar = new ah0.a();
        aVar.a = "subs";
        aaVar.j(new ah0(aVar), new se0(this));
    }

    public final void c(da daVar, List<sg0> list) {
        if (daVar.a == 0 && list != null) {
            boolean z = false;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).c = null;
            }
            for (sg0 sg0Var : list) {
                Iterator<String> it2 = sg0Var.a().iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (next.equals("premium_weekly")) {
                        z = true;
                    }
                    a aVar = (a) this.d.get(next);
                    if (aVar != null) {
                        aVar.c = sg0Var;
                    }
                }
            }
            this.b.d(z);
        }
    }
}