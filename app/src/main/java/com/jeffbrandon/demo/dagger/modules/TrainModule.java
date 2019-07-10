package com.jeffbrandon.demo.dagger.modules;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

@Module
public class TrainModule {
    private final Context context;

    public TrainModule(Context c) {
        context = c;
    }

    @Provides
    Context provideContext() {
        return context;
    }
}
