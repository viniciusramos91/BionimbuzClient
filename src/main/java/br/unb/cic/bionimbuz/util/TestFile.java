package br.unb.cic.bionimbuz.util;

public class TestFile {
	private String name;
	private String size;
	private String date;

	public TestFile(String name, String size, String date) {
		this.name = name;
		this.size = size;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
