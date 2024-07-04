package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import defpackage.bh;

/* renamed from: ah  reason: default package */
public abstract class ah extends BaseAdapter implements Filterable, bh.a {
    public Context S;
    public bh W;
    public boolean Q = true;
    public Cursor R = null;
    public boolean P = false;
    public int T = -1;
    public a U = new a();
    public b V = new b();

    /* renamed from: ah$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            ah ahVar = ah.this;
            if (ahVar.Q && (cursor = ahVar.R) != null && !cursor.isClosed()) {
                ahVar.P = ahVar.R.requery();
            }
        }
    }

    /* renamed from: ah$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ah ahVar = ah.this;
            ahVar.P = true;
            ahVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ah ahVar = ah.this;
            ahVar.P = false;
            ahVar.notifyDataSetInvalidated();
        }
    }

    public ah(Context context) {
        this.S = context;
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.R;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.U;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.V;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.R = cursor;
            if (cursor != null) {
                a aVar2 = this.U;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.V;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.T = cursor.getColumnIndexOrThrow("_id");
                this.P = true;
                notifyDataSetChanged();
            } else {
                this.T = -1;
                this.P = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.P || (cursor = this.R) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.P) {
            this.R.moveToPosition(i);
            if (view == null) {
                dl0 dl0Var = (dl0) this;
                view = dl0Var.Z.inflate(dl0Var.Y, viewGroup, false);
            }
            b(view, this.R);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.W == null) {
            this.W = new bh(this);
        }
        return this.W;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.P || (cursor = this.R) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.R;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.P && (cursor = this.R) != null && cursor.moveToPosition(i)) {
            return this.R.getLong(this.T);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.P) {
            if (this.R.moveToPosition(i)) {
                if (view == null) {
                    view = h(viewGroup);
                }
                b(view, this.R);
                return view;
            }
            throw new IllegalStateException(k6.a("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(ViewGroup viewGroup);
}