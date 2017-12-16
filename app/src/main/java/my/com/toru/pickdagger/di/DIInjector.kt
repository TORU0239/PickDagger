package my.com.toru.pickdagger.di

import android.util.Log
import javax.inject.Inject

/**
 * Created by toruchoi on 16/12/2017.
 */
class DIInjector @Inject constructor() {
    companion object {
        private val TAG =  DIInjector::class.java.simpleName
    }
    fun testDIComponent(){
        Log.w(TAG, "calling testDIComponent")
    }
}