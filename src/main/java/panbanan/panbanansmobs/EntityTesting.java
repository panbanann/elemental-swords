package panbanan.panbanansmobs;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import panbanan.panbanansmobs.entities.FieryGolemEntity;
import software.bernie.example.registry.ItemRegistry;


public class EntityTesting{

    public static final EntityType<FieryGolemEntity> FIERY_GOLEM = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("entitytesting", "fiery_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FieryGolemEntity::new).dimensions(EntityDimensions.fixed(1.0f, 2.1f)).build()
    );

    public static void onInitialize(){
        FabricDefaultAttributeRegistry.register(FIERY_GOLEM, FieryGolemEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 100.0D).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1D).add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.7D).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10.0D));
    }
}
