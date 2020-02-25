package com.github.karstens.langlab

import androidx.lifecycle.LiveData

class DbRepository (private val packageDao: DbPackageDao){

    val allPackages: LiveData<List<DbPackage>> = packageDao.getAlphabetizedPackages()

    suspend fun insert(pkg: DbPackage) {
        packageDao.insert(pkg)
    }

}