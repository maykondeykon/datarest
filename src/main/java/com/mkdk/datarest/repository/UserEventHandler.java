package com.mkdk.datarest.repository;

import com.mkdk.datarest.model.User;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.util.logging.Logger;

@RepositoryEventHandler()
public class UserEventHandler {
	private Logger logger = Logger.getLogger("UserEventHandler Logger ->");

	@HandleBeforeCreate
	public void handleUserSave(User user) {
		logger.info(String.format("Salvando usuário: %s", user));
	}
}
