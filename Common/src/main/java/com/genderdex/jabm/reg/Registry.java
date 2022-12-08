package com.genderdex.jabm.reg;

public interface Registry<T> {

    void register(T object, String id);
}
