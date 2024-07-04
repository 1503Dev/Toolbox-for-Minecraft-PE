package defpackage;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import defpackage.uz;
import io.mrarm.mctoolbox.bridge.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: g21  reason: default package */
public final class g21 {
    public List<vv> b;
    public ArrayList c = new ArrayList();
    public final File a = new File(Environment.getExternalStorageDirectory(), "ToolboxMenuOverride");

    /* renamed from: g21$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        @wq0("categories")
        public List<String> a;
        @wq0("toolbars")
        public List<String> b;
    }

    public g21(Context context, b bVar, ny0 ny0Var, mw mwVar, wv wvVar, iy0 iy0Var, tv tvVar, ve0 ve0Var) {
        this.b = new ArrayList();
        yt ytVar = new yt();
        ytVar.b(new yc0(context, bVar, ny0Var, wvVar, iy0Var, tvVar, ve0Var), iw.class);
        xt a2 = ytVar.a();
        yt ytVar2 = new yt();
        ytVar2.b(new vx0(context, bVar, ny0Var, wvVar), iw.class);
        ytVar2.b(new uz.d(bVar), uz.class);
        xt a3 = ytVar2.a();
        a aVar = (a) a(context, "ui_categories", a2, a.class);
        if (aVar != null) {
            for (String str : aVar.a) {
                sz szVar = (sz) a(context, k6.b("ui_", str), a2, sz.class);
                if (szVar != null) {
                    szVar.h(context, bVar);
                    this.b.add(szVar);
                }
            }
            this.b.add(new wr0(this, mwVar));
            this.b = Collections.unmodifiableList(this.b);
            for (String str2 : aVar.b) {
                f00 f00Var = (f00) a(context, k6.b("ui_toolbar_", str2), a3, f00.class);
                if (f00Var != null) {
                    f00Var.h(context, bVar);
                    this.c.add(f00Var);
                }
            }
            return;
        }
        throw new RuntimeException("Missing category data");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T a(Context context, String str, xt xtVar, Class<T> cls) {
        InputStreamReader fileReader;
        File file = new File(this.a, k6.b(str, ".json"));
        if (file.exists()) {
            try {
                fileReader = new FileReader(file);
            } catch (FileNotFoundException unused) {
            }
            if (fileReader != null) {
                return null;
            }
            try {
                return (T) xtVar.d(fileReader, cls);
            } finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        int identifier = context.getResources().getIdentifier(str, "raw", context.getPackageName());
        if (identifier == 0) {
            Log.w("UIData", "Missing toolbar UI def file: " + str);
            fileReader = null;
        } else {
            fileReader = new InputStreamReader(context.getResources().openRawResource(identifier));
        }
        if (fileReader != null) {
        }
    }
}