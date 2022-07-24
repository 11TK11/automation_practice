package utils.randomGenearators;

import utils.dto.User;

public class RandomUser {
    private User user;
    public RandomUser(User user){
            // TODO: fill what is not there
    }
    public RandomUser(){
        this.user = new User();
        setRandomUserValues();
    }
    private void setRandomUserValues(){
        user.firstName = RandomGenerator.getString(6, "lowercase");
        user.lastName = RandomGenerator.getString(6, "lowercase");
        user.fullName = user.firstName + " " +user.lastName;
        user.email =RandomGenerator.getEmail(6,"gmail.com");
        //user.birthDate =
    }
    public User getRandomUser(){
        return user;
    }
}
