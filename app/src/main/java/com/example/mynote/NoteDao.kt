package com.example.mynote

import android.icu.text.CaseMap
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface NoteDao {

    @Query("SELECT * from note")
    fun getAllNote(): List<NoteModel>

    @Insert(onConflict = REPLACE)
    fun insertNote (note : NoteModel)

    @Delete
    fun deleteNote (note: NoteModel)

    @Query( "UPDATE note SET tittle =:noteTitle,message =:noteMessage WHERE id =:noteId")
    fun updateNote(noteTitle:String, noteMessage:String, noteId:Long)
}