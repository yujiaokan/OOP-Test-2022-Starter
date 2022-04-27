package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<nematodes> nema = new ArrayList<nematodes>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}
	float border;

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();	
		//loadNematodes();	
		strokeWeight(2);
        float c = random(0,255);
		stroke(c,255,255);
		//line(80, 80, 160, 80);
		line(80, 400, 200, 400);
		line(80, 400, 120, 350); 
        line(80, 400, 120, 450);

		strokeWeight(2);
		stroke(255,255,255);
		line(600, 400, 720, 400);
		line(720, 400,670,350 ); 
        line(720, 400,680, 450);	
		border = width * 0.1f;	
	}

	void displayNematode()
	{
		
		textSize(14);
		textAlign(LEFT,CENTER);
		
		
		textAlign(CENTER, CENTER);
		stroke(128);
		
		for(nematodes ne:nema)
		{
			fill(255);
			text(ne.getName(), border, width/2);
			for(int i=0;i<ne.getLength();i++)
			{
				float c = map(i, 0, nema.size(), 0, 255);
				noFill();
				stroke(c);
				float x = map(i, 0, 50,50, width /2); 
				float y = map(i, 0, 50, 50 , width /2); 
				ellipse(x, y,50,50);
			}
			

			// Print the task
			
		}

	}

	




	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");

		for(TableRow row:table.rows())
		{
			nematodes nematode= new nematodes(row);
			nema.add(nematode);
		}
	}
	public void drawArrow()
    {
        for(nematodes n :nema )
        {
            n.reader(this);
        }
	

    }


	public void draw()
	{	
		drawArrow();
		displayNematode();

	}
}
