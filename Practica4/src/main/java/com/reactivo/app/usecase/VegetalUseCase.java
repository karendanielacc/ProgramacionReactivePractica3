package com.reactivo.app.usecase;

import com.reactivo.app.data.VegetalRepository;
import com.reactivo.app.modelos.Vegetal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VegetalUseCase {

    private VegetalRepository vegetalRepository;

    public Mono<Vegetal> verVegetal(String id){
        return vegetalRepository.findById(id);
    }

    public Flux<Vegetal> verVegetales(){
        return vegetalRepository.findAll();
    }

    public Mono<Void> eliminarVegetal(String id){
        return vegetalRepository.deleteById(id);
    }

    public Mono<Vegetal> agregarVegetal(Vegetal vegetal){
        return vegetalRepository.save(vegetal);
    }
}
