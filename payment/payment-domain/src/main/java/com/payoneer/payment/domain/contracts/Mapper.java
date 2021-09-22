package com.payoneer.payment.domain.contracts;

public interface Mapper<DTO, ENTITY> {

    ENTITY mapToDomain(DTO dto);
}