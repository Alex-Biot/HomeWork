package spring.shapes.service;

import org.springframework.stereotype.Component;
import spring.shapes.model.Picture;
import spring.shapes.model.Shape;

import java.util.List;
@Component
public class ShapeService {

    public void drawShapes(List<Shape> shapes) {
        System.out.println("--------------------");
        shapes.forEach(shape ->shape.draw() );
        System.out.println("--------------------");
    }
    /*public void drawShapes(List<Shape> shapes) {
        Picture a = new Picture(shapes);
        System.out.println("--------------------");
        a.draw();
        System.out.println("--------------------");
    }*/

}