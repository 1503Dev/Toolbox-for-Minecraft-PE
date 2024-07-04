package defpackage;

/* renamed from: y61  reason: default package */
public enum y61 {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean b() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}