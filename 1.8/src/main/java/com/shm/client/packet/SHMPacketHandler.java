package com.shm.client.packet;

import java.io.IOException;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ClientCustomPacketEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent.ServerCustomPacketEvent;

import com.jcraft.jogg.Packet;

public class SHMPacketHandler
{
	protected String channelName = "SUPERHEROES";
	
	/* I am just not even gonna look at this, gegy, its yours xd */
	
	@SubscribeEvent
	public void onServerPacket(ServerCustomPacketEvent event) throws IOException
	{
		
	}

	@SubscribeEvent
	public void onClientPacket(ClientCustomPacketEvent event) throws IOException
	{	
		
	}
}
