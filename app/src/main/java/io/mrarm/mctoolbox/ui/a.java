package io.mrarm.mctoolbox.ui;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import io.mrarm.mctoolbox.ui.a;
import java.util.Objects;

public final class a extends AppBottomSheetDialog {
    public static final String[] U = {"Byte", "Short", "Int", "Long", "Float", "Double", "Text", "Compound", "List"};
    public static final Class[] V = {gb.class, rr0.class, yx.class, e30.class, jq.class, am.class, gu0.class, ze.class, b20.class};

    /* renamed from: io.mrarm.mctoolbox.ui.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface InterfaceC0037a {
        void a(Class cls, String str);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final ViewGroup a;
        public int b;

        public b(FlexboxLayout flexboxLayout) {
            this.a = flexboxLayout;
            final int i = 0;
            while (true) {
                String[] strArr = a.U;
                if (i >= 9) {
                    a(0);
                    return;
                }
                TextView textView = (TextView) LayoutInflater.from(flexboxLayout.getContext()).inflate(2131492927, (ViewGroup) flexboxLayout, false);
                textView.setText(strArr[i]);
                flexboxLayout.addView(textView);
                textView.setOnClickListener(new View.OnClickListener() { // from class: l70
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.b.this.a(i);
                    }
                });
                i++;
            }
        }

        public final void a(int i) {
            for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
                this.a.getChildAt(i2).setSelected(false);
            }
            this.a.getChildAt(i).setSelected(true);
            this.b = i;
        }
    }

    public a(Context context, final InterfaceC0037a interfaceC0037a, final boolean z) {
        super(context);
        setContentView(2131492926);
        View findViewById = findViewById(2131296398);
        Objects.requireNonNull(findViewById);
        final ll llVar = (ll) jj.a(findViewById);
        llVar.S(z);
        final b bVar = new b(llVar.g0);
        llVar.T(new View.OnClickListener() { // from class: k70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                a aVar = a.this;
                ll llVar2 = llVar;
                boolean z2 = z;
                a.InterfaceC0037a interfaceC0037a2 = interfaceC0037a;
                a.b bVar2 = bVar;
                aVar.getClass();
                Editable text = llVar2.f0.getText();
                if ((text != null && text.length() != 0) || z2) {
                    if (text != null) {
                        str = text.toString();
                    } else {
                        str = null;
                    }
                    bVar2.getClass();
                    interfaceC0037a2.a(a.V[bVar2.b], str);
                    aVar.dismiss();
                }
            }
        });
        llVar.R(new ee(1, this));
    }
}