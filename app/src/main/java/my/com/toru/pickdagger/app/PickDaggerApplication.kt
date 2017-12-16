package my.com.toru.pickdagger.app

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by toruchoi on 16/12/2017.
 */
class PickDaggerApplication:Application(), HasActivityInjector {

    @Inject lateinit var dispatchingAndroidInjector:DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.create().inject(this@PickDaggerApplication)
    }
}