package com.example.myapplication.model

class Constant {
    var image: Int
    var title: String
    var ejza: String
    var tarqeeb: String
    var url: String? = null
    var u: String? = null

    constructor(image: Int, title: String, ejza: String, tarqeeb: String) {
        this.image = image
        this.title = title
        this.ejza = ejza
        this.tarqeeb = tarqeeb
    }

    constructor(image: Int, title: String, ejza: String, tarqeeb: String, url: String?) {
        this.image = image
        this.title = title
        this.ejza = ejza
        this.tarqeeb = tarqeeb
        this.url = url
    }

    constructor(
        image: Int,
        title: String,
        ejza: String,
        tarqeeb: String,
        url: String?,
        u: String?
    ) {
        this.image = image
        this.title = title
        this.ejza = ejza
        this.tarqeeb = tarqeeb
        this.url = url
        this.u = u
    }
}