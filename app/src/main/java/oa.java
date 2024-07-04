package defpackage;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: oa  reason: default package */
public final class oa extends FloatingActionButton.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    /* renamed from: oa$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = oa.this.b;
            int i = BottomAppBar.L0;
            bottomAppBar.getClass();
        }
    }

    public oa(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.b.s(this.a));
        floatingActionButton.k(new a(), true);
    }
}