public class Point<T> {
	    
	    private T x, y;
	    public Point(T x, T y){
	        set(x, y);
	    }
	    
	    public void set(T x, T y){
	        this.x = x; this.y = y;
	    }
	    
	    T getX(){return x;}
	    T getY(){return y;}
	    
	    @Override
	    public String toString(){
	        return "(" + x.toString() + "," + y.toString() + ")";
	    }
	}
