package com.inzi.sealnotex.roomdatabase.entity.dao;


import androidx.room.Dao;
import androidx.room.Query;

import com.inzi.sealnotex.SealNote;

import java.util.List;

@Dao
public interface NoteDao {


    //public void updateNote();

    @Query("SELECT * FROM notes")
    public List<SealNote> getAllNotes();

}
