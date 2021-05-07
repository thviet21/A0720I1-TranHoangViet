package com.codegtm.exam_module4.services;

import com.codegtm.exam_module4.models.Discount;

import java.util.List;

public interface IDiscountService {

    List<Discount> findAllDiscount();

    Discount findById(int id);

    void save(Discount discount);

    void delete(int id);
}
