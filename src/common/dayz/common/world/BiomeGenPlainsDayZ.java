package dayz.common.world;

import java.util.Random;

import net.minecraft.src.BiomeDecorator;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.EntityChicken;
import net.minecraft.src.EntityCow;
import net.minecraft.src.EntityPig;
import net.minecraft.src.EntitySheep;
import net.minecraft.src.EntityWolf;
import net.minecraft.src.SpawnListEntry;
import net.minecraft.src.WorldGenTaiga1;
import net.minecraft.src.WorldGenTaiga2;
import net.minecraft.src.WorldGenerator;
import dayz.common.entities.EntityBandit;
import dayz.common.entities.EntityCrawler;
import dayz.common.entities.EntityZombieDayZ;

public class BiomeGenPlainsDayZ extends BiomeGenBase 
{
	public BiomeGenPlainsDayZ(int id) 
	{
		super(id);
		setColor(747097);
		setBiomeName("DayZ Plains");
		temperature = BiomeGenBase.forest.temperature;
		rainfall = BiomeGenBase.forest.rainfall;
		minHeight = 0.1F;
		maxHeight = 0.1F;
        spawnableMonsterList.clear();
        spawnableCreatureList.clear();
        spawnableWaterCreatureList.clear();
        spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 4, 4, 4));
        spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 4, 4, 4));
        spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 4, 4, 4));
        spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 4, 4, 4));
        spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 4, 4, 4));
        spawnableCreatureList.add(new SpawnListEntry(EntityZombieDayZ.class, 70, 2, 2));
        spawnableCreatureList.add(new SpawnListEntry(EntityCrawler.class, 50, 2, 2));
        spawnableCreatureList.add(new SpawnListEntry(EntityBandit.class, 2, 4, 4)); 
    }

	@Override
	protected BiomeDecorator createBiomeDecorator() 
	{
		return new BiomeDecoratorOverride.Builder(this).biomeColour(1456435).flowersPerChunk(4).deadBushPerChunk(4).treesPerChunk(-999).grassPerChunk(20).build();
	}
}
