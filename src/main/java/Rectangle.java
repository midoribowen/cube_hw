public class Rectangle {

  private Integer mLength;
  private Integer mWidth;

  public Rectangle(Integer length, Integer width) {
    mLength = length;
    mWidth = width;
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public boolean isSquare() {
   return mLength == mWidth;
  }

  public int area() {
    return mLength * mWidth;
  }

}
