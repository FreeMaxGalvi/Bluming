package ru.bluming.www.springbootapp.service;

import ru.bluming.www.springbootapp.entity.Goods;
import ru.bluming.www.springbootapp.entity.Title;

import java.util.List;

public interface GoodsService {

    Goods addGood(Goods goods);
//    Goods getByName(String name);
    Goods editGood(Goods goods);
    List<Goods> getAll();

}
