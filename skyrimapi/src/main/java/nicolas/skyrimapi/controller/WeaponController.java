package nicolas.skyrimapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nicolas.skyrimapi.model.Weapon;
import nicolas.skyrimapi.service.WeaponService;

@RestController
@RequestMapping("/weapon")
public class WeaponController {

    @Autowired
    private WeaponService weaponService;

    @GetMapping("/all")
    public List<Weapon> getAllWeapons() {
        return weaponService.getAllWeapons();
    }

    @GetMapping("/{type}")
    public List<Weapon> getWeaponsByType(@PathVariable String type) {
        return weaponService.getWeaponsByType(type);
    }

    @GetMapping("/search/{keyword}")
    public List<Weapon> searchWeapons(@PathVariable String keyword) {
        return weaponService.searchWeapons(keyword);
    }
}