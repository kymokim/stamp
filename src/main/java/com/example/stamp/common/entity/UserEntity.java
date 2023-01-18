package com.example.stamp.common.entity;




import com.example.stamp.common.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private  String Username;
    @Column
    private String UserId;
    @Column
    private String Password;
    //NumberOfStamps(스탬프 수)
    @Column
    private Integer NOS;

    @OneToMany(mappedBy = "Writer",orphanRemoval = true)
    private List<CommentEntity> comments = new ArrayList<>();


    public static UserEntity createUser(UserDto dto,List<CommentEntity> comments) {
        //엔티티 생성 및 반환
        return new UserEntity(
                dto.getId(),
                dto.getUsername(),
                dto.getUserId(),
                dto.getPassword(),
                dto.getNOS(),
                comments);

    }


}
