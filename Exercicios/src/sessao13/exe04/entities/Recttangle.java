package sessao13.exe04.entities;

import sessao13.exe04.entities.enums.Color;

public class Recttangle extends  Shape{

    private Double width;
    private Double height;

    public Recttangle() {
        super();
    }

    public Recttangle(Color color,Double  width, Double height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area(){
        return  width * height;
    }
}
