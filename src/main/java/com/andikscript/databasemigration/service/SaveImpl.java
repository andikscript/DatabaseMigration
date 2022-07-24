package com.andikscript.databasemigration.service;

import com.andikscript.databasemigration.model.Save;
import com.andikscript.databasemigration.repository.SaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
}
