package de.paulbrejla.resources

import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import de.paulbrejla.api.Saying
import javax.ws.rs.QueryParam
import com.codahale.metrics.annotation.Timed
import java.util.*
import java.util.concurrent.atomic.AtomicLong
import javax.ws.rs.GET


@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
class HelloWorldResource constructor(val template: String, val defaultName: String){

    var counter= AtomicLong()

    @GET
    @Timed
    fun sayHello(@QueryParam("name") name: Optional<String>): Saying {
        val value = String.format(template, name.orElse(defaultName))
        return Saying(counter.incrementAndGet(), value)
    }
}