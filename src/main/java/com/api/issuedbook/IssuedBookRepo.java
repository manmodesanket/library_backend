package com.api.issuedbook;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IssuedBookRepo extends JpaRepository<IssuedBook, Integer> {
    @Query("from IssuedBook where id=:id1")
    List<IssuedBook> selectById(@Param("id1") Integer id);
}
