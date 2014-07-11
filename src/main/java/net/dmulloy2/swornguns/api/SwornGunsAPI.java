package net.dmulloy2.swornguns.api;

import java.util.List;

import net.dmulloy2.swornguns.SwornGuns;
import net.dmulloy2.swornguns.types.Bullet;
import net.dmulloy2.swornguns.types.EffectType;
import net.dmulloy2.swornguns.types.Gun;
import net.dmulloy2.swornguns.types.GunPlayer;
import net.dmulloy2.types.MyMaterial;
import net.dmulloy2.types.Reloadable;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

/**
 * API Implementation for {@link SwornGuns}
 * 
 * @author dmulloy2
 */

public abstract interface SwornGunsAPI extends Reloadable
{
	Permission getPermission(Gun gun);

	GunPlayer getGunPlayer(Player player);

	Gun getGun(MyMaterial material);

	Gun getGun(String gunName);

	void removeBullet(Bullet bullet);

	void addBullet(Bullet bullet);

	Bullet getBullet(Entity proj);

	List<Gun> getGunsByType(MyMaterial material);

	void removeEffect(EffectType effectType);

	void addEffect(EffectType effectType);
}