package com.andikscript.databasemigration.controller;

import com.andikscript.databasemigration.message.ResponseMessage;
import com.andikscript.databasemigration.model.Save;
import com.andikscript.databasemigration.service.SaveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RestController
@RequestMapping(value = "/api/save")
public class SaveController {
    private final SaveService saveService;

    public SaveController(SaveService saveService) {
        this.saveService = saveService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getSave(@PathVariable(value = "id") Integer id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(saveService.getSave(id));
    }

    @GetMapping(value = "/saves")
    public ResponseEntity<?> getAllSave() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(saveService.getAll());
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<?> addSave(@Valid @RequestBody Save s) {
        saveService.add(s);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Succesfully created");
    }

    @GetMapping(value = "/saveswithoutid")
    public ResponseEntity<?> getAllSaveWithoutId() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(saveService.getAllWithoutId());
    }
}
