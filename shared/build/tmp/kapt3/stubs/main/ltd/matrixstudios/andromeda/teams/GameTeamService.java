package ltd.matrixstudios.andromeda.teams;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lltd/matrixstudios/andromeda/teams/GameTeamService;", "", "()V", "teams", "Ljava/util/HashMap;", "", "Lltd/matrixstudios/andromeda/teams/GameTeam;", "getTeams", "()Ljava/util/HashMap;", "setTeams", "(Ljava/util/HashMap;)V", "sendTeamsToRedis", "", "shared"})
public final class GameTeamService {
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.Integer, ltd.matrixstudios.andromeda.teams.GameTeam> teams;
    
    public GameTeamService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Integer, ltd.matrixstudios.andromeda.teams.GameTeam> getTeams() {
        return null;
    }
    
    public final void setTeams(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, ltd.matrixstudios.andromeda.teams.GameTeam> p0) {
    }
    
    /**
     * Send teams to redis so they can be pulls for things like:
     * Lobby, website data, etc.
     */
    public final void sendTeamsToRedis() {
    }
}