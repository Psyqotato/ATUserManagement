package com.ATUserManagement.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class UserDetails {

    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private int age;
    private String gender;
    private String nationality;
    private List<String> tags;

    @Override
    public String toString() {
        String tags_print = "";
        for (int i = 0;i < tags.size() - 1; i++) {
            tags_print = tags_print + "\"" + tags.get(i) + "\",";
        }
        tags_print = tags_print + "\"" + tags.get(tags.size() - 1) + "\"";

        return "{"
                + "\"password\"" + ":\"" +password + "\","
                + "\"firstName\"" + ":\"" +firstName + "\","
                + "\"lastName\"" + ":\"" +lastName + "\","
                + "\"email\"" + ":\"" +email + "\","
                + "\"contactNumber\"" + ":\"" + contactNumber + "\","
                + "\"age\"" + ":" + age + ","
                + "\"gender\"" + ":\"" + gender + "\","
                + "\"nationality\"" + ":\"" + nationality + "\","
                + "\"tags\"" + ":[" + tags_print + "]"
                + "}";
    }

}
