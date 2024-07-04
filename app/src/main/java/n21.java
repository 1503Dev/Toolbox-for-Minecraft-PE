package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.android.billingclient.api.ProxyBillingActivity;
import defpackage.ca;
import defpackage.n21;
import defpackage.tv;
import defpackage.ve0;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: n21  reason: default package */
public class n21 extends m5 {
    public static boolean W = false;
    public static int X = 0;
    public final io.mrarm.mctoolbox.bridge.a R;
    public final za0<String> S;
    public final TextView T;
    public xs0 U;
    public final xs0 V;

    /* renamed from: n21$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements tv.a {
        public final /* synthetic */ Context a;
        public final /* synthetic */ io.mrarm.mctoolbox.bridge.a b;

        public a(Context context, b bVar) {
            this.a = context;
            this.b = bVar;
        }

        @Override // defpackage.tv.a
        public final void a() {
            n21.this.dismiss();
            boolean unused = n21.W = false;
        }

        @Override // defpackage.tv.a
        public final void b() {
            Toast.makeText(this.a, 2131755203, 1).show();
            n21.this.dismiss();
            boolean unused = n21.W = false;
        }

        @Override // defpackage.tv.a
        public final void c() {
        }

        @Override // defpackage.tv.a
        public final void d() {
            ((b) this.b).t();
            n21.g();
        }
    }

    public n21(final Context context, final io.mrarm.mctoolbox.bridge.a aVar, final tv tvVar, final uv uvVar, boolean z) {
        super(context, 2131820558);
        int i;
        int i2;
        this.U = null;
        this.V = new xs0(new te0(this));
        this.R = aVar;
        setContentView(2131493007);
        findViewById(2131296341).setOnClickListener(new View.OnClickListener() { // from class: k21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n21 n21Var = n21.this;
                boolean z2 = n21.W;
                n21Var.cancel();
            }
        });
        TextView textView = (TextView) findViewById(2131296466);
        TextView textView2 = (TextView) findViewById(2131296670);
        TextView textView3 = (TextView) findViewById(2131296525);
        final View findViewById = findViewById(2131296669);
        final View findViewById2 = findViewById(2131296671);
        ve0 ve0Var = (ve0) uvVar;
        if (!ve0Var.a.h()) {
            ve0Var.a.l(ve0Var);
        } else if (ve0Var.f) {
            ve0Var.a();
        }
        this.S = ve0Var.e.d;
        this.T = textView3;
        if (z) {
            i = 2131755194;
        } else {
            i = 2131755193;
        }
        textView.setText(i);
        if (z) {
            i2 = 2131755199;
        } else {
            i2 = 2131755198;
        }
        textView2.setText(i2);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: l21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n21.k(uv.this, context, view);
            }
        });
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: m21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n21 n21Var = n21.this;
                a aVar2 = aVar;
                Context context2 = context;
                View view2 = findViewById2;
                View view3 = findViewById;
                tv tvVar2 = tvVar;
                boolean z2 = n21.W;
                n21Var.getClass();
                b bVar = (b) aVar2;
                if (bVar.n("internal/premium/remaining_time") > 900.0f) {
                    Toast.makeText(context2, context2.getString(2131755204, Integer.valueOf(Math.round(15.0f))), 1).show();
                    return;
                }
                view2.setVisibility(0);
                view3.setVisibility(8);
                if (!n21.W) {
                    n21.W = true;
                    ((cy0) tvVar2).b.b(new n21.a(context2, bVar), "premium_ticket", 0);
                }
            }
        });
    }

    public static /* synthetic */ int g() {
        int i = X + 1;
        X = i;
        return i;
    }

    public static int i() {
        return X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:78|(2:82|(6:90|(2:99|(2:104|(8:109|(23:111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)|126|(1:128)|129|(1:131)|132|(1:134)|135|(1:137)|(1:261)(1:140)|(1:143)|(1:145)|146|(13:148|(8:151|(1:153)|154|(1:156)|157|(2:159|160)(2:162|163)|161|149)|164|165|(1:167)|(1:169)|(1:171)|(1:173)|(1:175)|176|(4:178|(2:181|179)|182|183)|184|(9:191|(1:193)(2:244|(1:246)(1:247))|194|(1:196)|197|(1:199)(2:231|(6:233|234|235|236|237|238))|200|(2:223|(2:227|(1:229)(1:230))(1:226))(1:204)|205)(5:188|189|190|97|98))(2:248|(21:250|(1:252)|253|(1:255)|256|(2:258|183)|184|(1:186)|191|(0)(0)|194|(0)|197|(0)(0)|200|(1:202)|223|(0)|227|(0)(0)|205)(2:259|260)))(1:262)|206|207|208|(1:210)(2:214|215)|211|212)(1:108))(1:103))(1:94)|95|96|97|98))|263|(1:92)|99|(1:101)|104|(1:106)|109|(0)(0)|206|207|208|(0)(0)|211|212) */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x055a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x055c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0578, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0579, code lost:
        defpackage.m82.f(r2, "Exception while launching billing flow. Try to reconnect", r0);
        r0 = 5;
        r2 = defpackage.qa2.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0583, code lost:
        defpackage.m82.f(r2, "Time out while launching billing flow. Try to reconnect", r0);
        r0 = 4;
        r2 = defpackage.qa2.j;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0534 A[Catch: CancellationException -> 0x055a, TimeoutException -> 0x055c, Exception -> 0x0578, TryCatch #4 {CancellationException -> 0x055a, TimeoutException -> 0x055c, Exception -> 0x0578, blocks: (B:240:0x0522, B:242:0x0534, B:247:0x055e), top: B:271:0x0522 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x055e A[Catch: CancellationException -> 0x055a, TimeoutException -> 0x055c, Exception -> 0x0578, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x055a, TimeoutException -> 0x055c, Exception -> 0x0578, blocks: (B:240:0x0522, B:242:0x0534, B:247:0x055e), top: B:271:0x0522 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void k(uv uvVar, Context context, View view) {
        boolean z;
        boolean z2;
        Object obj;
        Object obj2;
        boolean z3;
        Activity activity;
        String str;
        String str2;
        final aa aaVar;
        Callable callable;
        da daVar;
        int a2;
        boolean z4;
        String str3;
        ca caVar;
        ew5 ew5Var;
        aa aaVar2;
        gt0 gt0Var;
        ca.a aVar;
        boolean z5;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        gt0 gt0Var2;
        String str4;
        String str5;
        Intent intent;
        String str6;
        final int i;
        boolean z6;
        int i2;
        da daVar2;
        da daVar3;
        ve0.b bVar = ((ve0) uvVar).e;
        Activity h = ea2.h(context);
        gt0 gt0Var3 = bVar.b;
        if (gt0Var3 != null) {
            aa aaVar3 = ve0.this.a;
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(gt0Var3);
            boolean z7 = !arrayList3.isEmpty();
            if (z7) {
                if (z7) {
                    if (!arrayList3.contains(null)) {
                        String str7 = "packageName";
                        if (arrayList3.size() > 1) {
                            gt0 gt0Var4 = (gt0) arrayList3.get(0);
                            String a3 = gt0Var4.a();
                            int size = arrayList3.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                gt0 gt0Var5 = (gt0) arrayList3.get(i3);
                                if (!a3.equals("play_pass_subs") && !gt0Var5.a().equals("play_pass_subs") && !a3.equals(gt0Var5.a())) {
                                    throw new IllegalArgumentException("SKUs should have the same type.");
                                }
                            }
                            String optString = gt0Var4.b.optString("packageName");
                            int size2 = arrayList3.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                gt0 gt0Var6 = (gt0) arrayList3.get(i4);
                                if (!a3.equals("play_pass_subs") && !gt0Var6.a().equals("play_pass_subs") && !optString.equals(gt0Var6.b.optString("packageName"))) {
                                    throw new IllegalArgumentException("All SKUs must have the same package name.");
                                }
                            }
                        }
                        ca caVar2 = new ca();
                        if (z7 && !((gt0) arrayList3.get(0)).b.optString("packageName").isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        caVar2.a = z;
                        caVar2.b = null;
                        caVar2.c = null;
                        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        boolean z8 = !TextUtils.isEmpty(null);
                        if (z2 && z8) {
                            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                        }
                        ca.b bVar2 = new ca.b();
                        bVar2.a = null;
                        bVar2.c = 0;
                        bVar2.b = null;
                        caVar2.d = bVar2;
                        caVar2.f = new ArrayList(arrayList3);
                        caVar2.g = false;
                        fu5 fu5Var = ew5.Q;
                        caVar2.e = fk1.T;
                        if (!aaVar3.h()) {
                            daVar3 = qa2.i;
                            tv2.u(2, 2, daVar3);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.addAll(caVar2.f);
                            ew5 ew5Var2 = caVar2.e;
                            Iterator it = arrayList4.iterator();
                            if (it.hasNext()) {
                                obj = it.next();
                            } else {
                                obj = null;
                            }
                            gt0 gt0Var7 = (gt0) obj;
                            Iterator<E> it2 = ew5Var2.iterator();
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                            } else {
                                obj2 = null;
                            }
                            ca.a aVar2 = (ca.a) obj2;
                            if (gt0Var7 != null) {
                                final String optString2 = gt0Var7.b.optString("productId");
                                final String a4 = gt0Var7.a();
                                if (a4.equals("subs") && !aaVar3.W) {
                                    m82.e("BillingClient", "Current client doesn't support subscriptions.");
                                    daVar3 = qa2.k;
                                    tv2.u(9, 2, daVar3);
                                } else {
                                    if (caVar2.b == null && caVar2.c == null) {
                                        ca.b bVar3 = caVar2.d;
                                        if (bVar3.b == null && bVar3.c == 0 && !caVar2.a && !caVar2.g) {
                                            z3 = false;
                                            if (!z3 && !aaVar3.Y) {
                                                m82.e("BillingClient", "Current client doesn't support extra params for buy intent.");
                                                i2 = 18;
                                                daVar2 = qa2.f;
                                            } else if (arrayList4.size() <= 1 && !aaVar3.d0) {
                                                m82.e("BillingClient", "Current client doesn't support multi-item purchases.");
                                                i2 = 19;
                                                daVar2 = qa2.l;
                                            } else if (ew5Var2.isEmpty() && !aaVar3.e0) {
                                                m82.e("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                                                i2 = 20;
                                                daVar2 = qa2.n;
                                            } else {
                                                if (!aaVar3.Y) {
                                                    boolean z9 = aaVar3.Z;
                                                    boolean z10 = aaVar3.f0;
                                                    str = "BUY_INTENT";
                                                    boolean z11 = aaVar3.g0;
                                                    boolean z12 = aaVar3.h0;
                                                    boolean z13 = aaVar3.i0;
                                                    String str8 = aaVar3.Q;
                                                    final Bundle bundle = new Bundle();
                                                    activity = h;
                                                    bundle.putString("playBillingLibraryVersion", str8);
                                                    int i5 = caVar2.d.c;
                                                    if (i5 != 0) {
                                                        bundle.putInt("prorationMode", i5);
                                                    }
                                                    if (!TextUtils.isEmpty(caVar2.b)) {
                                                        bundle.putString("accountId", caVar2.b);
                                                    }
                                                    if (!TextUtils.isEmpty(caVar2.c)) {
                                                        bundle.putString("obfuscatedProfileId", caVar2.c);
                                                    }
                                                    if (caVar2.g) {
                                                        bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
                                                    }
                                                    if (!TextUtils.isEmpty(null)) {
                                                        bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
                                                    }
                                                    if (!TextUtils.isEmpty(caVar2.d.a)) {
                                                        bundle.putString("oldSkuPurchaseToken", caVar2.d.a);
                                                    }
                                                    if (!TextUtils.isEmpty(null)) {
                                                        bundle.putString("oldSkuPurchaseId", null);
                                                    }
                                                    if (!TextUtils.isEmpty(caVar2.d.b)) {
                                                        bundle.putString("originalExternalTransactionId", caVar2.d.b);
                                                    }
                                                    if (!TextUtils.isEmpty(null)) {
                                                        bundle.putString("paymentsPurchaseParams", null);
                                                    }
                                                    if (z9 && z11) {
                                                        z4 = true;
                                                        bundle.putBoolean("enablePendingPurchases", true);
                                                    } else {
                                                        z4 = true;
                                                    }
                                                    if (z10 && z12) {
                                                        bundle.putBoolean("enablePendingPurchaseForSubscriptions", z4);
                                                    }
                                                    if (z13) {
                                                        bundle.putBoolean("enableAlternativeBilling", z4);
                                                    }
                                                    if (arrayList4.isEmpty()) {
                                                        str3 = "packageName";
                                                        caVar = caVar2;
                                                        ew5Var = ew5Var2;
                                                        aaVar2 = aaVar3;
                                                        gt0Var = gt0Var7;
                                                        aVar = aVar2;
                                                        z5 = true;
                                                        arrayList = new ArrayList<>(ew5Var.size() - 1);
                                                        ArrayList<String> arrayList5 = new ArrayList<>(ew5Var.size() - 1);
                                                        ArrayList<String> arrayList6 = new ArrayList<>();
                                                        ArrayList<String> arrayList7 = new ArrayList<>();
                                                        ArrayList<String> arrayList8 = new ArrayList<>();
                                                        if (ew5Var.size() <= 0) {
                                                            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                                                            if (!arrayList6.isEmpty()) {
                                                                bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                                                            }
                                                            if (!arrayList8.isEmpty()) {
                                                                bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList8);
                                                            }
                                                            if (!arrayList.isEmpty()) {
                                                                arrayList2 = arrayList5;
                                                                bundle.putStringArrayList("additionalSkus", arrayList);
                                                                bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                                                            }
                                                            aaVar = aaVar2;
                                                            if (!bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST")) {
                                                            }
                                                            gt0Var2 = gt0Var;
                                                            str4 = str3;
                                                            if (TextUtils.isEmpty(gt0Var2.b.optString(str4))) {
                                                            }
                                                            if (!TextUtils.isEmpty(str5)) {
                                                            }
                                                            intent = activity.getIntent();
                                                            if (intent != null) {
                                                            }
                                                            if (!aaVar.e0) {
                                                            }
                                                            if (!aaVar.c0) {
                                                            }
                                                            if (aaVar.Z) {
                                                            }
                                                            final ca caVar3 = caVar;
                                                            callable = new Callable(i, optString2, a4, caVar3, bundle) { // from class: cl1
                                                                public final /* synthetic */ int b;
                                                                public final /* synthetic */ String c;
                                                                public final /* synthetic */ String d;
                                                                public final /* synthetic */ Bundle e;

                                                                {
                                                                    this.e = bundle;
                                                                }

                                                                @Override // java.util.concurrent.Callable
                                                                public final Object call() {
                                                                    aa aaVar4 = aa.this;
                                                                    return aaVar4.U.T0(this.b, aaVar4.T.getPackageName(), this.c, this.d, this.e);
                                                                }
                                                            };
                                                        } else {
                                                            ((ca.a) ew5Var.get(0)).getClass();
                                                            throw null;
                                                        }
                                                    } else {
                                                        ArrayList<String> arrayList9 = new ArrayList<>();
                                                        ArrayList<String> arrayList10 = new ArrayList<>();
                                                        ArrayList<String> arrayList11 = new ArrayList<>();
                                                        ArrayList<Integer> arrayList12 = new ArrayList<>();
                                                        caVar = caVar2;
                                                        ArrayList<String> arrayList13 = new ArrayList<>();
                                                        Iterator it3 = arrayList4.iterator();
                                                        boolean z14 = false;
                                                        boolean z15 = false;
                                                        boolean z16 = false;
                                                        boolean z17 = false;
                                                        while (it3.hasNext()) {
                                                            ca.a aVar3 = aVar2;
                                                            gt0 gt0Var8 = (gt0) it3.next();
                                                            String str9 = str7;
                                                            gt0 gt0Var9 = gt0Var7;
                                                            if (!gt0Var8.b.optString("skuDetailsToken").isEmpty()) {
                                                                arrayList9.add(gt0Var8.b.optString("skuDetailsToken"));
                                                            }
                                                            String optString3 = gt0Var8.b.optString("offerIdToken");
                                                            if (optString3.isEmpty()) {
                                                                optString3 = gt0Var8.b.optString("offer_id_token");
                                                            }
                                                            aa aaVar4 = aaVar3;
                                                            String optString4 = gt0Var8.b.optString("offer_id");
                                                            ew5 ew5Var3 = ew5Var2;
                                                            int optInt = gt0Var8.b.optInt("offer_type");
                                                            String optString5 = gt0Var8.b.optString("serializedDocid");
                                                            arrayList10.add(optString3);
                                                            z14 |= !TextUtils.isEmpty(optString3);
                                                            arrayList11.add(optString4);
                                                            z15 |= !TextUtils.isEmpty(optString4);
                                                            arrayList12.add(Integer.valueOf(optInt));
                                                            if (optInt != 0) {
                                                                z6 = true;
                                                            } else {
                                                                z6 = false;
                                                            }
                                                            z16 |= z6;
                                                            z17 |= !TextUtils.isEmpty(optString5);
                                                            arrayList13.add(optString5);
                                                            str7 = str9;
                                                            aVar2 = aVar3;
                                                            gt0Var7 = gt0Var9;
                                                            aaVar3 = aaVar4;
                                                            ew5Var2 = ew5Var3;
                                                        }
                                                        str3 = str7;
                                                        ew5Var = ew5Var2;
                                                        aaVar2 = aaVar3;
                                                        gt0Var = gt0Var7;
                                                        aVar = aVar2;
                                                        if (!arrayList9.isEmpty()) {
                                                            bundle.putStringArrayList("skuDetailsTokens", arrayList9);
                                                        }
                                                        if (z14) {
                                                            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList10);
                                                        }
                                                        if (z15) {
                                                            bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList11);
                                                        }
                                                        if (z16) {
                                                            bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList12);
                                                        }
                                                        if (z17) {
                                                            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList13);
                                                        }
                                                        z5 = true;
                                                        if (arrayList4.size() > 1) {
                                                            arrayList = new ArrayList<>(arrayList4.size() - 1);
                                                            arrayList2 = new ArrayList<>(arrayList4.size() - 1);
                                                            for (int i6 = 1; i6 < arrayList4.size(); i6++) {
                                                                arrayList.add(((gt0) arrayList4.get(i6)).b.optString("productId"));
                                                                arrayList2.add(((gt0) arrayList4.get(i6)).a());
                                                            }
                                                            bundle.putStringArrayList("additionalSkus", arrayList);
                                                            bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                                                        }
                                                        aaVar = aaVar2;
                                                        if (!bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !aaVar.b0) {
                                                            int i7 = 21;
                                                            daVar = qa2.m;
                                                            tv2.u(i7, 2, daVar);
                                                            aaVar.n(daVar);
                                                            return;
                                                        }
                                                        gt0Var2 = gt0Var;
                                                        str4 = str3;
                                                        if (TextUtils.isEmpty(gt0Var2.b.optString(str4))) {
                                                            bundle.putString("skuPackageName", gt0Var2.b.optString(str4));
                                                            str5 = null;
                                                        } else {
                                                            str5 = null;
                                                            if (aVar == null) {
                                                                z5 = false;
                                                            } else {
                                                                throw null;
                                                            }
                                                        }
                                                        if (!TextUtils.isEmpty(str5)) {
                                                            bundle.putString("accountName", str5);
                                                        }
                                                        intent = activity.getIntent();
                                                        if (intent != null) {
                                                            str2 = "BillingClient";
                                                            m82.e(str2, "Activity's intent is null.");
                                                        } else {
                                                            str2 = "BillingClient";
                                                            if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                                                                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                                                bundle.putString("proxyPackage", stringExtra);
                                                                try {
                                                                    str6 = "proxyPackageVersion";
                                                                } catch (PackageManager.NameNotFoundException unused) {
                                                                    str6 = "proxyPackageVersion";
                                                                }
                                                                try {
                                                                    bundle.putString(str6, aaVar.T.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                                                } catch (PackageManager.NameNotFoundException unused2) {
                                                                    bundle.putString(str6, "package not found");
                                                                    if (!aaVar.e0) {
                                                                    }
                                                                    if (!aaVar.c0) {
                                                                    }
                                                                    if (aaVar.Z) {
                                                                    }
                                                                    final ca caVar32 = caVar;
                                                                    callable = new Callable(i, optString2, a4, caVar32, bundle) { // from class: cl1
                                                                        public final /* synthetic */ int b;
                                                                        public final /* synthetic */ String c;
                                                                        public final /* synthetic */ String d;
                                                                        public final /* synthetic */ Bundle e;

                                                                        {
                                                                            this.e = bundle;
                                                                        }

                                                                        @Override // java.util.concurrent.Callable
                                                                        public final Object call() {
                                                                            aa aaVar42 = aa.this;
                                                                            return aaVar42.U.T0(this.b, aaVar42.T.getPackageName(), this.c, this.d, this.e);
                                                                        }
                                                                    };
                                                                    Bundle bundle2 = (Bundle) aaVar.p(callable, 5000L, null, aaVar.R).get(5000L, TimeUnit.MILLISECONDS);
                                                                    a2 = m82.a(bundle2, str2);
                                                                    String c = m82.c(bundle2, str2);
                                                                    if (a2 != 0) {
                                                                    }
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        if (!aaVar.e0 && !ew5Var.isEmpty()) {
                                                            i = 17;
                                                        } else if (!aaVar.c0 && z5) {
                                                            i = 15;
                                                        } else if (aaVar.Z) {
                                                            i = 9;
                                                        } else {
                                                            i = 6;
                                                        }
                                                        final ca caVar322 = caVar;
                                                        callable = new Callable(i, optString2, a4, caVar322, bundle) { // from class: cl1
                                                            public final /* synthetic */ int b;
                                                            public final /* synthetic */ String c;
                                                            public final /* synthetic */ String d;
                                                            public final /* synthetic */ Bundle e;

                                                            {
                                                                this.e = bundle;
                                                            }

                                                            @Override // java.util.concurrent.Callable
                                                            public final Object call() {
                                                                aa aaVar42 = aa.this;
                                                                return aaVar42.U.T0(this.b, aaVar42.T.getPackageName(), this.c, this.d, this.e);
                                                            }
                                                        };
                                                    }
                                                } else {
                                                    activity = h;
                                                    str = "BUY_INTENT";
                                                    str2 = "BillingClient";
                                                    aaVar = aaVar3;
                                                    callable = new Callable() { // from class: fm1
                                                        @Override // java.util.concurrent.Callable
                                                        public final Object call() {
                                                            aa aaVar5 = aa.this;
                                                            return aaVar5.U.r3(aaVar5.T.getPackageName(), optString2, a4);
                                                        }
                                                    };
                                                }
                                                Bundle bundle22 = (Bundle) aaVar.p(callable, 5000L, null, aaVar.R).get(5000L, TimeUnit.MILLISECONDS);
                                                a2 = m82.a(bundle22, str2);
                                                String c2 = m82.c(bundle22, str2);
                                                if (a2 != 0) {
                                                    m82.e(str2, "Unable to buy item, Error response code: " + a2);
                                                    da daVar4 = new da();
                                                    daVar4.a = a2;
                                                    daVar4.b = c2;
                                                    tv2.u(3, 2, daVar4);
                                                    aaVar.n(daVar4);
                                                } else {
                                                    Activity activity2 = activity;
                                                    Intent intent2 = new Intent(activity2, ProxyBillingActivity.class);
                                                    String str10 = str;
                                                    intent2.putExtra(str10, (PendingIntent) bundle22.getParcelable(str10));
                                                    activity2.startActivity(intent2);
                                                    da daVar5 = qa2.a;
                                                }
                                                return;
                                            }
                                            tv2.u(i2, 2, daVar2);
                                            daVar = daVar2;
                                            aaVar = aaVar3;
                                            aaVar.n(daVar);
                                            return;
                                        }
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                    if (arrayList4.size() <= 1) {
                                    }
                                    if (ew5Var2.isEmpty()) {
                                    }
                                    if (!aaVar3.Y) {
                                    }
                                    Bundle bundle222 = (Bundle) aaVar.p(callable, 5000L, null, aaVar.R).get(5000L, TimeUnit.MILLISECONDS);
                                    a2 = m82.a(bundle222, str2);
                                    String c22 = m82.c(bundle222, str2);
                                    if (a2 != 0) {
                                    }
                                    return;
                                }
                            } else {
                                aVar2.getClass();
                                throw null;
                            }
                        }
                        aaVar3.n(daVar3);
                        return;
                    }
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                throw null;
            }
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (this.U == null) {
            this.U = new xs0(new se0(this));
        }
        this.S.a(this.U);
        this.U.g(0, null);
        ((b) this.R).c.a(this.V);
        if (((b) this.R).c.Q) {
            dismiss();
        }
    }

    @Override // defpackage.m5, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.S.z(this.U);
        ((b) this.R).c.z(this.V);
    }
}