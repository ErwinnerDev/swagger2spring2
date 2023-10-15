package com.swaggerconfig.swaggerconfig.application.resources;

import com.swaggerconfig.swaggerconfig.model.ExampleResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Api("Estos son endpont de ejemplos")
@RequestMapping("/api/usuario")
public interface Exampleresource {

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ExampleResponse.class),
            @ApiResponse(code = 500, message = "OK", response = String.class)
    })
    @GetMapping(value = "/{name}")
    @ApiOperation(value = "Saludar a un usuario", notes = "Esto es una nota")
    ResponseEntity<ExampleResponse> saludar(
            @ApiParam(name = "name", value = "Puede ir cualquier valor", example = "Example: Erwin, chene, Evelin, Ojilver" )
            @PathVariable(name = "name") String name);
}
