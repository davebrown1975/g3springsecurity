package com.tucanoo.springsec

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER'])
class HomeController {

    def index() {println "in home index"}

}
