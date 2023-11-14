package com.testehan.records;

import java.util.Objects;

public class Before {
    private final int x;
    private final int y;

    Before(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x() { return x; }
    int y() { return y; }

    public boolean equals(Object o) {
        if (!(o instanceof Before)) return false;
        Before other = (Before) o;
        return other.x == x && other.y == y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }

    public String toString() {
        return String.format("Before[x=%d, y=%d]", x, y);
    }
}
