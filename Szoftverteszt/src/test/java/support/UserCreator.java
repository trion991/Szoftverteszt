package support;

import user.User;

public class UserCreator {

    public User user = new User();

    public UserCreator() {
        user.setFirstName("Peter");
        user.setLastName("Pelda");
        user.setEmailAddress("testuser.test.szt22e@gmail.com");
        user.setPassword("peldapwd");
        user.setAddress("Felso Tisza-Part 23");
        user.setCity("Szeged");
        user.setPostalCode("6723");
        user.setMobilePhone("1245662321");
        user.setAddressAlias("Ady ter 10");
    }

    public User getUser() {
        return user;
    }
}
