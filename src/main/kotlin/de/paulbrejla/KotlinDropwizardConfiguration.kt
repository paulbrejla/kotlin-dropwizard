package de.paulbrejla

import io.dropwizard.Configuration
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.*
import javax.validation.constraints.*

class KotlinDropwizardConfiguration : Configuration()// TODO: implement service configuration