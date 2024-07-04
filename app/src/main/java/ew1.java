package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ew1  reason: default package */
public final class ew1 {
    public final String a;
    public String b;
    public Bundle c = new Bundle();

    public ew1(JsonReader jsonReader) {
        char c;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (nextName.equals("params")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            }
        }
        this.a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}