package com.reactivo.app.controller;

import com.reactivo.app.modelos.Carne;
import com.reactivo.app.usecase.CarneUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/carne")
@AllArgsConstructor
public class CarneController {

    private CarneUseCase carneUseCase;


    @PostMapping("/agregarcarne")
    public Mono<Carne> agregarCarne(@RequestBody Carne carne){
        return carneUseCase.agregarCarne(carne);
    }

    @GetMapping("vercarne/{id}")
    public Mono<Carne> verCarne(@PathVariable String id){
        return carneUseCase.verCarne(id);
    }

    @GetMapping("/vercarnes")
    public Flux<Carne> verCarnes(){
        return carneUseCase.verCarnes();
    }

    @PutMapping("/actualizarcarne")
    public Mono<Carne> actualizarCarne(@RequestBody Carne carne){
        return carneUseCase.agregarCarne(carne);
    }

    @DeleteMapping("/eliminarcarne/{id}")
    public Mono<Void> eliminarCarne(@PathVariable String id){
        return carneUseCase.eliminarCarne(id);
    }
}
