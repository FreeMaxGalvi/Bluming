package ru.bluming.www.springbootapp.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.bluming.www.springbootapp.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.bluming.www.springbootapp.entity.Title;

@Repository
@Configuration
public interface GoodsRepository extends JpaRepository<Goods, Long> {
    @Query("select b from Goods b where b.name = :name")
    Goods findByName(@Param("name") String name);

}
