package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Controller
public class ExampleController {

    @Get
    @ApiResponse(
        description = "success",
        content = @Content(mediaType = MediaType.APPLICATION_JSON,
                           schema = @Schema(ref = "#/components/schemas/SomethingFoo")))
    public Object getFoo() {
        return "";
    }
}
