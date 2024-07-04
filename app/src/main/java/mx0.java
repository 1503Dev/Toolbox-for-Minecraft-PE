package defpackage;

/* renamed from: mx0  reason: default package */
public enum mx0 {
    TLS_1_3(0),
    TLS_1_2(1),
    TLS_1_1(2),
    TLS_1_0(3),
    SSL_3_0(4);
    
    public final String P;

    mx0(int i) {
        this.P = r2;
    }

    public static mx0 b(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c = 0;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c = 1;
                    break;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    c = 2;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TLS_1_1;
            case 1:
                return TLS_1_2;
            case 2:
                return TLS_1_3;
            case 3:
                return SSL_3_0;
            case 4:
                return TLS_1_0;
            default:
                throw new IllegalArgumentException(k6.b("Unexpected TLS version: ", str));
        }
    }
}