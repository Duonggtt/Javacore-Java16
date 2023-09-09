package com.example.restapitest;

import com.example.restapitest.model.User;
import com.example.restapitest.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RestApiTestApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    void saveAllUser() {
        User user = new User(1, "Duc Thinh", "thinh@gmail.com", "0988881888","Ha Noi", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123");
        User user1 = new User(2, "Duong Tung", "duong@gmail.com", "0988883888","Hai Phong", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123");
        User user2 = new User(3, "Lan Anh", "lanh@gmail.com", "0988885888","Ha Noi", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123");
        User user3 = new User(4, "Minh Tam", "tam@gmail.com", "0988886888","Hai Phong", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123");
        User user4 = new User(5, "Tien Dat", "dat@gmail.com", "09888887888","Hai Phong", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123");
        User user5 = new User(6, "Quang Huy", "huy@gmail.com", "0988888888","Ha Noi", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123");

        userRepository.saveAll(List.of(user,user1,user2,user3,user4,user5));
    }

}
