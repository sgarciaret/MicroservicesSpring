package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name = "Accounts", description = "Schema to hold Account information")
public class AccountsDto {
    @NotEmpty(message = "Account number is mandatory")
    @Pattern(regexp = "(^$|\\d{10})", message = "Account number should be 10 digits")
    @Schema(description = "Account number of the customer", example = "1234567890")
    private Long accountNumber;
    @NotEmpty(message = "Account type is mandatory")
    @Schema(description = "Type of account", example = "Savings")
    private String accountType;
    @NotEmpty(message = "Branch address is mandatory")
    @Schema(description = "Branch address of the account", example = "123, Main Street, New York")
    private String branchAddress;
}
