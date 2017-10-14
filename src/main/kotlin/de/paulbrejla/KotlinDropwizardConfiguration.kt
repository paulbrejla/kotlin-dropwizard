package de.paulbrejla

import io.dropwizard.Configuration
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.*
import javax.validation.constraints.*

class KotlinDropwizardConfiguration : Configuration(){
    @JsonProperty("template")
    var template: String="Hello, %s!"

    @NotEmpty
    @JsonProperty("defaultName")
    var defaultName: String="paulbert"

}