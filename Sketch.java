import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  PImage imgMeteor;

  // x and y coordinates for the meteor
  float fltMeteorX = 0;
  float fltMeteorY = 0;

  // meteor speed varibles
  float fltXSpeed = 3;
  float fltYSpeed = 5;

  // define colours
  int Black = color(0);
  int While = color(255);
  int Magenta = color(255, 0, 255);

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(Black);
    // load meteor
    imgMeteor = loadImage("spaceMeteors_003.png");
    // resize meteor
    imgMeteor.resize(50, 50);
    // load missile

    // resize missile

    // load rocket

    // resize rocket

  }

  public void draw() {
    // draw meteor and move
    background(Black);

    // draw meteor and postion
    image(imgMeteor, fltMeteorX, fltMeteorY);

    fltMeteorX += fltXSpeed;
    fltMeteorY += fltYSpeed;

    if (fltMeteorX > width - imgMeteor.width || fltMeteorX < 0) {
      fltXSpeed *= -1;
      
    }
    if (fltMeteorY > height - imgMeteor.height || fltMeteorY < 0) {
      fltYSpeed *= -1;
    }
    // draw missile and move


    // draw rocket and move

  }
}