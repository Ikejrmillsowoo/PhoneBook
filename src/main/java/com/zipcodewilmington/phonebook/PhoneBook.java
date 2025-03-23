package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {
    String name;
    String phoneNumber;

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = new Map<String, List<String>>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public List<String> get(Object key) {
                return List.of();
            }

            @Override
            public List<String> put(String key, List<String> value) {
                return List.of();
            }

            @Override
            public List<String> remove(Object key) {
                return List.of();
            }

            @Override
            public void putAll(Map<? extends String, ? extends List<String>> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return Set.of();
            }

            @Override
            public Collection<List<String>> values() {
                return List.of();
            }

            @Override
            public Set<Entry<String, List<String>>> entrySet() {
                return Set.of();
            }
        };
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        this.phonebook.put(name, Collections.singletonList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        this.phonebook.put(name, List.of(phoneNumbers));
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return this.phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
//        Map<V, K> inversedMap = new HashMap<V, K>();
//        for (Entry<String, List> entry : this.phonebook.entrySet()) {
//            inversedMap.put(entry.getValue(), entry.getKey());
//        }
//        return inversedMap;
        return  null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }
}
