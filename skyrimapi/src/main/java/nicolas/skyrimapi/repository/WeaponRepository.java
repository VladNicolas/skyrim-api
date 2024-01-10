package nicolas.skyrimapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nicolas.skyrimapi.model.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository <Weapon, Integer> {

    List<Weapon> findByType(String type);
}