package Unittests.utils;

import org.junit.jupiter.api.Test;
import utils.dto.ContactDto;
import utils.dto.User;
import utils.randomGenearators.RandomContact;
import utils.randomGenearators.RandomUser;

public class RandomUserTest {
    @Test
    public void testRandomFullName(){
        RandomUser randomUser = new RandomUser();
        User user = randomUser.getRandomUser();
        System.out.println(user.firstName);
        //System.out.println(RandomUser.getUserFullName());
    }
    @Test
    public void testRandomDto(){
        /*RandomDto<User> userRandomDto = new RandomDto<>(User::new);
        System.out.println(userRandomDto.getClass());
        System.out.println(userRandomDto.getDto().getClass());*/

        RandomContact contactDtoRandomDto = new RandomContact();
        //System.out.println(contactDtoRandomDto.getDto().);
        ContactDto contactDto =(ContactDto)contactDtoRandomDto.getDto();
        System.out.println(contactDto.message);
    }
}
