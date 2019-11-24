package com.capfsd.mod.user.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_mentor_skills")
@IdClass(MentorSkillPK.class)
public class MentorSkill {

    @Id
    @Column(name = "mentor_id", nullable = false)
    private Long mentorId;

    @Id
    @Column(name = "skill_id", nullable = false)
    private Long skillId;

}
