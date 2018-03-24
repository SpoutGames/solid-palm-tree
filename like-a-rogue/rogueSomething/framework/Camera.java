package framework;

import entity.Entity;

public class Camera
{

	//private
		private double xOffset, yOffset;
		
		
	//objects
		private Handler handler;
		
	//constructor
		public Camera(Handler handler, double xOffset, double yOffset) {
			this.handler = handler;
			this.setxOffset(xOffset);
			this.setyOffset(yOffset);
			
		}
	
	//functions
		public void centerCameraOnEntity(Entity e) {
			xOffset = e.getX() - handler.getWidth() / 2;
			yOffset = e.getY() - handler.getHeight() / 2;
		}
		
		public void move(double xAmt, double yAmt) {
			setxOffset(getxOffset() + xAmt);
			setyOffset(getyOffset() + yAmt);
		}
		
	//getters and setters
		public double getxOffset() {
			return xOffset;
		}
		public void setxOffset(double xOffset) {
			this.xOffset = xOffset;
		}
		

		public double getyOffset() {
			return yOffset;
		}

		public void setyOffset(double yOffset) {
			this.yOffset = yOffset;
		}
	
	
}
