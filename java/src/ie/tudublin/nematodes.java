package ie.tudublin;

import processing.data.TableRow;
public class nematodes {
    private String name;
    private int length;
    private int limbs;
    private String gender;
    private int eyes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }



    public nematodes(String name, int length, int limbs, String gender, int eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }
    @Override
    public String toString() {
        return "nematodes [eyes=" + eyes + ", gender=" + gender + ", length=" + length + ", limbs=" + limbs + ", name="
                + name + "]";
    }

    
    public nematodes(TableRow tr)
    {
        this(tr.getString("name"), tr.getInt("length"), tr.getInt("limbs"), tr.getString("gender"),tr.getInt("eye"));
    }

    public void reader(NematodeVisualiser pa)
    {
        
		pa.strokeWeight(2);
        float c = pa.random(0,255);
		pa.stroke(c,255,255);
		//line(80, 80, 160, 80);
		pa.line(80, 400, 200, 400);
		pa.line(80, 400, 120, 350); 
        pa.line(80, 400, 120, 450);

		pa.strokeWeight(2);
		pa.stroke(255,255,255);
		pa.line(600, 400, 720, 400);
		pa.line(720, 400,670,350 ); 
        pa.line(720, 400,680, 450);


      
    }
}
