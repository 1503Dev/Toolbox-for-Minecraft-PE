package io.mrarm.mctoolbox.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;
import io.mrarm.mctoolbox.ui.FullscreenTextEditDialog;
import io.mrarm.mctoolbox.ui.a;
import io.mrarm.mctoolbox.ui.b;
import io.mrarm.mctoolbox.ui.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;

public final class b extends fj {
    public static final lj f;
    public static final lj g;
    public static final lj h;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final c.d a;
        public final c.d b;
        public final int c;

        public a(int i, c.d dVar, c.d dVar2) {
            this.a = dVar;
            this.b = dVar2;
            this.c = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(final View view) {
            MenuItem add;
            MenuItem.OnMenuItemClickListener onMenuItemClickListener;
            c.d dVar;
            lf0 lf0Var = new lf0(view.getContext(), view);
            c.d dVar2 = this.a;
            if (dVar2 instanceof c.a) {
                add = lf0Var.a.add(2131755035);
                onMenuItemClickListener = new MenuItem.OnMenuItemClickListener() { // from class: q70
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        b.a aVar = b.a.this;
                        View view2 = view;
                        aVar.getClass();
                        new a(view2.getContext(), new sc0(aVar), false).show();
                        return true;
                    }
                };
            } else {
                if (dVar2 instanceof c.b) {
                    add = lf0Var.a.add(2131755035);
                    onMenuItemClickListener = new MenuItem.OnMenuItemClickListener() { // from class: r70
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            final b.a aVar = b.a.this;
                            View view2 = view;
                            final Class<?> B = ((b20) ((c.b) aVar.a).b).B();
                            if (B != null && B != wo.class) {
                                ((c.b) aVar.a).c.add(c.a(null, wv0.a(wv0.b(B))));
                            } else {
                                new a(view2.getContext(), new a.InterfaceC0037a() { // from class: x70
                                    @Override // io.mrarm.mctoolbox.ui.a.InterfaceC0037a
                                    public final void a(Class cls, String str) {
                                        b.a aVar2 = b.a.this;
                                        if (((b20) ((c.b) aVar2.a).b).B() == B) {
                                            ((c.b) aVar2.a).c(c.a(null, wv0.a(wv0.b(cls))));
                                        }
                                    }
                                }, true).show();
                            }
                            return true;
                        }
                    };
                }
                ((h) lf0Var.a.add(2131755042)).p = new MenuItem.OnMenuItemClickListener() { // from class: s70
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        b.a aVar = b.a.this;
                        View view2 = view;
                        aVar.getClass();
                        Context context = view2.getContext();
                        c.d dVar3 = aVar.a;
                        try {
                            ze zeVar = new ze();
                            String str = dVar3.a.Q;
                            if (str == null) {
                                str = "root";
                            }
                            zeVar.x(str, dVar3.b());
                            ClipData clipData = new ClipData("Toolbox NBT", new String[]{"text/plain", "text/vnd.toolbox.nbt"}, new ClipData.Item(zeVar.v(512)));
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            zeVar.q(new p00(byteArrayOutputStream), 100);
                            clipData.addItem(new ClipData.Item(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 3), ""));
                            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(clipData);
                            return true;
                        } catch (Exception e) {
                            Log.e("NbtEditor", "Failed to save clip");
                            e.printStackTrace();
                            return true;
                        }
                    }
                };
                ((h) lf0Var.a.add(2131755047)).p = new MenuItem.OnMenuItemClickListener() { // from class: t70
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #0 {Exception -> 0x0056, blocks: (B:14:0x004f, B:19:0x005b), top: B:46:0x004f }] */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        ze zeVar;
                        String b;
                        c.b bVar;
                        c.d a;
                        String b2;
                        b.a aVar = b.a.this;
                        View view2 = view;
                        aVar.getClass();
                        Context context = view2.getContext();
                        c.d dVar3 = aVar.a;
                        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
                        if (primaryClip != null) {
                            try {
                                b2 = c.b(primaryClip, "text/vnd.toolbox.nbt");
                            } catch (Exception e) {
                                Log.e("NbtEditor", "Failed to load clip (raw NBT)");
                                e.printStackTrace();
                            }
                            if (b2 != null) {
                                byte[] decode = Base64.decode(b2, 0);
                                zeVar = new ze();
                                zeVar.o(new o00(new ByteArrayInputStream(decode)), 100);
                                if (zeVar != null) {
                                    try {
                                        b = c.b(primaryClip, "text/plain");
                                    } catch (Exception e2) {
                                        Log.e("NbtEditor", "Failed to load clip (text NBT)");
                                        e2.printStackTrace();
                                    }
                                } else {
                                    b = null;
                                }
                                if (b != null) {
                                    zeVar = m60.b(b);
                                }
                                if (zeVar != null) {
                                    if (dVar3 instanceof c.a) {
                                        Iterator<Map.Entry<String, tv0<?>>> it = zeVar.iterator();
                                        while (it.hasNext()) {
                                            Map.Entry<String, tv0<?>> next = it.next();
                                            ((c.a) dVar3).c.add(c.a(next.getKey(), next.getValue()));
                                        }
                                    } else if (dVar3 instanceof c.b) {
                                        Class<?> B = ((b20) dVar3.b).B();
                                        if (((Map) zeVar.P).size() == 1) {
                                            tv0 tv0Var = (tv0) ((Map) zeVar.P).values().iterator().next();
                                            if (tv0Var.getClass() == B || B == wo.class) {
                                                bVar = (c.b) dVar3;
                                                a = c.a(null, tv0Var);
                                                bVar.c(a);
                                            }
                                        }
                                        if (B == ze.class || B == wo.class) {
                                            bVar = (c.b) dVar3;
                                            a = c.a(null, zeVar);
                                            bVar.c(a);
                                        }
                                    }
                                }
                            }
                            zeVar = null;
                            if (zeVar != null) {
                            }
                            if (b != null) {
                            }
                            if (zeVar != null) {
                            }
                        }
                        return true;
                    }
                };
                dVar = this.b;
                if (dVar != null && (dVar instanceof c.a)) {
                    ((h) lf0Var.a.add(2131755048)).p = new MenuItem.OnMenuItemClickListener() { // from class: u70
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            final b.a aVar = b.a.this;
                            View view2 = view;
                            aVar.getClass();
                            final FullscreenTextEditDialog fullscreenTextEditDialog = new FullscreenTextEditDialog(view2.getContext());
                            String str = aVar.a.a.Q;
                            if (str == null) {
                                fullscreenTextEditDialog.S.setText("");
                            } else {
                                fullscreenTextEditDialog.S.setText(str);
                            }
                            fullscreenTextEditDialog.R = new FullscreenTextEditDialog.a() { // from class: w70
                                @Override // io.mrarm.mctoolbox.ui.FullscreenTextEditDialog.a
                                public final boolean a() {
                                    String str2;
                                    b.a aVar2 = b.a.this;
                                    FullscreenTextEditDialog fullscreenTextEditDialog2 = fullscreenTextEditDialog;
                                    za0<String> za0Var = aVar2.a.a;
                                    Editable text = fullscreenTextEditDialog2.S.getText();
                                    if (text != null) {
                                        str2 = text.toString();
                                    } else {
                                        str2 = "";
                                    }
                                    za0Var.H(str2);
                                    return true;
                                }
                            };
                            fullscreenTextEditDialog.show();
                            return true;
                        }
                    };
                }
                if (this.b != null) {
                    ((h) lf0Var.a.add(2131755043)).p = new MenuItem.OnMenuItemClickListener() { // from class: v70
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            b.a aVar = b.a.this;
                            ((c.b) aVar.b).c.remove(aVar.a);
                            return true;
                        }
                    };
                }
                lf0Var.a();
            }
            ((h) add).p = onMenuItemClickListener;
            ((h) lf0Var.a.add(2131755042)).p = new MenuItem.OnMenuItemClickListener() { // from class: s70
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    b.a aVar = b.a.this;
                    View view2 = view;
                    aVar.getClass();
                    Context context = view2.getContext();
                    c.d dVar3 = aVar.a;
                    try {
                        ze zeVar = new ze();
                        String str = dVar3.a.Q;
                        if (str == null) {
                            str = "root";
                        }
                        zeVar.x(str, dVar3.b());
                        ClipData clipData = new ClipData("Toolbox NBT", new String[]{"text/plain", "text/vnd.toolbox.nbt"}, new ClipData.Item(zeVar.v(512)));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        zeVar.q(new p00(byteArrayOutputStream), 100);
                        clipData.addItem(new ClipData.Item(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 3), ""));
                        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(clipData);
                        return true;
                    } catch (Exception e) {
                        Log.e("NbtEditor", "Failed to save clip");
                        e.printStackTrace();
                        return true;
                    }
                }
            };
            ((h) lf0Var.a.add(2131755047)).p = new MenuItem.OnMenuItemClickListener() { // from class: t70
                /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #0 {Exception -> 0x0056, blocks: (B:14:0x004f, B:19:0x005b), top: B:46:0x004f }] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // android.view.MenuItem.OnMenuItemClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ze zeVar;
                    String b;
                    c.b bVar;
                    c.d a;
                    String b2;
                    b.a aVar = b.a.this;
                    View view2 = view;
                    aVar.getClass();
                    Context context = view2.getContext();
                    c.d dVar3 = aVar.a;
                    ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
                    if (primaryClip != null) {
                        try {
                            b2 = c.b(primaryClip, "text/vnd.toolbox.nbt");
                        } catch (Exception e) {
                            Log.e("NbtEditor", "Failed to load clip (raw NBT)");
                            e.printStackTrace();
                        }
                        if (b2 != null) {
                            byte[] decode = Base64.decode(b2, 0);
                            zeVar = new ze();
                            zeVar.o(new o00(new ByteArrayInputStream(decode)), 100);
                            if (zeVar != null) {
                                try {
                                    b = c.b(primaryClip, "text/plain");
                                } catch (Exception e2) {
                                    Log.e("NbtEditor", "Failed to load clip (text NBT)");
                                    e2.printStackTrace();
                                }
                            } else {
                                b = null;
                            }
                            if (b != null) {
                                zeVar = m60.b(b);
                            }
                            if (zeVar != null) {
                                if (dVar3 instanceof c.a) {
                                    Iterator<Map.Entry<String, tv0<?>>> it = zeVar.iterator();
                                    while (it.hasNext()) {
                                        Map.Entry<String, tv0<?>> next = it.next();
                                        ((c.a) dVar3).c.add(c.a(next.getKey(), next.getValue()));
                                    }
                                } else if (dVar3 instanceof c.b) {
                                    Class<?> B = ((b20) dVar3.b).B();
                                    if (((Map) zeVar.P).size() == 1) {
                                        tv0 tv0Var = (tv0) ((Map) zeVar.P).values().iterator().next();
                                        if (tv0Var.getClass() == B || B == wo.class) {
                                            bVar = (c.b) dVar3;
                                            a = c.a(null, tv0Var);
                                            bVar.c(a);
                                        }
                                    }
                                    if (B == ze.class || B == wo.class) {
                                        bVar = (c.b) dVar3;
                                        a = c.a(null, zeVar);
                                        bVar.c(a);
                                    }
                                }
                            }
                        }
                        zeVar = null;
                        if (zeVar != null) {
                        }
                        if (b != null) {
                        }
                        if (zeVar != null) {
                        }
                    }
                    return true;
                }
            };
            dVar = this.b;
            if (dVar != null) {
                ((h) lf0Var.a.add(2131755048)).p = new MenuItem.OnMenuItemClickListener() { // from class: u70
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        final b.a aVar = b.a.this;
                        View view2 = view;
                        aVar.getClass();
                        final FullscreenTextEditDialog fullscreenTextEditDialog = new FullscreenTextEditDialog(view2.getContext());
                        String str = aVar.a.a.Q;
                        if (str == null) {
                            fullscreenTextEditDialog.S.setText("");
                        } else {
                            fullscreenTextEditDialog.S.setText(str);
                        }
                        fullscreenTextEditDialog.R = new FullscreenTextEditDialog.a() { // from class: w70
                            @Override // io.mrarm.mctoolbox.ui.FullscreenTextEditDialog.a
                            public final boolean a() {
                                String str2;
                                b.a aVar2 = b.a.this;
                                FullscreenTextEditDialog fullscreenTextEditDialog2 = fullscreenTextEditDialog;
                                za0<String> za0Var = aVar2.a.a;
                                Editable text = fullscreenTextEditDialog2.S.getText();
                                if (text != null) {
                                    str2 = text.toString();
                                } else {
                                    str2 = "";
                                }
                                za0Var.H(str2);
                                return true;
                            }
                        };
                        fullscreenTextEditDialog.show();
                        return true;
                    }
                };
            }
            if (this.b != null) {
            }
            lf0Var.a();
        }
    }

    static {
        int i = l41.b;
        lj ljVar = new lj();
        ljVar.d = 2131492976;
        ljVar.e = 19;
        f = ljVar;
        lj ljVar2 = new lj();
        ljVar2.d = 2131492974;
        ljVar2.e = 19;
        g = ljVar2;
        lj ljVar3 = new lj();
        ljVar3.d = 2131492975;
        ljVar3.e = 19;
        h = ljVar3;
    }

    public b() {
        m(new oj());
    }

    public final j9 n(int i, c.d dVar, c.d dVar2) {
        if (dVar instanceof c.b) {
            oj ojVar = new oj();
            if (dVar.a.Q == null && i == 0) {
                ojVar.o(new ct0(new a(0, dVar, dVar2), h));
                i = -1;
            } else {
                ojVar.o(new ct0(new a(i, dVar, dVar2), g));
            }
            c.b bVar = (c.b) dVar;
            ojVar.o(new af(new oj(bVar.c, new p70(this, dVar, i)), bVar.d));
            return ojVar;
        }
        return new ct0(new a(i, dVar, dVar2), f);
    }
}