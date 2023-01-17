package hiber.dao;

import hiber.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();

   @Transactional
   List<User> getUserByCar(String carModel, int carSeries);
}
