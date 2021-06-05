package pl.javastart.cookbook.user.address.service;

import org.springframework.stereotype.Service;
import pl.javastart.cookbook.user.address.repository.AddressRepository;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
}
