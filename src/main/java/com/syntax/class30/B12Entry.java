package com.syntax.class30;

import java.util.HashSet;
import java.util.Set;

public class B12Entry {
    String key;
    Double value;

    public B12Entry(String key, Double value) {
        this.key = key;
        this.value = value;
    }

    String getKey() {
        return key;
    }

    Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "B12Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}

class Test {


    public static void main(String[] args) {
        Set<B12Entry> entries = new HashSet<>();
        entries.add(new B12Entry("Apple", 12.0));
        entries.add(new B12Entry("Mango", 12.0));
        entries.add(new B12Entry("Banana", 12.0));
        entries.add(new B12Entry("Kiwi", 12.0));
        System.out.println(entries);
    }
}
