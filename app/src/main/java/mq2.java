package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mq2  reason: default package */
public final class mq2 {
    public static Bundle a(JSONObject jSONObject) {
        String valueOf;
        String str;
        String format;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (jSONArray.length() != 0) {
                            int length = jSONArray.length();
                            int i = 0;
                            Object obj = null;
                            for (int i2 = 0; obj == null && i2 < length; i2++) {
                                obj = !jSONArray.isNull(i2) ? jSONArray.opt(i2) : null;
                            }
                            if (obj == null) {
                                valueOf = String.valueOf(next);
                                str = "Expected JSONArray with at least 1 non-null element for key:";
                                format = str.concat(valueOf);
                            } else if (obj instanceof JSONObject) {
                                Parcelable[] parcelableArr = new Bundle[length];
                                while (i < length) {
                                    parcelableArr[i] = !jSONArray.isNull(i) ? a(jSONArray.optJSONObject(i)) : null;
                                    i++;
                                }
                                bundle.putParcelableArray(next, parcelableArr);
                            } else if (obj instanceof Number) {
                                double[] dArr = new double[jSONArray.length()];
                                while (i < length) {
                                    dArr[i] = jSONArray.optDouble(i);
                                    i++;
                                }
                                bundle.putDoubleArray(next, dArr);
                            } else if (obj instanceof CharSequence) {
                                String[] strArr = new String[length];
                                while (i < length) {
                                    strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                    i++;
                                }
                                bundle.putStringArray(next, strArr);
                            } else if (obj instanceof Boolean) {
                                boolean[] zArr = new boolean[length];
                                while (i < length) {
                                    zArr[i] = jSONArray.optBoolean(i);
                                    i++;
                                }
                                bundle.putBooleanArray(next, zArr);
                            } else {
                                format = String.format("JSONArray with unsupported type %s for key:%s", obj.getClass().getCanonicalName(), next);
                            }
                        }
                    } else if (opt instanceof JSONObject) {
                        bundle.putBundle(next, a((JSONObject) opt));
                    } else {
                        valueOf = String.valueOf(next);
                        str = "Unsupported type for key:";
                        format = str.concat(valueOf);
                    }
                    sv2.g(format);
                }
            }
        }
        return bundle;
    }

    public static List b(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static ArrayList c(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONArray d(JsonReader jsonReader) {
        Object d;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                d = d(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                d = f(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else if (!JsonToken.STRING.equals(peek)) {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            } else {
                d = jsonReader.nextString();
            }
            jSONArray.put(d);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject e(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject f(JsonReader jsonReader) {
        Object d;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                d = d(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                d = f(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else if (!JsonToken.STRING.equals(peek)) {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            } else {
                d = jsonReader.nextString();
            }
            jSONObject.put(nextName, d);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void g(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    h(jsonWriter, (JSONObject) obj);
                } else if (!(obj instanceof JSONArray)) {
                    String valueOf = String.valueOf(obj);
                    throw new JSONException("unable to write field: " + valueOf);
                } else {
                    g(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static void h(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    h(jsonWriter.name(next), (JSONObject) obj);
                } else if (!(obj instanceof JSONArray)) {
                    String valueOf = String.valueOf(obj);
                    throw new JSONException("unable to write field: " + valueOf);
                } else {
                    g(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static boolean i(JSONObject jSONObject, String... strArr) {
        JSONObject k = k(jSONObject, strArr);
        if (k == null) {
            return false;
        }
        return k.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String j(ei4 ei4Var) {
        if (ei4Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            l(jsonWriter, ei4Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            sv2.e("Error when writing JSON.", e);
            return null;
        }
    }

    public static JSONObject k(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i]);
        }
        return jSONObject;
    }

    public static void l(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof ei4) {
            h(jsonWriter, ((ei4) obj).d);
        } else if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (Object obj2 : (List) obj) {
                l(jsonWriter, obj2);
            }
            jsonWriter.endArray();
        } else {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    l(jsonWriter.name((String) key), entry.getValue());
                }
            }
            jsonWriter.endObject();
        }
    }
}