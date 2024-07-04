package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

public final class d extends BaseAdapter {
    public static final int T = zf.b(null).getMaximum(4);
    public final p60 P;
    public final qj<?> Q;
    public nb R;
    public final a S;

    public d(p60 p60Var, qj<?> qjVar, a aVar) {
        this.P = p60Var;
        this.Q = qjVar;
        this.S = aVar;
    }

    public final int b() {
        return this.P.g();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final Long getItem(int i) {
        if (i >= this.P.g() && i <= d()) {
            p60 p60Var = this.P;
            Calendar a = zf.a(p60Var.P);
            a.set(5, (i - p60Var.g()) + 1);
            return Long.valueOf(a.getTimeInMillis());
        }
        return null;
    }

    public final int d() {
        return (this.P.g() + this.P.U) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return b() + this.P.U;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.P.T;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Long item;
        Object obj;
        String b;
        Context context = viewGroup.getContext();
        if (this.R == null) {
            this.R = new nb(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ki0.mtrl_calendar_day, viewGroup, false);
        }
        int b2 = i - b();
        if (b2 >= 0) {
            p60 p60Var = this.P;
            if (b2 < p60Var.U) {
                int i2 = b2 + 1;
                textView.setTag(p60Var);
                textView.setText(String.valueOf(i2));
                Calendar a = zf.a(this.P.P);
                a.set(5, i2);
                long timeInMillis = a.getTimeInMillis();
                int i3 = this.P.S;
                Calendar a2 = zf.a(Calendar.getInstance());
                a2.set(5, 1);
                Calendar a3 = zf.a(a2);
                a3.get(2);
                int i4 = a3.get(1);
                a3.getMaximum(7);
                a3.getActualMaximum(5);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                simpleDateFormat.format(a3.getTime());
                a3.getTimeInMillis();
                if (i3 == i4) {
                    b = rj.a(timeInMillis);
                } else {
                    b = rj.b(timeInMillis);
                }
                textView.setContentDescription(b);
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    a.b bVar = this.S.S;
                    item.longValue();
                    if (bVar.isValid()) {
                        textView.setEnabled(true);
                        Iterator<Long> it = this.Q.n().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                long longValue = it.next().longValue();
                                long longValue2 = item.longValue();
                                Calendar b3 = zf.b(null);
                                b3.setTimeInMillis(longValue2);
                                long timeInMillis2 = zf.a(b3).getTimeInMillis();
                                Calendar b4 = zf.b(null);
                                b4.setTimeInMillis(longValue);
                                if (timeInMillis2 == zf.a(b4).getTimeInMillis()) {
                                    obj = this.R.b;
                                    break;
                                }
                            } else if (zf.a(Calendar.getInstance()).getTimeInMillis() == item.longValue()) {
                                obj = this.R.c;
                            } else {
                                obj = this.R.a;
                            }
                        }
                    } else {
                        textView.setEnabled(false);
                        obj = this.R.g;
                    }
                    ((mb) obj).b(textView);
                }
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        item = getItem(i);
        if (item != null) {
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}