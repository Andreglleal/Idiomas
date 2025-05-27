package com.trabalhoandroid.idiomas.datasource

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


val Context.dataStore by preferencesDataStore(name = "language")

object LanguagePreferences {

    private val LANGUAGE_KEY = stringPreferencesKey("language_key")

    suspend fun saveLanguage(context: Context, languageCode: String){
        context.dataStore.edit {preferences ->
            preferences[LANGUAGE_KEY] = languageCode
        }
    }
    fun getLanguage(context: Context):Flow<String>{
        return context.dataStore.data.map { preferences ->
            preferences[LANGUAGE_KEY] ?: "pt"
        }
    }
}