package com.example.mynote

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "note")
data class NoteModel (

    @PrimaryKey( autoGenerate = true)
    @ColumnInfo( name =  "id")
    var id: Long = 0,

    @ColumnInfo( name = "tittle")
    var tittle: String? = null,

    @ColumnInfo( name = "message")
    var message: String? = null,

    @ColumnInfo( name = "created_at")
    var createdAt : String? = null

) : Parcelable