package com.yourcompany.passengermonitoringapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PassengerMonitoringApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // 初始化代码（如果有）
    }
}