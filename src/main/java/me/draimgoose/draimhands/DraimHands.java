package me.draimgoose.draimhands;

import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DraimHands extends JavaPlugin {

    private List<World> worlds = new ArrayList<>();
    private List<UUID> colds = new ArrayList<>();
    private List<UUID> diseases = new ArrayList<>();

    private List<World> getWorlds() {
        return worlds;
    }

    // TODO: Простуды
    private List<UUID> getColds() {
        return colds;
    }

    // TODO: Болезни
    private List<UUID> getDiseases() {
        return diseases;
    }

    @Override
    public void onEnable() {
        createFiles();
    }

    @Override
    public void onDisable() {
    }

    // Создание файлов
    private void createFiles() {
        File folder = new File(this.getDataFolder() + File.separator + "players");
        if (!folder.exists()) folder.mkdirs();
    }

}
