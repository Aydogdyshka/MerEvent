package com.mertech.merevent

import android.app.Application
import android.content.Context
import com.mertech.merevent.di.ApplicationComponent
import com.mertech.merevent.di.DaggerApplicationComponent
import dagger.android.DaggerApplication

class MerEventApplication: Application() {

    val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.create()
    }

    override fun onCreate() {
        super.onCreate()
    }

    val Context.appComponent: ApplicationComponent
        get() = when(this){
            is MerEventApplication -> applicationComponent
            else -> this.applicationContext.appComponent
        }
}