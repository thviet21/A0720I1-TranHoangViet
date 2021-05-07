package com.codegtm.exam_module4.services.impl;

import com.codegtm.exam_module4.models.Discount;
import com.codegtm.exam_module4.repositories.DiscountRepository;
import com.codegtm.exam_module4.services.IDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServiceImpl  implements IDiscountService {
    @Autowired
    DiscountRepository discountRepository;

    @Override
    public List<Discount> findAllDiscount() {
        return discountRepository.findAll();
    }

    @Override
    public Discount findById(int id) {
        return discountRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Discount discount) {
        discountRepository.save(discount);
    }

    @Override
    public void delete(int id) {
        discountRepository.deleteById(id);
    }
}
