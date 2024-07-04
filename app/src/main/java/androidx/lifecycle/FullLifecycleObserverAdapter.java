package androidx.lifecycle;

import androidx.lifecycle.c;

/* JADX INFO: Access modifiers changed from: package-private */
public class FullLifecycleObserverAdapter implements d {
    public final ks a;
    public final d b;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.b.values().length];
            a = iArr;
            try {
                iArr[c.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(ks ksVar, d dVar) {
        this.a = ksVar;
        this.b = dVar;
    }

    @Override // androidx.lifecycle.d
    public final void d(b10 b10Var, c.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                this.a.c();
                break;
            case 2:
                this.a.a();
                break;
            case 3:
                this.a.onResume();
                break;
            case 4:
                this.a.onPause();
                break;
            case 5:
                this.a.b();
                break;
            case 6:
                this.a.onDestroy();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        d dVar = this.b;
        if (dVar != null) {
            dVar.d(b10Var, bVar);
        }
    }
}