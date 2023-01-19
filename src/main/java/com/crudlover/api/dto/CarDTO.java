package com.crudlover.api.dto;

import java.util.Date;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

public record CarDTO(

        @NotBlank String modelo,

        @NotBlank String fabricante,

        @Past Date dataFabricacao,

        @Min(0) double valor,

        @Min(0) int anoModelo) {

}
