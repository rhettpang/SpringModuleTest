import com.pk.second.service.UserService;
import com.pk.second.service.impl.UserServiceImpl;

/**
 * @author Created by pangkunkun on 2018/10/31.
 */
module SpringSecond {
    requires spring.context;

    requires SpringThird;

    provides UserService with UserServiceImpl;

    exports com.pk.second.service;
}