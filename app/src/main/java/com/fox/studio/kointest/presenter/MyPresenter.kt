package com.fox.studio.kointest.presenter

import com.fox.studio.kointest.repository.HelloRepository

/*класс презентатора для использования данных: HelloRepository*/
class MyPresenter(val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()} from $this"
}