package com.sinarahimi.koinsample

import android.app.Application
import com.sinarahimi.koinsample.di.applicationModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

//
// Created by Sina Rahimi on 2/2/20.
// Copyright (c) 2020 www.sinarahimi.com. All rights reserved.
//

 class BaseApplication : Application() {

     override fun onCreate() {
         super.onCreate()
         startKoin {
             androidLogger()
             androidContext(this@BaseApplication)
             modules(listOf(applicationModules)) }
     }

}