package com.trendyol.javafunctionalprogrammingbootcamp.practices;

import com.trendyol.javafunctionalprogrammingbootcamp.model.Refund;
import com.trendyol.javafunctionalprogrammingbootcamp.model.RefundDto;

import java.util.List;

public class Practise5 {

    public List<RefundDto> assembleSuccessfulRefunds(List<Refund> refunds) {
        // TODO: implement method that accepts list of Refunds and assembles the successful refunds into RefundDto
        List<RefundDto> result = null;
        return refunds.stream().
                filter(refund -> refund.isSuccess()).
                map(refund -> RefundDto.builder().id(refund.getId()).build()).
                toList();
    }
}
