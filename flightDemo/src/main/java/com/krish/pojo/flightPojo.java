package com.krish.pojo;

public class flightPojo {
	private int code;
	private String carrier;
	private String source;
	private String dest;
	
	public flightPojo()
	{
		
	}

	public flightPojo(int code, String carrier, String source, String dest) {
		super();
		this.code = code;
		this.carrier = carrier;
		this.source = source;
		this.dest = dest;
	}

	@Override
	public String toString() {
		return "flightPojo [code=" + code + ", carrier=" + carrier + ", source=" + source + ", dest=" + dest + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}
	
	
}
