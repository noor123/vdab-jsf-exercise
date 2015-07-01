package be.vdab.UserBean.java;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;

@Named
@RequestScoped
public class UserBean {
    User user = new User();

    @Inject
    UserRepository userRepository;

    public User getById(int id) {
        return userRepository.findById(id);
    }

    public String saveUser() {
        userRepository.save(this.user);
        return "table";
    }

    public String saveChanges() {
        userRepository.save(this.user);
        return "table";
    }

    public String editUser() {
        userRepository.save(this.user);
        return "table";
    }

    public User getUser() {
        return user;
    }
}
