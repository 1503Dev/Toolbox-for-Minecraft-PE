package io.mrarm.yurai.msa;

public class AccountList {
    private String[] cid;
    private Entry[] entries;
    private String[] username;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class Entry {
        private int index;

        private Entry(int i) {
            this.index = i;
        }

        public String getCID() {
            return AccountList.this.cid[this.index];
        }

        public String getUsername() {
            return AccountList.this.username[this.index];
        }
    }

    private AccountList(String[] strArr, String[] strArr2) {
        this.username = strArr;
        this.cid = strArr2;
        this.entries = new Entry[strArr.length];
    }

    public Entry get(int i) {
        Entry[] entryArr = this.entries;
        if (entryArr[i] == null) {
            entryArr[i] = new Entry(i);
        }
        return this.entries[i];
    }

    public int size() {
        return this.username.length;
    }
}