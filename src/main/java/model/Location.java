package model;

public class Location {
	long latitud;
	long longitud;
	
	public Location(long latitud, long longitud) {
		this.setLatitud(latitud);
		this.setLongitud(longitud);
	}

	public long getLatitud() {
		return latitud;
	}

	public void setLatitud(long latitud) {
		this.latitud = latitud;
	}

	public long getLongitud() {
		return longitud;
	}

	public void setLongitud(long longitud) {
		this.longitud = longitud;
	}

}
