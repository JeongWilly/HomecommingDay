package com.homecomingday.repository;

import com.homecomingday.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

  Optional<Member> findById(Long id);

  Optional<Member> findByEmail(String email);

  Optional<Member> findByUsername(String username);
}
