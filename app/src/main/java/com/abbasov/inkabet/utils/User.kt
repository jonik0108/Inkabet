package com.abbasov.inkabet.utils

import java.io.Serializable

class User: Serializable {

    var uid:String? = null
    var name:String? = null
    var gmail:String? = null
    var image:String? = null

    constructor()

    constructor(uid: String?, name: String?, gmail: String?, image: String?) {
        this.uid = uid
        this.name = name
        this.gmail = gmail
        this.image = image
    }


    override fun toString(): String {
        return "User(uid=$uid, name=$name, gmail=$gmail, image=$image)"
    }
}