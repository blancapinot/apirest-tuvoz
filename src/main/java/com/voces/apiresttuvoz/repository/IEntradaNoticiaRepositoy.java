package com.voces.apiresttuvoz.repository;

import com.voces.apiresttuvoz.model.EntradaNoticia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IEntradaNoticiaRepositoy extends MongoRepository<EntradaNoticia, String> {


}
