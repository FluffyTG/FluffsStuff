package fluff.fluffsstuff.sound;

import fluff.fluffsstuff.FluffsStuff;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent COUGHING_FIT = registerSoundEvent("coughing_fit");

    private  static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(FluffsStuff.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        FluffsStuff.LOGGER.info("Registering Sounds for " + FluffsStuff.MOD_ID);
    }
}
