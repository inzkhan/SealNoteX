package com.inzi.sealnotex.roomdatabase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tags")
public class TagName {

    @PrimaryKey(autoGenerate = true)
    private String id;
    private String name;
}
