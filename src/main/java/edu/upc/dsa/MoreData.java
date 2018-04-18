package edu.upc.dsa;

public class MoreData extends Data {

    public MoreData() {}

    public MoreData(String a, int b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private long c;

    public long getC() {
        return c;
    }

    public void setC(long c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "[MoreData] "+a+" "+b+" "+c;
    }
}
