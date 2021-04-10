package com.mvp.mvp_login.modal

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Matcher
import java.util.regex.Pattern

class User(var email: String, var password: String) : IUser {


    override fun isValid(): Boolean {
        return !TextUtils.isEmpty(email) && (password.length > 6) && Patterns.EMAIL_ADDRESS.matcher(
            email
        ).matches()
    }
}