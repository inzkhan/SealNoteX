package com.inzi.sealnotex.roomdatabase.entity.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.inzi.sealnotex.SealNote;

import java.util.List;

@Dao
public interface NoteDao {

    @Update
    void updateNote(SealNote sealNote);

    @Insert
    void addNote(SealNote sealNote);

    @Query("SELECT * FROM notes WHERE id =:note_id")
    SealNote getNoteById(int note_id);

    @Query("SELECT * FROM notes")
     List<SealNote> getAllNotes();

    @Query("SELECT * FROM notes, note_tag " +
            "    WHERE archived = '0' AND " +
            "          deleted= '0' AND " +
            "          tag_id =:tag_id AND " +
            "          note_id = notes.Id " +
            "     ORDER BY deleted DESC")
     List<SealNote> getAllNotesByTagId(int tag_id);


    @Query("SELECT * FROM notes" +
            " WHERE archived = '1' AND " +
             " deleted = '0'" +
            " ORDER BY deleted DESC")
    List<SealNote> getAllArchivedNotes();


    @Query("SELECT * FROM notes " +
            "WHERE deleted = '1' ORDER BY " +
             "edited DESC")
    List<SealNote> getAllDeletedNotes();


    @Query("DELETE FROM notes WHERE id= :note_id")
    void deleteNoteById(int note_id);


    @Query("UPDATE notes SET deleted =:trash WHERE id=:note_id")
    void trashNoteById(int note_id,int trash);

    @Query("UPDATE notes SET archived =:archive WHERE id=:note_id")
    void archiveNoteById(int note_id ,int archive);

}
