package simulations.fractalworlds;

import modules.water.Water;
import engine.core.Constants;
import engine.math.Quaternion;

public class Ocean extends Water{

	public Ocean() {
		super(128,256);
		
		getTransform().setScaling(Constants.ZFAR,1,Constants.ZFAR);
		getTransform().setTranslation(-Constants.ZFAR/2,0,-Constants.ZFAR/2);
		
		setClipplane(new Quaternion(0,-1,0,getTransform().getTranslation().getY()));

		this.loadSettingsFile("./res/terrains/terrain0/waterSettings.ocn");
	}

}