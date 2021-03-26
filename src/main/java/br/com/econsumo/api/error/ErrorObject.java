package br.com.econsumo.api.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorObject {

	private final String message;
    private final Object parameter;
    
}