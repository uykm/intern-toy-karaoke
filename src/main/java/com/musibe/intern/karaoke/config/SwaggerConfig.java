package com.musibe.intern.karaoke.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Musibe 인턴십 악쓰는하마 코인노래방 과제 API 명세서",
        version = "v1"
    )
)
public class SwaggerConfig {

}
