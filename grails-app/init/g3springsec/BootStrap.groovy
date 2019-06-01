package g3springsec

import com.tucanoo.springsec.*

class BootStrap {

    def init = { servletContext ->
      
      // Establish single role
      if (! Role.count())
        new Role(authority: 'ROLE_USER').save()

      // create a standard user
      if (! User.count()) {
        User user = new User()
        user.username = 'normal'
        user.password = 'password'
        user.enabled = true
        user.save(failOnError:true)

        UserRole.create(user, Role.first(),true )
        println user.authorities
      }

      // create a special user
      if (! OtherUser.count()) {
        OtherUser otherUser= new OtherUser()
        otherUser.username = 'other'
        otherUser.password = 'password'
        otherUser.enabled = true
        otherUser.save(failOnError:true)

        // no role is needed
      }

      println User.count()
    }
    def destroy = {
    }
}
