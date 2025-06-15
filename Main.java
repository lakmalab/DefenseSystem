class Main{
	public static void main(String args[]){
		ControlRoom controlRoom=new ControlRoom();
		controlRoom.addWaterLevelObserver(new AlarmWindow());
		controlRoom.addWaterLevelObserver(new AlarmWindow());
		controlRoom.addWaterLevelObserver(new DisplayWindow());
		
		new WaterTank(controlRoom).setVisible(true);
		
	}
}
