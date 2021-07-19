package panbanan.elementalswords.items.material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ElementalArmorMaterial implements ArmorMaterial {
    public static final ElementalArmorMaterial INSTANCE = new ElementalArmorMaterial();


    @Override
    public int getDurability(EquipmentSlot slot) {
        return 1000;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }

    @Override
    public SoundEvent getEquipSound() {
        return new SoundEvent(new Identifier("item.armor.equip_generic"));
    }


    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.POTATO);
    }

    @Override
    public String getName() {
        return "Potat";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
