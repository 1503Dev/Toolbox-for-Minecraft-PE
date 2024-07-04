package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c30  reason: default package */
public abstract class c30 {
    public static final a P;
    public static final /* synthetic */ c30[] Q;

    /* renamed from: c30$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public enum a extends c30 {
        public a() {
            super("DEFAULT", 0);
        }
    }

    static {
        a aVar = new a();
        P = aVar;
        Q = new c30[]{aVar, new c30() { // from class: c30.b
        }};
    }

    public c30() {
        throw null;
    }

    public c30(String str, int i) {
    }

    public static c30 valueOf(String str) {
        return (c30) Enum.valueOf(c30.class, str);
    }

    public static c30[] values() {
        return (c30[]) Q.clone();
    }
}