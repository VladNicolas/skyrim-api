package nicolas.skyrimapi.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nicolas.skyrimapi.model.Weapon;
import nicolas.skyrimapi.repository.WeaponRepository;

@Service
public class WeaponServiceImplementation implements WeaponService {

    @Autowired
    private WeaponRepository weaponRepository;

    @Override
    public List<Weapon> getAllWeapons() {
        return weaponRepository.findAll();
    }

    @Override
    public List<Weapon> getWeaponsByType(String type) {
        return weaponRepository.findByType(type);
    }

    @Override
    public List<Weapon> searchWeapons(String keyword) {
        return weaponRepository.findAll().stream()
                .filter(weapon -> weapon.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}