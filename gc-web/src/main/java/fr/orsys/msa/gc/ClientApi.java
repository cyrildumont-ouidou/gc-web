package fr.orsys.msa.gc;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange("/api/clients")
public interface ClientApi {

    @GetExchange
    List<Client> findAll();
}