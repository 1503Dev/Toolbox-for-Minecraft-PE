package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: tj  reason: default package */
public final class tj extends BaseAdapter {
    public static final int S;
    public final Calendar P;
    public final int Q;
    public final int R;

    static {
        S = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public tj() {
        Calendar b = zf.b(null);
        this.P = b;
        this.Q = b.getMaximum(7);
        this.R = b.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.Q;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.Q;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.R;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ki0.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.P;
        int i2 = i + this.R;
        int i3 = this.Q;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.P.getDisplayName(7, S, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ui0.mtrl_picker_day_of_week_column_header), this.P.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}