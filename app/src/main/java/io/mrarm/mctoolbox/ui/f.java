package io.mrarm.mctoolbox.ui;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.mrarm.mctoolbox.ui.e;

public final class f extends t90 implements e.a {
    public final a c;
    public final Activity d;
    public final ys0 e;
    public k7 f;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public f(Activity activity, d dVar) {
        this.d = activity;
        this.c = dVar;
        setFocusable(true);
        setTouchable(true);
        setInputMethodMode(2);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, 2131821003);
        ys0 ys0Var = new ys0(activity);
        this.e = ys0Var;
        k7 k7Var = new k7(contextThemeWrapper);
        this.f = k7Var;
        k7Var.setColor(contextThemeWrapper.getResources().getColor(2131099841));
        RecyclerView recyclerView = new RecyclerView(contextThemeWrapper);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(new e(ys0Var, this));
        this.f.addView(recyclerView);
        setContentView(this.f);
    }
}