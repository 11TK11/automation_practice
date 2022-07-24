package utils.randomGenearators;

import utils.dto.ContactDto;

public class RandomContact extends RandomDto{
    private ContactDto contactDto;
    public RandomContact() {
        contactDto = new ContactDto();
        setDto();
    }

    @Override
    public void setDto() {
        contactDto.message = RandomGenerator.getString(80,"lowercase");
        contactDto.orderReference = RandomGenerator.getString(10,"lowercase");
        this.dto=contactDto;
    }
}
