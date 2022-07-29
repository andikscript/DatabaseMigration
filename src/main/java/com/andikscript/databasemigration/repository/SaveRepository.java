package com.andikscript.databasemigration.repository;

import com.andikscript.databasemigration.model.Save;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveRepository extends JpaRepository<Save, Integer> {
}
