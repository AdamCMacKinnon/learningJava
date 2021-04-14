class Rectangle {
    private int height;
    private int width;

    public Rectangle(int h, int w){
        setHeight(h);
        setWidth(w);

    }


    public void setHeight(int h) {

        if (h > 0) {
            height = h;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int w) {
        if (w > 0) {
            width = w;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getArea(){
        return height * width;
    }
    public int getPerimeter(){
        return (2 * height) + (2 * width);
    }
}
