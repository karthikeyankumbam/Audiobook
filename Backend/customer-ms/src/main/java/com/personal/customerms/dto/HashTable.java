package com.personal.customerms.dto;

import java.util.Arrays;

public class HashTable {
    private Object[] data;

    public HashTable(int size) {
        this.data = new Object[size];
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % data.length;
        }
        return hash;
    }

    public void set(String key, Object value) {
        int index = hash(key);
        data[index] = value;
    }

    public Object get(String key) {
        int index = hash(key);
        return data[index];
    }

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable(50);
        myHashTable.set("grapes", 10000);
        System.out.println(myHashTable.get("grapes"));
        myHashTable.set("apples", 9);
        System.out.println(myHashTable.hash("abc"));
        System.out.println(myHashTable.hash("cba"));
    }
}
