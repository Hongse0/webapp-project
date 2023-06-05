package com.mvc.company.model.dto;


public class TeamDTO {

    private String teamCode;
    private String teamName;
    private String teamDetail;
    private String useYN;

    public TeamDTO() {
    }

    public TeamDTO(String teamCode, String teamName, String teamDetail, String useYN) {
        this.teamCode = teamCode;
        this.teamName = teamName;
        this.teamDetail = teamDetail;
        this.useYN = useYN;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamDetail() {
        return teamDetail;
    }

    public void setTeamDetail(String teamDetail) {
        this.teamDetail = teamDetail;
    }

    public String getUseYN() {
        return useYN;
    }

    public void setUseYN(String useYN) {
        this.useYN = useYN;
    }

    @Override
    public String toString() {
        return "TeamDTO{" +
                "teamCode='" + teamCode + '\'' +
                ", teamName='" + teamName + '\'' +
                ", teamDetail='" + teamDetail + '\'' +
                ", useYN='" + useYN + '\'' +
                '}';
    }
}
