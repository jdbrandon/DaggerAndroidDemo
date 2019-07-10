package com.jeffbrandon.demo.dagger;

import com.jeffbrandon.demo.dagger.components.DaggerTrainApplicationComponent;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import timber.log.Timber;

import javax.inject.Inject;

public class MainApplication extends DaggerApplication {
    @Inject
    Train train;

    @Override
    public void onCreate() {
        //Plant debug tree absolutely first thing
        Timber.plant(new Timber.DebugTree());
        super.onCreate();
        train.run();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerTrainApplicationComponent.create();
    }
}
