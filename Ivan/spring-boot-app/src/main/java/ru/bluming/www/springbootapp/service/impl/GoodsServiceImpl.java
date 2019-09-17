package ru.bluming.www.springbootapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import ru.bluming.www.springbootapp.entity.Goods;
import ru.bluming.www.springbootapp.repository.GoodsRepository;
import ru.bluming.www.springbootapp.service.GoodsService;

import java.util.List;

@Service
@Configuration
@ComponentScan(value = "ru.bluming.www.springbootapp.*")
public class GoodsServiceImpl implements GoodsService {

    private final GoodsRepository goodsRepository;

    public GoodsServiceImpl(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }

    @Override
    public Goods addGood(Goods goods) {
        Goods savedGoods = goodsRepository.saveAndFlush(goods);

        return savedGoods;
    }

    @Override
    public Goods editGood(Goods bank) {
        return goodsRepository.saveAndFlush(bank);
    }

    @Override
    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }
}
