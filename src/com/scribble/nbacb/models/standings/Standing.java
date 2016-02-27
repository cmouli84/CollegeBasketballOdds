
package com.scribble.nbacb.models.standings;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Standing {

    private Boolean clinched_conference;
    private Boolean clinched_division;
    private Boolean clinched_playoffs;
    private String conference;
    private String conference_abbreviation;
    private Boolean conference_first;
    private Object conference_games_back;
    private Integer conference_seed;
    private Object division_seed;
    private String formatted_rank;
    private Integer conference_wins;
    private Integer conference_losses;
    private Object division;
    private Boolean division_first;
    private Boolean eliminated_from_playoffs;
    private Object games_back;
    private Integer id;
    private Object last_ten_games_record;
    private Integer losses;
    private Integer place;
    private Integer points_against_conference;
    private Integer points_against_overall;
    private Double points_against_per_game;
    private Integer points_for_conference;
    private Integer points_for_overall;
    private Double points_for_per_game;
    private String season_type;
    private Integer sequence;
    private String short_record;
    private String short_away_record;
    private String short_home_record;
    private String streak;
    private Integer streak_losing;
    private Object streak_winning;
    private String sub_division;
    private String updated_at;
    private String winning_percentage;
    private Integer wins;
    private Boolean won_conference_tournament;
    private String api_uri;
    private Integer conference_rank;
    private Integer conference_ranking;
    private Integer division_rank;
    private Integer division_ranking;
    private Season season;
    private Team team;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The clinched_conference
     */
    public Boolean getClinched_conference() {
        return clinched_conference;
    }

    /**
     * 
     * @param clinched_conference
     *     The clinched_conference
     */
    public void setClinched_conference(Boolean clinched_conference) {
        this.clinched_conference = clinched_conference;
    }

    /**
     * 
     * @return
     *     The clinched_division
     */
    public Boolean getClinched_division() {
        return clinched_division;
    }

    /**
     * 
     * @param clinched_division
     *     The clinched_division
     */
    public void setClinched_division(Boolean clinched_division) {
        this.clinched_division = clinched_division;
    }

    /**
     * 
     * @return
     *     The clinched_playoffs
     */
    public Boolean getClinched_playoffs() {
        return clinched_playoffs;
    }

    /**
     * 
     * @param clinched_playoffs
     *     The clinched_playoffs
     */
    public void setClinched_playoffs(Boolean clinched_playoffs) {
        this.clinched_playoffs = clinched_playoffs;
    }

    /**
     * 
     * @return
     *     The conference
     */
    public String getConference() {
        return conference;
    }

    /**
     * 
     * @param conference
     *     The conference
     */
    public void setConference(String conference) {
        this.conference = conference;
    }

    /**
     * 
     * @return
     *     The conference_abbreviation
     */
    public String getConference_abbreviation() {
        return conference_abbreviation;
    }

    /**
     * 
     * @param conference_abbreviation
     *     The conference_abbreviation
     */
    public void setConference_abbreviation(String conference_abbreviation) {
        this.conference_abbreviation = conference_abbreviation;
    }

    /**
     * 
     * @return
     *     The conference_first
     */
    public Boolean getConference_first() {
        return conference_first;
    }

    /**
     * 
     * @param conference_first
     *     The conference_first
     */
    public void setConference_first(Boolean conference_first) {
        this.conference_first = conference_first;
    }

    /**
     * 
     * @return
     *     The conference_games_back
     */
    public Object getConference_games_back() {
        return conference_games_back;
    }

    /**
     * 
     * @param conference_games_back
     *     The conference_games_back
     */
    public void setConference_games_back(Object conference_games_back) {
        this.conference_games_back = conference_games_back;
    }

    /**
     * 
     * @return
     *     The conference_seed
     */
    public Integer getConference_seed() {
        return conference_seed;
    }

    /**
     * 
     * @param conference_seed
     *     The conference_seed
     */
    public void setConference_seed(Integer conference_seed) {
        this.conference_seed = conference_seed;
    }

    /**
     * 
     * @return
     *     The division_seed
     */
    public Object getDivision_seed() {
        return division_seed;
    }

    /**
     * 
     * @param division_seed
     *     The division_seed
     */
    public void setDivision_seed(Object division_seed) {
        this.division_seed = division_seed;
    }

    /**
     * 
     * @return
     *     The formatted_rank
     */
    public String getFormatted_rank() {
        return formatted_rank;
    }

    /**
     * 
     * @param formatted_rank
     *     The formatted_rank
     */
    public void setFormatted_rank(String formatted_rank) {
        this.formatted_rank = formatted_rank;
    }

    /**
     * 
     * @return
     *     The conference_wins
     */
    public Integer getConference_wins() {
        return conference_wins;
    }

    /**
     * 
     * @param conference_wins
     *     The conference_wins
     */
    public void setConference_wins(Integer conference_wins) {
        this.conference_wins = conference_wins;
    }

    /**
     * 
     * @return
     *     The conference_losses
     */
    public Integer getConference_losses() {
        return conference_losses;
    }

    /**
     * 
     * @param conference_losses
     *     The conference_losses
     */
    public void setConference_losses(Integer conference_losses) {
        this.conference_losses = conference_losses;
    }

    /**
     * 
     * @return
     *     The division
     */
    public Object getDivision() {
        return division;
    }

    /**
     * 
     * @param division
     *     The division
     */
    public void setDivision(Object division) {
        this.division = division;
    }

    /**
     * 
     * @return
     *     The division_first
     */
    public Boolean getDivision_first() {
        return division_first;
    }

    /**
     * 
     * @param division_first
     *     The division_first
     */
    public void setDivision_first(Boolean division_first) {
        this.division_first = division_first;
    }

    /**
     * 
     * @return
     *     The eliminated_from_playoffs
     */
    public Boolean getEliminated_from_playoffs() {
        return eliminated_from_playoffs;
    }

    /**
     * 
     * @param eliminated_from_playoffs
     *     The eliminated_from_playoffs
     */
    public void setEliminated_from_playoffs(Boolean eliminated_from_playoffs) {
        this.eliminated_from_playoffs = eliminated_from_playoffs;
    }

    /**
     * 
     * @return
     *     The games_back
     */
    public Object getGames_back() {
        return games_back;
    }

    /**
     * 
     * @param games_back
     *     The games_back
     */
    public void setGames_back(Object games_back) {
        this.games_back = games_back;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The last_ten_games_record
     */
    public Object getLast_ten_games_record() {
        return last_ten_games_record;
    }

    /**
     * 
     * @param last_ten_games_record
     *     The last_ten_games_record
     */
    public void setLast_ten_games_record(Object last_ten_games_record) {
        this.last_ten_games_record = last_ten_games_record;
    }

    /**
     * 
     * @return
     *     The losses
     */
    public Integer getLosses() {
        return losses;
    }

    /**
     * 
     * @param losses
     *     The losses
     */
    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    /**
     * 
     * @return
     *     The place
     */
    public Integer getPlace() {
        return place;
    }

    /**
     * 
     * @param place
     *     The place
     */
    public void setPlace(Integer place) {
        this.place = place;
    }

    /**
     * 
     * @return
     *     The points_against_conference
     */
    public Integer getPoints_against_conference() {
        return points_against_conference;
    }

    /**
     * 
     * @param points_against_conference
     *     The points_against_conference
     */
    public void setPoints_against_conference(Integer points_against_conference) {
        this.points_against_conference = points_against_conference;
    }

    /**
     * 
     * @return
     *     The points_against_overall
     */
    public Integer getPoints_against_overall() {
        return points_against_overall;
    }

    /**
     * 
     * @param points_against_overall
     *     The points_against_overall
     */
    public void setPoints_against_overall(Integer points_against_overall) {
        this.points_against_overall = points_against_overall;
    }

    /**
     * 
     * @return
     *     The points_against_per_game
     */
    public Double getPoints_against_per_game() {
        return points_against_per_game;
    }

    /**
     * 
     * @param points_against_per_game
     *     The points_against_per_game
     */
    public void setPoints_against_per_game(Double points_against_per_game) {
        this.points_against_per_game = points_against_per_game;
    }

    /**
     * 
     * @return
     *     The points_for_conference
     */
    public Integer getPoints_for_conference() {
        return points_for_conference;
    }

    /**
     * 
     * @param points_for_conference
     *     The points_for_conference
     */
    public void setPoints_for_conference(Integer points_for_conference) {
        this.points_for_conference = points_for_conference;
    }

    /**
     * 
     * @return
     *     The points_for_overall
     */
    public Integer getPoints_for_overall() {
        return points_for_overall;
    }

    /**
     * 
     * @param points_for_overall
     *     The points_for_overall
     */
    public void setPoints_for_overall(Integer points_for_overall) {
        this.points_for_overall = points_for_overall;
    }

    /**
     * 
     * @return
     *     The points_for_per_game
     */
    public Double getPoints_for_per_game() {
        return points_for_per_game;
    }

    /**
     * 
     * @param points_for_per_game
     *     The points_for_per_game
     */
    public void setPoints_for_per_game(Double points_for_per_game) {
        this.points_for_per_game = points_for_per_game;
    }

    /**
     * 
     * @return
     *     The season_type
     */
    public String getSeason_type() {
        return season_type;
    }

    /**
     * 
     * @param season_type
     *     The season_type
     */
    public void setSeason_type(String season_type) {
        this.season_type = season_type;
    }

    /**
     * 
     * @return
     *     The sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 
     * @param sequence
     *     The sequence
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 
     * @return
     *     The short_record
     */
    public String getShort_record() {
        return short_record;
    }

    /**
     * 
     * @param short_record
     *     The short_record
     */
    public void setShort_record(String short_record) {
        this.short_record = short_record;
    }

    /**
     * 
     * @return
     *     The short_away_record
     */
    public String getShort_away_record() {
        return short_away_record;
    }

    /**
     * 
     * @param short_away_record
     *     The short_away_record
     */
    public void setShort_away_record(String short_away_record) {
        this.short_away_record = short_away_record;
    }

    /**
     * 
     * @return
     *     The short_home_record
     */
    public String getShort_home_record() {
        return short_home_record;
    }

    /**
     * 
     * @param short_home_record
     *     The short_home_record
     */
    public void setShort_home_record(String short_home_record) {
        this.short_home_record = short_home_record;
    }

    /**
     * 
     * @return
     *     The streak
     */
    public String getStreak() {
        return streak;
    }

    /**
     * 
     * @param streak
     *     The streak
     */
    public void setStreak(String streak) {
        this.streak = streak;
    }

    /**
     * 
     * @return
     *     The streak_losing
     */
    public Integer getStreak_losing() {
        return streak_losing;
    }

    /**
     * 
     * @param streak_losing
     *     The streak_losing
     */
    public void setStreak_losing(Integer streak_losing) {
        this.streak_losing = streak_losing;
    }

    /**
     * 
     * @return
     *     The streak_winning
     */
    public Object getStreak_winning() {
        return streak_winning;
    }

    /**
     * 
     * @param streak_winning
     *     The streak_winning
     */
    public void setStreak_winning(Object streak_winning) {
        this.streak_winning = streak_winning;
    }

    /**
     * 
     * @return
     *     The sub_division
     */
    public String getSub_division() {
        return sub_division;
    }

    /**
     * 
     * @param sub_division
     *     The sub_division
     */
    public void setSub_division(String sub_division) {
        this.sub_division = sub_division;
    }

    /**
     * 
     * @return
     *     The updated_at
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * 
     * @param updated_at
     *     The updated_at
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * 
     * @return
     *     The winning_percentage
     */
    public String getWinning_percentage() {
        return winning_percentage;
    }

    /**
     * 
     * @param winning_percentage
     *     The winning_percentage
     */
    public void setWinning_percentage(String winning_percentage) {
        this.winning_percentage = winning_percentage;
    }

    /**
     * 
     * @return
     *     The wins
     */
    public Integer getWins() {
        return wins;
    }

    /**
     * 
     * @param wins
     *     The wins
     */
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    /**
     * 
     * @return
     *     The won_conference_tournament
     */
    public Boolean getWon_conference_tournament() {
        return won_conference_tournament;
    }

    /**
     * 
     * @param won_conference_tournament
     *     The won_conference_tournament
     */
    public void setWon_conference_tournament(Boolean won_conference_tournament) {
        this.won_conference_tournament = won_conference_tournament;
    }

    /**
     * 
     * @return
     *     The api_uri
     */
    public String getApi_uri() {
        return api_uri;
    }

    /**
     * 
     * @param api_uri
     *     The api_uri
     */
    public void setApi_uri(String api_uri) {
        this.api_uri = api_uri;
    }

    /**
     * 
     * @return
     *     The conference_rank
     */
    public Integer getConference_rank() {
        return conference_rank;
    }

    /**
     * 
     * @param conference_rank
     *     The conference_rank
     */
    public void setConference_rank(Integer conference_rank) {
        this.conference_rank = conference_rank;
    }

    /**
     * 
     * @return
     *     The conference_ranking
     */
    public Integer getConference_ranking() {
        return conference_ranking;
    }

    /**
     * 
     * @param conference_ranking
     *     The conference_ranking
     */
    public void setConference_ranking(Integer conference_ranking) {
        this.conference_ranking = conference_ranking;
    }

    /**
     * 
     * @return
     *     The division_rank
     */
    public Integer getDivision_rank() {
        return division_rank;
    }

    /**
     * 
     * @param division_rank
     *     The division_rank
     */
    public void setDivision_rank(Integer division_rank) {
        this.division_rank = division_rank;
    }

    /**
     * 
     * @return
     *     The division_ranking
     */
    public Integer getDivision_ranking() {
        return division_ranking;
    }

    /**
     * 
     * @param division_ranking
     *     The division_ranking
     */
    public void setDivision_ranking(Integer division_ranking) {
        this.division_ranking = division_ranking;
    }

    /**
     * 
     * @return
     *     The season
     */
    public Season getSeason() {
        return season;
    }

    /**
     * 
     * @param season
     *     The season
     */
    public void setSeason(Season season) {
        this.season = season;
    }

    /**
     * 
     * @return
     *     The team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * 
     * @param team
     *     The team
     */
    public void setTeam(Team team) {
        this.team = team;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
