/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucab.tesis.servicio;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import javax.ws.rs.ApplicationPath;

import javax.ws.rs.core.Application;

/**
 *
 * @author Miguelangel
 */
@ApplicationPath("api")
public class Configuracion extends org.glassfish.jersey.server.ResourceConfig{
    
    public Configuracion()
    {
        super();
        registerJsonProvider();
        packages("com.ucab.tesis.servicio");
    }
    /** register a provider to handle JSON request and response */
	private void registerJsonProvider() {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
		JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider();
		provider.setMapper(mapper);
		register(provider);
}
}
