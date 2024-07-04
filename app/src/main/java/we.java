package defpackage;

import android.widget.CompoundButton;

/* renamed from: we  reason: default package */
public final class we {
    public static void a(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    public static void b(CompoundButton compoundButton, wb0 wb0Var, jy jyVar) {
        if (jyVar == null) {
            compoundButton.setOnCheckedChangeListener(wb0Var);
        } else {
            compoundButton.setOnCheckedChangeListener(new ve(wb0Var, jyVar));
        }
    }
}