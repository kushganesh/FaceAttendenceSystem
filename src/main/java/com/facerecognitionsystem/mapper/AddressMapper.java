package com.facerecognitionsystem.mapper;
import com.facerecognitionsystem.dto.AddressDTO;
import com.facerecognitionsystem.entity.Address;

public class AddressMapper {


    public static AddressDTO toDTO(Address address) {
        if (address == null) {
            return null;
        }

        return new AddressDTO(
                address.getId(),
                address.getStreet(),
                address.getCity(),
                address.getState(),
                address.getPincode(),
                address.getCountry()
        );
    }

    // Convert AddressDTO to Address entity
    public static Address toEntity(AddressDTO addressDTO) {
        if (addressDTO == null) {
            return null;
        }

        Address address = new Address();
        address.setId(addressDTO.getId());
        address.setStreet(addressDTO.getStreet());
        address.setCity(addressDTO.getCity());
        address.setState(addressDTO.getState());
        address.setPincode(addressDTO.getPincode());
        address.setCountry(addressDTO.getCountry());

        return address;
    }
}
