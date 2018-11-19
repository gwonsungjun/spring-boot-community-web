package com.sngjun.communityweb.repository;

import com.sngjun.communityweb.domain.Board;
import com.sngjun.communityweb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
