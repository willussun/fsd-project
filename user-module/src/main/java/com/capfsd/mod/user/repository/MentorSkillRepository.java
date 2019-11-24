package com.capfsd.mod.user.repository;

import com.capfsd.mod.user.entity.MentorSkill;
import com.capfsd.mod.user.entity.MentorSkillPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface MentorSkillRepository extends JpaRepository<MentorSkill, MentorSkillPK> {
    @Query(value = "SELECT ms.skillId from MentorSkill ms where ms.mentorId = :mentorId")
    Set<Long> findAllByMentorId(@Param("mentorId") Long mentorId);
}
