package com.synthilearn.entrypointservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenPair {

    private String accessToken;
    private String refreshToken;
}
