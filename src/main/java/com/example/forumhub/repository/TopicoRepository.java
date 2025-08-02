package com.example.forumhub.repository;

import com.example.forumhub.Topicos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topicos,Integer> {
}
