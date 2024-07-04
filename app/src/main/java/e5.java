package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e5  reason: default package */
public final /* synthetic */ class e5 {
    public static String a(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static StringBuilder b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }
}