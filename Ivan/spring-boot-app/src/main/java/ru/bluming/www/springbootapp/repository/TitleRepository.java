package ru.bluming.www.springbootapp.repository;

import ru.bluming.www.springbootapp.entity.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRepository extends JpaRepository<Title, Long> {

}
