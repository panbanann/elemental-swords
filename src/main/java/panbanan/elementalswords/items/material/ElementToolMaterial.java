package panbanan.elementalswords.items.material;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ElementToolMaterial implements ToolMaterial {

    public static final ElementToolMaterial INSTANCE = new ElementToolMaterial();

    @Override
    public int getDurability() {
        return 5000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 6.0F;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHER_STAR);
    }
}
