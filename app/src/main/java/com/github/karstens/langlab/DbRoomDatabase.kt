package com.github.karstens.langlab

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(
        entities = [DbPackage::class],
        version = 1,
        exportSchema = false
)
public abstract class DbRoomDatabase  : RoomDatabase() {
    abstract fun packageDao(): DbPackageDao

    companion object {
        @Volatile
        private var INSTANCE: DbRoomDatabase? = null

        fun getDatabase(context: Context): DbRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        DbRoomDatabase::class.java,
                        "langlab_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}