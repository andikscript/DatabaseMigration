package com.andikscript.databasemigration.service;

import com.andikscript.databasemigration.model.Save;

import java.util.List;
import java.util.Optional;

public interface SaveService {

    public void add(Save s);

    public Optional<Save> getSave(Integer id);

    public List<Save> getAll();
}
