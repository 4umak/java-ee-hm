package com.chumak;

import com.chumak.annotations.ArtistPerform;
import com.chumak.annotations.ComicPerform;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AppContext {
    @Bean
    public ArtistPerform throwingPerformer() {
        return new ArtistPerform();
    }

    @Bean
    public ComicPerform noThrowingPerformer() {
        return new ComicPerform();
    }
}
