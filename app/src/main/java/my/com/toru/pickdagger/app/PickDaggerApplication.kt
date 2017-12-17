package my.com.toru.pickdagger.app

import android.app.Application
import my.com.toru.pickdagger.di.AppComponent

/**
 * Created by toruchoi on 16/12/2017.
 */
class PickDaggerApplication:Application(){

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
    }

    private fun createComponent(){
    }
}