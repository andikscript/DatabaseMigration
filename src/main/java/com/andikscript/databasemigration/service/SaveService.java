package com.andikscript.databasemigration.service;

import com.andikscript.databasemigration.model.Save;

import java.util.*;

public interface SaveService {

    void add(Save s);
    Optional<Save> getSave(Integer id);
    List<Save> getAll();
    List<Object> getAllWithoutId();
}
