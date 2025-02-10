package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(info = @Info(title = "Accounts microservices REST API Documentation",
                                description = "Accounts microservices REST API Documentation",
                                version = "v1",
                                contact = @Contact(name = "EazyBytes", email = "ola@ola.com", url = "olaola.com"),
                                license = @License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0")),
                    externalDocs = @ExternalDocumentation(description = "Accounts microservices REST API Documentation",
                                                         url = "http://localhost:8080/swagger-ui/index.html"))
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
