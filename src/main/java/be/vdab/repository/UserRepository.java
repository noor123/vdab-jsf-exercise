package be.vdab.repository;

import be.vdab.domain.User;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAll() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public User findById(int id) {
        return entityManager.find(User.class,id);
    }

    public void saveUser(User user) {
        entityManager.merge(user);

    }
}
