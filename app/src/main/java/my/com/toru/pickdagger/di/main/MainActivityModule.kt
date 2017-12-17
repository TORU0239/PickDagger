package my.com.toru.pickdagger.di.main

import dagger.Module
import dagger.Provides
import my.com.toru.pickdagger.repo.ToastModule
import my.com.toru.pickdagger.ui.MainActivity

/**
 * Created by toruchoi on 17/12/2017.
 */
@Module
class MainActivityModule(private val activity:MainActivity) {

    @Provides
    fun provideToastModule() = ToastModule(activity)
}