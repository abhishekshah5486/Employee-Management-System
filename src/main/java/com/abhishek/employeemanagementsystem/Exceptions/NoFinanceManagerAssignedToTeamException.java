package com.abhishek.employeemanagementsystem.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoFinanceManagerAssignedToTeamException extends RuntimeException {
    private Long id;
    public NoFinanceManagerAssignedToTeamException(String message, Long id) {
        super(message);
        this.id = id;
    }
}
