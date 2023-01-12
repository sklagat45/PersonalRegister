package com.sklagat46.salicprac

import android.app.Application
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
//import org.koin.android.ext.koin.androidContext
//import org.koin.core.context.startKoin
//import org.koin.core.error.KoinAppAlreadyStartedException
import timber.log.Timber

class SalicPracApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initTimber()
//        initKoin()
    }

//    private fun initKoin() {
//        try {
//            startKoin {
//                androidContext(this@SalicPracApplication)
//                modules(
//                    appModule
//                )
//            }
//        } catch (error: KoinAppAlreadyStartedException) {
//            Timber.e(error.localizedMessage)
//        }
//    }

    private fun initTimber() {
        Timber.plant(object : Timber.DebugTree() {
            @Nullable
            override fun createStackElementTag(@NotNull element: StackTraceElement): String? {
                return super.createStackElementTag(element) + ":" + element.lineNumber
            }
        })
    }
}