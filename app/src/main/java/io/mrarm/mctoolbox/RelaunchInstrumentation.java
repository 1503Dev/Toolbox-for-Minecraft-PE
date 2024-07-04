package io.mrarm.mctoolbox;

import android.app.ActivityOptions;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;

public class RelaunchInstrumentation extends Instrumentation {
    @Override // android.app.Instrumentation
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(getContext(), MinecraftActivity.class);
        intent.addFlags(268435456);
        getContext().startActivity(intent, ActivityOptions.makeCustomAnimation(getContext(), 2130771999, 2130771999).toBundle());
    }
}