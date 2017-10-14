package de.paulbrejla

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class KotlinDropwizardApplication : Application<KotlinDropwizardConfiguration>() {

    override fun getName(): String {
        return "kotlin-dropwizard"
    }

    override fun initialize(bootstrap: Bootstrap<KotlinDropwizardConfiguration>?) {
        // TODO: application initialization
    }

    override fun run(configuration: KotlinDropwizardConfiguration,
                     environment: Environment) {
        // TODO: implement application
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            KotlinDropwizardApplication().run(*args)
        }
    }
}
