package my.com.toru.pickdagger.repo

import android.app.Activity
import android.widget.Toast

/**
 * Created by toruchoi on 17/12/2017.
 */
class ToastModule(val activity:Activity) {

    fun showToast(msg:String) {
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show()
    }
}