package com.example.mynotes.repository;

import com.example.mynotes.model.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface NoteRepository extends JpaRepository <NoteEntity,Long> {
    List<NoteEntity> findByAuthor (String author);
    List<NoteEntity> findAll();
    Optional<NoteEntity> findById(Long id);
    NoteEntity save(NoteEntity note);
    void deleteById (Long id);
}
