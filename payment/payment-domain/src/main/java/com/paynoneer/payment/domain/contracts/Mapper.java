package com.paynoneer.payment.domain.contracts;

public interface Mapper<DTO, ENTITY> {

    ENTITY mapToDomain(DTO dto);
}