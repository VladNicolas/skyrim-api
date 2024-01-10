package nicolas.skyrimapi.service;

import java.util.List;

import nicolas.skyrimapi.model.Weapon;

public interface WeaponService {

    public List<Weapon> getAllWeapons();
    public List<Weapon> getWeaponsByType(String type);
    public List<Weapon> searchWeapons(String keyword);
}