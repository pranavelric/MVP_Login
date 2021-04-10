package com.mvp.mvp_login.presenter

import com.mvp.mvp_login.modal.User
import com.mvp.mvp_login.view.IView

class Presenter(var iView:IView) :IPresenter {


    override fun onLogin(email: String, pass: String) {
    val user=User(email,pass)
        if(user.isValid()){
            iView.onLoginSuccess("Login succesful")
        }
        else{
            iView.onLoginSuccess("NO Successful")
        }
    }

}