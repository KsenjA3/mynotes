package com.example.mynotes.service;

import com.example.mynotes.model.NoteEntity;

import java.util.List;

public interface NoteService {
    List<NoteEntity> getAllNotes();
    NoteEntity getNoteById(Long id);
    NoteEntity createNote(NoteEntity note);
    NoteEntity updateNote(Long id, NoteEntity note);
    void deleteNote(Long id);
}
