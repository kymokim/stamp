package com.example.stamp.common.dto;



import com.example.stamp.common.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class UserDto {
    private Long Id;
    private String Username;
    private String UserId;
    private String Password;
    //NumberOfStamps(스탬프 수)
    private Integer NOS;


    public static UserDto createCommentDto(UserEntity user) {
        return new UserDto(

                user.getId(),
                user.getUsername(),
                user.getUserId(),
                user.getPassword(),
                user.getNOS()
        );

    }

}