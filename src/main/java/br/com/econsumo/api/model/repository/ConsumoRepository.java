package br.com.econsumo.api.model.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.econsumo.api.model.entity.ConsumoEntity;

/**
 * Interface responsável por realizar as operações na base de dados de Consumo
 * 
 * @author Rafael Moraes
 * @since 27/05/2020
 */
public interface ConsumoRepository extends MongoRepository<ConsumoEntity, String>{

	public List<ConsumoEntity> findByEquipamentoAndDataBetween(String equipamento, LocalDateTime dataInicial, LocalDateTime dataFinal);
	
}
