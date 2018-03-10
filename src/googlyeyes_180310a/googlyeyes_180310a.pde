void setup(){
PImage face= loadImage("beyonce.png");
background(face);
size(1093,873);
}
void draw(){
  fill(255,255,255);
  ellipse(479,309,30,20);
  ellipse(598,294,28,18);
  ellipse(479,310,10,10);
  ellipse(598,294,10,10);
  if(mousePressed){
    println(mouseX+" "+mouseY);
  }
  
}