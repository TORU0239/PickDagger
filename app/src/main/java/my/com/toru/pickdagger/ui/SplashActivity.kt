package my.com.toru.pickdagger.ui

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import my.com.toru.pickdagger.R
import my.com.toru.pickdagger.databinding.ActivitySplashBinding
import my.com.toru.pickdagger.viewmodel.SplashDataBinding

class SplashActivity : AppCompatActivity() {

    private val responseSuccess: MutableLiveData<Boolean> = MutableLiveData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding:ActivitySplashBinding = DataBindingUtil.setContentView(SplashActivity@this, R.layout.activity_splash)

        responseSuccess.observe(this@SplashActivity, Observer<Boolean>{
            it?.let {
                if(it){
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                }
                else{
                    Toast.makeText(this@SplashActivity, "Sign In Failed!!", Toast.LENGTH_SHORT).show()
                }
            }
        })
        dataBinding.vmBinding = SplashDataBinding(responseSuccess)
    }
}