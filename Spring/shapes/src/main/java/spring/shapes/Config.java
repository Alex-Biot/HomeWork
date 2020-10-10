package spring.shapes;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import spring.shapes.model.Line;
import spring.shapes.model.Picture;
import spring.shapes.model.Rectangler;

import java.util.Arrays;

@Configuration
public class Config {

    @Bean
    @Qualifier("simpleShapes")
    @Order(3)
    public Rectangler rectangle() {
        return new Rectangler(20, 5, '#');
    }

    @Bean
    @Qualifier("simpleShapes")
    @Order(1)
    public Rectangler rectangle1() {
        return new Rectangler(10, 5, '&');
    }


    @Bean
    @Qualifier("simpleShapes")
    @Order(2)
    public Line line1() {
        return new Line(20, '*');
    }

    @Bean
    @Qualifier("simpleShapes")
    @Order(2)
    public Picture picture(Line line1, Rectangler rectangle,Rectangler rectangle1) {
        return new Picture(Arrays.asList(line1, rectangle, rectangle1,line1));
    }

}