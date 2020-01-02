package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public Docket swaggerWeatherConfiguration(){
        return new Docket(DocumentationType.SWAGGER_2)
                    .groupName("User")
                    .select()
                    .paths(PathSelectors.ant("+/user/*"))
                    .apis(RequestHandlerSelectors.basePackage("app"))
                    .build()
                    .apiInfo(apiInfo());
    }
    @Bean
    public Docket swaggerUserConfiguration(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("City")
                .select()
                .paths(PathSelectors.ant("/city/*"))
                .apis(RequestHandlerSelectors.basePackage("app"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "Climate API",
                "Practice API for Globant BootCamp",
                "1.0",
                "",
                new springfox.documentation.service.Contact("Joel Arce","mywebpage.com","joel.arce9637@gmail.com"),
                "API license",
                "mywebpage.com",
                Collections.emptyList()

        );

    }

}
