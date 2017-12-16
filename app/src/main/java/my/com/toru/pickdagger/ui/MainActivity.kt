package my.com.toru.pickdagger.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import my.com.toru.pickdagger.R
import my.com.toru.pickdagger.di.DIInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var diComponent: DIInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    fun init(){
        diComponent.testDIComponent()
    }
}