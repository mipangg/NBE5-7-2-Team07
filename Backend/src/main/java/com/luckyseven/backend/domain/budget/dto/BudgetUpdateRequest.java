package com.luckyseven.backend.domain.budget.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.DecimalMin;
import java.math.BigDecimal;

public record BudgetUpdateRequest (
        @JsonProperty("totalAmount")
        @DecimalMin(value = "0.0", inclusive = false)
        BigDecimal totalAmount,

        @JsonProperty("isExchanged")
        Boolean isExchanged,

        @JsonProperty("exchangeRate")
        @DecimalMin(value = "0.0", inclusive = false)
        BigDecimal exchangeRate
) { }
