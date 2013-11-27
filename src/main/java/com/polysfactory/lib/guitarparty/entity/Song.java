package com.polysfactory.lib.guitarparty.entity;

import java.util.ArrayList;
import java.util.List;

public class Song {

    private String title;
    private String body;
    private List<Author> authors;

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public List<String> getBodyAsList() {
        List<String> list = new ArrayList<String>();
        String[] strings = getBody().split("\\\r\\\n");
        for (String s : strings) {
            s = s.trim();
            if (!s.isEmpty()) {
                list.add(s.trim());
            }
        }
        return list;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return title + "/" + getAuthors().toString();
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
