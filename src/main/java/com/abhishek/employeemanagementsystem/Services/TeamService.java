package com.abhishek.employeemanagementsystem.Services;

import com.abhishek.employeemanagementsystem.Dtos.TeamRequestDto;
import com.abhishek.employeemanagementsystem.Models.Teams;

import java.util.List;

public interface TeamService {
    Teams createTeam(TeamRequestDto teamRequestDto);
    Teams getTeamById(Long id);
    List<Teams> retrieveAllTeams();
    void deleteTeamById(Long id);
}
