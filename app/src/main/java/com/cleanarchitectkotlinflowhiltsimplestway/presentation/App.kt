package com.cleanarchitectkotlinflowhiltsimplestway.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
	AppCenter.start(getApplication(), "955b4774-e16b-4fe1-a9ae-ccb5298923dd",
                  Analytics.class, Crashes.class);

    }
}