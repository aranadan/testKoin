package com.fox.studio.jointtest.presenter

import com.fox.studio.jointtest.repository.HelloRepository

/*класс презентатора для использования данных: HelloRepository*/
class MyPresenter(val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()} from $this"
}