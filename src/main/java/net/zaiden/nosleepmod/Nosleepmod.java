package net.zaiden.nosleepmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.minecraft.entity.player.PlayerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Nosleepmod implements ModInitializer {
    public static String  MOD_ID = "nosleepmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        EntitySleepEvents.ALLOW_SLEEPING.register((player, sleepingPos) -> {
            return PlayerEntity.SleepFailureReason.OTHER_PROBLEM;
        });





        LOGGER.info("Z <3 A = )");
    }
}
