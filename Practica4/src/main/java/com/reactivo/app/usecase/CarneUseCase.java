package com.reactivo.app.usecase;

import com.reactivo.app.data.CarneRepository;
import com.reactivo.app.modelos.Carne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarneUseCase {

    private CarneRepository carneRepository;

    public Mono<Carne> verCarne(String id){
        return carneRepository.findById(id);
    }

    public Flux<Carne> verCarnes(){
        return carneRepository.findAll();
    }

    public Mono<Void> eliminarCarne(String id){
        return carneRepository.deleteById(id);
    }

    public Mono<Carne> agregarCarne(Carne carne){
        return carneRepository.save(carne);
    }

}
