package com.poixson.webxbukkit.webLink.handlers;

import org.bukkit.event.EventHandler;

import com.poixson.webxbukkit.webLink.ActionEvent;
import com.poixson.webxbukkit.webLink.ActionHandler;


public class worldguardHandler implements ActionHandler {

	public static final String HANDLER_NAME = "worldguard";


	@Override
	public String getHandlerName() {
		return HANDLER_NAME;
	}


	@Override
	public void doUpdate() {
	}


	@Override
	@EventHandler
	public void onAction(ActionEvent event) {
		if(event.isCancelled()) return;
		if(!event.equalsHandler(HANDLER_NAME)) return;
		System.out.println("ACTION EVENT: "+event.getActionName());
	}


}