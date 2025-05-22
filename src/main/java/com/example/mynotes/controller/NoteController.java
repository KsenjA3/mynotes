package com.example.mynotes.controller;

import com.example.mynotes.model.NoteEntity;
import com.example.mynotes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {
    private final NoteService service;

    @Autowired
    public NoteController(NoteService service) {
        this.service = service;
    }

// методы контроллера
    @GetMapping
    public List<NoteEntity> getAllNotes() {
        return service.getAllNotes();
    }

    @GetMapping("/{id}")
    public NoteEntity getNoteById(@PathVariable Long id) {
        return service.getNoteById(id);
    }

    @PostMapping
    public NoteEntity createNote(@RequestBody NoteEntity note) {
        return service.createNote(note);
    }

    @PutMapping("/{id}")
    public NoteEntity updateNote(@PathVariable Long id, @RequestBody NoteEntity note) {
        return service.updateNote(id, note);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        service.deleteNote(id);
    }
}
