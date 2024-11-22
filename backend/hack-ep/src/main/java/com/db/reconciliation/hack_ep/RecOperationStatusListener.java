package com.db.reconciliation.hack_ep;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecOperationStatusListener {
	
	@Autowired
	private OperationStatusService operationStatusService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RecOperationStatusListener.class);
	
	public void handleStatus(String message) throws JsonProcessingException {
		
		LOGGER.info("Request received to handle client notification {}", message);
		ClientNotification clientNotification = new ObjectMapper().readValue(message, ClientNotification.class);
		operationStatusService.handleClientNotification(clientNotification);
		LOGGER.info("Request completed to handle client notification {}", message);
	}
	
}
