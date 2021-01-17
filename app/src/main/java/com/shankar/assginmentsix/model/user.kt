package com.shankar.assginmentsix.model

import java.util.*

class user {
    fun Login(username: String, password: String): Boolean {
        return username.toLowerCase(Locale.ROOT).equals("shankar") &&
                password.toLowerCase(Locale.ROOT).equals("12345");
    }
}