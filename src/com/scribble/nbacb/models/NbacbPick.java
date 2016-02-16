
package com.scribble.nbacb.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class NbacbPick {

    private Long pickId;
    private Long gameId;
    private String league;
    private String leagueDisplayName;
    private String cbsGameAbbrv;
    private String gameStartDt;
    private String homeTeamName;
    private String awayTeamName;
    private String homeTeamNickName;
    private String awayTeamNickName;
    private String handicap;
    private String awayHandicap;
    private String pointSpreadAwayOdds;
    private String pointSpreadHomeOdds;
    private String overUnder;
    private String homeTeamMl;
    private String awayTeamMl;
    private String pick1Grade;
    private String pick2Grade;
    private String pick3Grade;
    private Long pick1Value;
    private Long pick2Value;
    private Long pick3Value;
    private String homeTeamProjScore;
    private String awayTeamProjScore;
    private String homeTeamAbbrv;
    private String homeTeamMedName;
    private String awayTeamAbbrv;
    private String awayTeamMedName;
    private String gameStartDtStamp;
    private String access;
    private String lineType;
    private Long homeRotationNumber;
    private Long awayRotationNumber;
    private Long homeTeamRank;
    private Long awayTeamRank;
    private String homeTeamConference;
    private String homeTeamConfAbbv;
    private String awayTeamConference;
    private String awayTeamConfAbbv;
    private Long homeTeamId;
    private Long awayTeamId;
    private Long gameStartFullDate;
    private Boolean neutral;
    private Long generated;
    private Long competId;
    private String openPick1Label;
    private String currentPick1Label;
    private String pick1ConsensusLabel;
    private Boolean pick1RLM;
    private String pick1MoveDirection;
    private String openPick2Label;
    private String currentPick2Label;
    private String pick2ConsensusLabel;
    private Boolean pick2RLM;
    private String pick2MoveDirection;
    private String openPick3Label;
    private String currentPick3Label;
    private String pick3ConsensusLabel;
    private Boolean pick3RLM;
    private String pick3MoveDirection;
    private String gamedate;
    private String venueNm;
    private String venueLoc;
    private String homeColor;
    private String homePrimaryColor;
    private String homeSecondaryColor;
    private Long homeWins;
    private Long homeLosses;
    private Long homeRank;
    private String homeRankPretty;
    private String homeConferenceAbbrv;
    private String homeConference;
    private String homeDivisionAbbrv;
    private String homeDivision;
    private Long homeConferenceRank;
    private String homeConferenceRankPretty;
    private Long homeDivisionRank;
    private String homeDivisionRankPretty;
    private String awayColor;
    private String awayPrimaryColor;
    private String awaySecondaryColor;
    private Long awayWins;
    private Long awayLosses;
    private Long awayRank;
    private String awayRankPretty;
    private String awayConferenceAbbrv;
    private String awayConference;
    private String awayDivisionAbbrv;
    private String awayDivision;
    private Long awayConferenceRank;
    private String awayConferenceRankPretty;
    private Long awayDivisionRank;
    private String awayDivisionRankPretty;
    private String spreadPubConsHomeLabel;
    private String spreadPubConsAwayLabel;
    private String mlPubConsHomeLabel;
    private String mlPubConsAwayLabel;
    private String ouPubConsOverLabel;
    private String ouPubConsUnderLabel;
    private Boolean locked;
    private String overUnderOverOdds;
    private String overUnderUnderOdds;
    private String total;
    private List<Odd> odds = new ArrayList<Odd>();
    private CoversOdd coversOdd;
    private Long lastJobRunDate;
    private String gameTime;
    private Boolean isMoneyLine;
    private String lastUpdatedDate;
    private Long bestValuePick;
    private String pick1GradeSanitized;
    private String pick1;
    private String pick2;
    private String pick3;
    private String pick3Label;
    private String pick1Proj;
    private String pick2Proj;
    private String pick3Proj;
    private String pick1MoveType;
    private String pick2MoveType;
    private String pick3MoveType;
    private String pick1SimLabel;
    private String pick2SimLabel;
    private String pick3SimLabel;
    private String pick1Sanitized;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The pickId
     */
    public Long getPickId() {
        return pickId;
    }

    /**
     * 
     * @param pickId
     *     The pickId
     */
    public void setPickId(Long pickId) {
        this.pickId = pickId;
    }

    /**
     * 
     * @return
     *     The gameId
     */
    public Long getGameId() {
        return gameId;
    }

    /**
     * 
     * @param gameId
     *     The gameId
     */
    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    /**
     * 
     * @return
     *     The league
     */
    public String getLeague() {
        return league;
    }

    /**
     * 
     * @param league
     *     The league
     */
    public void setLeague(String league) {
        this.league = league;
    }

    /**
     * 
     * @return
     *     The leagueDisplayName
     */
    public String getLeagueDisplayName() {
        return leagueDisplayName;
    }

    /**
     * 
     * @param leagueDisplayName
     *     The leagueDisplayName
     */
    public void setLeagueDisplayName(String leagueDisplayName) {
        this.leagueDisplayName = leagueDisplayName;
    }

    /**
     * 
     * @return
     *     The cbsGameAbbrv
     */
    public String getCbsGameAbbrv() {
        return cbsGameAbbrv;
    }

    /**
     * 
     * @param cbsGameAbbrv
     *     The cbsGameAbbrv
     */
    public void setCbsGameAbbrv(String cbsGameAbbrv) {
        this.cbsGameAbbrv = cbsGameAbbrv;
    }

    /**
     * 
     * @return
     *     The gameStartDt
     */
    public String getGameStartDt() {
        return gameStartDt;
    }

    /**
     * 
     * @param gameStartDt
     *     The gameStartDt
     */
    public void setGameStartDt(String gameStartDt) {
        this.gameStartDt = gameStartDt;
    }

    /**
     * 
     * @return
     *     The homeTeamName
     */
    public String getHomeTeamName() {
        return homeTeamName;
    }

    /**
     * 
     * @param homeTeamName
     *     The homeTeamName
     */
    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    /**
     * 
     * @return
     *     The awayTeamName
     */
    public String getAwayTeamName() {
        return awayTeamName;
    }

    /**
     * 
     * @param awayTeamName
     *     The awayTeamName
     */
    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    /**
     * 
     * @return
     *     The homeTeamNickName
     */
    public String getHomeTeamNickName() {
        return homeTeamNickName;
    }

    /**
     * 
     * @param homeTeamNickName
     *     The homeTeamNickName
     */
    public void setHomeTeamNickName(String homeTeamNickName) {
        this.homeTeamNickName = homeTeamNickName;
    }

    /**
     * 
     * @return
     *     The awayTeamNickName
     */
    public String getAwayTeamNickName() {
        return awayTeamNickName;
    }

    /**
     * 
     * @param awayTeamNickName
     *     The awayTeamNickName
     */
    public void setAwayTeamNickName(String awayTeamNickName) {
        this.awayTeamNickName = awayTeamNickName;
    }

    /**
     * 
     * @return
     *     The handicap
     */
    public String getHandicap() {
        return handicap;
    }

    /**
     * 
     * @param handicap
     *     The handicap
     */
    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    /**
     * 
     * @return
     *     The awayHandicap
     */
    public String getAwayHandicap() {
        return awayHandicap;
    }

    /**
     * 
     * @param awayHandicap
     *     The awayHandicap
     */
    public void setAwayHandicap(String awayHandicap) {
        this.awayHandicap = awayHandicap;
    }

    /**
     * 
     * @return
     *     The pointSpreadAwayOdds
     */
    public String getPointSpreadAwayOdds() {
        return pointSpreadAwayOdds;
    }

    /**
     * 
     * @param pointSpreadAwayOdds
     *     The pointSpreadAwayOdds
     */
    public void setPointSpreadAwayOdds(String pointSpreadAwayOdds) {
        this.pointSpreadAwayOdds = pointSpreadAwayOdds;
    }

    /**
     * 
     * @return
     *     The pointSpreadHomeOdds
     */
    public String getPointSpreadHomeOdds() {
        return pointSpreadHomeOdds;
    }

    /**
     * 
     * @param pointSpreadHomeOdds
     *     The pointSpreadHomeOdds
     */
    public void setPointSpreadHomeOdds(String pointSpreadHomeOdds) {
        this.pointSpreadHomeOdds = pointSpreadHomeOdds;
    }

    /**
     * 
     * @return
     *     The overUnder
     */
    public String getOverUnder() {
        return overUnder;
    }

    /**
     * 
     * @param overUnder
     *     The overUnder
     */
    public void setOverUnder(String overUnder) {
        this.overUnder = overUnder;
    }

    /**
     * 
     * @return
     *     The homeTeamMl
     */
    public String getHomeTeamMl() {
        return homeTeamMl;
    }

    /**
     * 
     * @param homeTeamMl
     *     The homeTeamMl
     */
    public void setHomeTeamMl(String homeTeamMl) {
        this.homeTeamMl = homeTeamMl;
    }

    /**
     * 
     * @return
     *     The awayTeamMl
     */
    public String getAwayTeamMl() {
        return awayTeamMl;
    }

    /**
     * 
     * @param awayTeamMl
     *     The awayTeamMl
     */
    public void setAwayTeamMl(String awayTeamMl) {
        this.awayTeamMl = awayTeamMl;
    }

    /**
     * 
     * @return
     *     The pick1Grade
     */
    public String getPick1Grade() {
        return pick1Grade;
    }

    /**
     * 
     * @param pick1Grade
     *     The pick1Grade
     */
    public void setPick1Grade(String pick1Grade) {
        this.pick1Grade = pick1Grade;
    }

    /**
     * 
     * @return
     *     The pick2Grade
     */
    public String getPick2Grade() {
        return pick2Grade;
    }

    /**
     * 
     * @param pick2Grade
     *     The pick2Grade
     */
    public void setPick2Grade(String pick2Grade) {
        this.pick2Grade = pick2Grade;
    }

    /**
     * 
     * @return
     *     The pick3Grade
     */
    public String getPick3Grade() {
        return pick3Grade;
    }

    /**
     * 
     * @param pick3Grade
     *     The pick3Grade
     */
    public void setPick3Grade(String pick3Grade) {
        this.pick3Grade = pick3Grade;
    }

    /**
     * 
     * @return
     *     The pick1Value
     */
    public Long getPick1Value() {
        return pick1Value;
    }

    /**
     * 
     * @param pick1Value
     *     The pick1Value
     */
    public void setPick1Value(Long pick1Value) {
        this.pick1Value = pick1Value;
    }

    /**
     * 
     * @return
     *     The pick2Value
     */
    public Long getPick2Value() {
        return pick2Value;
    }

    /**
     * 
     * @param pick2Value
     *     The pick2Value
     */
    public void setPick2Value(Long pick2Value) {
        this.pick2Value = pick2Value;
    }

    /**
     * 
     * @return
     *     The pick3Value
     */
    public Long getPick3Value() {
        return pick3Value;
    }

    /**
     * 
     * @param pick3Value
     *     The pick3Value
     */
    public void setPick3Value(Long pick3Value) {
        this.pick3Value = pick3Value;
    }

    /**
     * 
     * @return
     *     The homeTeamProjScore
     */
    public String getHomeTeamProjScore() {
        return homeTeamProjScore;
    }

    /**
     * 
     * @param homeTeamProjScore
     *     The homeTeamProjScore
     */
    public void setHomeTeamProjScore(String homeTeamProjScore) {
        this.homeTeamProjScore = homeTeamProjScore;
    }

    /**
     * 
     * @return
     *     The awayTeamProjScore
     */
    public String getAwayTeamProjScore() {
        return awayTeamProjScore;
    }

    /**
     * 
     * @param awayTeamProjScore
     *     The awayTeamProjScore
     */
    public void setAwayTeamProjScore(String awayTeamProjScore) {
        this.awayTeamProjScore = awayTeamProjScore;
    }

    /**
     * 
     * @return
     *     The homeTeamAbbrv
     */
    public String getHomeTeamAbbrv() {
        return homeTeamAbbrv;
    }

    /**
     * 
     * @param homeTeamAbbrv
     *     The homeTeamAbbrv
     */
    public void setHomeTeamAbbrv(String homeTeamAbbrv) {
        this.homeTeamAbbrv = homeTeamAbbrv;
    }

    /**
     * 
     * @return
     *     The homeTeamMedName
     */
    public String getHomeTeamMedName() {
        return homeTeamMedName;
    }

    /**
     * 
     * @param homeTeamMedName
     *     The homeTeamMedName
     */
    public void setHomeTeamMedName(String homeTeamMedName) {
        this.homeTeamMedName = homeTeamMedName;
    }

    /**
     * 
     * @return
     *     The awayTeamAbbrv
     */
    public String getAwayTeamAbbrv() {
        return awayTeamAbbrv;
    }

    /**
     * 
     * @param awayTeamAbbrv
     *     The awayTeamAbbrv
     */
    public void setAwayTeamAbbrv(String awayTeamAbbrv) {
        this.awayTeamAbbrv = awayTeamAbbrv;
    }

    /**
     * 
     * @return
     *     The awayTeamMedName
     */
    public String getAwayTeamMedName() {
        return awayTeamMedName;
    }

    /**
     * 
     * @param awayTeamMedName
     *     The awayTeamMedName
     */
    public void setAwayTeamMedName(String awayTeamMedName) {
        this.awayTeamMedName = awayTeamMedName;
    }

    /**
     * 
     * @return
     *     The gameStartDtStamp
     */
    public String getGameStartDtStamp() {
        return gameStartDtStamp;
    }

    /**
     * 
     * @param gameStartDtStamp
     *     The gameStartDtStamp
     */
    public void setGameStartDtStamp(String gameStartDtStamp) {
        this.gameStartDtStamp = gameStartDtStamp;
    }

    /**
     * 
     * @return
     *     The access
     */
    public String getAccess() {
        return access;
    }

    /**
     * 
     * @param access
     *     The access
     */
    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * 
     * @return
     *     The lineType
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * 
     * @param lineType
     *     The lineType
     */
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    /**
     * 
     * @return
     *     The homeRotationNumber
     */
    public Long getHomeRotationNumber() {
        return homeRotationNumber;
    }

    /**
     * 
     * @param homeRotationNumber
     *     The homeRotationNumber
     */
    public void setHomeRotationNumber(Long homeRotationNumber) {
        this.homeRotationNumber = homeRotationNumber;
    }

    /**
     * 
     * @return
     *     The awayRotationNumber
     */
    public Long getAwayRotationNumber() {
        return awayRotationNumber;
    }

    /**
     * 
     * @param awayRotationNumber
     *     The awayRotationNumber
     */
    public void setAwayRotationNumber(Long awayRotationNumber) {
        this.awayRotationNumber = awayRotationNumber;
    }

    /**
     * 
     * @return
     *     The homeTeamRank
     */
    public Long getHomeTeamRank() {
        return homeTeamRank;
    }

    /**
     * 
     * @param homeTeamRank
     *     The homeTeamRank
     */
    public void setHomeTeamRank(Long homeTeamRank) {
        this.homeTeamRank = homeTeamRank;
    }

    /**
     * 
     * @return
     *     The awayTeamRank
     */
    public Long getAwayTeamRank() {
        return awayTeamRank;
    }

    /**
     * 
     * @param awayTeamRank
     *     The awayTeamRank
     */
    public void setAwayTeamRank(Long awayTeamRank) {
        this.awayTeamRank = awayTeamRank;
    }

    /**
     * 
     * @return
     *     The homeTeamConference
     */
    public String getHomeTeamConference() {
        return homeTeamConference;
    }

    /**
     * 
     * @param homeTeamConference
     *     The homeTeamConference
     */
    public void setHomeTeamConference(String homeTeamConference) {
        this.homeTeamConference = homeTeamConference;
    }

    /**
     * 
     * @return
     *     The homeTeamConfAbbv
     */
    public String getHomeTeamConfAbbv() {
        return homeTeamConfAbbv;
    }

    /**
     * 
     * @param homeTeamConfAbbv
     *     The homeTeamConfAbbv
     */
    public void setHomeTeamConfAbbv(String homeTeamConfAbbv) {
        this.homeTeamConfAbbv = homeTeamConfAbbv;
    }

    /**
     * 
     * @return
     *     The awayTeamConference
     */
    public String getAwayTeamConference() {
        return awayTeamConference;
    }

    /**
     * 
     * @param awayTeamConference
     *     The awayTeamConference
     */
    public void setAwayTeamConference(String awayTeamConference) {
        this.awayTeamConference = awayTeamConference;
    }

    /**
     * 
     * @return
     *     The awayTeamConfAbbv
     */
    public String getAwayTeamConfAbbv() {
        return awayTeamConfAbbv;
    }

    /**
     * 
     * @param awayTeamConfAbbv
     *     The awayTeamConfAbbv
     */
    public void setAwayTeamConfAbbv(String awayTeamConfAbbv) {
        this.awayTeamConfAbbv = awayTeamConfAbbv;
    }

    /**
     * 
     * @return
     *     The homeTeamId
     */
    public Long getHomeTeamId() {
        return homeTeamId;
    }

    /**
     * 
     * @param homeTeamId
     *     The homeTeamId
     */
    public void setHomeTeamId(Long homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    /**
     * 
     * @return
     *     The awayTeamId
     */
    public Long getAwayTeamId() {
        return awayTeamId;
    }

    /**
     * 
     * @param awayTeamId
     *     The awayTeamId
     */
    public void setAwayTeamId(Long awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    /**
     * 
     * @return
     *     The gameStartFullDate
     */
    public Long getGameStartFullDate() {
        return gameStartFullDate;
    }

    /**
     * 
     * @param gameStartFullDate
     *     The gameStartFullDate
     */
    public void setGameStartFullDate(Long gameStartFullDate) {
        this.gameStartFullDate = gameStartFullDate;
    }

    /**
     * 
     * @return
     *     The neutral
     */
    public Boolean getNeutral() {
        return neutral;
    }

    /**
     * 
     * @param neutral
     *     The neutral
     */
    public void setNeutral(Boolean neutral) {
        this.neutral = neutral;
    }

    /**
     * 
     * @return
     *     The generated
     */
    public Long getGenerated() {
        return generated;
    }

    /**
     * 
     * @param generated
     *     The generated
     */
    public void setGenerated(Long generated) {
        this.generated = generated;
    }

    /**
     * 
     * @return
     *     The competId
     */
    public Long getCompetId() {
        return competId;
    }

    /**
     * 
     * @param competId
     *     The competId
     */
    public void setCompetId(Long competId) {
        this.competId = competId;
    }

    /**
     * 
     * @return
     *     The openPick1Label
     */
    public String getOpenPick1Label() {
        return openPick1Label;
    }

    /**
     * 
     * @param openPick1Label
     *     The openPick1Label
     */
    public void setOpenPick1Label(String openPick1Label) {
        this.openPick1Label = openPick1Label;
    }

    /**
     * 
     * @return
     *     The currentPick1Label
     */
    public String getCurrentPick1Label() {
        return currentPick1Label;
    }

    /**
     * 
     * @param currentPick1Label
     *     The currentPick1Label
     */
    public void setCurrentPick1Label(String currentPick1Label) {
        this.currentPick1Label = currentPick1Label;
    }

    /**
     * 
     * @return
     *     The pick1ConsensusLabel
     */
    public String getPick1ConsensusLabel() {
        return pick1ConsensusLabel;
    }

    /**
     * 
     * @param pick1ConsensusLabel
     *     The pick1ConsensusLabel
     */
    public void setPick1ConsensusLabel(String pick1ConsensusLabel) {
        this.pick1ConsensusLabel = pick1ConsensusLabel;
    }

    /**
     * 
     * @return
     *     The pick1RLM
     */
    public Boolean getPick1RLM() {
        return pick1RLM;
    }

    /**
     * 
     * @param pick1RLM
     *     The pick1RLM
     */
    public void setPick1RLM(Boolean pick1RLM) {
        this.pick1RLM = pick1RLM;
    }

    /**
     * 
     * @return
     *     The pick1MoveDirection
     */
    public String getPick1MoveDirection() {
        return pick1MoveDirection;
    }

    /**
     * 
     * @param pick1MoveDirection
     *     The pick1MoveDirection
     */
    public void setPick1MoveDirection(String pick1MoveDirection) {
        this.pick1MoveDirection = pick1MoveDirection;
    }

    /**
     * 
     * @return
     *     The openPick2Label
     */
    public String getOpenPick2Label() {
        return openPick2Label;
    }

    /**
     * 
     * @param openPick2Label
     *     The openPick2Label
     */
    public void setOpenPick2Label(String openPick2Label) {
        this.openPick2Label = openPick2Label;
    }

    /**
     * 
     * @return
     *     The currentPick2Label
     */
    public String getCurrentPick2Label() {
        return currentPick2Label;
    }

    /**
     * 
     * @param currentPick2Label
     *     The currentPick2Label
     */
    public void setCurrentPick2Label(String currentPick2Label) {
        this.currentPick2Label = currentPick2Label;
    }

    /**
     * 
     * @return
     *     The pick2ConsensusLabel
     */
    public String getPick2ConsensusLabel() {
        return pick2ConsensusLabel;
    }

    /**
     * 
     * @param pick2ConsensusLabel
     *     The pick2ConsensusLabel
     */
    public void setPick2ConsensusLabel(String pick2ConsensusLabel) {
        this.pick2ConsensusLabel = pick2ConsensusLabel;
    }

    /**
     * 
     * @return
     *     The pick2RLM
     */
    public Boolean getPick2RLM() {
        return pick2RLM;
    }

    /**
     * 
     * @param pick2RLM
     *     The pick2RLM
     */
    public void setPick2RLM(Boolean pick2RLM) {
        this.pick2RLM = pick2RLM;
    }

    /**
     * 
     * @return
     *     The pick2MoveDirection
     */
    public String getPick2MoveDirection() {
        return pick2MoveDirection;
    }

    /**
     * 
     * @param pick2MoveDirection
     *     The pick2MoveDirection
     */
    public void setPick2MoveDirection(String pick2MoveDirection) {
        this.pick2MoveDirection = pick2MoveDirection;
    }

    /**
     * 
     * @return
     *     The openPick3Label
     */
    public String getOpenPick3Label() {
        return openPick3Label;
    }

    /**
     * 
     * @param openPick3Label
     *     The openPick3Label
     */
    public void setOpenPick3Label(String openPick3Label) {
        this.openPick3Label = openPick3Label;
    }

    /**
     * 
     * @return
     *     The currentPick3Label
     */
    public String getCurrentPick3Label() {
        return currentPick3Label;
    }

    /**
     * 
     * @param currentPick3Label
     *     The currentPick3Label
     */
    public void setCurrentPick3Label(String currentPick3Label) {
        this.currentPick3Label = currentPick3Label;
    }

    /**
     * 
     * @return
     *     The pick3ConsensusLabel
     */
    public String getPick3ConsensusLabel() {
        return pick3ConsensusLabel;
    }

    /**
     * 
     * @param pick3ConsensusLabel
     *     The pick3ConsensusLabel
     */
    public void setPick3ConsensusLabel(String pick3ConsensusLabel) {
        this.pick3ConsensusLabel = pick3ConsensusLabel;
    }

    /**
     * 
     * @return
     *     The pick3RLM
     */
    public Boolean getPick3RLM() {
        return pick3RLM;
    }

    /**
     * 
     * @param pick3RLM
     *     The pick3RLM
     */
    public void setPick3RLM(Boolean pick3RLM) {
        this.pick3RLM = pick3RLM;
    }

    /**
     * 
     * @return
     *     The pick3MoveDirection
     */
    public String getPick3MoveDirection() {
        return pick3MoveDirection;
    }

    /**
     * 
     * @param pick3MoveDirection
     *     The pick3MoveDirection
     */
    public void setPick3MoveDirection(String pick3MoveDirection) {
        this.pick3MoveDirection = pick3MoveDirection;
    }

    /**
     * 
     * @return
     *     The gamedate
     */
    public String getGamedate() {
        return gamedate;
    }

    /**
     * 
     * @param gamedate
     *     The gamedate
     */
    public void setGamedate(String gamedate) {
        this.gamedate = gamedate;
    }

    /**
     * 
     * @return
     *     The venueNm
     */
    public String getVenueNm() {
        return venueNm;
    }

    /**
     * 
     * @param venueNm
     *     The venueNm
     */
    public void setVenueNm(String venueNm) {
        this.venueNm = venueNm;
    }

    /**
     * 
     * @return
     *     The venueLoc
     */
    public String getVenueLoc() {
        return venueLoc;
    }

    /**
     * 
     * @param venueLoc
     *     The venueLoc
     */
    public void setVenueLoc(String venueLoc) {
        this.venueLoc = venueLoc;
    }

    /**
     * 
     * @return
     *     The homeColor
     */
    public String getHomeColor() {
        return homeColor;
    }

    /**
     * 
     * @param homeColor
     *     The homeColor
     */
    public void setHomeColor(String homeColor) {
        this.homeColor = homeColor;
    }

    /**
     * 
     * @return
     *     The homePrimaryColor
     */
    public String getHomePrimaryColor() {
        return homePrimaryColor;
    }

    /**
     * 
     * @param homePrimaryColor
     *     The homePrimaryColor
     */
    public void setHomePrimaryColor(String homePrimaryColor) {
        this.homePrimaryColor = homePrimaryColor;
    }

    /**
     * 
     * @return
     *     The homeSecondaryColor
     */
    public String getHomeSecondaryColor() {
        return homeSecondaryColor;
    }

    /**
     * 
     * @param homeSecondaryColor
     *     The homeSecondaryColor
     */
    public void setHomeSecondaryColor(String homeSecondaryColor) {
        this.homeSecondaryColor = homeSecondaryColor;
    }

    /**
     * 
     * @return
     *     The homeWins
     */
    public Long getHomeWins() {
        return homeWins;
    }

    /**
     * 
     * @param homeWins
     *     The homeWins
     */
    public void setHomeWins(Long homeWins) {
        this.homeWins = homeWins;
    }

    /**
     * 
     * @return
     *     The homeLosses
     */
    public Long getHomeLosses() {
        return homeLosses;
    }

    /**
     * 
     * @param homeLosses
     *     The homeLosses
     */
    public void setHomeLosses(Long homeLosses) {
        this.homeLosses = homeLosses;
    }

    /**
     * 
     * @return
     *     The homeRank
     */
    public Long getHomeRank() {
        return homeRank;
    }

    /**
     * 
     * @param homeRank
     *     The homeRank
     */
    public void setHomeRank(Long homeRank) {
        this.homeRank = homeRank;
    }

    /**
     * 
     * @return
     *     The homeRankPretty
     */
    public String getHomeRankPretty() {
        return homeRankPretty;
    }

    /**
     * 
     * @param homeRankPretty
     *     The homeRankPretty
     */
    public void setHomeRankPretty(String homeRankPretty) {
        this.homeRankPretty = homeRankPretty;
    }

    /**
     * 
     * @return
     *     The homeConferenceAbbrv
     */
    public String getHomeConferenceAbbrv() {
        return homeConferenceAbbrv;
    }

    /**
     * 
     * @param homeConferenceAbbrv
     *     The homeConferenceAbbrv
     */
    public void setHomeConferenceAbbrv(String homeConferenceAbbrv) {
        this.homeConferenceAbbrv = homeConferenceAbbrv;
    }

    /**
     * 
     * @return
     *     The homeConference
     */
    public String getHomeConference() {
        return homeConference;
    }

    /**
     * 
     * @param homeConference
     *     The homeConference
     */
    public void setHomeConference(String homeConference) {
        this.homeConference = homeConference;
    }

    /**
     * 
     * @return
     *     The homeConferenceRank
     */
    public Long getHomeConferenceRank() {
        return homeConferenceRank;
    }

    /**
     * 
     * @param homeConferenceRank
     *     The homeConferenceRank
     */
    public void setHomeConferenceRank(Long homeConferenceRank) {
        this.homeConferenceRank = homeConferenceRank;
    }

    /**
     * 
     * @return
     *     The homeConferenceRankPretty
     */
    public String getHomeConferenceRankPretty() {
        return homeConferenceRankPretty;
    }

    /**
     * 
     * @param homeConferenceRankPretty
     *     The homeConferenceRankPretty
     */
    public void setHomeConferenceRankPretty(String homeConferenceRankPretty) {
        this.homeConferenceRankPretty = homeConferenceRankPretty;
    }

    /**
     * 
     * @return
     *     The homeDivisionRank
     */
    public Long getHomeDivisionRank() {
        return homeDivisionRank;
    }

    /**
     * 
     * @param homeDivisionRank
     *     The homeDivisionRank
     */
    public void setHomeDivisionRank(Long homeDivisionRank) {
        this.homeDivisionRank = homeDivisionRank;
    }

    /**
     * 
     * @return
     *     The homeDivisionRankPretty
     */
    public String getHomeDivisionRankPretty() {
        return homeDivisionRankPretty;
    }

    /**
     * 
     * @param homeDivisionRankPretty
     *     The homeDivisionRankPretty
     */
    public void setHomeDivisionRankPretty(String homeDivisionRankPretty) {
        this.homeDivisionRankPretty = homeDivisionRankPretty;
    }

    /**
     * 
     * @return
     *     The awayColor
     */
    public String getAwayColor() {
        return awayColor;
    }

    /**
     * 
     * @param awayColor
     *     The awayColor
     */
    public void setAwayColor(String awayColor) {
        this.awayColor = awayColor;
    }

    /**
     * 
     * @return
     *     The awayPrimaryColor
     */
    public String getAwayPrimaryColor() {
        return awayPrimaryColor;
    }

    /**
     * 
     * @param awayPrimaryColor
     *     The awayPrimaryColor
     */
    public void setAwayPrimaryColor(String awayPrimaryColor) {
        this.awayPrimaryColor = awayPrimaryColor;
    }

    /**
     * 
     * @return
     *     The awaySecondaryColor
     */
    public String getAwaySecondaryColor() {
        return awaySecondaryColor;
    }

    /**
     * 
     * @param awaySecondaryColor
     *     The awaySecondaryColor
     */
    public void setAwaySecondaryColor(String awaySecondaryColor) {
        this.awaySecondaryColor = awaySecondaryColor;
    }

    /**
     * 
     * @return
     *     The awayWins
     */
    public Long getAwayWins() {
        return awayWins;
    }

    /**
     * 
     * @param awayWins
     *     The awayWins
     */
    public void setAwayWins(Long awayWins) {
        this.awayWins = awayWins;
    }

    /**
     * 
     * @return
     *     The awayLosses
     */
    public Long getAwayLosses() {
        return awayLosses;
    }

    /**
     * 
     * @param awayLosses
     *     The awayLosses
     */
    public void setAwayLosses(Long awayLosses) {
        this.awayLosses = awayLosses;
    }

    /**
     * 
     * @return
     *     The awayRank
     */
    public Long getAwayRank() {
        return awayRank;
    }

    /**
     * 
     * @param awayRank
     *     The awayRank
     */
    public void setAwayRank(Long awayRank) {
        this.awayRank = awayRank;
    }

    /**
     * 
     * @return
     *     The awayRankPretty
     */
    public String getAwayRankPretty() {
        return awayRankPretty;
    }

    /**
     * 
     * @param awayRankPretty
     *     The awayRankPretty
     */
    public void setAwayRankPretty(String awayRankPretty) {
        this.awayRankPretty = awayRankPretty;
    }

    /**
     * 
     * @return
     *     The awayConferenceAbbrv
     */
    public String getAwayConferenceAbbrv() {
        return awayConferenceAbbrv;
    }

    /**
     * 
     * @param awayConferenceAbbrv
     *     The awayConferenceAbbrv
     */
    public void setAwayConferenceAbbrv(String awayConferenceAbbrv) {
        this.awayConferenceAbbrv = awayConferenceAbbrv;
    }

    /**
     * 
     * @return
     *     The awayConference
     */
    public String getAwayConference() {
        return awayConference;
    }

    /**
     * 
     * @param awayConference
     *     The awayConference
     */
    public void setAwayConference(String awayConference) {
        this.awayConference = awayConference;
    }

    /**
     * 
     * @return
     *     The awayConferenceRank
     */
    public Long getAwayConferenceRank() {
        return awayConferenceRank;
    }

    /**
     * 
     * @param awayConferenceRank
     *     The awayConferenceRank
     */
    public void setAwayConferenceRank(Long awayConferenceRank) {
        this.awayConferenceRank = awayConferenceRank;
    }

    /**
     * 
     * @return
     *     The awayConferenceRankPretty
     */
    public String getAwayConferenceRankPretty() {
        return awayConferenceRankPretty;
    }

    /**
     * 
     * @param awayConferenceRankPretty
     *     The awayConferenceRankPretty
     */
    public void setAwayConferenceRankPretty(String awayConferenceRankPretty) {
        this.awayConferenceRankPretty = awayConferenceRankPretty;
    }

    /**
     * 
     * @return
     *     The awayDivisionRank
     */
    public Long getAwayDivisionRank() {
        return awayDivisionRank;
    }

    /**
     * 
     * @param awayDivisionRank
     *     The awayDivisionRank
     */
    public void setAwayDivisionRank(Long awayDivisionRank) {
        this.awayDivisionRank = awayDivisionRank;
    }

    /**
     * 
     * @return
     *     The awayDivisionRankPretty
     */
    public String getAwayDivisionRankPretty() {
        return awayDivisionRankPretty;
    }

    /**
     * 
     * @param awayDivisionRankPretty
     *     The awayDivisionRankPretty
     */
    public void setAwayDivisionRankPretty(String awayDivisionRankPretty) {
        this.awayDivisionRankPretty = awayDivisionRankPretty;
    }

    /**
     * 
     * @return
     *     The spreadPubConsHomeLabel
     */
    public String getSpreadPubConsHomeLabel() {
        return spreadPubConsHomeLabel;
    }

    /**
     * 
     * @param spreadPubConsHomeLabel
     *     The spreadPubConsHomeLabel
     */
    public void setSpreadPubConsHomeLabel(String spreadPubConsHomeLabel) {
        this.spreadPubConsHomeLabel = spreadPubConsHomeLabel;
    }

    /**
     * 
     * @return
     *     The spreadPubConsAwayLabel
     */
    public String getSpreadPubConsAwayLabel() {
        return spreadPubConsAwayLabel;
    }

    /**
     * 
     * @param spreadPubConsAwayLabel
     *     The spreadPubConsAwayLabel
     */
    public void setSpreadPubConsAwayLabel(String spreadPubConsAwayLabel) {
        this.spreadPubConsAwayLabel = spreadPubConsAwayLabel;
    }

    /**
     * 
     * @return
     *     The mlPubConsHomeLabel
     */
    public String getMlPubConsHomeLabel() {
        return mlPubConsHomeLabel;
    }

    /**
     * 
     * @param mlPubConsHomeLabel
     *     The mlPubConsHomeLabel
     */
    public void setMlPubConsHomeLabel(String mlPubConsHomeLabel) {
        this.mlPubConsHomeLabel = mlPubConsHomeLabel;
    }

    /**
     * 
     * @return
     *     The mlPubConsAwayLabel
     */
    public String getMlPubConsAwayLabel() {
        return mlPubConsAwayLabel;
    }

    /**
     * 
     * @param mlPubConsAwayLabel
     *     The mlPubConsAwayLabel
     */
    public void setMlPubConsAwayLabel(String mlPubConsAwayLabel) {
        this.mlPubConsAwayLabel = mlPubConsAwayLabel;
    }

    /**
     * 
     * @return
     *     The ouPubConsOverLabel
     */
    public String getOuPubConsOverLabel() {
        return ouPubConsOverLabel;
    }

    /**
     * 
     * @param ouPubConsOverLabel
     *     The ouPubConsOverLabel
     */
    public void setOuPubConsOverLabel(String ouPubConsOverLabel) {
        this.ouPubConsOverLabel = ouPubConsOverLabel;
    }

    /**
     * 
     * @return
     *     The ouPubConsUnderLabel
     */
    public String getOuPubConsUnderLabel() {
        return ouPubConsUnderLabel;
    }

    /**
     * 
     * @param ouPubConsUnderLabel
     *     The ouPubConsUnderLabel
     */
    public void setOuPubConsUnderLabel(String ouPubConsUnderLabel) {
        this.ouPubConsUnderLabel = ouPubConsUnderLabel;
    }

    /**
     * 
     * @return
     *     The locked
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 
     * @param locked
     *     The locked
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * 
     * @return
     *     The overUnderOverOdds
     */
    public String getOverUnderOverOdds() {
        return overUnderOverOdds;
    }

    /**
     * 
     * @param overUnderOverOdds
     *     The overUnderOverOdds
     */
    public void setOverUnderOverOdds(String overUnderOverOdds) {
        this.overUnderOverOdds = overUnderOverOdds;
    }

    /**
     * 
     * @return
     *     The overUnderUnderOdds
     */
    public String getOverUnderUnderOdds() {
        return overUnderUnderOdds;
    }

    /**
     * 
     * @param overUnderUnderOdds
     *     The overUnderUnderOdds
     */
    public void setOverUnderUnderOdds(String overUnderUnderOdds) {
        this.overUnderUnderOdds = overUnderUnderOdds;
    }

    /**
     * 
     * @return
     *     The total
     */
    public String getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The odds
     */
    public List<Odd> getOdds() {
        return odds;
    }

    /**
     * 
     * @param odds
     *     The odds
     */
    public void setOdds(List<Odd> odds) {
        this.odds = odds;
    }

    /**
     * 
     * @return
     *     The coversOdd
     */
    public CoversOdd getCoversOdd() {
        return coversOdd;
    }

    /**
     * 
     * @param coversOdd
     *     The coversOdd
     */
    public void setCoversOdd(CoversOdd coversOdd) {
        this.coversOdd = coversOdd;
    }

    /**
     * 
     * @return
     *     The lastJobRunDate
     */
    public Long getLastJobRunDate() {
        return lastJobRunDate;
    }

    /**
     * 
     * @param lastJobRunDate
     *     The lastJobRunDate
     */
    public void setLastJobRunDate(Long lastJobRunDate) {
        this.lastJobRunDate = lastJobRunDate;
    }

    /**
     * 
     * @return
     *     The gameTime
     */
    public String getGameTime() {
        return gameTime;
    }

    /**
     * 
     * @param gameTime
     *     The gameTime
     */
    public void setGameTime(String gameTime) {
        this.gameTime = gameTime;
    }

    /**
     * 
     * @return
     *     The isMoneyLine
     */
    public Boolean getIsMoneyLine() {
        return isMoneyLine;
    }

    /**
     * 
     * @param isMoneyLine
     *     The isMoneyLine
     */
    public void setIsMoneyLine(Boolean isMoneyLine) {
        this.isMoneyLine = isMoneyLine;
    }

    /**
     * 
     * @return
     *     The lastUpdatedDate
     */
    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * 
     * @param lastUpdatedDate
     *     The lastUpdatedDate
     */
    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * 
     * @return
     *     The bestValuePick
     */
    public Long getBestValuePick() {
        return bestValuePick;
    }

    /**
     * 
     * @param bestValuePick
     *     The bestValuePick
     */
    public void setBestValuePick(Long bestValuePick) {
        this.bestValuePick = bestValuePick;
    }

    /**
     * 
     * @return
     *     The pick1GradeSanitized
     */
    public String getPick1GradeSanitized() {
        return pick1GradeSanitized;
    }

    /**
     * 
     * @param pick1GradeSanitized
     *     The pick1GradeSanitized
     */
    public void setPick1GradeSanitized(String pick1GradeSanitized) {
        this.pick1GradeSanitized = pick1GradeSanitized;
    }

    /**
     * 
     * @return
     *     The pick1
     */
    public String getPick1() {
        return pick1;
    }

    /**
     * 
     * @param pick1
     *     The pick1
     */
    public void setPick1(String pick1) {
        this.pick1 = pick1;
    }

    /**
     * 
     * @return
     *     The pick2
     */
    public String getPick2() {
        return pick2;
    }

    /**
     * 
     * @param pick2
     *     The pick2
     */
    public void setPick2(String pick2) {
        this.pick2 = pick2;
    }

    /**
     * 
     * @return
     *     The pick3
     */
    public String getPick3() {
        return pick3;
    }

    /**
     * 
     * @param pick3
     *     The pick3
     */
    public void setPick3(String pick3) {
        this.pick3 = pick3;
    }

    /**
     * 
     * @return
     *     The pick3Label
     */
    public String getPick3Label() {
        return pick3Label;
    }

    /**
     * 
     * @param pick3Label
     *     The pick3Label
     */
    public void setPick3Label(String pick3Label) {
        this.pick3Label = pick3Label;
    }

    /**
     * 
     * @return
     *     The pick1Proj
     */
    public String getPick1Proj() {
        return pick1Proj;
    }

    /**
     * 
     * @param pick1Proj
     *     The pick1Proj
     */
    public void setPick1Proj(String pick1Proj) {
        this.pick1Proj = pick1Proj;
    }

    /**
     * 
     * @return
     *     The pick2Proj
     */
    public String getPick2Proj() {
        return pick2Proj;
    }

    /**
     * 
     * @param pick2Proj
     *     The pick2Proj
     */
    public void setPick2Proj(String pick2Proj) {
        this.pick2Proj = pick2Proj;
    }

    /**
     * 
     * @return
     *     The pick3Proj
     */
    public String getPick3Proj() {
        return pick3Proj;
    }

    /**
     * 
     * @param pick3Proj
     *     The pick3Proj
     */
    public void setPick3Proj(String pick3Proj) {
        this.pick3Proj = pick3Proj;
    }

    /**
     * 
     * @return
     *     The pick1MoveType
     */
    public String getPick1MoveType() {
        return pick1MoveType;
    }

    /**
     * 
     * @param pick1MoveType
     *     The pick1MoveType
     */
    public void setPick1MoveType(String pick1MoveType) {
        this.pick1MoveType = pick1MoveType;
    }

    /**
     * 
     * @return
     *     The pick2MoveType
     */
    public String getPick2MoveType() {
        return pick2MoveType;
    }

    /**
     * 
     * @param pick2MoveType
     *     The pick2MoveType
     */
    public void setPick2MoveType(String pick2MoveType) {
        this.pick2MoveType = pick2MoveType;
    }

    /**
     * 
     * @return
     *     The pick3MoveType
     */
    public String getPick3MoveType() {
        return pick3MoveType;
    }

    /**
     * 
     * @param pick3MoveType
     *     The pick3MoveType
     */
    public void setPick3MoveType(String pick3MoveType) {
        this.pick3MoveType = pick3MoveType;
    }

    /**
     * 
     * @return
     *     The pick1SimLabel
     */
    public String getPick1SimLabel() {
        return pick1SimLabel;
    }

    /**
     * 
     * @param pick1SimLabel
     *     The pick1SimLabel
     */
    public void setPick1SimLabel(String pick1SimLabel) {
        this.pick1SimLabel = pick1SimLabel;
    }

    /**
     * 
     * @return
     *     The pick2SimLabel
     */
    public String getPick2SimLabel() {
        return pick2SimLabel;
    }

    /**
     * 
     * @param pick2SimLabel
     *     The pick2SimLabel
     */
    public void setPick2SimLabel(String pick2SimLabel) {
        this.pick2SimLabel = pick2SimLabel;
    }

    /**
     * 
     * @return
     *     The pick3SimLabel
     */
    public String getPick3SimLabel() {
        return pick3SimLabel;
    }

    /**
     * 
     * @param pick3SimLabel
     *     The pick3SimLabel
     */
    public void setPick3SimLabel(String pick3SimLabel) {
        this.pick3SimLabel = pick3SimLabel;
    }

    /**
     * 
     * @return
     *     The pick1Sanitized
     */
    public String getPick1Sanitized() {
        return pick1Sanitized;
    }

    /**
     * 
     * @param pick1Sanitized
     *     The pick1Sanitized
     */
    public void setPick1Sanitized(String pick1Sanitized) {
        this.pick1Sanitized = pick1Sanitized;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	/**
	 * @return the homeDivisionAbbrv
	 */
	public String getHomeDivisionAbbrv() {
		return homeDivisionAbbrv;
	}

	/**
	 * @param homeDivisionAbbrv the homeDivisionAbbrv to set
	 */
	public void setHomeDivisionAbbrv(String homeDivisionAbbrv) {
		this.homeDivisionAbbrv = homeDivisionAbbrv;
	}

	/**
	 * @return the homeDivision
	 */
	public String getHomeDivision() {
		return homeDivision;
	}

	/**
	 * @param homeDivision the homeDivision to set
	 */
	public void setHomeDivision(String homeDivision) {
		this.homeDivision = homeDivision;
	}

	/**
	 * @return the awayDivisionAbbrv
	 */
	public String getAwayDivisionAbbrv() {
		return awayDivisionAbbrv;
	}

	/**
	 * @param awayDivisionAbbrv the awayDivisionAbbrv to set
	 */
	public void setAwayDivisionAbbrv(String awayDivisionAbbrv) {
		this.awayDivisionAbbrv = awayDivisionAbbrv;
	}

	/**
	 * @return the awayDivision
	 */
	public String getAwayDivision() {
		return awayDivision;
	}

	/**
	 * @param awayDivision the awayDivision to set
	 */
	public void setAwayDivision(String awayDivision) {
		this.awayDivision = awayDivision;
	}

}
