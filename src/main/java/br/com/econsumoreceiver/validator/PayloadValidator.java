package br.com.econsumoreceiver.validator;

/**
 * Interface para validação do payload
 * 
 * @author Rafael Moraes
 * @since 29/05/2020
 */
public interface PayloadValidator {
	
	/**
	 * Método responsável por realizar a validação do Payload
	 * 
	 * @param payload - Payload
	 * @author Rafael Moraes
	 * @since 29/05/2020
	 */
	public void validar(String payload);

}
