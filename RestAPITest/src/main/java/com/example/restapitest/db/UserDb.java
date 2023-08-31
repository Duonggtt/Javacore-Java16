package com.example.restapitest.db;

import com.example.restapitest.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDb {
    public static List<User> userList = new ArrayList<>(
            List.of(
                    new User(1, "Duc Thinh", "thinh@gmail.com", "0988888888","Ha Noi", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123"),
                    new User(2, "Duong Tung", "duong@gmail.com", "0988888888","Hai Phong", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123"),
                    new User(3, "Lan Anh", "lanh@gmail.com", "0988888888","Ha Noi", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123"),
                    new User(4, "Minh Tam", "tam@gmail.com", "0988888888","Hai Phong", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123"),
                    new User(5, "Tien Dat", "dat@gmail.com", "0988888888","Hai Phong", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123"),
                    new User(6, "Quang Huy", "huy@gmail.com", "0988888888","Ha Noi", "https://media.techmaster.vn/api/static/c2m5ou451cob24f6skeg/c3IwVOU2","123")

            )
    );
}
