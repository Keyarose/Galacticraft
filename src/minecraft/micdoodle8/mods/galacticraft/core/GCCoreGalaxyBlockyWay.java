package micdoodle8.mods.galacticraft.core;

import micdoodle8.mods.galacticraft.API.IGalaxy;
import universalelectricity.core.vector.Vector3;

public class GCCoreGalaxyBlockyWay implements IGalaxy
{
	@Override
	public String getGalaxyName()
	{
		return "The Blocky Way";
	}

	@Override
	public int getXCoord()
	{
		return 0;
	}

	@Override
	public int getYCoord()
	{
		return 0;
	}

	@Override
	public Vector3 getRGBRingColors()
	{
		return new Vector3(50.0D / 256.0D, 60.0D / 256.0D, 256.0D / 256.0D);
	}
}
