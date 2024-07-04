package defpackage;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;

/* renamed from: bh  reason: default package */
public final class bh extends Filter {
    public a a;

    /* renamed from: bh$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public bh(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((ou0) this.a).d((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        ou0 ou0Var = (ou0) this.a;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            ou0Var.getClass();
            charSequence2 = charSequence.toString();
        }
        if (ou0Var.a0.getVisibility() == 0 && ou0Var.a0.getWindowVisibility() == 0) {
            try {
                cursor = ou0Var.q(ou0Var.b0, charSequence2);
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.a;
        Cursor cursor = ((ah) aVar).R;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((ou0) aVar).c((Cursor) obj);
        }
    }
}