package craterzone.com.vivek.product.service;



import java.util.List;

import craterzone.com.vivek.product.model.User;
import craterzone.com.vivek.product.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
