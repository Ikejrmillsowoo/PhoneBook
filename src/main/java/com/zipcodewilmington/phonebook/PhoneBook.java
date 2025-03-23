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
        this.phonebook = map;
    }
    public PhoneBook() {
        this(new LinkedHashMap<>());
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

    public Boolean hasEntry(String name, String phoneNumber) {
        return this.phonebook.containsKey(name);
    }

    public Boolean hasEntry(String name) {
        return this.phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String s = "";
        for(Map.Entry<String, List<String>> string: this.phonebook.entrySet()){
           if (string.getValue().contains(phoneNumber)){
               s = (string.getKey());
           }
        }
        return s;
    }

    public List<String> getAllContactNames() {
        List<String> contacts = new ArrayList<>();
        for (Map.Entry<String, List<String>> string: this.phonebook.entrySet()){
            contacts.add(string.getKey());
        }
        return contacts;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}
