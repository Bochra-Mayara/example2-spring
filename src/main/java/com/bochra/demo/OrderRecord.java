package com.bochra.demo;

public record OrderRecord(
        String customerName,
        String customerProduct,
        int quantity
) {

}
