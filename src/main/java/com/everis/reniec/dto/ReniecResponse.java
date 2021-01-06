package com.everis.reniec.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel("Reniec response")
public class ReniecResponse {
    @ApiModelProperty(example = "Reniec")
    private String entityName;
    @ApiModelProperty(example = "true")
    private Boolean success;
}
