package letmecook.BE.service;

import letmecook.BE.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        this.userList = new ArrayList<>();

        User user1 = new User(1,"Tus1", "tu.phuong1014442772@hcmut.edu.vn", "0964088349");
        User user2 = new User(2,"Tus2", "tudt@gmail.com", "0964088350");
        User user3 = new User(3,"Tus3", "pchungtu@gmail.com", "0964088351");
        User user4 = new User(4,"Tus4", "pchungtu998@gmail.com", "0964088352");

        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }
    public List<User> getAllUser() {
        return this.userList;
    }
    public Optional<User> getUser(Integer id) {
        Optional<User> resultUser = Optional.empty();
        for (User user: userList) {
            if (id == user.getId()) {
                resultUser = Optional.of(user);
                break;
            }
        }
        return resultUser;
    }
}
