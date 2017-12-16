package my.com.toru.pickdagger.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import my.com.toru.pickdagger.app.PickDaggerApplication

/**
 * Created by toruchoi on 16/12/2017.
 */
@Component(modules = [AndroidInjectionModule::class, ApplicationModule::class])
interface ApplicationComponent:AndroidInjector<PickDaggerApplication>{
}