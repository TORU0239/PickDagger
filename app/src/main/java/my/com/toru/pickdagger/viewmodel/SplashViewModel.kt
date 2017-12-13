package my.com.toru.pickdagger.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.util.Log
import android.view.View
import my.com.toru.pickdagger.BR

/**
 * Created by toruchoi on 13/12/2017.
 */

class SplashDataBinding(val success:MutableLiveData<Boolean>):BaseObservable(){
    val buttonClickListener = View.OnClickListener{
        Log.w("SplashDataBinding", "onClickButton")
        success.postValue(((email != "" && password != "")))
    }

    var email:String = ""
    @Bindable get
    set(value) {
        field = value
        notifyPropertyChanged(BR.email)
    }

    var password:String = ""
    @Bindable get
    set(value) {
        field = value
        notifyPropertyChanged(BR.password)
    }
}