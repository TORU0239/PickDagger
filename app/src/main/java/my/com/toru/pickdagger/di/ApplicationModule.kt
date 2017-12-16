package my.com.toru.pickdagger.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import my.com.toru.pickdagger.ui.MainActivity

/**
 * Created by toruchoi on 16/12/2017.
 */
@Module
abstract class ApplicationModule {
    @ContributesAndroidInjector
    abstract fun contributeActivityInjector(): MainActivity
}