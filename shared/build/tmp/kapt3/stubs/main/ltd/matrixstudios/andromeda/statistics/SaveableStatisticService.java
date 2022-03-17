package ltd.matrixstudios.andromeda.statistics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lltd/matrixstudios/andromeda/statistics/SaveableStatisticService;", "", "()V", "statistics", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lltd/matrixstudios/andromeda/statistics/SaveableStatistic;", "getStatistics", "()Ljava/util/HashMap;", "getStatistic", "player", "Lorg/bukkit/entity/Player;", "loadStatistics", "", "saveStatistic", "saveable", "shared"})
public final class SaveableStatisticService {
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.util.UUID, ltd.matrixstudios.andromeda.statistics.SaveableStatistic> statistics = null;
    
    public SaveableStatisticService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, ltd.matrixstudios.andromeda.statistics.SaveableStatistic> getStatistics() {
        return null;
    }
    
    /**
     * Saves a stat to redis
     * @param player
     * @param saveable
     */
    public final void saveStatistic(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.andromeda.statistics.SaveableStatistic saveable) {
    }
    
    public final void loadStatistics() {
    }
    
    /**
     * Finds statistic or creates a new one
     * @param player
     */
    @org.jetbrains.annotations.NotNull()
    public final ltd.matrixstudios.andromeda.statistics.SaveableStatistic getStatistic(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
}