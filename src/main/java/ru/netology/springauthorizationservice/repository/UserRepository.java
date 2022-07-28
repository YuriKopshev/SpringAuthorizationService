package ru.netology.springauthorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springauthorizationservice.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> result = new ArrayList<>();
        if (user.equalsIgnoreCase("admin") && password.equals("1111")) {
            result.add(Authorities.WRITE);
            result.add(Authorities.DELETE);
            result.add(Authorities.READ);
        } else if (user.equalsIgnoreCase("ivan") && password.equals("5555")) {
            result.add(Authorities.WRITE);
            result.add(Authorities.READ);
        } else if (user.equalsIgnoreCase("petr") && password.equals("7777")) {
            result.add(Authorities.READ);
        }
        return result;
    }
}
