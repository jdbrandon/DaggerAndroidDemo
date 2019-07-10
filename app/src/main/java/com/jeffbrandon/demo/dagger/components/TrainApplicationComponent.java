package com.jeffbrandon.demo.dagger.components;

import com.jeffbrandon.demo.dagger.MainApplication;
import com.jeffbrandon.demo.dagger.modules.BindingModule;
import com.jeffbrandon.demo.dagger.modules.TrainModule;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

import javax.inject.Singleton;

@Singleton
@Component(modules = {TrainModule.class, AndroidInjectionModule.class, BindingModule.class})
interface TrainApplicationComponent extends AndroidInjector<MainApplication> {
}
