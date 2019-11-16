package com.br.codenation.Aplicacao.resources.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status;
    private String message;
    private Long timeStamp;

    public StandardError(Integer status, String message, Long timeStamp) {
        super();
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
