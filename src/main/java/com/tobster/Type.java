package com.tobster;

/**
 * Created by jackson on 11/22/2016.
 */
public enum Type {
    TYPE1(1, "Type A"), TYPE2(2, "Type 2");

    private Integer id;
    private String name;

    private Type(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    // standard getters and setters
}
