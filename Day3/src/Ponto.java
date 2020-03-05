public class Ponto {
    int x;
    int y;


    public Ponto() {
        x=0;
        y=0;
    }

    public Ponto(int xx, int yy) {
        this.x = xx;
        this.y = yy;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public boolean equals(Object o) {
        if (o==null ) return false;
        if(!Ponto.class.isAssignableFrom(o.getClass())) {
            return false;
        }
        final Ponto obj = (Ponto) o;

        if(this.x == obj.getX() && this.y == obj.getY()) return true;

        return false;

    }


}
