package my.com.toru.pickdagger.di.main

import dagger.Subcomponent
import my.com.toru.pickdagger.ui.MainActivity

/**
 * Created by toruchoi on 17/12/2017.
 */

@Subcomponent(modules = [])
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun mainActivityModule(mainActivityModule:MainActivityModule):Builder
        fun build():MainActivityComponent
    }
}