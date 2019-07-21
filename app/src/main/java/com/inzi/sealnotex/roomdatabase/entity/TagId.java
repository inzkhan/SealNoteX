package com.inzi.sealnotex.roomdatabase.entity;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_tag",foreignKeys ={ @ForeignKey(entity = Note.class,parentColumns = "note_id",childColumns = "id"),
        @ForeignKey(entity = TagName.class,parentColumns = "tag_id",childColumns = "id")})
public class TagId {

    @PrimaryKey
    private int note_id,tag_id;

    public int getNote_id() {
        return note_id;
    }

    public void setNote_id(int note_id) {
        this.note_id = note_id;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }
}
