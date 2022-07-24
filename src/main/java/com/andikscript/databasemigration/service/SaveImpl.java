package com.andikscript.databasemigration.service;

import com.andikscript.databasemigration.model.Save;
import com.andikscript.databasemigration.repository.SaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;

import java.util.*;

@Service
public class SaveImpl implements SaveService {

    @Autowired
    private SaveRepository saveRepository;

    @Override
    public void add(Save s) {
        saveRepository.save(s);
    }

    @Override
    public Optional<Save> getSave(Integer id) {
        return saveRepository.findById(id);
    }

    @Override
    public List<Save> getAll() {
        return saveRepository.findAll();
    }

    @Override
    public List<Object> getAllWithoutId() {
        Map<String, Object> m = new HashMap<>();
        List<Object> list = new ArrayList<>();
        saveRepository.findAll().forEach(e -> {
            m.put("nama", e.getNama());
            m.put("keterangan", e.getKeterangan());
            list.add(m);
        });
        return list;
    }
}
