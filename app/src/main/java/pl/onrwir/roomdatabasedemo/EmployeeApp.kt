package pl.onrwir.roomdatabasedemo

import android.app.Application

class EmployeeApp:Application() {
    val db by lazy{
        EmployeeDatabase.getInstance(this)
    }
}