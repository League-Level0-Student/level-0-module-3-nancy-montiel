void setup(){
PImage face= loadImage("beyonce.png");
background(face);
size(1093,873);
}
void draw(){
  fill(255,255,255);
  ellipse(480,309,30,20);
  ellipse(598,294,28,18);
  fill(29,129,56);
  ellipse(mouseX,mouseY,10,10);
  ellipse(mouseX+119,mouseY-16,10,10);
 
  if(mousePressed){
    println(mouseX+" "+mouseY);

  }
  
}