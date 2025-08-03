package com.worldcup;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String region;
    private String coach;
    private List<String> assistantCoaches;
    private String medicalStaff;
    private List<Player> players;
    private int points;
    private int goalDifference;
    private int yellowCards;
    private int redCards;
    private boolean isHost;
    private int substitutionCount; // 👈 Thêm biến theo dõi số lần thay người (BR10)
    private List<Player> startingPlayers = new ArrayList<>();
    private List<Player> substitutePlayers = new ArrayList<>();


    public Team(String name, String region, String coach, List<String> assistantCoaches,
                String medicalStaff, List<Player> players, boolean isHost) {

        if (assistantCoaches.size() > 3) {
            throw new IllegalArgumentException("Tối đa 3 trợ lý huấn luyện viên.");
        }

        if (players.size() < 22) {
            throw new IllegalArgumentException("Đội bóng phải có ít nhất 22 cầu thủ.");
        }

        this.name = name;
        this.region = region;
        this.coach = coach;
        this.assistantCoaches = new ArrayList<>(assistantCoaches);
        this.medicalStaff = medicalStaff;
        this.players = new ArrayList<>(players);
        this.isHost = isHost;
        this.points = 0;
        this.goalDifference = 0;
        this.yellowCards = 0;
        this.redCards = 0;
        this.substitutionCount = 0; // 👈 Khởi tạo số lần thay người là 0
    }

    public Team(String name, String region, String coach, List<String> assistantCoaches,
            String medicalStaff, List<Player> startingPlayers, List<Player> substitutePlayers, boolean isHost) {
    this.name = name;
    this.region = region;
    this.coach = coach;
    this.assistantCoaches = new ArrayList<>(assistantCoaches);
    this.medicalStaff = medicalStaff;
    this.startingPlayers = new ArrayList<>(startingPlayers);
    this.substitutePlayers = new ArrayList<>(substitutePlayers);
    this.isHost = isHost;
}


    // --- Getters ---

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCoach() {
        return coach;
    }

    public List<String> getAssistantCoaches() {
        return assistantCoaches;
    }

    public String getMedicalStaff() {
        return medicalStaff;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public boolean isHost() {
        return isHost;
    }

    public int getPoints() {
        return points;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public int getSubstitutionCount() {
        return substitutionCount;
    }

    public List<Player> getStartingPlayers() {
        return startingPlayers;
    }

    public void setStartingPlayers(List<Player> startingPlayers) {
        this.startingPlayers = startingPlayers;
    }

    public List<Player> getSubstitutePlayers() {
        return substitutePlayers;
    }

    public void setSubstitutePlayers(List<Player> substitutePlayers) {
        this.substitutePlayers = substitutePlayers;
    }


    // --- Setters ---

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }

    public void setSubstitutionCount(int substitutionCount) {
        this.substitutionCount = substitutionCount;
    }

    // --- Thêm mới: Tăng số lần thay người ---
    public void incrementSubstitutionCount() {
        this.substitutionCount++;
    }

    public void addStartingPlayer(Player player) {
        this.startingPlayers.add(player);
    }

    public void addSubstitutePlayer(Player player) {
        this.substitutePlayers.add(player);
    }

}
