package com.tucanoo.springsec

import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class IndexController {

    def index() { }
}
