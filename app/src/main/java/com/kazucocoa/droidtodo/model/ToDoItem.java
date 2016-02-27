package com.kazucocoa.droidtodo.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class ToDoItem extends RealmObject {

    @PrimaryKey
    private long id;

    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
