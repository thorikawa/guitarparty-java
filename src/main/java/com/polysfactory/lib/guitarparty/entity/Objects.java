package com.polysfactory.lib.guitarparty.entity;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Objects<T> {
    private List<T> objects;

    @SerializedName("objects_count")
    int count;

    public List<T> getObjects() {
        return objects;
    }

    public void setObjects(List<T> objects) {
        this.objects = objects;
    }
}
