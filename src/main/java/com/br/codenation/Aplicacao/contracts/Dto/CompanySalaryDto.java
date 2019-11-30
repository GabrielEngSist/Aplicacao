package com.br.codenation.Aplicacao.contracts.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanySalaryDto {
    public String companyName;
    public BigDecimal averageSalary;
}
