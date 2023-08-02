package old.adapterpattern;


import old.com.adapter.pilotpen.PilotPen;

public class PenAdapter implements Pen
{
	PilotPen pilotpen = new PilotPen();

	@Override
	public void write(String str)
	{
		pilotpen.Mark(str);
	}

}
