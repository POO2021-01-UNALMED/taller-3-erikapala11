package taller3.televisores;

public class TV {
	
	Marca marca;
	int canal= 1;
	int precio= 500;
	static boolean estado;
	int volumen= 1;
	Control control;
	public static int numTV;
	
	public TV(Marca marca, boolean estado){
		this.marca= marca;
		TV.estado= estado;
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int can) {
		canal= can;
		}
	
	public Marca getMarca() {
		return marca;
		
	}
	public void setMarca(Marca mar) {
		marca= mar;	
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control con) {
		control=con;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int pre) {
		precio=pre;
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int vol) {
		volumen= vol;	
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public boolean getEstado() {
		return estado;
	}
	

    public boolean turnON(boolean estado) {
    	if (estado!=true);
    	return true;
	
    }  
    public boolean turnOff(boolean estado) {
    	if (estado==true);
    	return false;
    	
    }
    
    public void volumenUp(){
    	for (volumen=0; volumen<7; volumen++);
    	if (estado==true);
        this.volumen++;
    }
    
    public void volumenDown(){
    	for (volumen=0; volumen<7; volumen++);
    	if (estado==true);
        this.volumen--;
    }
    
    public int canalUp(){
    	for (canal=1; canal<120; canal--);
		return canal++;
	}
 
	public int canalDown(){
		for (canal=1; canal<120; canal--);
		return canal--;
		
	}
    
    
	
    
    
}

 
   


