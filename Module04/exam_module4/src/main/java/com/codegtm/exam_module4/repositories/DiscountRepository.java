package com.codegtm.exam_module4.repositories;

import com.codegtm.exam_module4.models.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DiscountRepository extends JpaRepository<Discount,Integer> {
}
