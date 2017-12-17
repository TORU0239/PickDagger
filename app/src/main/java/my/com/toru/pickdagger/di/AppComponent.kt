package my.com.toru.pickdagger.di

import dagger.Component
import my.com.toru.pickdagger.di.main.MainActivityComponent
import javax.inject.Singleton

/**
 * Created by toruchoi on 16/12/2017.
 */

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent{
    fun mainActivityComponentBuilder():MainActivityComponent.Builder
}