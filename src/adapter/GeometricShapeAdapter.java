package adapter;

import adapter.geometricshape.GeometricShape;
import adapter.shape.Shape;

public class GeometricShapeAdapter implements Shape {
	private GeometricShape adaptee;

	public GeometricShapeAdapter(GeometricShape geoShape) {
		adaptee = geoShape;
	}

	@Override
	public void drawShape() {
		adaptee.drawGeometricShape();
	}

}
