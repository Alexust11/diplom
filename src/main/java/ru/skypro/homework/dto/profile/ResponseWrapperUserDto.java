package ru.skypro.homework.dto.profile;

import lombok.Data;

@Data

public class ResponseWrapperUserDto {
    private long count;
    private UserDto[] result;
}
