package com.codegtm.exam_module4.models;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    @NotEmpty(message = "Không được để trống tiêu đề!")
    String title;

    @NotEmpty(message = "Điền vào ngày tháng")
    String startDay;

    @NotEmpty(message = "Điền vào ngày tháng")
    String endDay;

    @NotNull
    @Min(value = 10000, message = "Lớn hơn 10000")
    double discountValue;

    @NotNull
    @NotEmpty(message = "Không được để trống mô tả")
    String description;

}
