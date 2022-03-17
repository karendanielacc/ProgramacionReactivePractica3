package com.reactivo.app.usecase;

import com.reactivo.app.data.LacteoRepository;
import com.reactivo.app.data.VegetalRepository;
import com.reactivo.app.modelos.Lacteo;
import com.reactivo.app.modelos.Vegetal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LacteoUseCase {
    private LacteoRepository lacteoRepository;

    public Mono<Lacteo> verLacteo(String id){
        return lacteoRepository.findById(id);
    }

    public Flux<Lacteo> verLacteos(){
        return lacteoRepository.findAll();
    }

    public Mono<Void> eliminarLacteo(String id){
        return lacteoRepository.deleteById(id);
    }

    public Mono<Lacteo> agregarLacteo(Lacteo lacteo){
        return lacteoRepository.save(lacteo);
    }
}
