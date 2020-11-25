package adapter;

import adapter.geometricshape.Triangle;
import adapter.shape.Circle;

public class AdapterExample {

	public static void main(String[] args) {
		Drawing drawing=new Drawing();
		//we can circle class here because circle is of Shape type
		//but we can not add Triangle because Triangle is GeometricShape
		drawing.addShape(new Circle());
		//Now with the help of the adapter we can add Triangle
		drawing.addShape(new GeometricShapeAdapter(new Triangle()));
		drawing.draw();

	}

}
