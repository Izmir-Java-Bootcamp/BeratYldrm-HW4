package com.kodluyoruz.homework.model.mapper;

import com.kodluyoruz.homework.model.dto.BasketDto;
import com.kodluyoruz.homework.model.dto.ProductDto;
import com.kodluyoruz.homework.model.dto.UserDto;
import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.model.entity.Category;
import com.kodluyoruz.homework.model.entity.Product;
import com.kodluyoruz.homework.model.entity.User;
import com.kodluyoruz.homework.model.request.BasketRequest;
import com.kodluyoruz.homework.model.request.CreateUpdateCategoryRequest;
import com.kodluyoruz.homework.model.request.CreateUpdateProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketMapper {
    BasketMapper BASKET_MAPPER = Mappers.getMapper(BasketMapper.class);

    BasketDto toBasketDto(Basket basket);
    List<BasketDto> toBasketDtoList(List<Basket> baskets);
    Basket createBasket(BasketRequest request);
}
