package lv.rvt;

class BoxTester {
  public static void main ( String[] args )
  {
    Box box = new Box(2.5, 5.0, 6.0) ;  
    System.out.println("Area: " + box.area() + " volume: " + box.volume()); 
    System.out.println("Original box length: " + box.length() + " height: " + box.height() + " width: " + box.width()); 
    //System.out.println("topArea: " + box.topArea());
    System.out.println("Bigger box length: " + box.biggerBox(box).length() + " Bigger box height: " + box.biggerBox(box).height() + " Bigger box width: " + box.biggerBox(box).width());
    System.out.println("Smaller box length: " + box.smallerBox(box).length() + " Smaller box height: " + box.smallerBox(box).height() + " Smaller box width: " + box.smallerBox(box).width());
    System.out.println(box.nests(box.smallerBox(box)));
  }
}