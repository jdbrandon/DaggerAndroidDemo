package com.jeffbrandon.demo.dagger.modules;

import com.jeffbrandon.demo.dagger.MainApplication;
import com.jeffbrandon.demo.dagger.activities.MainActivity;
import com.jeffbrandon.demo.dagger.engine.Engine;
import com.jeffbrandon.demo.dagger.engine.SteamEngine;
import com.jeffbrandon.demo.dagger.fuel.Coal;
import com.jeffbrandon.demo.dagger.fuel.Fuel;
import com.jeffbrandon.demo.dagger.heat.Fire;
import com.jeffbrandon.demo.dagger.heat.HeatSource;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BindingModule {
    @ContributesAndroidInjector
    abstract MainApplication mainApplication();

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();

    @Binds
    abstract Fuel provideFuel(Coal c);

    @Binds
    abstract HeatSource provideHeatSource(Fire f);

    @Binds
    abstract Engine providesEngine(SteamEngine e);
}
