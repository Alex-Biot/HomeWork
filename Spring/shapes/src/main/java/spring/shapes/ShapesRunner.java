package spring.shapes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import spring.shapes.model.Shape;
import spring.shapes.service.ShapeService;

import java.util.List;

@Component
public class ShapesRunner implements ApplicationRunner {

    List<Shape> shapes;
    ShapeService service;

    public ShapesRunner(
            @Qualifier("simpleShapes")
                    List<Shape> shapes,
            ShapeService service) {
        this.shapes = shapes;
        this.service = service;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(shapes);
        service.drawShapes(shapes);
    }
}