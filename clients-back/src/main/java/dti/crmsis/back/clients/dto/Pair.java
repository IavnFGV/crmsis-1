package dti.crmsis.back.clients.dto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class Pair<A, B>  {
    private final A a;
    private final B b;
    private final transient int hashCode;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
        this.hashCode = hashCode(a, b);
    }

    private static int hashCode(Object a, Object b) {
        return (a == null ? 0 : a.hashCode()) * 1319 + (b == null ? 0 : b.hashCode());
    }

    public A getA() {
        return this.a;
    }

    public B getB() {
        return this.b;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair<?, ?> pair)) return false;

        return hashCode == pair.hashCode && Objects.equals(a, pair.a) && Objects.equals(b, pair.b);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(a);
        result = 31 * result + Objects.hashCode(b);
        return result;
    }

    public boolean equals(Pair<?, ?> other) {
        if (other == null) {
            return false;
        } else {
            Object a = this.a;
            Object othera = other.a;
            Object b = this.b;
            Object otherb = other.b;
            return (a == othera || a != null && a.equals(othera)) && (b == otherb || b != null && b.equals(otherb));
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pair (").append(this.a).append(", ").append(this.b).append(')');
        return builder.toString();
    }

    public static <A, B> Pair<A, B> create(A a, B b) {
        return new Pair<A, B>(a, b);
    }
}