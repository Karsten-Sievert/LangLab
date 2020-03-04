package com.github.karstens.langlab

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
interface DbPackageDao {
    @Query("SELECT * from package_table ORDER BY description ASC")
    fun getAlphabetizedPackages(): LiveData<List<DbPackage>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(pkg: DbPackage)

    @Query("DELETE FROM package_table")
    suspend fun deleteAll()

}