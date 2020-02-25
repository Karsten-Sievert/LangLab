package com.github.karstens.langlab

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "package_table")
class DbPackage (
        @PrimaryKey
        @ColumnInfo val name: String
)
