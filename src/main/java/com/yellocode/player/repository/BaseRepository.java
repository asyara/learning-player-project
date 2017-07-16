package com.yellocode.player.repository;

import com.yellocode.player.domain.AbstractDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository <T extends AbstractDomain> extends JpaRepository <T, Long> {
}
