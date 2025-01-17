package com.feljtech.istudybucket.dto.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginForm {
    @JsonProperty(value = "username", required = true)
    private String username;
    @JsonProperty(value = "password", required = true)
    private String password;
}
