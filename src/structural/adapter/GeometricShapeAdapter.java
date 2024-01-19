package structural.adapter;

import structural.adapter.geometricshape.GeometricShape;
import structural.adapter.shape.Shape;

public class GeometricShapeAdapter implements Shape {
	private final GeometricShape adaptee;

	public GeometricShapeAdapter(GeometricShape geoShape) {
		adaptee = geoShape;
	}

	@Override
	public void drawShape() {
		adaptee.drawGeometricShape();
	}

}
