class Shape 
{
    int area;
    Shape()
    {
        area=0;
    }
}

class rectangle extends Shape
{
    int len;
    int breath;
    rectangle()
    {
        len=0;
        breath=0;
    }
    rectangle(int l, int b)
    {
        this.len=l;
        this.breath=b;
    }
    void Shapearea()
    {
        area= len*breath;
    }
}
class Area
{
    public static void main(String args[])
    {
        rectangle r1=new rectangle(14,25);
        r1.Shapearea();

        System.out.println(r1.area);
    }
}