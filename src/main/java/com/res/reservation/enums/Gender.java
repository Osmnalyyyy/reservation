package com.res.reservation.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {
    MALE("Erkek"),
    FEMALE("Kadın");

    private final String value;
}
