package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.q7;
import io.mrarm.yurai.msa.AccountList;
import io.mrarm.yurai.xbox.XboxLoginActivity;
import java.io.File;
import java.util.HashSet;

/* renamed from: z0  reason: default package */
public final class z0 extends RecyclerView.g<RecyclerView.d0> {
    public AccountList c;
    public q7 d;
    public a e;

    /* renamed from: z0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a(String str, String str2);

        void b();
    }

    /* renamed from: z0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends RecyclerView.d0 implements View.OnClickListener {
        public b(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            z0.this.e.b();
        }
    }

    /* renamed from: z0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends RecyclerView.d0 implements View.OnClickListener, q7.c {
        public TextView i0;
        public q7.b j0;

        public c(View view) {
            super(view);
            this.i0 = (TextView) view;
            view.setOnClickListener(this);
        }

        @Override // defpackage.q7.c
        public final void a(Bitmap bitmap) {
            this.i0.setCompoundDrawablesRelativeWithIntrinsicBounds(bitmap != null ? new BitmapDrawable(this.i0.getResources(), bitmap) : cg.b(this.i0.getContext(), yh0.ic_default_profile), (Drawable) null, (Drawable) null, (Drawable) null);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPositionFor;
            AccountList accountList = z0.this.c;
            RecyclerView recyclerView = this.g0;
            if (recyclerView == null) {
                adapterPositionFor = -1;
            } else {
                adapterPositionFor = recyclerView.getAdapterPositionFor(this);
            }
            AccountList.Entry entry = accountList.get(adapterPositionFor);
            a aVar = z0.this.e;
            if (aVar != null) {
                aVar.a(entry.getCID(), entry.getUsername());
            }
        }
    }

    public z0(XboxLoginActivity xboxLoginActivity, AccountList accountList) {
        File[] listFiles;
        this.c = accountList;
        q7 q7Var = new q7(new y0(xboxLoginActivity));
        this.d = q7Var;
        y0 y0Var = q7Var.b;
        y0Var.getClass();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < accountList.size(); i++) {
            hashSet.add(accountList.get(i).getCID());
        }
        for (File file : y0Var.a.listFiles()) {
            String name = file.getName();
            if (name.startsWith("account-") && name.endsWith(".png")) {
                String substring = name.substring(8, name.length() - 4);
                if (!hashSet.contains(substring)) {
                    Log.d("AccountImageLoader", "Deleting unused image: " + substring);
                    file.delete();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int d() {
        return this.c.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int g(int i) {
        return i == this.c.size() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void i(RecyclerView.d0 d0Var, int i) {
        if (i == this.c.size()) {
            return;
        }
        c cVar = (c) d0Var;
        AccountList.Entry entry = this.c.get(i);
        q7.b bVar = cVar.j0;
        if (bVar != null) {
            bVar.a.clear();
        }
        cVar.i0.setText(entry.getUsername());
        cVar.a(null);
        q7 q7Var = z0.this.d;
        String cid = entry.getCID();
        q7Var.getClass();
        q7.b bVar2 = new q7.b(cVar, cid);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new q7.a(bVar2));
        cVar.j0 = bVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.d0 j(RecyclerView recyclerView, int i) {
        return i == 1 ? new b(LayoutInflater.from(recyclerView.getContext()).inflate(mi0.msa_account_list_add, (ViewGroup) recyclerView, false)) : new c(LayoutInflater.from(recyclerView.getContext()).inflate(mi0.msa_account_list_entry, (ViewGroup) recyclerView, false));
    }
}