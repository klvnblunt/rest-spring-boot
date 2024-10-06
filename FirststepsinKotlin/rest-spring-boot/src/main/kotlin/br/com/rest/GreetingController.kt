package br.com.rest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
    val counter: AtomicLong = AtomicLong()
    @RequestMapping("/greeting")
    fun greeting(): Greeting {
        val content: String = "Hello Kotlin"
        return Greeting(counter.incrementAndGet(), content)
    }
}