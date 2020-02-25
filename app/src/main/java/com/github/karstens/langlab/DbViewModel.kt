package com.github.karstens.langlab

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DbViewModel (application: Application) : AndroidViewModel(application) {

    private val repository: DbRepository
    val allWords: LiveData<List<DbPackage>>

    init {
        val packageDao = DbRoomDatabase.getDatabase(application).packageDao()
        repository = DbRepository(packageDao)
        allWords = repository.allPackages
    }

    /**
     * The implementation of insert() in the database is completely hidden from the UI.
     * Room ensures that you're not doing any long running operations on
     * the main thread, blocking the UI, so we don't need to handle changing Dispatchers.
     * ViewModels have a coroutine scope based on their lifecycle called
     * viewModelScope which we can use here.
     */
    fun insert(pkg: DbPackage) = viewModelScope.launch {
        repository.insert(pkg)
    }
}

