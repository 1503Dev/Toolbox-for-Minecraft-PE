package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vl  reason: default package */
public final class vl implements Executor {
    public static final vl P;
    public static final /* synthetic */ vl[] Q;

    static {
        vl vlVar = new vl();
        P = vlVar;
        Q = new vl[]{vlVar};
    }

    public static vl valueOf(String str) {
        return (vl) Enum.valueOf(vl.class, str);
    }

    public static vl[] values() {
        return (vl[]) Q.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}