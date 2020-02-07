package com.example.team;

public class Rectangle extends Shape {
    private int edgeWidth;
    private int edgeHeight;

    public void Shape(int edgeWidth, int edgeHeight) {
        this.edgeHeight = edgeHeight;
        this.edgeWidth = edgeWidth;
    }

    public int getEdgeWidth() {
        return this.edgeWidth;
    }

    public int getEdgeHeight() {
        return this.edgeHeight;
    }

    public void setEdgeHeight(int edgeHeight) {
        if(edgeHeight>0) {
            this.edgeHeight = edgeHeight;
        }
    }

    public void setEdgeWidth(int edgeWidth) {
        if(edgeWidth>0) {
            this.edgeWidth = edgeWidth;
        }
    }

    public int getArea() {
        return this.edgeHeight*this.edgeWidth;
    }
}
