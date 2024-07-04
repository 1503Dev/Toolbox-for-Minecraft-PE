package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: py4  reason: default package */
public final class py4 implements Executor {
    public static final py4 P;
    public static final /* synthetic */ py4[] Q;

    static {
        py4 py4Var = new py4();
        P = py4Var;
        Q = new py4[]{py4Var};
    }

    public static py4[] values() {
        return (py4[]) Q.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}