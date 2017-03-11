package com.appbusters.robinkamboj.search.model;

public class Data {

    private final long id;
    private final String text;

    public Data(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
