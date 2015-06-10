/**
 * Created by hbadhani on 10/06/2015.
 */
package hbadhani.spring.service;


import hbadhani.spring.model.Circle;
import hbadhani.spring.model.Triangle;

public class ShapeService {
    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
