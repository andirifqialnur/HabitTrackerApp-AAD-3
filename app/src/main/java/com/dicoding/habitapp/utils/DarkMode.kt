package com.dicoding.habitapp.utils

import androidx.appcompat.app.AppCompatDelegate

enum class DarkMode(val value: Int) {

    FOLLOW_SYSTEM(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM),
    AUTO(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM),
    OFF(AppCompatDelegate.MODE_NIGHT_NO),
    ON(AppCompatDelegate.MODE_NIGHT_YES)

}